package TeamNova_4주차과제;

import java.util.*;

public class Boss extends Monster{


    Random random = new Random();


    List<Skill> skills = new ArrayList<>();

    Boss(){

        this.name = "붉으스름한 버섯달팽이";
        this.attack = 700;
        this.defense = 400;
        this.maxHp = 1000;
        this.currentHp = this.maxHp;

        skills.add(new Skill("메테오 달팽이 껍질",700,0));
        skills.add(new Skill("아이스 포자",700,0));
    }

    public void skill(Character ch){ // 보스 스킬 공격

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
