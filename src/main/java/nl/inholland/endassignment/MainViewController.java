package nl.inholland.endassignment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainViewController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void openMainView(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("main-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void onBtnAddMemberClick(ActionEvent event) throws IOException {

        root = FXMLLoader.load(getClass().getResource("add-user-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void onBtnDeleteMemberClick(ActionEvent event) throws IOException{

    }
    @FXML
    private void onBtnEditMemberClick(ActionEvent event){

    }
}
