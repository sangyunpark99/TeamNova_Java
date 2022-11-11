package TeamNova_4주차과제;

import java.util.List;

public class MonsterAttackThread implements Runnable{

    Character ch;
    Monster monster;
    사냥하기 사냥하기;

    MonsterAttackThread(Character ch, Monster monster, 사냥하기 사냥하기){
        this.ch = ch;
        this.monster = monster;
        this.사냥하기 = 사냥하기;
    }

    @Override
    public void run() {

        // interrupt로 쓰레드 종료
        while(ch.currentHp>0 && monster.currentHp >0 && !Thread.currentThread().isInterrupted()){ // 현재 쓰레드 인터럽트인 경우 쓰레드 종료

            사냥하기.monsterAttack();

            if(ch.currentHp <= 0){
                System.out.println("----------------------------------");
                System.out.println("캐릭터가 죽었습니다.. 부활하도록 하겠습니다.");
                System.out.println("패널티 : 1레벨부터 다시 시작");
                System.out.println("아무숫자나 입력하세요.");
                System.out.println("----------------------------------");
                break;
            }

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // 인터럽트 되는 경우 현재 쓰레드 인터럽트
            }
        }
    }
}
