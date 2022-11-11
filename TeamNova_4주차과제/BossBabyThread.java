package TeamNova_4주차과제;

import java.util.Random;

public class BossBabyThread implements Runnable{

    Character ch;
    BossBaby bb;
    보스잡기 보스잡기;

    BossBabyThread(Character getCh, Monster getBb,보스잡기 보스잡기){
        ch = getCh;
        bb = ((BossBaby) getBb);
        this.보스잡기 = 보스잡기;
    }

    @Override
    public void run() {

        while(ch.currentHp > 0 && bb.currentHp > 0 && !Thread.currentThread().isInterrupted()){ // 보스 베이비 공격 쓰레드

            try {
                보스잡기.bossBabyAttack(); // 보스잡기 object 메소드 공유
            } catch (InterruptedException e) {

            }

            if(ch.currentHp <= 0){
                System.out.println("----------------------------------");
                System.out.println("캐릭터가 죽었습니다.. 부활하도록 하겠습니다.");
                System.out.println("패널티 : 1레벨부터 다시 시작");
                System.out.println("아무숫자나 입력하세요.");
                System.out.println("----------------------------------");
                break;
            }

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
