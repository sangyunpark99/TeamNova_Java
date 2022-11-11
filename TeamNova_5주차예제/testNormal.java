package TeamNova_5주차예제;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class testNormal {


    String path = "";

    File file;
    Clip clip;

    testNormal(String path){
        this.path = path;
    }


    public void startMusic() throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        file = new File(path);

        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);

        clip = AudioSystem.getClip();

        clip.open(audioInputStream);

        clip.start();


    }


    public void stopMusic(){
        clip.stop();
    }
}
