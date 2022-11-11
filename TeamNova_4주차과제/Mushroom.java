package TeamNova_4주차과제;

import java.util.Random;

public class Mushroom extends Monster{

    Random random = new Random();

    Mushroom(){
        this.name = "버섯";
        this.attack = 100;
        this.defense = 100;
        this.maxHp = 150;
        this.currentHp = this.maxHp;
        this.exp = 100 + random.nextInt(10)+1;
        this.money = 100 + random.nextInt(10)+1;

        this.dropItem = new Item("다크데모닉 모자",0,100,0,"모자",500,10);
    }
}
