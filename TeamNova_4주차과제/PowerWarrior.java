package TeamNova_4주차과제;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PowerWarrior extends Warrior{

    List<Skill> powerSkills = new ArrayList<>();

    Boolean powerUpSkill = false;

    PowerWarrior(String name,String job) {
        super(name,job);

        this.powerSkills.add(new Skill("파이널 어택",200,60));
        this.powerSkills.add(new Skill("브랜디쉬",250,70));
        this.powerSkills.add(new Skill("웨폰 부스터",50,60));
    }

    public void powerSkill(Monster monster, Skill skill){

        System.out.println("----------------------------------");
        System.out.println(this.name +" "+skill.name+"!");
        System.out.println();


        if(skill.name == "파이널 어택"){
            skill.useMp = 60;
        }else if(skill.name == "브랜디쉬"){
            skill.useMp = 70;
        }else{
            skill.useMp = 60;
        }

        if(skill.useMp > this.currentMp){ // 마나가 부족한 경우
            System.out.println("마나가 부족합니다");
        }else{
            System.out.println("스킬 사용 전 마나 : " + this.currentMp);
            this.currentMp -= skill.useMp; // 사용되는 MP
            System.out.printf("마나 %d 소모",skill.useMp);
            System.out.println();
            System.out.println("스킬 사용 후 마나 : " + this.currentMp);

            if(skill.name == "파이널 어택" || skill.name == "브랜디쉬"){
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
            }else {

                if(!powerUpSkill){
                    System.out.println();
                    System.out.printf("공격력 %d 증가(3초)",skill.skillAttack);
                    System.out.println();

                    Thread powerUpSkillThread = new Thread(()->{

                        powerUpSkill = true;

                        for(Skill s : powerSkills){
                            if(s.name == "파이널 어택" || s.name == "브랜디쉬"){
                                s.skillAttack += skill.skillAttack;
                            }
                        }

                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                        powerUpSkill = false;

                        for(Skill s : powerSkills){
                            if(s.name == "파이널 어택" || s.name == "브랜디쉬"){
                                s.skillAttack -= skill.skillAttack;
                            }
                        }
                    });

                    powerUpSkillThread.start();

                }else{
                    System.out.println("스킬 지속시간이 끝나지 않아 사용할 수 없습니다.");
                }

            }

            System.out.println("----------------------------------");
        }
    }
}
