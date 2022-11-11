package TeamNova_4주차과제;

import java.util.ArrayList;
import java.util.List;

public class Bandit extends Character{

    List<Skill> skills = new ArrayList<>();

    int dagger = 50; // 기본 표창 갯수 100개

    int skillDagger = 2; // 스킬 사용시 드는 표창 갯수

    Boolean powerUpSkill = false;

    Bandit(String name,String job) {
        super(name,job);

        this.maxHp = 400;
        this.maxMp = 400;

        this.currentHp = this.maxHp;
        this.currentMp = this.maxMp;

        this.attack = 25;
        this.defense = 25;

        this.attackDefault = this.attack; // 기본값
        this.defenseDefault = this.defense;// 기본값

        this.skills.add(new Skill("럭키 세븐",55,30));
        this.skills.add(new Skill("크리티컬 어택",50,20));
        this.skills.add(new Skill("목표 집중",20,30));

        System.out.println(name + " 님의" + " 직업은 \"도적\" 입니다.");
        System.out.printf("사용 가능 스킬 : [ %s, %s, %s ]",skills.get(0).name,skills.get(1).name,skills.get(2).name);
        System.out.println();

        equipment.put("무기",new Item("허름한 아대",0,0,0,"무기",0,1));
    }

    // 1차 스킬
    public void skill(Monster monster, Skill skill){

        System.out.println("----------------------------------");
        System.out.println(this.name +" "+skill.name+"!");
        System.out.println();


        if(skill.useMp > this.currentMp){ // 마나가 부족한 경우
            System.out.println("마나가 부족합니다");
            return;
        }


        // 스킬 사용시 출력문 작성
        if(skill.name == "럭키 세븐" || skill.name == "크리티컬 어택"){

            if(this.dagger<2){
                System.out.println("표창 갯수가 부족하여 스킬을 사용할 수 없습니다.");
            }else{

                System.out.println("스킬 사용 전 마나 : " + this.currentMp);
                this.currentMp -= skill.useMp; // 사용되는 MP
                System.out.printf("마나 %d 소모",skill.useMp);
                System.out.println();
                System.out.println("스킬 사용 후 마나 : " + this.currentMp);

                System.out.println();
                System.out.println("표창 2개 소모");
                this.dagger-=skillDagger;
                System.out.printf("현재 표창 갯수 : %d", this.dagger);
                System.out.println();

                System.out.println();
                System.out.println(monster.name + "의 HP : " + monster.currentHp);
                System.out.println(this.name + "의 스킬 공격력 : " + skill.skillAttack +" | "+monster.name + "의 방어력 : " + monster.defense);
                System.out.println(monster.name +"에게 가해진 공격 : " + (skill.skillAttack - monster.defense));

                if(skill.skillAttack >= monster.defense){
                    monster.currentHp -= skill.skillAttack - monster.defense;
                }else{
                    System.out.printf("%s에게 공격이 통하지 않습니다",monster.name);
                }

                if(monster.currentHp>0){ // 몬스터의 피가 0보다 큰 경우에만 보여준다
                    System.out.println(monster.name + "의 HP : " + monster.maxHp);
                }
            }
        }else { // 목표 집중

            if(!powerUpSkill){

                System.out.println("스킬 사용 전 마나 : " + this.currentMp);
                this.currentMp -= skill.useMp; // 사용되는 MP
                System.out.printf("마나 %d 소모",skill.useMp);
                System.out.println();
                System.out.println("스킬 사용 후 마나 : " + this.currentMp);

                System.out.println();
                System.out.printf("스킬 공격력 %d 증가(3초)",skill.skillAttack);
                System.out.println();

                Thread powerUpSkillThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        powerUpSkill = true;
                        for(Skill s : skills){
                            if(s.name == "럭키 세븐" || s.name == "크리티컬 어택"){
                                s.skillAttack += skill.skillAttack; // 공격력 상승
                            }
                        }

                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                        powerUpSkill = false;
                        for(Skill s : skills){
                            if(s.name == "럭키 세븐" || s.name == "크리티컬 어택"){
                                s.skillAttack -= skill.skillAttack; // 공격력 상승
                            }
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
