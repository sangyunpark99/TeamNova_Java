package TeamNova_4주차과제;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class BackgroundMusicThread extends Thread{

    File file;
    Clip clip;

    AudioInputStream audioInputStream;

    BackgroundMusicThread(String path){
        this.file = new File(path);
    }

    @Override
    public void run() { // 배경음악 재생
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

        clip.loop(-1); // 끝나면 계속 재생

    }

    public void stopMusic(){ // 음악 멈추기
        clip.close();
    }
}
