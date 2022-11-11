package TeamNova_4주차과제;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Character {

    // Unit 몬스터, 캐릭터 둘 다 쓰이는 부분
    // 피, 공격력, 방어력

    // 캐릭터 별로 공통적으로 쓰이는 부분
    String name; // 이름
    int exp; // 현재 경험치 (100% 기준)

    int maxHp; // 최대 HP
    int maxMp; // 최대 MP -> 직업마다 다르게 부여, 직업마다 오르는 수치도 다르게 부여

    int currentHp; // 현재 HP
    int currentMp; // 현재 MP

    int skillPoint; // 사용 가능한 스킬포인트(스킬을 강화하기 위한 데이터)
    int level; // 현재 캐릭터 레벨

    int attack; // 공격력

    int attackDefault;

    int defense; // 방어력

    int defenseDefault;

    int money; // 돈

    String job;

    List<Item> itemList = new ArrayList<>();

    int liquidMedicineHp; // HP 물약 갯수
    int liquidMedicineMp; // MP 물약 갯수

    HashMap<String,Item> equipment = new HashMap<String,Item>();

    // 전직 가능 여부
    Boolean 전직;

    // 보스의 증표
    Boolean bossticket = false;

    Boolean gameClear = false; // 게임 클리어 조건

    EffectMusicThread monsterHitMusic = new EffectMusicThread("./src/캐릭터공격소리.wav"); // 캐릭터 공격효과음
    EffectMusicThread levelUpMusic = new EffectMusicThread("./src/캐릭터레벨업.wav");

    Character(String name,String job){
        this.name = name; // 이름 생성
        this.skillPoint = 0; // 스킬 포인트 0으로 초기화
        this.level = 1; // 레벨 1로 초기화
        this.money = 0;
        this.exp = 0;
        this.liquidMedicineMp = 1;
        this.liquidMedicineHp = 1;
        this.전직 = false;
        this.job = job;

        // 총 6개의 장비가 존재한다.
        equipment.put("상의",new Item("허름한 상의",0,0,0,"상의",0,1));
        equipment.put("하의",new Item("허름한 하의",0,0,0,"하의",0,1));
        equipment.put("신발",new Item("허름한 신발",0,0,0,"신발",0,1));
        equipment.put("모자",new Item("허름한 모자",0,0,0,"모자",0,1));
        equipment.put("목걸이",new Item("허름한 목걸이",0,0,0,"목걸이",0,1));

        if(name.length()>0){ // 캐릭터가 생성되었을때
            System.out.println();
            System.out.println("캐릭터가 생성 되었습니다!");
        }
    }

    // 기본 공격
    public void defaultAttack(Monster monster, String job){ // 기본 공격 + HP 보여주기

        monsterHitMusic.run();

        System.out.println();
        System.out.println("----------------------------------");
        System.out.println(this.name + " 기본 공격!");
        System.out.println(monster.name + "의 HP : " + monster.currentHp);
        System.out.println(this.name + "의 기본 공격력 : " + this.attack +"  "+monster.name + "의 방어력 : " + monster.defense);
        System.out.println("몬스터에게 가해진 공격 : " + (this.attack - monster.defense));

        if(this.attack >= monster.defense){ // 캐릭터 공격력이 더 큰 경우 공격
            monster.currentHp -= this.attack - monster.defense;
        }else{ // 몬스터의 방어력이 더 큰경우 공격이 통하지 않는다.
            System.out.printf("%s에게 공격이 통하지 않습니다",monster.name);
            System.out.println();
            return;
        }

        if(monster.currentHp>0){ // 몬스터의 피가 0보다 큰 경우에만 보여준다
            System.out.println(monster.name + "의 HP : " + monster.currentHp);
        }

        if(job == "Bandit"){

            System.out.println();
            ((Bandit)this).dagger -= 1;
            System.out.println("표창 1개 소모");
            System.out.printf("현재 표창 갯수 : %d",((Bandit) this).dagger);
            System.out.println();

        }else if(job == "Archer"){

            System.out.println();
            ((Archer)this).arrow -= 1;
            System.out.println("화살 1개 소모");
            System.out.printf("현재 화살 갯수 : %d",((Archer) this).arrow);
            System.out.println();
        }
        System.out.println("----------------------------------");
    }

    public void getItem(Item item) {
        if(item!=null){ // 몬스터가 장비를 갖고 있는 경우
            System.out.println(item.name + "획득 !!");
            this.itemList.add(item);
        }
    }

    public void setLevel(){

        if(exp >= 50*level){
            // 이전 레벨업에 필요한 경험치 제거
            level++;

            levelUpMusic.run();

            exp = exp - (level-1)*50;

            skillPoint+=3;
            attack+=10; // 공격력 업그레이드
            defense+=10; // 방어력 업그레이드

            // 전사, 마법사, 궁수, 도적 피, 마나 업그레이드

            maxMp += 50; // 최대 HP 증가
            maxHp += 50; // 최대 MP 증가

            currentHp = maxHp;
            currentMp = maxMp;

            System.out.println();
            System.out.println("레벨업!!");
            System.out.println("스킬 포인트 3개 획득");


            if(level == 5){ // 전직 가능 확인
                System.out.println();
                System.out.println("전직가능한 레벨에 도달하였습니다!");
            }

            if(level > 5 && !전직){
                System.out.println("전직이 가능합니다! 전직을 해주세요");
            }


            if(level == 6){ // 버섯의 숲 사냥터 이용
                System.out.println();
                System.out.println("현재 레벨이 6이므로 버섯의 숲 사냥터를 이용할 수 있습니다!");
                System.out.println();
            }

            if(level == 10){
                System.out.println();
                System.out.println("보스를 잡을 수 있는 레벨이 되었습니다!");
                System.out.println("보스를 사냥해 게임을 클리어하세요.");
            }
        }


        System.out.println();
        System.out.printf("현재 레벨 : %d", level);
        System.out.println();

        System.out.printf("현재 경험치 : %d / %d", exp , (level)*50);

        System.out.println();
    }

    public void death(){

        this.exp = 0;
        this.maxHp -= (level-1)*50;
        this.maxMp -= (level-1)*50;
        this.level = 1;
        this.전직 = false;
        // 직업별로 능력치 초기 피,마나,공격력,방어력,스킬 공격력
        this.currentHp = this.maxHp;
        this.currentMp = this.maxMp;
        this.attack = this.attackDefault;
        this.defense = this.defenseDefault;
        this.bossticket = false;
        this.itemList = new ArrayList<>(); // 아이템 초기화


        equipment.put("상의",new Item("허름한 상의",0,0,0,"상의",0,1));
        equipment.put("하의",new Item("허름한 하의",0,0,0,"하의",0,1));
        equipment.put("신발",new Item("허름한 신발",0,0,0,"신발",0,1));
        equipment.put("모자",new Item("허름한 모자",0,0,0,"모자",0,1));
        equipment.put("목걸이",new Item("허름한 목걸이",0,0,0,"목걸이",0,1));

        // 스킬 공격 초기화

        if(job == "Warrior"){

            if(this.전직){
                for(Skill s : ((PowerWarrior)this).powerSkills){
                    s.skillAttack = s.defaultSkillAttack;
                }
            }else{
                for(Skill s : ((Warrior)this).skills){
                    s.skillAttack = s.defaultSkillAttack;
                }
            }

        }else if(job == "Wizard"){

            if(this.전직){
                for(Skill s : ((PowerWizard)this).powerSkills){
                    s.skillAttack = s.defaultSkillAttack;
                }
            }else{
                for(Skill s : ((Wizard)this).skills){
                    s.skillAttack = s.defaultSkillAttack;
                }
            }

        }else if(job == "Archer"){

            ((Archer)this).arrow = 100;


            if(this.전직){
                for(Skill s : ((PowerArcher)this).powerSkills){
                    s.skillAttack = s.defaultSkillAttack;
                }
            }else{
                for(Skill s : ((Archer)this).skills){
                    s.skillAttack = s.defaultSkillAttack;
                }
            }

        }else{

            ((Bandit)this).dagger = 100;

            if(this.전직){
                for(Skill s : ((PowerBandit)this).powerSkills){
                    s.skillAttack = s.defaultSkillAttack;
                }
            }else{
                for(Skill s : ((Bandit)this).skills){
                    s.skillAttack = s.defaultSkillAttack;
                }
            }

        }
    }
}
