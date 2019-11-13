package fxmaven;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    public static void main(String[] args) throws Exception {
        System.out.println("Test");
        launch(args);
    }

    public void start(Stage stage) throws Exception {
        AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("Hello.fxml"));
        Scene scene = new Scene(root, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}
