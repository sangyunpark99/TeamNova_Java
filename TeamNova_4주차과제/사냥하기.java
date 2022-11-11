package TeamNova_4주차과제;

import java.util.*;

public class 사냥하기 {

    Scanner sc = new Scanner(System.in);
    Character ch;

    Monster monster;

    String job;

    Random random = new Random();

    // 배경음악
    BackgroundMusicThread snailForestMusic = new BackgroundMusicThread("./src/달팽이숲.wav"); // 달팽이 숲 음악
    BackgroundMusicThread mushroomForestMusic = new BackgroundMusicThread("./src/버섯의숲.wav"); // 버섯의 숲 음악

    // 효과음악
    EffectMusicThread monsterHitMusic = new EffectMusicThread("./src/캐릭터공격소리.wav"); // 캐릭터 공격효과음
    EffectMusicThread monsterDeadMusic = new EffectMusicThread("./src/몬스터죽는소리.wav"); // 몬스터(달팽이)죽는소리

    Boolean snailForest = false; // 달팽이 사냥의 숲인지 버섯 사냥의 숲인지 구분

    // 추가 이벤트
    float addPercent = 0;
    int eventTimer = 0;

    사냥하기(Character getCh){ // 캐릭터 받아오기

        this.ch = getCh;
        this.job = ch.job;
    }

