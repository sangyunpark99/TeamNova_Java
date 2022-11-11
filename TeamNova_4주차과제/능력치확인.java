package TeamNova_4주차과제;

import java.util.*;

public class 능력치확인 {
    Character ch;
    String job;

    능력치확인(Character getCh){

        ch = getCh;
        this.job = ch.job;
    }

    public void start(){
        
        List<Skill> skills = new ArrayList<Skill>();
        int selectedNum = 0;
        Scanner sc = new Scanner(System.in);

        if(job == "Warrior"){
            if(ch.전직){
                skills = ((PowerWarrior)ch).powerSkills;
                System.out.println("스킬 스텟");
            }else{
                skills = ((Warrior)ch).skills;
            }
        }else if(job == "Wizard"){
            if(ch.전직){
                skills = ((PowerWizard)ch).powerSkills;
            }else{
                skills = ((Wizard)ch).skills;
            }
        }else if(job == "Archer"){
            if(ch.전직){
                skills = ((PowerArcher)ch).powerSkills;
            }else{
                skills = ((Archer)ch).skills;
            }
        }else if(job == "Bandit"){
            if(ch.전직){
                skills = ((PowerBandit)ch).powerSkills;
            }else{
                skills = ((Bandit)ch).skills;
            }
        }

        System.out.println();
        System.out.println("--------------능력치확인-------------");
        System.out.println();
        System.out.println("# 기본 스텟");
        System.out.println();
        System.out.println("레벨 : " + ch.level);
        System.out.println();
        System.out.println("체력 : " + ch.maxHp);
        System.out.println("마나 : " + ch.maxMp);
        System.out.println("힘 : " + ch.attack);
        System.out.println("방어력 : " + ch.defense);
        System.out.println();

        System.out.println("# 스킬 스텟");
        System.out.println();
        for(int i = 0; i < skills.size(); i++){
            System.out.printf("(%s)의 스텟 : %d", skills.get(i).name,skills.get(i).skillAttack );
            System.out.println();
        }

        System.out.println();
        System.out.println("# 장착한 장비");
        System.out.println("상의 : " + ch.equipment.get("상의").name);
        System.out.println("하의 : " + ch.equipment.get("하의").name);
        System.out.println("모자 : " + ch.equipment.get("모자").name);
        System.out.println("신발 : " + ch.equipment.get("신발").name);
        System.out.println("목걸이 : " + ch.equipment.get("목걸이").name);
        System.out.println("무기 : " + ch.equipment.get("무기").name);
        System.out.println();
        System.out.println("----------------------------------");

        System.out.println("아무 숫자 입력시 나가집니다.");
        selectedNum = sc.nextInt();
    }
}
