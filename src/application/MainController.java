package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Control;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;
import res.StringContract;

import java.io.IOException;

public class MainController {

    Stage mAppStage = new Stage();

    @FXML
    private MenuItem weightItem;
    @FXML
    private MenuItem competitionItem;
    @FXML
    private MenuItem instruction;
    @FXML
    private MenuItem authors;
    @FXML
    private MenuItem close;


    @FXML
    private void weightStart() {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("layouts/Weightin.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        mAppStage.setTitle(StringContract.APP_NAME);
        mAppStage.setScene(new Scene(root, ApplicationDefaults.APPLICATION_WIDTH, ApplicationDefaults.APPLICATION_HEIGHT));
        mAppStage.show();
    }

    @FXML
    private void competitionStart() {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @FXML
    private void showInstruction() {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @FXML
    private void showAuthors() {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @FXML
    private void closeProgram() {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
    }
}
