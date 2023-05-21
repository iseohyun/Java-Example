package z_Music;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

public class Controllar implements Initializable {
    @FXML
    private Label name;
    
    @FXML
    private Slider volumn;
    
    @FXML
    private ProgressBar time;
    
    @FXML
    private Button play, pause, reset, previous, next;
    
    @FXML
    private ComboBox<String> speed;
    
    private Media media;
    private MediaPlayer mediaPlayer;
    
    private File directory;
    private File[] files;
    
    private ArrayList<File> songs;
    
    private int songNumber;
    private int[] speedOpt = {25, 50, 75, 100, 125, 150, 175, 200};
    
    private Timer timer;
    private TimerTask task;
    private boolean running;
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        songs = new ArrayList<File>();
        //directory = new File("Song");
        directory = new File("WindowCode/Song");
        files = directory.listFiles();
        if(files != null) {
            for(File file : files) {
                songs.add(file);
            }
        }
        media = new Media(songs.get(songNumber).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        name.setText(songs.get(songNumber).getName());
        
        for(int spd : speedOpt) {
            speed.getItems().add(Integer.toString(spd)+"%");
        }
        speed.setOnAction(this::changeSpeed);
        
        volumn.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
                mediaPlayer.setVolume(volumn.getValue()*0.01);
            }
        });
    }

    public void play() {
        begin();
        changeSpeed(null);
        mediaPlayer.setVolume(volumn.getValue()*0.01);
        mediaPlayer.play();
    }

    public void pause() {
        end();
        mediaPlayer.pause();
    }

    public void reset() {
        time.setProgress(0);
        mediaPlayer.seek(Duration.seconds(0));
    }

    public void previous() {
        if(songNumber > 0) {
            songNumber--;
            mediaPlayer.stop();
            if(running) {
                end();
            }
            media = new Media(songs.get(songNumber).toURI().toString());
            mediaPlayer = new MediaPlayer(media);
            name.setText(songs.get(songNumber).getName());
            play();
        }
    }

    public void next() {
        if(songNumber < songs.size()-1) {
            songNumber++;
            mediaPlayer.stop();
            if(running) {
                end();
            }
            media = new Media(songs.get(songNumber).toURI().toString());
            mediaPlayer = new MediaPlayer(media);
            name.setText(songs.get(songNumber).getName());
            play();
        }
    }

    public void changeSpeed(ActionEvent event) {
        if(speed.getValue() == null) {
            mediaPlayer.setRate(1);
        }else		{
            mediaPlayer.setRate(Integer.parseInt(speed.getValue().substring(0, speed.getValue().length()-1))*0.01);
        }
    }
    public void begin() {
        timer = new Timer();
        task = new TimerTask() {
            @Override
            public void run() {
                running = true;
                double current = mediaPlayer.getCurrentTime().toSeconds();
                double end = media.getDuration().toSeconds();
                time.setProgress(current/end);
                
                if(current/end == 1) {
                    end();
                }
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000);
    }
    public void end() {
        running = false;
        timer.cancel();
    }
}