    public void start(){ // 사냥시작, 랜덤으로 생성

        Monster[] snails = {new Snail(), new BlueSnail(), new RedSnail()};
        Monster[] mushRooms = {new Mushroom(), new GreenMushroom(this.job), new OrangeMushroom()};

        monster = new Snail(); // start 메소드가 종료되는 시점에 monster 객체도 사라짐(메모리 누수x), 기본값으로 선언



        int selectedNum;

        // 궁수, 도적인 경우 화살, 표창 여부 파악하기
        if(job == "Archer"){
            if(((Archer)ch).arrow <= 0){
                System.out.println("갖고 있는 화살이 없습니다. 상점에서 화살을 구입해 주세요!");
                return;
            }
        }else if(job == "Bandit"){
            if(((Bandit)ch).dagger <= 0){
                System.out.println("갖고 있는 표창이 없습니다. 상점에서 표창을 구입해 주세요!");
                return;
            }
        }

        Thread addEventThread = new Thread(new AddEventThread(this));


        addEventThread.start();

        while(true){ // 존재하지 않은 항목 입력시 처음부터 다시 보여준다.

            System.out.println();
            System.out.println("사냥터를 선택해주세요.");
            System.out.println();
            System.out.println("1. 달팽이의 숲 - 레벨 1~5 추천");
            System.out.println("2. 버섯의 숲 - 레벨 6~10 추천");

            System.out.print("선택 : ");
            selectedNum = sc.nextInt();

            if(selectedNum == 1){ // 달팽이의 숲
                // 랜덤 함수 사용하여 달팽이 소환
                snailForestMusic.run();

                snailForest = true;

                if(ch.level > 5){
                    System.out.println();
                    System.out.println("현재 레벨이 추천레벨보다 높습니다");
                    System.out.println("1. 사냥하기  2. 다른 사냥터 이동하기");
                    System.out.print("선택 : ");
                    selectedNum = sc.nextInt();

                    if(selectedNum == 1){
                        monster = snails[random.nextInt(snails.length)];
                        break;
                    }else{
                        snailForestMusic.stopMusic();
                    }
                }else{

                    monster = snails[random.nextInt(snails.length)];
                    break;
                }
            }else if(selectedNum == 2){
                // 랜덤 함수 사용하여 버섯 소환
                mushroomForestMusic.run();

                snailForest = false;

                if(ch.level < 6){
                    System.out.println();
                    System.out.println("현재 레벨이 추천레벨보다 낮아 입장이 불가능합니다.");
                    mushroomForestMusic.stopMusic();
                }else{
                    monster = mushRooms[random.nextInt(mushRooms.length)];
                    break;
                }

            }else{
                System.out.println("존재하지 않는 항목입니다.");

            }
        }

        if(addPercent > 0){
            System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
            System.out.printf("                             경험치, 돈 %d퍼센트 추가 이벤트(%d초)                                ",(int)addPercent,eventTimer);
            System.out.println();
            System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
        }else{
            System.out.println();
            System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
            System.out.println("                             이벤트는 다음기회에.......                                       ");
            System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
        }




        Loop1 : while(true){

            System.out.println();
            System.out.println(monster.name + "(이)가 등장했다.");
            System.out.println();
            System.out.printf("%s 공격력 : %d | %s의 방어력 : %d",ch.name,ch.attack,monster.name,monster.defense);
            System.out.println();
            System.out.printf("%s 공격력 : %d | %s의 방어력 : %d",monster.name,monster.attack,ch.name,ch.defense);
            System.out.println();

            if(monster.defense >= ch.attack){
                System.out.println("몬스터의 방어력이 너무 높습니다.. 도망가는것을 추천합니다.");
            }

            if(job == "Archer" && ((Archer)ch).arrow <= 0){
                System.out.println("화살이 없으므로 즉시 도망칩니다!");
                addEventThread.interrupt();

                if(snailForest){
                    snailForestMusic.stopMusic();
                }else{
                    mushroomForestMusic.stopMusic();
                }

                break;
            }else if(job == "Bandit" && ((Bandit)ch).dagger <= 0){
                System.out.println("표창이 없으므로 즉시 도망칩니다!");
                addEventThread.interrupt();

                if(snailForest){
                    snailForestMusic.stopMusic();
                }else{
                    mushroomForestMusic.stopMusic();
                }

                break;
            }

            System.out.println();
            System.out.println("1. 싸운다 2. 도망간다");

            System.out.print("선택 : ");
            selectedNum = sc.nextInt();

            List<Skill> skills = setSkillName();

            Thread monsterAttackThread = new Thread(new MonsterAttackThread(ch,monster,this));

            if(selectedNum == 1){

                System.out.println();
                System.out.printf("%s(을)를 공격하자",monster.name);
                System.out.println();
                System.out.println();
                System.out.printf("1. 기본공격 2. %s 3. %s 4. %s  5. 물약 먹기  6. 도망 가기",skills.get(0).name,skills.get(1).name,skills.get(2).name);
                System.out.println();
                System.out.println();

                monsterAttackThread.start();

                while(true){ // 몬스터가 죽거나 사람이 죽을때까지 싸운다.

                    selectedNum = sc.nextInt();

                    if(this.job == "Archer"){ // 직업이 궁수인 경우

                        if(((Archer)ch).arrow<=0){ // 싸우다가 화살이 다 떨어진 경우

                            if(monster.currentHp <= 0){ // 화살은 다 떨여졌지만, 몬스터를 잡은 경우
                                System.out.println(monster.name + "을(를) 잡았습니다!");
                                ch.getItem(monster.dropItem());
                            }


                            if(snailForest){
                                snailForestMusic.stopMusic();
                            }else{
                                mushroomForestMusic.stopMusic();
                            }

                            System.out.println();
                            System.out.println("화살이 다 떨어졌습니다.. 즉시 도망칩니다!");
                            addEventThread.interrupt();
                            monsterAttackThread.interrupt(); // 화살이 다떨어진 경우 몬스터 공격 멈추기
                            break Loop1;
                        }
                        // 도적
                    }

                    if(this.job == "Bandit"){ // 직업이 도적인 경우

                        if(((Bandit)ch).dagger<=0){ // 싸우다가 표창이 다 떨어진 경우

                            if(monster.currentHp <= 0){ // 표창은 다 떨어졌지만, 몬스터를 잡은 경우
                                System.out.println(monster.name + "을(를) 잡았습니다!");
                                ch.getItem(monster.dropItem());
                            }

                            if(snailForest){
                                snailForestMusic.stopMusic();
                            }else{
                                mushroomForestMusic.stopMusic();
                            }

                            System.out.println();
                            System.out.println("표창이 다 떨어졌습니다.. 즉시 도망칩니다!");
                            addEventThread.interrupt();
                            monsterAttackThread.interrupt(); // 화살이 다 떨어진 경우 몬스터 공격 멈추기
                            break Loop1;
                        }
                    }


                    if(ch.currentHp > 0){
                        if(selectedNum >= 1 && selectedNum <6){ // 1 ~ 5까지
                            characterAttack(monster,selectedNum); // 캐릭터가 공격하는 차례
                        }else if(selectedNum == 6){ // 도망가기 선택

                            if(snailForest){
                                snailForestMusic.stopMusic();
                                snailForest = false;
                            }else{
                                mushroomForestMusic.stopMusic();
                            }

                            addEventThread.interrupt();
                            monsterAttackThread.interrupt();

                            System.out.println("도망 가기!");
                            break Loop1; // while문을 break해야 하므로 로직 안에다가 구현
                        }else{
                            System.out.println("선택한 항목이 존재하지 않습니다.");
                        }
                    }

                    if(monster.currentHp <= 0){ // 몬스터가 죽은 경우
                        System.out.println("----------------------------------");
                        System.out.println(monster.name + "을(를) 잡았습니다!");

                        if(addPercent > 0){
                            System.out.println("경험치 " + monster.exp + " 획득"); // 경험치 획득
                            System.out.println("추가경험치 " + (int)(monster.exp * (addPercent/100)) + " 획득");
                            System.out.println("돈 " + monster.money + " 획득"); // 돈 획득
                            System.out.println("추가 돈 " + (int)(monster.money * (addPercent/100)) + " 획득");
                        }else{
                            System.out.println("경험치 " + monster.exp + " 획득"); // 경험치 획득
                            System.out.println("돈 " + monster.money + " 획득"); // 돈 획득
                        }

                        ch.exp += monster.exp + (int)(monster.exp * (addPercent/100)); // 경험치 추가
                        ch.money += monster.money + (int)(monster.money * (addPercent/100)); // 돈 추가
                        ch.getItem(monster.dropItem()); // 아이템 얻기
                        ch.setLevel(); // 경험치 확인

                        monsterDeadMusic.run();

                        // 몬스터 재생성
                        if(snailForest){
                            Monster[] monsters = {new Snail(), new BlueSnail(), new RedSnail()};
                            monster = monsters[random.nextInt(3)];

                        }else{
                            Monster[] monsters = {new Mushroom(), new GreenMushroom(this.job), new OrangeMushroom()};
                            monster = monsters[random.nextInt(3)];
                        }

                        System.out.println("----------------------------------");

                        break;
                    }

                    if(ch.currentHp <= 0){ // 사람이 죽은 경우

                        addEventThread.interrupt(); // 이벤트 강제종료
                        monsterAttackThread.interrupt(); // 몬스터 공격 강제종료
                        ch.death(); // 피 초기화

                        if(snailForest){
                            snailForestMusic.stopMusic();
                            snailForest = false;
                        }else{
                            mushroomForestMusic.stopMusic();
                        }

                         break Loop1;
                    }

                }

            }else if(selectedNum == 2) { // 도망간다.

                if(snailForest){
                    snailForestMusic.stopMusic();
                }else{
                    mushroomForestMusic.stopMusic();
                }

                addEventThread.interrupt(); // 이벤트 강제종료
                monsterAttackThread.interrupt(); // 몬스터 공격 강제종료

                System.out.println();
                System.out.println("도망 치기 성공!");

                break;
            }else{

                System.out.println("존재하지 않는 항목입니다.");
            }
        }
    }

