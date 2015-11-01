package retailstore;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController implements Initializable {
    
    @FXML
    TextField usernameFld;
    
    @FXML
    PasswordField passwordFld;
    
    @FXML
    Button loginBtn;

    private Main application;

    public void setApp(Main application) {
        this.application = application;
    }

    public void processLogin(ActionEvent event) {
        if(application.login(usernameFld.getText(), passwordFld.getText())){
            application.gotoMainMenu();
        } else {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Грешка");
            String s ="Грешен потребител или парола.";
            alert.setContentText(s);
            alert.show();            
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}
