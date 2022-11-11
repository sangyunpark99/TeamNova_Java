package TeamNova_4주차과제;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BossBaby extends Monster{

    Random random = new Random();

    List<Skill> skills = new ArrayList<>();

    BossBaby(){
        this.name = "아기 붉으스름한 버섯달팽이";
        this.attack = 500;
        this.defense = 300;
        this.maxHp = 500;
        this.currentHp = this.maxHp;

        skills.add(new Skill("응애 울부짖기",700,0));
        skills.add(new Skill("분유 어택",700,0));

    }

    public void skill(Character ch){
        int skillSelect = random.nextInt(2); // 0 ~ 1

        int skillAttack = skills.get(skillSelect).skillAttack;

        System.out.println("----------------------------------");
        System.out.println(this.name + " " + skills.get(skillSelect).name + "!");
        System.out.println(ch.name+"의 HP : " + ch.currentHp);
        System.out.println(this.name + "의 스킬 공격력 : " + skillAttack + " | " + ch.name + "의 방어력 : " + ch.defense );
        if(skillAttack > ch.defense){
            System.out.println(ch.name +"에게 가해진 공격 : " + (skillAttack - ch.defense));
            ch.currentHp -= (skillAttack - ch.defense);
        }else{
            System.out.printf("%s에게 공격이 통하지 않습니다.",ch.name);
            System.out.println();
        }

        if(ch.currentHp > 0){ // 주인공이 죽은 경우에 피를 보여줄 필요는 없다.
            System.out.println(ch.name + "의 HP : " + ch.currentHp);
        }

        System.out.println("----------------------------------");
    }

}
