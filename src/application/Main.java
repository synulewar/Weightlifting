package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import res.StringContract;

public class Main extends Application {

    Stage mStage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        mStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("layouts/mainScreen.fxml"));
        primaryStage.setTitle(StringContract.APP_NAME);
        primaryStage.setScene(new Scene(root, ApplicationDefaults.APPLICATION_WIDTH, ApplicationDefaults.APPLICATION_HEIGHT));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
