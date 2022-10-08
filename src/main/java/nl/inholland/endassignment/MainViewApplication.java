package nl.inholland.endassignment;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MainViewApplication extends Application{

    private String message;

    public MainViewApplication(String message) {
        this.message = message;
    }

    @Override
    public void start(Stage stage) throws Exception {

//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("main-view.fxml"));
//        MainViewApplication mainController = new MainViewApplication("Welcome to the main view");
//        fxmlLoader.setController(mainController);
//     //   Scene scene = new Scene(fxmlLoader.load(), 320, 140);
//        stage.setTitle("Hello!");


        Parent root = FXMLLoader.load(getClass().getResource("main-view.fxml"));
        Scene scene = new Scene(root, 320, 140);
        stage.setScene(scene);
        stage.show();

    }
}