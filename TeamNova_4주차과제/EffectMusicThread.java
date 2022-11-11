package TeamNova_4주차과제;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class EffectMusicThread extends Thread {
    File file;
    Clip clip;

    AudioInputStream audioInputStream;

    EffectMusicThread(String path){
        this.file = new File(path);
    }


    public void run(){ // 효과음
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

    public void stopMusic(){ // 음악 멈추기
        clip.close();
    }
}
