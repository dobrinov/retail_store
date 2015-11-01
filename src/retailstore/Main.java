/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailstore;

import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.hibernate.Session;

public class Main extends Application {

    Session session;
    private User loggedUser;
    private Stage stage;
    private final double MINIMUM_WINDOW_WIDTH = 390.0;
    private final double MINIMUM_WINDOW_HEIGHT = 500.0;

    @Override
    public void start(Stage primaryStage) throws Exception {
        session = HibernateUtil.getSessionFactory().openSession();
        
        
        stage = primaryStage;
        stage.setTitle("Магазин");
        stage.setMinWidth(MINIMUM_WINDOW_WIDTH);
        stage.setMinHeight(MINIMUM_WINDOW_HEIGHT);

        gotoLogin();
        primaryStage.show();
    }
    
    public void gotoLogin() {
        try {
            LoginController profile = (LoginController) replaceSceneContent("Login.fxml");
            profile.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void gotoMainMenu() {
        try {
            MainMenuController profile = (MainMenuController) replaceSceneContent("MainMenu.fxml");
            profile.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public User getLoggedUser() {
        return loggedUser;
    }
    
    public Boolean login(String username, String password){
        List list = session.createQuery("from User where username like ? and password like ?")
                        .setString(0, username)
                        .setString(1, password)
                        .list();
        
        Iterator it = list.iterator();
        
        if(it.hasNext()){
           loggedUser =  (User) it.next();
           return true;
        } else {
            return false;
        }
    }
    
    public void logout(){
        loggedUser = null;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    private Initializable replaceSceneContent(String fxml) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        InputStream in = Main.class.getResourceAsStream(fxml);
        loader.setBuilderFactory(new JavaFXBuilderFactory());
        loader.setLocation(Main.class.getResource(fxml));
        AnchorPane page;
        try {
            page = (AnchorPane) loader.load(in);
        } finally {
            in.close();
        } 
        Scene scene = new Scene(page, 800, 600);
        stage.setScene(scene);
        stage.sizeToScene();
        return (Initializable) loader.getController();
    }
}
