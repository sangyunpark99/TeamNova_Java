package TeamNova_4주차과제;

import java.util.HashMap;
import java.util.Random;

public class Monster {

    Random random = new Random();

    String name;

    int maxHp; // 몬스터 최대체력
    int currentHp; // 몬스터 현재 체력
    int attack; // 몬스터 공격력
    int defense; // 몬스터 방어력

    // 죽으면 나오는 아이템, 돈, 경험치
    Item dropItem; // 몬스터 아이템(몬스터 종류마다 다름)
    int money; // 돈
    int exp; // 경험치

    public void attack(Character ch){ // 몬스터가 사람 공격

        System.out.println();
        System.out.println("----------------------------------");
        System.out.println(this.name + "공격!");
        System.out.println(ch.name+"의 HP : " + ch.currentHp);
        System.out.println(this.name + "의 공격력 : " +this.attack + " | " + ch.name + "의 방어력 : " + ch.defense );

        if(this.attack > ch.defense){
            System.out.println(ch.name +"에게 가해진 공격 : " + (this.attack - ch.defense));
            ch.currentHp -= (this.attack - ch.defense);
        }else{
            System.out.printf("%s에게 공격이 통하지 않습니다.",ch.name);
            System.out.println();
        }

        if(ch.currentHp > 0){ // 주인공이 죽은 경우에 피를 보여줄 필요는 없다.
            System.out.println(ch.name + "의 HP : " + ch.currentHp);
        }
        System.out.println("----------------------------------");
    }

    public Item dropItem(){ // 몬스터 잡았을 경우 떨어트리는 아이템
       // 아이템만

        int equipmentPercent = random.nextInt(10)+1;

        if(equipmentPercent>1){ // 90% 확률로 장비, 돈, 경험치 획득.
            return this.dropItem;
        }

        return null; // HashMap 형태로 return
    }
}
