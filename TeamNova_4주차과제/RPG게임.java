package TeamNova_4주차과제;

import java.util.Scanner;

public class RPG게임 {
    public static void main(String[] args) throws InterruptedException {

        BackgroundMusicThread createCharacterMusic = new BackgroundMusicThread("./src/캐릭터생성음악.wav"); // 캐릭터 생성 음악
        BackgroundMusicThread mainCategoryMusic = new BackgroundMusicThread("./src/메인카테고리음악.wav");

        Scanner sc = new Scanner(System.in);
        String name; // 캐릭터 생성시 필요한 이름
        int job; // 캐릭터 직업 선택
        int selectedMenu; // 여러 할일 목록 중 선택

        Character ch = new Character("","");

        // 기본값으로 선언한 후에 다시 재정의
        사냥하기 사냥하기 = new 사냥하기(new Character("","")); // 우선 기본값 -> 선언이 되어있어야 나중에 사용이 가능하다.
        전직하기 전직하기 = new 전직하기(new Character("","")); // 우선 기본값 선언 후 재할당
        스킬레벨업 스킬레벨업 = new 스킬레벨업(new Character("",""));// 기본값 선언 후 재할당
        인벤토리 인벤토리 = new 인벤토리(new Character("",""));
        능력치확인 능력치확인 = new 능력치확인(new Character("",""));
        상점가기 상점가기 = new 상점가기(new Character("",""));
        보스잡기 보스잡기 = new 보스잡기(new Character("",""));
        퀘스트 퀘스트 = new 퀘스트(new Character("",""));
        레벨업버그 레벨업버그 = new 레벨업버그(new Character("",""));

        System.out.println("--------------게임 클리어 조건-------------");
        System.out.println("원하는 직업을 선택한 후, 육성한 뒤에 보스를 잡아야 합니다");
        System.out.println("종료에 필요한 레벨 제한은 없습니다");
        System.out.println("---------------------------------------");

        System.out.println("게임을 시작합니다");

        System.out.println("캐릭터를 생성하도록 하겠습니다..");

        System.out.println();
        System.out.println("원하는 닉네임을 입력해주세요.");
        System.out.print("이름 : ");


        createCharacterMusic.run(); // 캐릭터 생성 음악 재생

        name = sc.next();

        while(true){ // 잘못된 항목을 입력할 경우 다시 선택하게 해준다. -> 예외 처리

            System.out.println();
            System.out.println("원하는 직업을 선택해주세요.");
            System.out.println("직업 스펙 - HP / MP / 공격력 / 방어력");
            System.out.println("1. 전사 - 500 / 300 / 30 / 50");
            System.out.println("2. 법사 - 350 / 450 / 50 / 30");
            System.out.println("3. 궁수 - 400 / 400 / 40 / 40");
            System.out.println("4. 도적 - 400 / 400 / 45 / 35");
            System.out.print("직업 : ");

            job = sc.nextInt();

            if(job > 0 && job < 5){
                break;
            }else{
                System.out.println();
                System.out.println("올바른 항목을 입력하세요.");
            }
        }

        // 캐릭터 객체 생성 및 사냥하기 객체 생성

        if(job == 1){ // 전사
            ch = new PowerWarrior(name,"Warrior");
        }else if(job == 2){ // 마법사
            ch = new PowerWizard(name,"Wizard");
        }else if(job == 3){ // 궁수
            ch = new PowerArcher(name,"Archer");
        }else if(job == 4){ // 도적
            ch = new PowerBandit(name,"Bandit");
        }

        사냥하기 = new 사냥하기(ch);
        전직하기 = new 전직하기(ch);
        스킬레벨업 = new 스킬레벨업(ch);
        인벤토리 = new 인벤토리(ch);
        능력치확인 = new 능력치확인(ch);
        상점가기 = new 상점가기(ch);
        보스잡기 = new 보스잡기(ch);
        퀘스트 = new 퀘스트(ch);
        레벨업버그 = new 레벨업버그(ch);

        Boolean comebackHome = false;

        createCharacterMusic.stopMusic();

            while(true){ // 할 것 입력하기

                System.out.println();
                System.out.println("메인 카테고리 이동중...");

                if(ch.gameClear){
                    System.out.println();
                    System.out.println("게임을 클리어 했습니다!!! 축하합니다!!");
                    break;
                }

                if(!comebackHome){
                    mainCategoryMusic.run(); // 메인 카테고리 음악
                }


                System.out.println();
                System.out.println("======================");
                System.out.println("1. 인벤토리");
                System.out.println("2. 스킬 레벨업");
                System.out.println("3. 능력치 확인");
                System.out.println("4. 상점");
                System.out.println("5. 전직");
                System.out.println("6. 보스잡기");
                System.out.println("7. 사냥하기");
                System.out.println("8. 퀘스트");
                System.out.println("======================");
                System.out.print("선택 : ");

                selectedMenu = sc.nextInt();

                //comebackHome 역할 : 음악 반복재생 방지
                switch (selectedMenu){ // 메뉴 선택
                    case 1: 인벤토리.start();
                        comebackHome = true;
                        break;
                    case 2: 스킬레벨업.start();
                        comebackHome = true;
                        break;
                    case 3: 능력치확인.start();
                        comebackHome = true;
                        break;
                    case 4:
                        mainCategoryMusic.stopMusic(); // 메인음악 멈추기
                        상점가기.start();
                        comebackHome = false;
                        break;
                    case 5:
                        mainCategoryMusic.stopMusic(); // 메인음악 멈추기
                        전직하기.start();
                        comebackHome = false;
                        break;
                    case 6:
                        mainCategoryMusic.stopMusic(); // 메인음악 멈추기
                        보스잡기.start();
                        comebackHome = false;
                        break;
                    case 7:
                        mainCategoryMusic.stopMusic(); // 메인음악 멈추기
                        사냥하기.start();
                        comebackHome = false;

                        break;
                    case 8: 퀘스트.start();
                        comebackHome = true;
                        break;

                    case 9 : 레벨업버그.start();
                        comebackHome = true;
                        break;

                    default :
                        System.out.println("올바른 항목을 입력하세요");
                }
            }
    }
}
