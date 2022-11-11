package TeamNova_4주차과제;

import java.util.ArrayList;
import java.util.List;
public class PowerWizard extends Wizard{

    List<Skill> powerSkills = new ArrayList<>();


    PowerWizard(String name,String job) {
        super(name,job);

        this.powerSkills.add(new Skill("썬더 볼트",250,90));
        this.powerSkills.add(new Skill("콜드 빔",300,100));
        this.powerSkills.add(new Skill("매직 스틸 아머",100,80));

    }

    public void powerSkill(Monster monster, Skill skill){

        System.out.println("----------------------------------");
        System.out.println(this.name +" "+skill.name+"!");
        System.out.println();

        if(skill.useMp > this.currentMp){ // 마나가 부족한 경우
            System.out.println("마나가 부족합니다");
            return;
        }

        if(skill.name == "썬더 볼트" || skill.name == "콜드 빔"){

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
        }else {
            if(!powerUpSkill){

                System.out.println("스킬 사용 전 마나 : " + this.currentMp);
                this.currentMp -= skill.useMp; // 사용되는 MP
                System.out.printf("마나 %d 소모",skill.useMp);
                System.out.println();
                System.out.println("스킬 사용 후 마나 : " + this.currentMp);


                System.out.println();
                System.out.printf("방어력 %d 증가(3초)",skill.skillAttack);
                System.out.println();

                Thread powerUpSkillThread = new Thread(() -> { // 람다식으로 변경하니 상속받은 클래스 변수 참조가능
                    powerUpSkill = true;

                    this.defense += skill.skillAttack;

                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    powerUpSkill = false;
                    this.defense -= skill.skillAttack;
                });

                powerUpSkillThread.start();
            }else{
                System.out.println("스킬 지속시간이 끝나지 않아 사용할 수 없습니다.");
            }
        }

        System.out.println("----------------------------------");
    }
}
