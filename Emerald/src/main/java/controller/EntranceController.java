package controller;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URISyntaxException;

public class EntranceController extends Application {
    @FXML
    private Text errorText;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button tryIt;

    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
    }
    @FXML
    void entranceButton(ActionEvent event) throws IOException {
       if( passwordField.getText().equals("OpalEmerald")){
           Parent root = FXMLLoader.load(getClass().getResource("/fxml/CakePage.fxml"));
           Stage s1 = (Stage) ((Node) event.getSource()).getScene().getWindow();
           Scene scene = new Scene(root);
           s1.setScene(scene);
           s1.show();
       }
       else {
           errorText.setText("Ooookhey :)");
       }
    }

}
