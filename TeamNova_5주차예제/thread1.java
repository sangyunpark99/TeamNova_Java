package TeamNova_5주차예제;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class thread1 extends Thread{
    File file;
    Clip clip;

    AudioInputStream audioInputStream;

    thread1(String path){
        this.file = new File(path);
    }
    @Override
    public void run() {
        super.run();

        try {
            audioInputStream = AudioSystem.getAudioInputStream(file);
        } catch (UnsupportedAudioFileException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            clip = AudioSystem.getClip();
        } catch (LineUnavailableException e) {
            throw new RuntimeException(e);
        }

        try {
            clip.open(audioInputStream);
        } catch (LineUnavailableException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        clip.start();
    }
}