    public void drinkLiquidMedicine(){

        while(true){
            System.out.println();
            System.out.println("1. HP 물약  2. MP 물약  3. 나가기");

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

    public void monsterAttack(){

        Random random = new Random();

        if(monster.name == "달팽이" || monster.name == "버섯"){
            monster.attack(ch);
        }else{
            int skillPercent = random.nextInt(2)+1;

            if(skillPercent == 1){ // 50퍼센트 확률로 스킬 사용

                if(monster.name.contains("달팽이")){
                    if(monster.name == "빨간달팽이") {
                        ((RedSnail)monster).skill(this.ch);
                    }else if(monster.name == "파란달팽이"){
                        ((BlueSnail)monster).skill(this.ch);
                    }
                }else{

                    if(monster.name == "초록버섯"){
                        ((GreenMushroom)monster).skill(this.ch);
                    }else if(monster.name == "주황버섯"){
                        ((OrangeMushroom)monster).skill(this.ch);
                    }
                }


            }else{
                monster.attack(ch);
            }
        }
    }

    public List<Skill> setSkillName(){ // 각 직업별로 사용되는 스킬을 배열로 만들어준다.

        List<Skill> skills;

        if(ch.job == "Warrior"){ // 전사
            if(ch.전직){
                skills = ((PowerWarrior)ch).powerSkills;
            }else{
                skills = ((Warrior)ch).skills;
            }
        }else if(ch.job == "Wizard"){ // 마법사
            if(ch.전직){
                skills = ((PowerWizard)ch).powerSkills;
            }else{
                skills = ((Wizard)ch).skills;
            }
        }else if(ch.job == "Archer"){ // 궁수
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

        return skills;
    }

    public void characterAttack(Monster monster,int selectedNum){ // 사람이 몬스터 공격

        if(selectedNum == 1){ // 기본 공격
            if(ch.maxHp > 0){
                ch.defaultAttack(monster,this.job); // 캐릭터의 피가 0보다 큰 경우에만 공격 가능
            }

        }else if(selectedNum > 1 && selectedNum < 5){
            if(ch.maxHp > 0){

                monsterHitMusic.run();

                if(this.job == "Warrior"){
                    if(ch.전직){
                        ((PowerWarrior) this.ch).powerSkill(monster,((PowerWarrior)ch).powerSkills.get(selectedNum-2)); // 스킬은 인덱스 0부터 / 스킬 선택은 인덱스 2부터 이므로 2를 빼주었다.
                    }else{
                        ((Warrior) this.ch).skill(monster, ((Warrior)ch).skills.get(selectedNum-2));
                    }
                }else if(this.job == "Wizard"){
                    if(ch.전직){
                        ((PowerWizard) this.ch).powerSkill(monster,((PowerWizard)ch).powerSkills.get(selectedNum-2));
                    }else{
                        ((Wizard) this.ch).skill(monster,((Wizard)ch).skills.get(selectedNum-2));
                    }
                }else if(this.job == "Archer"){
                    if(ch.전직){
                        ((PowerArcher) this.ch).powerSkill(monster,((PowerArcher)ch).powerSkills.get(selectedNum-2));
                    }else{
                        ((Archer) this.ch).skill(monster,((Archer)ch).skills.get(selectedNum-2));
                    }
                }else{
                    if(ch.전직){
                        ((PowerBandit) this.ch).powerSkill(monster,((PowerBandit)ch).powerSkills.get(selectedNum-2));
                    }else{
                        ((Bandit) this.ch).skill(monster,((Bandit)ch).skills.get(selectedNum-2));
                    }
                }
            }

        }else if(selectedNum == 5){ // 물약 먹기
            drinkLiquidMedicine();
        }
    }

}