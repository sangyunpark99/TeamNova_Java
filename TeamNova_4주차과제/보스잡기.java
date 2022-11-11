package TeamNova_4주차과제;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class 보스잡기 {

    Character ch;
    Monster boss;
    Monster bossBaby;
    Scanner sc = new Scanner(System.in);
    String job;

    EffectMusicThread monsterHitMusic = new EffectMusicThread("./src/캐릭터공격소리.wav"); // 캐릭터 공격효과음
    EffectMusicThread monsterDeadMusic = new EffectMusicThread("./src/몬스터죽는소리.wav"); // 몬스터(달팽이)죽는소리

    BackgroundMusicThread bossBackgroundMusic = new BackgroundMusicThread("./src/보스던전.wav"); // 캐릭터 생성 음악


    int timer = 0;

    보스잡기(Character getCh){
        ch = getCh;
        this.job = ch.job;
        boss = new Boss();
        bossBaby = new BossBaby();
    }

    public void start(){

        Thread bossAttackThread = new Thread(new BossAttackThread(ch,boss,this));
        Thread bossBabyAttackThread = new Thread(new BossBabyThread(ch,bossBaby,this));

        int selectedNum = 0;

        // 보스 소멸 입장 조건
        if(!ch.bossticket){
            System.out.println();
            System.out.println("보스소멸 입장권을 갖고 있지않습니다!");
            System.out.println("퀘스트를 완료해주세요");
            return;
        }

        if(!ch.전직){
            System.out.println("전직을 해야 보스를 상대할 수 있습니다!");
            return;
        }

        if(ch.level < 10){
            System.out.println("10레벨을 아직 달성하지 못했습니다.");
            return;
        }

        if(job == "Archer"){
            if(((Archer)ch).arrow <= 0){
                System.out.println("화살을 갖고 있지 않습니다");
                return;
            }
        }

        if(job == "Bandit"){
            if(((Bandit)ch).dagger <= 0){
                System.out.println("표창을 갖고 있지 않습니다");
                return;
            }
        }

        bossBackgroundMusic.run();


        System.out.println();
        System.out.println("--------------최종보스-------------");
        System.out.println("보스 : 날 쓰러트려야 게임을 종료할 수 있다.");
        System.out.println();
        System.out.println("# 능력치 비교");
        System.out.printf("보스 공격력 : %d  보스 방어력 : %d  보스 체력 : %d",boss.attack,boss.defense,boss.maxHp);
        System.out.println();
        System.out.println();
        System.out.printf("보스 베이비 공격력 : %d 보스 베이비 방어력 : %d 보스 베이비 체력 : %d",bossBaby.attack, bossBaby.defense, bossBaby.maxHp);
        System.out.println();
        System.out.println();
        System.out.printf("캐릭터 공격력 : %d 캐릭터 방어력 : %d  캐릭터 체력 : %d",ch.attack,ch.defense,ch.maxHp);
        System.out.println();
        System.out.println();
        System.out.println("전투중에는 도망갈 수 없습니다. 죽게되면 처음부터 다시 해야 합니다.. 주의하세요!");
        System.out.println("전투에 필요한 물품들을 잘 챙기시길 바랍니다!");
        System.out.println("보스가 나오고 5초뒤에 보스베이비가 등장합니다!");
        System.out.println("보스베이비가 나오는 경우 보스 잡기 난이도가 최상으로 올라갑니다.");
        System.out.println();
        System.out.println("1. 싸운다  2. 도망간다");

        System.out.print("선택 : ");
        selectedNum = sc.nextInt();

        // 입장 조건 : 화살 o, 표창 o, 입장권 o

        List<Skill> skills = new ArrayList<>();


        if(this.job == "Warrior"){ // 전사인 경우
            skills = ((PowerWarrior)ch).powerSkills;
        }else if(this.job == "Wizard"){ // 마법사인 경우
            skills = ((PowerWizard)ch).powerSkills;
        }else if(this.job == "Archer"){ // 궁수인 경우
            skills = ((PowerArcher)ch).powerSkills;
        }else{ // 도적인 경우
            skills = ((PowerBandit)ch).powerSkills;
        }


        if(selectedNum == 1){ // 싸운다 선택

            System.out.println(boss.name + "이 등장했다!");

            System.out.println();
            System.out.printf("%s(을)를 공격하자",boss.name);
            System.out.println();
            System.out.printf("1. 기본공격 2. %s 3. %s 4. %s 5. 물약 먹기 ",skills.get(0).name,skills.get(1).name,skills.get(2).name);
            System.out.println();
            System.out.println();


            bossAttackThread.start(); // 보스 공격 쓰레드 시작


            Thread bornBaby = new Thread(new Runnable() { // 베이비 보스 탄생하기

                @Override
                public void run() {

                    while(!Thread.currentThread().isInterrupted() && boss.currentHp > 0){
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }

                        timer++;

                        if(timer == 5){
                            System.out.println();
                            System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
                            System.out.println("                             보스 베이비가 태어났습니다!                                          ");
                            System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
                            bossBabyAttackThread.start(); // 보스 베이비 공격 쓰레드 시작
                            break;
                        }
                    }
                }
            });


            bornBaby.start();


            while(true){

                startAttack(job); // 싸움 시작

                if(boss.currentHp <= 0){

                    bossBabyAttackThread.interrupt(); // 보스가 죽으면 보스베이비 죽음
                    bornBaby.interrupt(); // 보스가 죽으면 보스 베이비가 태어날 이유가 없다.

                    bossBackgroundMusic.stopMusic();
                    monsterDeadMusic.run();
                    System.out.println();
                    System.out.println("최종 보스를 쓰러트렸습니다!");
                    ch.gameClear = true; // 게임클리어를 위한 증표
                    break;
                }

                if(ch.currentHp <= 0){ // 모든 능력치 초기화
                    ch.death();
                    bossBackgroundMusic.stopMusic();
                    timer = 0;
                    break;
                }
            }
        }else if(selectedNum == 2){
            bossBackgroundMusic.stopMusic();
            System.out.println("도망쳤습니다...");
        }

    }

    public void startAttack(String job){ // 캐릭터 -> 보스 공격

        int selectedNum = 0;

        System.out.println();
        selectedNum = sc.nextInt();


        if(ch.currentHp > 0){
            if(selectedNum == 1){ // 기본 공격
                if(ch.maxHp > 0){
                    ch.defaultAttack(boss,this.job); // 캐릭터의 피가 0보다 큰 경우에만 공격 가능
                }

            }else if(selectedNum > 1 && selectedNum < 5){

                if(ch.currentHp > 0){
                    if(this.job == "Warrior"){

                        ((PowerWarrior) this.ch).powerSkill(boss,((PowerWarrior)ch).powerSkills.get(selectedNum-2)); // 스킬은 인덱스 0부터 / 스킬 선택은 인덱스 2부터 이므로 2를 빼주었다.


                    }else if(this.job == "Wizard"){

                        ((PowerWizard) this.ch).powerSkill(boss,((PowerWizard)ch).powerSkills.get(selectedNum-2));

                    }else if(this.job == "Archer"){

                        ((PowerArcher) this.ch).powerSkill(boss,((PowerArcher)ch).powerSkills.get(selectedNum-2));

                    }else{

                        ((PowerBandit) this.ch).powerSkill(boss,((PowerBandit)ch).powerSkills.get(selectedNum-2));

                    }
                }

                monsterHitMusic.run();

            }else if(selectedNum == 5){

                drinkLiquidMedicine(job);

            }else{
                System.out.println("선택한 항목이 존재하지 않습니다.");
            }
        }
    }
    public void drinkLiquidMedicine(String job){

        int defaultWarriorHp = 500;
        int defaultWizardHp = 350;
        int defaultArcherHp = 400;
        int defaultBanditHp = 400;

        int defaultWarriorMp = 300;
        int defaultWizardMp = 450;
        int defaultArcherMp = 400;
        int defaultBanditMP = 400;

        while(true){
            System.out.println();
            System.out.println("1. HP 물약  2. MP 물약  3. 나가기");
            System.out.print("선택 : ");

            int selectedNum = sc.nextInt();

            if(selectedNum == 1){ // HP를 최대한으로 채워준다.

                if(ch.liquidMedicineHp <= 0){
                    System.out.println();
                    System.out.println("HP 물약이 없습니다. 상점에서 구입하세요");
                    break;
                }else{

                    System.out.println();
                    System.out.println("HP 물약 섭취!");

                    ch.liquidMedicineHp-=1;
                    ch.currentHp = ch.maxHp;


                    System.out.println();
                    System.out.println("현재 HP : " + ch.currentHp);
                    System.out.println("현재 물약 갯수 : " + ch.liquidMedicineHp);
                }

            }else if(selectedNum == 2){ // MP를 최대한 채워준다.

                if(ch.liquidMedicineMp <= 0){
                    System.out.println("MP 물약이 없습니다. 상점에서 구입하세요");
                    break;
                }else{

                    System.out.println();
                    System.out.println("MP 물약 섭취!");

                    ch.liquidMedicineMp-=1;
                    ch.currentMp = ch.maxMp;

                    System.out.println();
                    System.out.println("현재 MP : " + ch.currentMp);
                    System.out.println("현재 물약 갯수 : " + ch.liquidMedicineMp);
                }

            }else if(selectedNum == 3){
                System.out.println();
                System.out.println("전투로 돌아갑니다..");
                break;
            }else{
                System.out.println();
                System.out.println("선택한 항목이 존재하지 않습니다.");
            }
        }
    }

    public synchronized void bossAttack() throws InterruptedException { // 보스 공격 메소드
        Random random = new Random();
        int skillPercent = random.nextInt(2);

        if(skillPercent == 1){
            // 보스 스킬 공격
            ((Boss)boss).skill(this.ch);
        }else{
            // 보스 기본 공격
            boss.attack(this.ch);
        }

        if(timer >= 5){
            notify();
            wait();
        }
    }

    public synchronized void bossBabyAttack() throws InterruptedException { // 보스 베이비 공격 메소드

        Random random = new Random();
        int skillPercent = random.nextInt(2);

        if(skillPercent == 1){
            // 보스 스킬 공격
            ((BossBaby)bossBaby).skill(this.ch);
        }else{
            // 보스 기본 공격
            bossBaby.attack(this.ch);
        }

        notify();
        wait();
    }
}
