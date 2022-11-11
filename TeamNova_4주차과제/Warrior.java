package TeamNova_4주차과제;

import java.util.ArrayList;
import java.util.List;

public class Warrior extends Character{

    List<Skill> skills = new ArrayList<>();

    Warrior(String name,String job) {
        super(name,job); // 부모에서 사용한 constructor 사용
        this.maxHp = 500;
        this.maxMp = 300;

        this.currentHp = this.maxHp;
        this.currentMp = this.maxMp;

        this.attack = 20;
        this.defense = 30;

        this.attackDefault = this.attack;
        this.defenseDefault = this.defense;

        // 스킬 이름 + 공격력

        this.skills.add(new Skill("슬래시 블러스트",50,20));
        this.skills.add(new Skill("어퍼 차지",40,20));
        this.skills.add(new Skill("리프 어택",40,20));

        System.out.println(name + " 님의" + " 직업은 \"전사\" 입니다.");
        System.out.printf("사용 가능 스킬 : [ %s, %s, %s ]",skills.get(0).name,skills.get(1).name,skills.get(2).name);
        System.out.println();

        equipment.put("무기",new Item("허름한 양손검",0,0,0,"무기",0,1));
    }

    // 1차 스킬
    // 스킬명만 전달 받게되면 유용하게 사용이 가능하다.
    // 마나가 소모되는 양만 조절해주면 된다.
    public void skill(Monster monster, Skill skill){

        System.out.println("----------------------------------");
        System.out.println(this.name +" "+skill.name+"!");
        System.out.println();

        if(skill.useMp > this.currentMp){ // 마나가 부족한 경우
            System.out.println("마나가 부족합니다");
            return;
        }

        System.out.println("스킬 사용 전 마나 : " + this.currentMp);
        this.currentMp -= skill.useMp; // 사용되는 MP
        System.out.printf("마나 %d 소모",skill.useMp);
        System.out.println();
        System.out.println("스킬 사용 후 마나 : " + this.currentMp);

        System.out.println();
        System.out.println(monster.name + "의 HP : " + monster.currentHp);
        System.out.println(this.name + "의 스킬 공격력 : " + skill.skillAttack +" | "+monster.name + "의 방어력 : " + monster.defense);
        System.out.println(monster.name +"에게 가해진 공격 : " + (skill.skillAttack - monster.defense));

        if(skill.skillAttack >= monster.defense){
            monster.currentHp -= skill.skillAttack - monster.defense;
        }else{
            System.out.printf("%s에게 공격이 통하지 않습니다",monster.name);
            System.out.println();
        }

        if(monster.currentHp>0){ // 몬스터의 피가 0보다 큰 경우에만 보여준다
            System.out.println(monster.name + "의 HP : " + monster.maxHp);
        }

        System.out.println("----------------------------------");
    }
}
