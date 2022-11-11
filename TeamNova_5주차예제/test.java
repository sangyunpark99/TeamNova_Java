package TeamNova_5주차예제;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;


public class test {

    public static void main(String[] args) throws UnsupportedAudioFileException, LineUnavailableException, IOException, InterruptedException {

        testNormal normal = new testNormal("./src/달팽이숲.wav");

        normal.startMusic();


        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("bye");
                }
            }
        }).start();

        while(true){
            System.out.println("Hi");
            Thread.sleep(3000);
        }

    }
}
