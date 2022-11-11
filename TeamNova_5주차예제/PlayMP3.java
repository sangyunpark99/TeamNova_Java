package TeamNova_5주차예제;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class PlayMP3 {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {

        File file = new File("./src/달팽이숲.wav");

        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);

        Clip clip = AudioSystem.getClip();

        clip.open(audioInputStream);


        System.out.println(Thread.currentThread());

        while(true){
            clip.start();

            System.out.println("음악 쓰레드");
            Thread.sleep(2000);

        } // 노래 재생하는 부분

    }
}
