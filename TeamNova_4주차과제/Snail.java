package TeamNova_4주차과제;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Snail extends Monster{

    Random random = new Random();

    Snail(){
        this.name = "달팽이";
        this.attack = 55;
        this.defense = 5;
        this.maxHp = 30;
        this.currentHp = this.maxHp;
        this.exp = 50 + random.nextInt(5)+1; // 1~4 랜덤으로 추가 부여하기
        this.dropItem = new Item("다크데모닉 상의",0,100,0,"상의",500,10);
        this.money = 50 + random.nextInt(5)+1; // 1~4 랜덤으로 추가 부여하기
    }
}