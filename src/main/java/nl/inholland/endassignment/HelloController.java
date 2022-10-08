package nl.inholland.endassignment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import nl.inholland.endassignment.Model.User;
import nl.inholland.endassignment.Model.Database;

import java.io.IOException;
import java.util.List;

public class HelloController {
    @FXML
    private Parent root;
    @FXML
    private Scene scene;
    @FXML
    private Stage stage;
    @FXML
    private Label testLabel;
    @FXML
    private Button btn_Login;

    @FXML
    private TextField txtUsername;

    @FXML
    private PasswordField txtPassword;


    @FXML
    protected void onLoginButtonClick(ActionEvent event) throws IOException {
        Database db = new Database();
        List<User> users = db.users;
        User user1 = new User();
        user1.username = txtUsername.getText();
        user1.password = txtPassword.getText();

        if (validateLogin(users, user1.getUsername(), user1.getPassword())) {
            testLabel.setText("Welcome " + user1.getUsername() + "!");
            Stage loginStage = (Stage) btn_Login.getScene().getWindow();
            loginStage.close();
            openMainView(event);
        } else {
            testLabel.setText("Password or username is wrong, please try again.");
        }
    }

    protected boolean validateLogin(List<User> users, String username, String password) {
        for (User user : users) {
            if ((user.getUsername().equals(username.trim())) && (user.getPassword().equals(password.trim()))) {
                return true;
            }
        }
        return false;
    }

    public void openMainView(ActionEvent event) throws IOException {

        root = FXMLLoader.load(getClass().getResource("main-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}

