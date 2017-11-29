package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    Stage mStage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        mStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("layouts/mainScreen.fxml"));
        primaryStage.setTitle("Weightlifting 2017");
        primaryStage.setScene(new Scene(root, 800, 800));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
