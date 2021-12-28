package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.time.Duration;

public class main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // TODO Auto-generated method stub
        music();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/EntrancePage.fxml"));
        Parent root = loader.load();
        stage.setTitle("Emerald");
        stage.setScene(new Scene(root));
        stage.sizeToScene();
        stage.show();
    }
    MediaPlayer mediaPlayer;
    public void music(){
        Media h = new Media(Paths.get("/music/HBD.mp3").toUri().toString());
        mediaPlayer = new MediaPlayer(h);
        mediaPlayer.play();
    }
    public static void main(String[] args){
        launch(args);
    }
}



