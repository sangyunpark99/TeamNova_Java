package TeamNova_4주차과제;

import java.util.Random;

public class AddEventThread implements Runnable{

    사냥하기 사냥;

    AddEventThread(사냥하기 사냥하기){

       this.사냥 = 사냥하기;
    }

    @Override
    public void run() {

        Random random = new Random();

        int eventPercent = random.nextInt(10)+1; // 이벤트가 발생할 확률 50 %
        int eventTime = random.nextInt(5) + 10; // 10초 ~ 15초


        사냥.eventTimer = eventTime;

            if(eventPercent > 2){ // 80% 확률

                사냥.addPercent = random.nextInt(20) + 1;

                try {
                    Thread.sleep(eventTime*1000);
                } catch (InterruptedException e) {

                }

                System.out.println();
                System.out.println("# 이벤트가 종료되었습니다 #");
            }

        System.out.println();

        사냥.addPercent = 0;
    }
}
