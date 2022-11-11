package TeamNova_4주차과제;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 스킬레벨업 {

    Scanner sc = new Scanner(System.in);

    String job;

    Character ch;

    스킬레벨업(Character getCh) {
        ch = getCh;
        this.job = ch.job;
    }

    public void start() {

        List<Skill> skills = new ArrayList<>();

        int selectedNum = 0;

        System.out.println();
        System.out.println("--------------스킬레벨업-------------");


        if(ch.skillPoint < 1){
            System.out.println("현재 갖고 있는 스킬포인트가 존재하지 않습니다...");
        }

        while (ch.skillPoint > 0) {
            System.out.println("현재 스킬 포인트 : " + ch.skillPoint);

            if(job == "Warrior"){

                if(ch.전직){
                    skills = ((PowerWarrior)ch).powerSkills;
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
            }else{ // 도적
                if(ch.전직){
                    skills = ((PowerBandit)ch).powerSkills;
                }else{
                    skills = ((Bandit)ch).skills;
                }
            }

            System.out.println();
            System.out.printf("1. %s  2. %s  3. %s",skills.get(0).name,skills.get(1).name,skills.get(2).name);

            System.out.println();
            System.out.print("선택 : ");
            selectedNum = sc.nextInt();


            if(selectedNum >= 1 && selectedNum <=3){
                skills.get(selectedNum-1).skillAttack += 5;

                System.out.printf("%s의 스킬 공격력이 5 증가 합니다!",skills.get(selectedNum-1).name);
                System.out.println();
                System.out.printf("%s의 스킬 파워 : %d ", skills.get(selectedNum-1).name,skills.get(selectedNum-1).skillAttack);
                System.out.println();

            }else{
                System.out.println("존재하지 않는 항목입니다.");
            }

            ch.skillPoint--;

            System.out.println("스킬 포인트가 1 감소합니다");

        }
            System.out.println("----------------------------------");
        }


}