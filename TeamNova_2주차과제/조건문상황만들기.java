package TeamNova_2주차과제;

import java.util.Scanner;

public class 조건문상황만들기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int selectNum = 0;
        int finalScore = 0;

        System.out.println("나는 어떠한 삶을 살고 있는가?");
        System.out.println("부정적인 생각, 게으른 생각, 인생을 망하게하는 생각, 건강을 망치는 생각을 할 수록 점수가 높아집니다.");

        System.out.println("*****************************************");
        System.out.println("주의 : 선택사항에 없는 선택지를 고르면 게임이 종료됩니다");
        System.out.println("*****************************************");

        System.out.println("삐비비빅! 삐비비빅! 알람이 울린다.");

        System.out.println("1. 알람 소리를 듣고 일어난다.");
        System.out.println("2. 30분뒤로 알람을 다시 맞추고 잔다");
        System.out.println("3. 알람 소리도 못듣고 잔다.");

        System.out.print("나의 선택 : ");

        selectNum = sc.nextInt();

        if(selectNum == 1){
            // 알람 소리를 듣고 일어난다.
            //depth : 1

            finalScore+=1;

            System.out.println("1. 화장실로가 세안 및 머리를 감는다");
            System.out.println("2. 부엌으로가 아침먹을 준비를 한다.");
            System.out.println("3. 자기전 옆에 두었던 휴대폰을 본다.");

            System.out.print("나의 선택 : ");
            selectNum = sc.nextInt();

            if(selectNum == 1){
                // 알람 소리를 듣고 일어난다.
                // 화장실로 가 세안 및 머리를 감는다.
                // depth : 2
                System.out.println("화장실에 도착했다.");
                finalScore += 1;

                System.out.println("1. 머리감고, 세수하고, 양치를 한다.");
                System.out.println("2. 세수랑 양치만 한다.");
                System.out.println("3. 물로만 얼굴을 닦는다.");

                System.out.print("나의 선택 : ");
                selectNum = sc.nextInt();

                if(selectNum == 1){
                    // 알람 소리를 듣고 일어난다.
                    // 화장실로 가 세안 및 머리를 감는다.
                    // 머리감고, 세수하고, 양치를 한다.
                    // depth : 3
                    finalScore+=1;

                    System.out.println("아 개운하다~");

                    System.out.println("1. 배가 고프지 않아도 하루를 위해 아침메뉴를 고른다.");
                    System.out.println("2. 일단 간단히 삼각김밥으로 떼운다.");
                    System.out.println("3. 배도 안고프니 그냥 스킵한다.");

                    System.out.print("나의 선택 : ");
                    selectNum = sc.nextInt();

                    if(selectNum == 1){
                        // 알람 소리를 듣고 일어난다.
                        // 화장실로 가 세안 및 머리를 감는다.
                        // 머리감고, 세수하고, 양치를 한다.
                        // 배가 고프지 않아도 하루를 위해서 아침을 메뉴를 고른다.
                        // depth : 4

                        finalScore += 1;

                        System.out.println("뭘 먹으면 좋을까?");

                        System.out.println("1. 아침은 간단히 현미랑 닭가슴살로 먹자! 너무 배부르면 공부도 안된다..");
                        System.out.println("2. 냉장고에 냉동식품이 있으면 데워먹어야지..");
                        System.out.println("3. 식탁에 있는거 대충 먹어야겠다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                       if(selectNum == 1){
                           // 알람 소리를 듣고 일어난다.
                           // 화장실로 가 세안 및 머리를 감는다.
                           // 머리감고, 세수하고, 양치를 한다.
                           // 배가 고프지 않아도 하루를 위해서 아침을 메뉴를 고른다.
                           // 아침은 간단히 현밀아 닭가슴살로 먹자! 너무 배부르면 공부도 안된다..
                           // depth : 5

                           finalScore += 1;

                           System.out.println("닭가슴살을 야무지게 먹었다.");

                           System.out.println("1. 평소에 배우고 싶었던 기타 연주영상을 보면서 직접 연주 해본다.");
                           System.out.println("2. 기타를 배울 수 있는 학원을 알아본다.");
                           System.out.println("3. 식탁에 있는거 대충 먹어야 겠다.");

                           System.out.print("나의 선택 : ");
                           selectNum = sc.nextInt();

                           if(selectNum == 1){
                               finalScore += 1;
                           }else if(selectNum == 2){
                               finalScore += 2;
                           }else if(selectNum == 3){
                               finalScore += 3;
                           }else{
                               selectNum = 0;
                               System.out.println("게임종료");
                           }

                       }else if(selectNum == 2){
                           // 알람 소리를 듣고 일어난다.
                           // 화장실로 가 세안 및 머리를 감는다.
                           // 머리감고, 세수하고, 양치를 한다.
                           // 배가 고프지 않아도 하루를 위해서 아침을 메뉴를 고른다.
                           // 냉장고에 냉동식품이 있으면 데워먹어야지..
                           // depth : 5

                           finalScore += 2;

                           System.out.println("냉장고 냉동식품을 무엇을 먹을까.?");

                           System.out.println("1. 멋진 몸을 위해 다이어트를 하기로한 약속을 떠오르며 냉동식품을 버려버린다.");
                           System.out.println("2. 최대한 칼로리가 낮고, 가벼운 냉동식품을 먹는다.");
                           System.out.println("3. 제일 맛있고, 몸에 나쁜 냉동식품을 먹는다.");

                           System.out.print("나의 선택 : ");
                           selectNum = sc.nextInt();

                           if(selectNum == 1){
                               // depth : 6
                               finalScore += 1;
                           }else if(selectNum == 2){
                               // depth : 6
                               finalScore += 2;
                           }else if(selectNum == 3){
                               // depth : 6
                               finalScore += 3;
                           }else{
                               selectNum = 0;
                               System.out.println("게임종료");
                           }

                       }else if(selectNum == 3){
                           // 알람 소리를 듣고 일어난다.
                           // 화장실로 가 세안 및 머리를 감는다.
                           // 머리감고, 세수하고, 양치를 한다.
                           // 배가 고프지 않아도 하루를 위해서 아침을 메뉴를 고른다.
                           // 식탁에 있는거 대충 먹어야겠다.
                           // depth : 5

                           finalScore += 3;

                           System.out.println("식탁에 있는거 대~충 먹어보자!");

                           System.out.println("1. 건강과 컨디션을 생각해서 식탁 위에 놓인 샐러드를 먹는다.");
                           System.out.println("2. 간단하게 프로틴 한잔 먹고 운동을 하러 간다.");
                           System.out.println("3. 식탁 위에있는 삼양라면을 뿌셔 먹는다.");

                           System.out.print("나의 선택 : ");
                           selectNum = sc.nextInt();

                           if(selectNum == 1){
                               // depth : 6
                               finalScore += 1;
                           }else if(selectNum == 2){
                               // depth : 6
                               finalScore += 2;
                           }else if(selectNum == 3){
                               // depth : 6
                               finalScore += 3;
                           }else{
                               selectNum = 0;
                               System.out.println("게임종료");
                           }

                       }else{
                           finalScore = 0;
System.out.println("게임 종료");
                       }

                    }else if(selectNum == 2){

                        // 알람 소리를 듣고 일어난다.
                        // 화장실로 가 세안 및 머리를 감는다.
                        // 머리감고, 세수하고, 양치를 한다.
                        // 일단 간단히 삼각김밥으로 떼운다.
                        // depth : 4

                        finalScore += 2;

                        System.out.println("간단히 아침도 떼웠고 이제 뭘 하지..?");

                        System.out.println("1. teamNova 자습실을 간다.");
                        System.out.println("2. 과제가 있지만, 운동을 먼저 하러 간다.");
                        System.out.println("3. 잠깐 한숨 돌리기 위해 쇼파에 앉는다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){

                            // 알람 소리를 듣고 일어난다.
                            // 화장실로 가 세안 및 머리를 감는다.
                            // 머리감고, 세수하고, 양치를 한다.
                            // 일단 간단히 삼각김밥으로 떼운다.
                            // teamNova 자습실을 간다.
                            // depth : 5

                            finalScore += 1;

                            System.out.println("teamNova 자습실에 도착했다.");

                            System.out.println("1. 오면서 생각해놓은 자리에 앉아 과제를 시작한다.");
                            System.out.println("2. 소변이 마려워 화장실을 간 후, 가벼운 마음으로 자리에 앉는다.");
                            System.out.println("3. 삼각김밥으로는 배가 차지 않아 일단 밥먹으러 나간다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){

                            // 알람 소리를 듣고 일어난다.
                            // 화장실로 가 세안 및 머리를 감는다.
                            // 머리감고, 세수하고, 양치를 한다.
                            // 일단 간단히 삼각김밥으로 떼운다.
                            // 과제가 있지만, 운동을 먼저 하러 간다.
                            // depth : 5

                            finalScore += 2;

                            System.out.println("운동 먼저하고, 과제를 하자!");

                            System.out.println("1. 헬스장에 도착하자마자 몸 스트레칭을 해준다.");
                            System.out.println("2. 헬스장에 도착하자마자 인바디를 측정해본다.");
                            System.out.println("3. 헬스장에 도착하기전 달달한 음료수를 한잔 사먹는다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){

                            // 알람 소리를 듣고 일어난다.
                            // 화장실로 가 세안 및 머리를 감는다.
                            // 머리감고, 세수하고, 양치를 한다.
                            // 일단 간단히 삼각김밥으로 떼운다.
                            // 잠깐 한숨 돌리기 위해 쇼파에 앉는다.
                            // depth : 5

                            finalScore += 3;

                            System.out.println("쇼파에 앉았다.");

                            System.out.println("1. 쇼파에 앉아서 옆에 있는 \"하버드 학생의 삶\"이라는 책을 펼친다.");
                            System.out.println("2. 노트북 충전기가 고장나서, 원활한 공부를 위해 노트북 충전기를 주문한다.");
                            System.out.println("3. 쇼파에 앉자마자 유튜브 예능zip을 시청한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 3){

                        // 알람 소리를 듣고 일어난다.
                        // 화장실로 가 세안 및 머리를 감는다.
                        // 머리감고, 세수하고, 양치를 한다.
                        // 배도 안고프니 그냥 스킵한다.
                        // depth : 4

                        finalScore += 3;

                        System.out.println("아침 생략하고 이따 점심에 먹어야지");

                        System.out.println("1. 지금 무엇을 해야 제일 좋을지 곰곰히 생각해본다.");
                        System.out.println("2. 일단 노트북을 키고, 공부할 준비를 한다.");
                        System.out.println("3. 놀고 싶은 마음에 친구한테 연락을 한다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){

                            // 알람 소리를 듣고 일어난다.
                            // 화장실로 가 세안 및 머리를 감는다.
                            // 머리감고, 세수하고, 양치를 한다.
                            // 배도 안고프니 그냥 스킵한다.
                            // 지금 무엇을 해야 제일 좋을지 곰곰히 생각해본다.
                            // depth : 5

                            finalScore += 1;

                            System.out.println("지금 무엇을 해야할지...");

                            System.out.println("1. teamNova 과제를 할지, java에 대한 강의를 들을지 고민한다.");
                            System.out.println("2. 평소에 하고 싶었던 랩을 음악 비트를 틀어놓고 해본다.");
                            System.out.println("3. 자연스럽게 아이패드를 꺼내 모바일 배틀그라운드를 한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){

                            // 알람 소리를 듣고 일어난다.
                            // 화장실로 가 세안 및 머리를 감는다.
                            // 머리감고, 세수하고, 양치를 한다.
                            // 배도 안고프니 그냥 스킵한다.
                            // 일단 노트북을 키고, 공부할 준비를 한다.
                            // depth : 5

                            finalScore += 2;

                            System.out.println("노트북이 켜졌다!");

                            System.out.println("1. 노트북을 키자마자, 변수형이 무엇인지에 대해 공부를 한다.");
                            System.out.println("2. 노트북을 키자마자, 수업시간에 메모한 내용을 본다.");
                            System.out.println("3. 노트북을 키자마자, 공부할 마음이 싹 사라져서 드라마 정주행을 한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){
                            // 알람 소리를 듣고 일어난다.
                            // 화장실로 가 세안 및 머리를 감는다.
                            // 머리감고, 세수하고, 양치를 한다.
                            // 배도 안고프니 그냥 스킵한다.
                            // 놀고 싶은 마음에 친구한테 연락을 한다.
                            // depth : 5

                            finalScore += 3;

                            System.out.println("친구에게 전화를 거는중...");

                            System.out.println("1. 친구에게 방구석에서 게임하지 말고 밖에서 놀자고 한다.");
                            System.out.println("2. 친구에게 카페 가서 수다를 떨자고 말한다.");
                            System.out.println("3. 만사가 귀찮으니 롤을 들어오라고한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{

                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else{

                        // depth : 4
                        finalScore = 0;
System.out.println("게임 종료");
                    }

                }else if(selectNum == 2){
                    // 알람 소리를 듣고 일어난다.
                    // 화장실로 가 세안 및 머리를 감는다.
                    // 세수랑 양치만 한다.
                    // depth : 3
                    finalScore+=2;

                    System.out.println("머리가 좀 집집하지만 그래도 충분해");

                    System.out.println("1. teamNova 자습실에 가서 공부할 과제를 검토한다.");
                    System.out.println("2. 공부전 헬스장에 먼저 간다.");
                    System.out.println("3. 노래가 부르고 싶어, 집 근처 노래방에 가서 노래를 부른다.");

                    System.out.print("나의 선택 : ");
                    selectNum = sc.nextInt();

                    if(selectNum == 1 ){

                        // 알람 소리를 듣고 일어난다.
                        // 화장실로 가 세안 및 머리를 감는다.
                        // 세수랑 양치만 한다.
                        // teamNova 자습실에 가서 공부할 과제를 검토한다.
                        // depth : 4
                        finalScore += 1;

                        System.out.println("과제 1번은 웹사이트 변수 찾기, 과제 2번은 조건문 상황만들기구나...");

                        System.out.println("1. 과제의 난이도와 현재 배경지식을 갖고 과제 계획을 세운다.");
                        System.out.println("2. 일단 둘중에 아무거나 하고 본다.");
                        System.out.println("3. 음..모르겠다. 일단 자습실부터 간다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){
                            // 알람 소리를 듣고 일어난다.
                            // 화장실로 가 세안 및 머리를 감는다.
                            // 세수랑 양치만 한다.
                            // teamNova 자습실에 가서 공부할 과제를 검토한다.
                            // 과제의 난이도와 현재 배경지식을 갖고 과제 계획을 세운다.
                            // depth : 5

                            finalScore += 1;

                            System.out.println("내 수준이 얼마나 될까...?");

                            System.out.println("1. 수준 파악을 하고, 부족한 배경지식에대해 구글링으로 공부한다.");
                            System.out.println("2. 생각보다 과제가 할만하다고 생각하지만, 혹시몰라 멘토링을 신청한다.");
                            System.out.println("3. 과제가 쉽다고 착각하여, 나중에 하면 된다고 미룬다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){
                            // 알람 소리를 듣고 일어난다.
                            // 화장실로 가 세안 및 머리를 감는다.
                            // 세수랑 양치만 한다.
                            // teamNova 자습실에 가서 공부할 과제를 검토한다.
                            // 일단 둘중에 아무거나 하고 본다.
                            // depth : 5

                            finalScore += 2;

                            System.out.println("동전 돌려서 앞면이 나오면 과제1번, 뒷면이 나오면 과제2번을 해야지");

                            System.out.println("1. 동전 앞면이 나와서 과제 1번을위한 계획을 세운다.");
                            System.out.println("2. 주머니를 뒤져보니 동전이 없어서 그냥 하고싶은 과제를 한다.");
                            System.out.println("3. 동전이 바닥에 떨어져서, 오늘은 과제를 안해도 된다고 합리화 한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){
                            // 알람 소리를 듣고 일어난다.
                            // 화장실로 가 세안 및 머리를 감는다.
                            // 세수랑 양치만 한다.
                            // teamNova 자습실에 가서 공부할 과제를 검토한다.
                            // 음.. 모르겠다. 일단 자습실부터 간다.
                            // depth : 5

                            finalScore += 3;

                            System.out.println("자습실을 가기위해서 집에서 막 나왔다.");

                            System.out.println("1. 맥북과 모니터를 연결하는 연결잭을 두고와서 집에 다시 돌아간다.");
                            System.out.println("2. 오랜 시간 필요한 칫솔과 치약을 챙기러 다시 돌아간다.");
                            System.out.println("3. 집에서 나오자마자 비가 너무 많이와서 다시 집에 들어간다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{

                            //depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 2){

                        // 알람 소리를 듣고 일어난다.
                        // 화장실로 가 세안 및 머리를 감는다.
                        // 세수랑 양치만 한다.
                        // 공부전 헬스장에 먼저 간다.
                        // depth : 4
                        finalScore += 2;

                        System.out.println("헬스장에 도착했다!");

                        System.out.println("1. 오늘 무슨 운동을 할건지 목표를 세운다.");
                        System.out.println("2. 빨리 운동하고 싶으므로 바로 시작한다.");
                        System.out.println("3. 일단 운동에 필요한 음악을 선정한다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){
                            // 알람 소리를 듣고 일어난다.
                            // 화장실로 가 세안 및 머리를 감는다.
                            // 세수랑 양치만 한다.
                            // 공부전 헬스장에 먼저 간다.
                            // 오늘 무슨 운동을 할건지 목표를 세운다.
                            // depth : 5

                            finalScore += 1;

                            System.out.println("오늘의 목표는...?");

                            System.out.println("1. 1시간 운동시간에 알맞게 효율적으로 꽉꽉채워서 계획을 세운다.");
                            System.out.println("2. 등,가슴,복근 이 3가지만 하고싶은만큼 한다.");
                            System.out.println("3. 목표따위 필요없다를 시전한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                selectNum = 0;
                                System.out.println("게임종료");
                            }


                        }else if(selectNum == 2){
                            // 알람 소리를 듣고 일어난다.
                            // 화장실로 가 세안 및 머리를 감는다.
                            // 세수랑 양치만 한다.
                            // 공부전 헬스장에 먼저 간다.
                            // 빨리 운동하고 싶으므로 바로 시작한다.
                            // depth : 5

                            finalScore += 2;

                            System.out.println("자 운동을 시작해보자, 이 기구는 어떻게 사용하지?");

                            System.out.println("1. 트레이너 선생님께 찾아가 기구사용법을 알려달라고 한다.");
                            System.out.println("2. 일단 기구 사용법에 대해 구글링을 해본다.");
                            System.out.println("3. 몰라 나 하고싶은대로 하면 되지 운동만 하면 되는거지를 시전한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                selectNum = 0;
                                System.out.println("게임종료");
                            }


                        }else if(selectNum == 3){
                            // 알람 소리를 듣고 일어난다.
                            // 화장실로 가 세안 및 머리를 감는다.
                            // 세수랑 양치만 한다.
                            // 공부전 헬스장에 먼저 간다.
                            // 일단 운동에 필요한 음악을 선정한다.
                            // depth : 5

                            finalScore +=3;

                            System.out.println("오늘 무슨 음악을 들으면서 운동할까?");

                            System.out.println("1. 운동에 더 집중하기 위해 음악을 듣지 않는 것을 선택한다.");
                            System.out.println("2. 헬스 유투버가 추천한 운동음악을 듣는다.");
                            System.out.println("3. 드라마를 틀어 운동 집중이 안되게 멀티 플레이를 한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{
                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 3){

                        // 알람 소리를 듣고 일어난다.
                        // 화장실로 가 세안 및 머리를 감는다.
                        // 세수랑 양치만 한다.
                        // 노래가 부르고 싶어, 집 근처 노래방에 가서 노래를 부른다.
                        // depth : 4
                        finalScore += 3;

                        System.out.println("노래방에 도착했다! 앗! 현금을 두고왔다.");

                        System.out.println("1. 현금을 안가져왔으니, 그냥 공부나 하러 가자");
                        System.out.println("2. 아쉽지만 헬스장이 근처니 그냥 운동을 하자");
                        System.out.println("3. 근처에 은행이 있으니 현금을 뽑아오자");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){
                            // 알람 소리를 듣고 일어난다.
                            // 화장실로 가 세안 및 머리를 감는다.
                            // 세수랑 양치만 한다.
                            // 노래가 부르고 싶어, 집 근처 노래방에 가서 노래를 부른다.
                            // 현금을 안가져왔으니, 그냥 공부나 하러 가자
                            // depth : 5

                            finalScore += 1;

                            System.out.println("집에 가는 길에 3000원이 떨어져 있었다.");

                            System.out.println("1. 돈을 주우면 노래방을 갈 생각에 모른척하고 지나간다.");
                            System.out.println("2. 돈만 주워서 메가 커피에서 아이스티를 사먹는다.");
                            System.out.println("3. 줍고 바로 노래방으로 뛰어간다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2 ){

                            // 알람 소리를 듣고 일어난다.
                            // 화장실로 가 세안 및 머리를 감는다.
                            // 세수랑 양치만 한다.
                            // 노래가 부르고 싶어, 집 근처 노래방에 가서 노래를 부른다.
                            // 아쉽지만 헬스장이 근처니 그냥 운동을 하자.
                            // depth : 5

                            finalScore += 2;

                            System.out.println("그래.. 그냥 운동이나 하자");

                            System.out.println("1. 노래부르고 싶은 열정을 운동에 대한 열정으로 바꾸어서 한다.");
                            System.out.println("2. 운동이 끝나고 헬스장 샤워실에서 작은 목소리로 노래를 부른다.");
                            System.out.println("3. 헬스장에 가니 친구가 있어 노래방 갈 돈을 빌려 노래방을 간다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){

                            // 알람 소리를 듣고 일어난다.
                            // 화장실로 가 세안 및 머리를 감는다.
                            // 세수랑 양치만 한다.
                            // 노래가 부르고 싶어, 집 근처 노래방에 가서 노래를 부른다.
                            // 근처에 은행이 있으니 현금을 뽑아오자
                            // depth : 5

                            finalScore += 3;

                            System.out.println("은행에서 돈을 뽑았다.");

                            System.out.println("1. 딱 1시간만 노래방에서 스트레스를 풀고 공부를 하고자 마음먹는다.");
                            System.out.println("2. 미리 노래방에서 부를 음악 5개만 딱 고른다.");
                            System.out.println("3. 노래방 갔다가 PC방을 갈 생각에 돈을 더 뽑는다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{
                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else{
                        // depth : 4
                        finalScore = 0;
System.out.println("게임 종료");
                    }

                }else if(selectNum == 3){
                    // 알람 소리를 듣고 일어난다.
                    // 화장실로 가 세안 및 머리를 감는다.
                    // 물로만 얼굴을 닦는다.
                    // depth : 3
                    finalScore+=3;
                    System.out.println("아우 귀찮아~ 물로만 닦으니 영 찝찝하긴 하네");

                    System.out.println("1. 찝찝함을 못 이기고 다시 씻는다.");
                    System.out.println("2. 방에 들어가서 책상에 앉는다.");
                    System.out.println("3. 찝찝해도 그려려니 하고 흘러가는 대로 있는다.");

                    System.out.print("나의 선택 : ");
                    selectNum = sc.nextInt();

                    if(selectNum == 1){

                        // 알람 소리를 듣고 일어난다.
                        // 화장실로 가 세안 및 머리를 감는다.
                        // 물로만 얼굴을 닦는다.
                        // 찝찝함을 못 이기고 다시 씻는다.
                        // depth : 4

                        finalScore += 1;

                        System.out.println("다시 씻으니 개운하네~");

                        System.out.println("1. 개운한 마음으로 아침먹을 준비를 한다.");
                        System.out.println("2. 든든한 아침보단 간단한 시리얼이지라며 시리얼을 먹는다.");
                        System.out.println("3. 갑자기 게임이 하고 싶어 PC방에 간다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){

                            // 알람 소리를 듣고 일어난다.
                            // 화장실로 가 세안 및 머리를 감는다.
                            // 물로만 얼굴을 닦는다.
                            // 찝찝함을 못 이기고 다시 씻는다.
                            // 개운한 마음으로 아침먹을 준비를 한다.
                            // depth : 5

                            finalScore += 1;

                            System.out.println("아침을 먹었다.");

                            System.out.println("1. 아침을 먹었으니, 잠시 소화할 시간을 갖고 바로 책상앞에 달려가 하다만 teamNova 과제를한다.");
                            System.out.println("2. 평소에 관심이 있었던 문워크하는 방법을 영상을 보고 배운다.");
                            System.out.println("3. 메이플 200렙을 찍기위해 컴퓨터로 메이플을 한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){

                            // 알람 소리를 듣고 일어난다.
                            // 화장실로 가 세안 및 머리를 감는다.
                            // 물로만 얼굴을 닦는다.
                            // 찝찝함을 못 이기고 다시 씻는다.
                            // 든든한 아침보단 간단한 시리얼이지라며 시리얼을 먹는다.
                            // depth : 5

                            finalScore += 2;

                            System.out.println("시리얼이 간단하고 좋네");

                            System.out.println("1. 시리얼을 다 먹은후, 다먹은 그릇을 설거지한다.");
                            System.out.println("2. 시리얼을 다 먹은 그릇을 물로만 헹군다.");
                            System.out.println("3. 이따 또 먹을 생각에 그냥 그릇을 내버려둔다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){

                            // 알람 소리를 듣고 일어난다.
                            // 화장실로 가 세안 및 머리를 감는다.
                            // 물로만 얼굴을 닦는다.
                            // 찝찝함을 못 이기고 다시 씻는다.
                            // 갑자기 게임이 하고 싶어 PC방에 간다.
                            // depth: 5

                            finalScore += 3;

                            System.out.println("PC방에 도착했다.");

                            System.out.println("1. PC방에가서 과제에 대한 회의감으로 필수 개념 강의를 듣는다.");
                            System.out.println("2. 일단 배가고프니, 라면을 시켜서 먹는다.");
                            System.out.println("3. 머릿속에 게임생각밖에 없어서 게임부터 접속한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{

                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 2){

                        // 알람 소리를 듣고 일어난다.
                        // 화장실로 가 세안 및 머리를 감는다.
                        // 물로만 얼굴을 닦는다.
                        // 방에 들어가서 책상에 앉는다.
                        // depth : 4

                        finalScore += 2;

                        System.out.println("책상에 앉았다.");

                        System.out.println("1. 조용한 분위기를 위해 주변 불을 끄고, 스탠더를 키고 공부할 준비를 한다.");
                        System.out.println("2. 따뜻한 우유가 먹고 싶어 우유를 마시러 간다.");
                        System.out.println("3. 유튜브 쇼츠를 보면서 시간을 보낸다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){

                            // 알람 소리를 듣고 일어난다.
                            // 화장실로 가 세안 및 머리를 감는다.
                            // 물로만 얼굴을 닦는다.
                            // 방에 들어가서 책상에 앉는다.
                            // 조용한 분위기를 위해 주변 불을 끄고, 스탠더를 키고 공부할 준비를 한다.
                            // depth : 5

                            finalScore += 1;

                            System.out.println("주변이 조용하다.. 공부를 시작해 볼까");

                            System.out.println("1. 오늘 해야할 공부를 미리 스캔하고, 중요도에따라 계획을 세운다.");
                            System.out.println("2. 눈앞에 보이는 책부터 먼저 공부한다.");
                            System.out.println("3. 책상이 어질러져 책상부터 정리한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){

                            // 알람 소리를 듣고 일어난다.
                            // 화장실로 가 세안 및 머리를 감는다.
                            // 물로만 얼굴을 닦는다.
                            // 방에 들어가서 책상에 앉는다.
                            // 따뜻한 우유가 마시고 싶어 우유를 마시러간다.
                            // depth : 5

                            finalScore += 2;

                            System.out.println("우유를 데피는 중이다..");

                            System.out.println("1. 우유가 다 끓을 시간동안 오늘 해야할 하루 공부량을 정한다.");
                            System.out.println("2. 우유가 끓고 있는 모습을 보며 불멍을 때린다.");
                            System.out.println("3. 그 새를 못참고 휴대폰을 꺼내 유튜브에 접속한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                selectNum = 0;
                                System.out.println("게임종료");
                            }


                        }else if(selectNum == 3){

                            // 알람 소리를 듣고 일어난다.
                            // 화장실로 가 세안 및 머리를 감는다.
                            // 물로만 얼굴을 닦는다.
                            // 방에 들어가서 책상에 앉는다.
                            // 유튜브 쇼츠를 보며 시간을 보낸다.
                            // depth : 5

                            finalScore += 3;

                            System.out.println("유튜브 쇼츠를 보고있는 중이다.");

                            System.out.println("1. 아무생각 없이 유튜브 쇼츠를 보고 있는 것을 자각한후, 공부할 책을 펼친다.");
                            System.out.println("2. 이번것만 보고 진짜 공부하고자 다짐한다.");
                            System.out.println("3. 거실에 있는 과자를 갖고와서 쇼츠 감상을 계속 한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                selectNum = 0;
                                System.out.println("게임종료");
                            }


                        }else{
                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 3){

                        // 알람 소리를 듣고 일어난다.
                        // 화장실로 가 세안 및 머리를 감는다.
                        // 물로만 얼굴을 닦는다.
                        // 찝찝해도 그려려니 하고 흘러가는 대로 있는다.
                        // depth : 4

                        finalScore += 3;

                        System.out.println("만사가 다 귀찮구려~~");

                        System.out.println("1. 마음을 다잡고, 책상정리부터 한다.");
                        System.out.println("2. 배가 고프니 일단 배부터 채우고 본다.");
                        System.out.println("3. 침대에 누워서 시간때우기 용으로 유튜브를 시청한다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){

                            // 알람 소리를 듣고 일어난다.
                            // 화장실로 가 세안 및 머리를 감는다.
                            // 물로만 얼굴을 닦는다.
                            // 찝찝해도 그려려니 하고 흘러가는 대로 있는다.
                            // 마음을 다잡고, 책상정리부터 한다.
                            // depth : 5
                            finalScore += 1;

                            System.out.println("책상을 정리중이다...");

                            System.out.println("1. 책상을 다 정리하고, 기분 좋게 공부를 시작한다.");
                            System.out.println("2. 책상을 정리하고나서, 의자에 앉아 잠시 휴식을 갖는다.");
                            System.out.println("3. 책상정리를 하고 나서, 힘들다며 침대에 눕는다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }


                        }else if(selectNum == 2 ){

                            // 알람 소리를 듣고 일어난다.
                            // 화장실로 가 세안 및 머리를 감는다.
                            // 물로만 얼굴을 닦는다.
                            // 찝찝해도 그려려니 하고 흘러가는 대로 있는다.
                            // 배가 고프니 일단 배부터 채우고 본다.
                            // depth : 5
                            finalScore += 2;

                            System.out.println("거실에 놓여있는 간단한 음식으로 배를 채웠다.");

                            System.out.println("1. 배가 부르니 소화를 위해 동네 마실을 나간다.");
                            System.out.println("2. 배가 부르니 소화가 될 동안 유튜브 영상을 시청한다.");
                            System.out.println("3. 바로 침대에 누워 \"배부를땐 누워야지\"를 시전한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){

                            // 알람 소리를 듣고 일어난다.
                            // 화장실로 가 세안 및 머리를 감는다.
                            // 물로만 얼굴을 닦는다.
                            // 찝찝해도 그려려니 하고 흘러가는 대로 있는다.
                            // 침대에 누워서 시간때우기 용으로 유튜브를 시청한다.
                            // depth : 5
                            finalScore += 3;

                            System.out.println("흠냐흠냐 유튜브 보면서 시간이나 때워야지...");

                            System.out.println("1. 유튜브 영상중 게으름을 벗어나는 법을 시청하여 현실을 자각한다.");
                            System.out.println("2. 어제 올라온 SPOTV 축구 하이라이트를 본다.");
                            System.out.println("3. 평소에 해보고 싶었던 스팀게임하는 영상을 본다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{
                            //depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else{
                        // depth : 4
                        finalScore = 0;
System.out.println("게임 종료");
                    }

                }

            }else if(selectNum == 2){
                // 알람 소리를 듣고 일어난다.
                // 부엌으로가 아침먹을 준비를 한다.
                // depth : 2
                finalScore += 2;

                System.out.println("1. 부엌에 있는 닭가슴살을 데워 샐러드 해먹는다.");
                System.out.println("2. 간단하게 라면을 끓여 먹는다.");
                System.out.println("3. 해먹는게 귀찮으니 어제 먹다 남은 치킨을 먹는다.");

                System.out.print("나의 선택 : ");
                selectNum = sc.nextInt();

                if(selectNum == 1){
                    // 알람 소리를 듣고 일어난다.
                    // 부엌으로가 아침먹을 준비를 한다.
                    // 부엌에 있는 닭가슴살을 데워 샐러드 해먹는다.
                    // depth : 3

                    finalScore += 1;

                    System.out.println("닭가슴살 샐러드를 맛있게 먹었다.");
                    System.out.println("1. 배도 부르고 하니 소화도 시킬겸 Team 노바 학원까지 걸어간다.");
                    System.out.println("2. 아직 배가 덜 부르므로, 계란후라이를 해먹는다.");
                    System.out.println("3. 배도 부르니, 자연스럽게 유튜브를 킨다.");

                    System.out.print("나의 선택 : ");
                    selectNum = sc.nextInt();

                    if(selectNum == 1){
                        // 알람 소리를 듣고 일어난다.
                        // 부엌으로가 아침먹을 준비를 한다.
                        // 부엌에 있는 닭가슴살을 데워 샐러드 해먹는다.
                        // 배도 부르고 하니 소화도 시킬겸 Team 노바 학원까지 걸어간다.
                        // depth : 4

                        System.out.println("열심히 걸어서 학원에 도착했다.");

                        System.out.println("1. 해야할 과제를 정리하고 계획을 작성한다.");
                        System.out.println("2. 일단 과제에 필요한 개념을 익히기 위해 인강을 듣는다.");
                        System.out.println("3. 막상 학원에 도착하니 목이말라 앞에있는 Mega커피점에 간다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){
                            // 알람 소리를 듣고 일어난다.
                            // 부엌으로가 아침먹을 준비를 한다.
                            // 부엌에 있는 닭가슴살을 데워 샐러드 해먹는다.
                            // 배도 부르고 하니 소화도 시킬겸 Team 노바 학원까지 걸어간다.
                            // 해야할 과제를 정리하고 계획을 작성한다.
                            // depth : 5

                            finalScore += 1;

                            System.out.println("계획을 다 작성했다.");

                            System.out.println("1. 오늘 짠 계획을 넘어서 더 많이 공부하고 간다는 마인드를 갖고 과제를 한다.");
                            System.out.println("2. 오늘 짠 계획만큼만 다 하자라는 마인드를 갖고 과제를 한다.");
                            System.out.println("3. 계획이 너무 빡빡한데 라며 좀더 계획을 느슨하게 작성한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                selectNum = 0;
                                System.out.println("게임종료");
                            }


                        }else if(selectNum == 2){
                            // 알람 소리를 듣고 일어난다.
                            // 부엌으로가 아침먹을 준비를 한다.
                            // 부엌에 있는 닭가슴살을 데워 샐러드 해먹는다.
                            // 배도 부르고 하니 소화도 시킬겸 Team 노바 학원까지 걸어간다.
                            // 일단 과제에 필요한 개념을 익히기 위해 인강을 듣는다.
                            // depth : 5

                            finalScore += 2;

                            System.out.println("인강을 듣는중...");

                            System.out.println("1. 강의를 듣다가 이해가 잘안되서 직접 이해안되는 부분을 확인해본다.");
                            System.out.println("2. 멘토링때 물어보기 위해 이해가 안되는 부분은 따로 메모해놓는다.");
                            System.out.println("3. 어차피 나중에 다 알게된다며 일종의 합리화를 하며 넘어간다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                selectNum = 0;
                                System.out.println("게임종료");
                            }


                        }else if(selectNum == 3){
                            // 알람 소리를 듣고 일어난다.
                            // 부엌으로가 아침먹을 준비를 한다.
                            // 부엌에 있는 닭가슴살을 데워 샐러드 해먹는다.
                            // 배도 부르고 하니 소화도 시킬겸 Team 노바 학원까지 걸어간다.
                            // 막상 학원에 도착하니 목이말라 앞에 있는 Mega커피점에 간다.
                            // depth : 5

                            finalScore += 3;

                            System.out.println("Mega 커피에 도착했다. 무엇을 마실까?");

                            System.out.println("1. 음료가 아닌, 녹차 종류를 마신다.");
                            System.out.println("2. 힘든것에 대한 보상으로 달달한 아이스티를 먹는다.");
                            System.out.println("3. 온김에 메가커피에 들어가 빵이나 먹어야 겠다를 시전한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{

                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                        finalScore += 1;
                    }

                }else if(selectNum == 2){
                    // 알람 소리를 듣고 일어난다.
                    // 부엌으로가 아침먹을 준비를 한다.
                    // 간단하게 라면을 끓여 먹는다.
                    // depth : 3

                    finalScore += 2;

                    System.out.println("신라면에 계란을 풀어서 맛깔나게 먹었다.");
                    System.out.println("1. 배가 부르니 마음의 배부름을 위해 독서를 한다.");
                    System.out.println("2. 배가 불러도 집에 있는 과자를 후식으로 먹는다.");
                    System.out.println("3. 배도 부르니 게임이나 해볼까? 게임을 켠다.");

                    System.out.print("나의 선택 : ");
                    selectNum = sc.nextInt();

                    if(selectNum == 1){
                        // 알람 소리를 듣고 일어난다.
                        // 부엌으로가 아침먹을 준비를 한다.
                        // 간단하게 라면을 끓여 먹는다.
                        // 배가 부르니 마음의 배부름을 위해 독서를 한다.
                        // depth : 4

                        finalScore += 1;

                        System.out.println("배도 부르고 어떤 책을 읽어 볼까?");
                        System.out.println("1. 안드로이드 개발 도서");
                        System.out.println("2. 부의 알고리즘");
                        System.out.println("3. 메이플스토리 만화책");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){
                            // 알람 소리를 듣고 일어난다.
                            // 부엌으로가 아침먹을 준비를 한다.
                            // 간단하게 라면을 끓여 먹는다.
                            // 배가 부르니 마음의 배부름을 위해 독서를 한다.
                            // 안드로이드 개발 도서
                            // depth : 5

                            finalScore += 1;

                            System.out.println("안드로이드 개발 도서를 읽는다..");

                            System.out.println("1. 개발 도서를 읽다가 이해가 안되는 부분은 다 짚고 넘어간다.");
                            System.out.println("2. 일단 전체적인 흐름을 읽기 위해 처음부터 끝까지 읽는다.");
                            System.out.println("3. 이해가 안되는 부분을 만나자마자 책을 집어 던진다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{

                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){
                            // 알람 소리를 듣고 일어난다.
                            // 부엌으로가 아침먹을 준비를 한다.
                            // 간단하게 라면을 끓여 먹는다.
                            // 배가 부르니 마음의 배부름을 위해 독서를 한다.
                            // 부의 알고리즘
                            // depth : 5

                            finalScore += 2;

                            System.out.println("부의 알고리즘에 대한 책을 읽는다..");

                            System.out.println("1. 부자들의 사고방식을 이해하고, 내가 실천할 부분을 따로 메모해놓는다.");
                            System.out.println("2. 처음부터 끝까지 가벼운 마음으로 책을 1회독 한다.");
                            System.out.println("3. 첫 페이지 읽자마자 책을 읽기 싫어져서 책을 덮는다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }


                        }else if(selectNum == 3){
                            // 알람 소리를 듣고 일어난다.
                            // 부엌으로가 아침먹을 준비를 한다.
                            // 간단하게 라면을 끓여 먹는다.
                            // 배가 부르니 마음의 배부름을 위해 독서를 한다.
                            // 메이플스토리 만화책
                            // depth : 5

                            finalScore += 3;

                            System.out.println("메이플스토리 만화책을 펼쳤다.");

                            System.out.println("1. 이 나이먹고 만화책을 봐야하나를 시전하면서 옆에 놓인 인생의 법칙 책을 읽는다.");
                            System.out.println("2. 생각보다 재미있었지만, 도움이 되지않겠다는 생각을 한다.");
                            System.out.println("3. 1권을 다읽고, 다른 스토리 5권을 더 가져온다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 2){
                        // 알람 소리를 듣고 일어난다.
                        // 부엌으로가 아침먹을 준비를 한다.
                        // 간단하게 라면을 끓여 먹는다.
                        // 배가 불러도 집에 있는 과자를 후식으로 먹는다.
                        // depth : 4

                        finalScore += 2;

                        System.out.println("바삭바삭~ 과자 맛있군");

                        System.out.println("1. 과자를 다먹고 teamNova 자습실을 간다.");
                        System.out.println("2. 달달한게 땡겨서 집근처 카페를 간다.");
                        System.out.println("3. 옆에 있던 과자 한봉지를 더 집어든다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){
                            // 알람 소리를 듣고 일어난다.
                            // 부엌으로가 아침먹을 준비를 한다.
                            // 간단하게 라면을 끓여 먹는다.
                            // 배가 불러도 집에 있는 과자를 후식으로 먹는다.
                            // 과자를 다먹고 teamNova 자습실을 간다.
                            // depth : 5

                            finalScore += 1;

                            System.out.println("teamNova 자습실에 도착했다.");

                            System.out.println("1. 자습실에 가자마자 자리를 잡고 공부를 한다.");
                            System.out.println("2. 잠깐 휴식을 취하면서 멍을 때린다.");
                            System.out.println("3. 15분정도 공부하다가 집에 가고싶은 맘에 자습실을 박차고 집에간다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2 ){
                            // 알람 소리를 듣고 일어난다.
                            // 부엌으로가 아침먹을 준비를 한다.
                            // 간단하게 라면을 끓여 먹는다.
                            // 배가 불러도 집에 있는 과자를 후식으로 먹는다.
                            // 달달한게 땡겨서 집근처 카페를 간다.
                            // depth : 5

                            finalScore += 2;

                            System.out.println("카페에 도착했다.");

                            System.out.println("1. 아이스아메리카노를 시키고, 챙겨온 노트북으로 공부를 시작한다.");
                            System.out.println("2. 카라멜마끼야또를 시키고, 잠시 사색을 즐긴다.");
                            System.out.println("3. 아이스 초코를 시키고 인스타그램을 한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){
                            // 알람 소리를 듣고 일어난다.
                            // 부엌으로가 아침먹을 준비를 한다.
                            // 간단하게 라면을 끓여 먹는다.
                            // 배가 불러도 집에 있는 과자를 후식으로 먹는다.
                            // 옆에 있던 과자 한봉지를 더 집어든다.
                            // depth : 5

                            finalScore += 3;

                            System.out.println("과자 한봉지를 집어들고 먹는중이다..");

                            System.out.println("1. 집어든 과자를 먹다가 자신의 뱃살을 보고 현타가와 먹던 과자를 내려놓는다.");
                            System.out.println("2. 1봉지를 다먹고나서, 칼로리를 보고 운동갈 준비를 한다.");
                            System.out.println("3. 과자 1봉지를 먹고나서 더 먹을건 없나 찾아본다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{

                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 3){
                        // 알람 소리를 듣고 일어난다.
                        // 부엌으로가 아침먹을 준비를 한다.
                        // 간단하게 라면을 끓여 먹는다.
                        // 배도 부르니 게임이나 해볼까? 게임을 켠다
                        // depth : 4

                        finalScore += 3;

                        System.out.println("어떤 게임을 할까..?");
                        System.out.println("1. 해볼만한 게임이 없네,, 그냥 과제나 할까?");
                        System.out.println("2. 음 기분전환으로 딱 1시간만 해야지");
                        System.out.println("3. 오늘 롤 10판 땡겨보자 ~");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){
                            // 알람 소리를 듣고 일어난다.
                            // 부엌으로가 아침먹을 준비를 한다.
                            // 간단하게 라면을 끓여 먹는다.
                            // 배도 부르니 게임이나 해볼까? 게임을 켠다
                            // 해볼만한 게임이 없네.. 그냥 과제나 할까?
                            // depth : 5

                            finalScore += 1;

                            System.out.println("음.. 그냥 과제나 할까");

                            System.out.println("1. 바로 teamNova 과제를 시작한다.");
                            System.out.println("2. 잠시동안 더 고민을 하다가 teamNova 과제를 시작한다.");
                            System.out.println("3. 재미를 추구하기위해 바로 게임을 한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){
                            // 알람 소리를 듣고 일어난다.
                            // 부엌으로가 아침먹을 준비를 한다.
                            // 간단하게 라면을 끓여 먹는다.
                            // 배도 부르니 게임이나 해볼까? 게임을 켠다
                            // 음 기분전환으로 딱 1시간만 해야지
                            // depth : 5

                            finalScore += 2;

                            System.out.println("기분전환으로 딱 1시간만 하자");

                            System.out.println("1. 1시간 타이머를 걸어놓고 게임을 한다.");
                            System.out.println("2. 넉넉하게 3시간정도 잡고 게임을 한다.");
                            System.out.println("3. \"에이 1시간이 뭐야\"를 시전하며 10시간할 마음을 갖는다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){
                            // 알람 소리를 듣고 일어난다.
                            // 부엌으로가 아침먹을 준비를 한다.
                            // 간단하게 라면을 끓여 먹는다.
                            // 배도 부르니 게임이나 해볼까? 게임을 켠다
                            // 오늘 롤 10판 땡겨보자~
                            // depth : 5

                            finalScore += 3;

                            System.out.println("롤을 켜고 1판을 시작했다.");

                            System.out.println("1. 평소에 게임만 하는 삶을 돌아보며, 롤을 탈주하고 공부를 시작한다.");
                            System.out.println("2. 10판은 무리라고 여겨 이번판을 마지막으로 하고, 게임을 종료한다.");
                            System.out.println("3. 승패에 상관없이 너무 재밌어서 10판 이상을 하려고 한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{

                            //depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }
                    }else{

                        //depth : 4
                        finalScore = 0;
System.out.println("게임 종료");
                    }

                }else if(selectNum == 3){
                    // 알람 소리를 듣고 일어난다.
                    // 부엌으로가 아침먹을 준비를 한다.
                    // 해먹는게 귀찮으니 어제 먹다 남은 치킨을 먹는다.
                    // depth : 3

                    finalScore += 3;

                    System.out.println("치킨을 맛있게 잘 먹었다.");
                    System.out.println("1. 너무 많이 먹었으니 산책을 하자");
                    System.out.println("2. 달달한게 땡기는데 카라멜마끼야또를 시켜먹는다.");
                    System.out.println("3. 배부르니 침대에 누워서 TV를 켠다.");

                    System.out.print("나의 선택 : ");
                    selectNum = sc.nextInt();

                    if(selectNum == 1){
                        // 알람 소리를 듣고 일어난다.
                        // 부엌으로가 아침먹을 준비를 한다.
                        // 해먹는게 귀찮으니 어제 먹다 남은 치킨을 먹는다.
                        // 너무 많이 먹었으니 산책을 하자
                        // depth : 4

                        finalScore += 1;

                        System.out.println("아 배부르다 ~ 산책해야지");

                        System.out.println("1. 집근처 산책을 하면서 소화를 시킨다.");
                        System.out.println("2. 한강공원에 가서 산책을 한다.");
                        System.out.println("3. 막상 나가려니 귀찮아서.. 집 쇼파에 잠시 앉는다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){
                            // 알람 소리를 듣고 일어난다.
                            // 부엌으로가 아침먹을 준비를 한다.
                            // 해먹는게 귀찮으니 어제 먹다 남은 치킨을 먹는다.
                            // 너무 많이 먹었으니 산책을 하자
                            // 집근처 산책을 하면서 소화를 시킨다.
                            // depth : 5
                            finalScore += 1;

                            System.out.println("산책을 나왔다..");

                            System.out.println("1. 산책을 하면서, 이번에 만들 앱 기능들에 대해 생각한다.");
                            System.out.println("2. 산책을 하면서, 복잡한 머리속을 정리한다.");
                            System.out.println("3. 산책을 하다보니 눈앞에 PC방이 보여 게임을 하고자 PC방에 들어간다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){
                            // 알람 소리를 듣고 일어난다.
                            // 부엌으로가 아침먹을 준비를 한다.
                            // 해먹는게 귀찮으니 어제 먹다 남은 치킨을 먹는다.
                            // 너무 많이 먹었으니 산책을 하자
                            // 한강공원에 가서 산책을 한다.
                            // depth : 5
                            finalScore += 2;

                            System.out.println("한강공원에 도착했다.");

                            System.out.println("1. 자전거를 빌려 운동도 할겸 한강을 한바퀴 돈다.");
                            System.out.println("2. 버스킹 공연을 보기위해 자리를 잡는다.");
                            System.out.println("3. 금강산도 식후경이지를 시전하며, 한강라면을 끓여먹는다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){
                            // 알람 소리를 듣고 일어난다.
                            // 부엌으로가 아침먹을 준비를 한다.
                            // 해먹는게 귀찮으니 어제 먹다 남은 치킨을 먹는다.
                            // 너무 많이 먹었으니 산책을 하자
                            // 막상 나가려니 귀찮아서.. 집 쇼파에 잠시 앉는다.
                            // depth : 5
                            finalScore += 3;

                            System.out.println("털석.. 쇼파에 앉았다.");

                            System.out.println("1. 평소에 영어를 배우고 싶다는 생각에 영어회화 학원을 신청한다.");
                            System.out.println("2. 쇼파 옆에 놓여있는 \"클린코드\"라는 책을 읽는다. ");
                            System.out.println("3. 앉는즉시 누워서 쇼파와 한몸이된다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{

                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 2){
                        // 알람 소리를 듣고 일어난다.
                        // 부엌으로가 아침먹을 준비를 한다.
                        // 해먹는게 귀찮으니 어제 먹다 남은 치킨을 먹는다.
                        // 달달한게 땡기는데 카라멜 마끼야또를 시켜먹는다.
                        // depth : 4

                        finalScore += 2;

                        System.out.println("역시 커피는 카라멜 마끼야또야~");

                        System.out.println("1. 달달한 커피도 먹었으니 TeamNova 자습실에 가볼까?");
                        System.out.println("2. 한 10분만 여유를 즐긴다.");
                        System.out.println("3. 아무 생각없이 휴대폰을 켠다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){
                            // 알람 소리를 듣고 일어난다.
                            // 부엌으로가 아침먹을 준비를 한다.
                            // 해먹는게 귀찮으니 어제 먹다 남은 치킨을 먹는다.
                            // 달달한게 땡기는데 카라멜 마끼야또를 시켜먹는다.
                            // 달달한 커피도 먹었으니 TeamNova 자습실에 가볼까?
                            // depth : 5

                            finalScore += 1;

                            System.out.println("지하철을 타고 자습실을 가고 있다. TeamNova 자습실 가려면 30분정도 남았다.");

                            System.out.println("1. 가는 시간도 아깝기 때문에 책을 읽는다.");
                            System.out.println("2. 30분뒤 열공을 해야하기 때문에, 휴식을 취한다.");
                            System.out.println("3. 30분동안 모바일 게임을 한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }


                        }else if(selectNum == 2){

                            // 알람 소리를 듣고 일어난다.
                            // 부엌으로가 아침먹을 준비를 한다.
                            // 해먹는게 귀찮으니 어제 먹다 남은 치킨을 먹는다.
                            // 달달한게 땡기는데 카라멜 마끼야또를 시켜먹는다.
                            // 한 10분만 여유를 즐긴다.
                            // depth : 5

                            finalScore += 2;

                            System.out.println("여유를 즐긴지 10분이 지났다.");

                            System.out.println("1. 배도 부르고 여유도 즐겼으니 본격적으로 공부를 시작한다.");
                            System.out.println("2. 음악을 들으면서 공부 할 준비를 한다.");
                            System.out.println("3. 조금더 여유를 즐기고 싶은 마음에 TV를 켠다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }


                        }else if(selectNum == 3){
                            // 알람 소리를 듣고 일어난다.
                            // 부엌으로가 아침먹을 준비를 한다.
                            // 해먹는게 귀찮으니 어제 먹다 남은 치킨을 먹는다.
                            // 달달한게 땡기는데 카라멜 마끼야또를 시켜먹는다.
                            // 아무 생각 없이 휴대폰을 켠다.
                            // depth : 5

                            finalScore += 3;

                            System.out.println("아무 생각없이 휴대폰을 켠다.");

                            System.out.println("1. 기찬 팀장님한테 질문할게 생각나 카카오톡으로 질문을 한다.");
                            System.out.println("2. 휴대폰을 켠김에 밀린 연락을 받는다.");
                            System.out.println("3. 휴대폰 배터리가 다 닳을때까지 유튜브를 시청한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{
                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 3){
                        // 알람 소리를 듣고 일어난다.
                        // 부엌으로가 아침먹을 준비를 한다.
                        // 해먹는게 귀찮으니 어제 먹다 남은 치킨을 먹는다.
                        // 배부르니 침대에 누워서 TV를 켠다.
                        // depth : 4

                        finalScore += 3;

                        System.out.println("음 뭘 봐볼까나~");

                        System.out.println("1. 딱히 볼게 없어서 책상 앞으로 간다.");
                        System.out.println("2. 한국 vs 일본 축구경기를 응원한다.");
                        System.out.println("3. 영화 2편을 보기위해 영화를 결제한다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){
                            // 알람 소리를 듣고 일어난다.
                            // 부엌으로가 아침먹을 준비를 한다.
                            // 해먹는게 귀찮으니 어제 먹다 남은 치킨을 먹는다.
                            // 배부르니 침대에 누워서 TV를 켠다.
                            // 딱히 볼게 없어서 책상 앞으로 간다.
                            // depth : 5

                            finalScore += 1;

                            System.out.println("책상 앞에 도착했다.");

                            System.out.println("1. 책상 앞에서 기웃거리지 않고, 바로 착석에 teamNova 과제를 시작한다.");
                            System.out.println("2. 막상 앉아서 공부하려니 하고싶지 않지만, 그러한 마음을 꾹꾹 눌러준다.");
                            System.out.println("3. 막상 책상앞에 오니 다시 TV가 보고싶어져서 침대에 다시 눕는다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){
                            // 알람 소리를 듣고 일어난다.
                            // 부엌으로가 아침먹을 준비를 한다.
                            // 해먹는게 귀찮으니 어제 먹다 남은 치킨을 먹는다.
                            // 배부르니 침대에 누워서 TV를 켠다.
                            // 한국 vs 일본 축구경기를 응원한다.
                            // depth : 5

                            finalScore += 2;

                            System.out.println("한국 1 : 2로 일본에게 지고 있다.");

                            System.out.println("1. 비록 지고 있지만 한국팀이기 때문에 끝까지 응원한다.");
                            System.out.println("2. 축구만 틀어놓고 잠시 눈휴식을 취한다.");
                            System.out.println("3. 역시 한국을 시전하며 LCK를 시청한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){
                            // 알람 소리를 듣고 일어난다.
                            // 부엌으로가 아침먹을 준비를 한다.
                            // 해먹는게 귀찮으니 어제 먹다 남은 치킨을 먹는다.
                            // 배부르니 침대에 누워서 TV를 켠다.
                            // 영화 2편을 보기위해 영화를 결제한다.
                            // depth : 5

                            finalScore += 3;

                            System.out.println("영화 2편을 결제했다.");

                            System.out.println("1. 2편을 결제했으니 이왕보는거 최대한 집중해서 작품을 감상한다.");
                            System.out.println("2. 영화를 보면서 친구와 연락을 한다.");
                            System.out.println("3. 막상 보려니 영화가 어렵고 재미없는 내용이라서 바로 다른 영화를 결재한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{
                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }
                    }else {
                        // depth : 4
                        finalScore = 0;
System.out.println("게임 종료");
                    }
                }else{
                    // depth : 3
                    finalScore = 0;
System.out.println("게임 종료");
                }

            }else if(selectNum == 3){
                // 알람 소리를 듣고 일어난다.
                // 자기전에 옆에 두었던 휴대폰을 본다.
                // depth : 2
                finalScore += 3;

                System.out.println("1. 하루 계획표를 짠다.");
                System.out.println("2. 어제 온 카카오톡을 확인한다.");
                System.out.println("3. 유튜브를 켠다.");

                System.out.print("나의 선택 : ");
                selectNum = sc.nextInt();

                if(selectNum == 1){
                    // 알람 소리를 듣고 일어난다.
                    // 자기전에 옆에 두었던 휴대폰을 본다.
                    // 하루 계획표를 짠다.
                    // depth : 3
                    finalScore += 1;

                    System.out.println("음.. 오늘의 계획은..?");

                    System.out.println("1. TeamNova 과제하는 것을 최우선으로 한다.");
                    System.out.println("2. 공부도 적당히하고 노는 계획을 세운다.");
                    System.out.println("3. 공부는 1시간, 노는건 10시간 계획을 세운다.");

                    System.out.print("나의 선택 : ");
                    selectNum = sc.nextInt();

                    if(selectNum == 1){
                        // 알람 소리를 듣고 일어난다.
                        // 자기전에 옆에 두었던 휴대폰을 본다.
                        // 하루 계획표를 짠다.
                        // TeamNova 과제하는 것을 최우선으로 한다.
                        // depth : 4

                        finalScore += 1;
                        System.out.println("TeamNova 과제를 먼저해놓고 다른걸 하자");

                        System.out.println("1. TeamNova 과제에 대한 주간 계획부터 시간계획으로 세부화 시킨다.");
                        System.out.println("2. TeamNova 과제에 대한 계획없이 과제 1번부터 시작한다.");
                        System.out.println("3. 음.. 갑자기 게임을 하고싶은 욕망이 스멀스멀 올라온다. 게임을 켠다.");

                        if(selectNum == 1){

                            // 알람 소리를 듣고 일어난다.
                            // 자기전에 옆에 두었던 휴대폰을 본다.
                            // 하루 계획표를 짠다.
                            // TeamNova 과제하는 것을 최우선으로 한다.
                            // TeamNova 과제에 대한 주간 계획부터 시간계획으로 세부화 시킨다.
                            // depth : 5

                            finalScore += 1;

                            System.out.println("계획을 좀 더 세부화 해보자");

                            System.out.println("1. 매 시간마다 어떻게 무엇을 할건지 적고, 확인해보는 계획을 세운다.");
                            System.out.println("2. 시간계획은 굳이..? 라며 그냥 일간 계획만 좀 더 세부화해서 세운다.");
                            System.out.println("3. 계획을 세부화하긴 귀찮다. 그냥 맘가는대로 하자");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }


                        }else if(selectNum == 2){

                            // 알람 소리를 듣고 일어난다.
                            // 자기전에 옆에 두었던 휴대폰을 본다.
                            // 하루 계획표를 짠다.
                            // TeamNova 과제하는 것을 최우선으로 한다.
                            // TeamNova 과제에 대한 계획없이 과제 1번부터 시작한다.
                            // depth : 5

                            finalScore += 2;

                            System.out.println("과제 1번을 하는중이다.");

                            System.out.println("1. 생각보다 과제 진행이 원만하지만, 현재 내가 하는 방향성이 맞는지 고민해본다.");
                            System.out.println("2. 과제1 진행이 원만하여, 이 기세로 과제 2 진행까지 한다.");
                            System.out.println("3. 과제1 진행이 원만하여, 과제2는 내일하는 것으로 미룬다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }


                        }else if (selectNum == 3) {

                            // 알람 소리를 듣고 일어난다.
                            // 자기전에 옆에 두었던 휴대폰을 본다.
                            // 하루 계획표를 짠다.
                            // TeamNova 과제하는 것을 최우선으로 한다.
                            // 음.. 갑자기 게임을 하고싶은 욕망이 스멀스멀 올라온다. 게임을 켠다.
                            // depth : 5

                            finalScore += 3;

                            System.out.println("게임을 켰다..");

                            System.out.println("1. 1시간정도 빡세게하고 공부를 하고자 마음먹는다.");
                            System.out.println("2. 어느정도 과제할 시간은 남겨두자는 생각을 갖고 게임을 시작한다.");
                            System.out.println("3. 무조건 재미있게 오래 해야한다고 생각하여 게임친구들을 부른다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        } else{
                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 2){
                        // 알람 소리를 듣고 일어난다.
                        // 자기전에 옆에 두었던 휴대폰을 본다.
                        // 하루 계획표를 짠다.
                        // 공부도 적당히하고 노는 계획을 세운다.
                        // depth : 4

                        finalScore += 2;

                        System.out.println("공부는 적당히 노는건 왕창!");

                        System.out.println("1. 음.. teamNova과제는 딱 1시간만 하자");
                        System.out.println("2. 1시간공부도 너무 많은데..? 30분만하자");
                        System.out.println("3. 책 한번만 쓱 훑고 놀러가야지");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){
                            // 알람 소리를 듣고 일어난다.
                            // 자기전에 옆에 두었던 휴대폰을 본다.
                            // 하루 계획표를 짠다.
                            // 공부도 적당히하고 노는 계획을 세운다.
                            // 음.. teamNova과제는 딱 1시간만 하자.
                            // depth : 5

                            finalScore += 1;

                            System.out.println("과제는 더도말고 덜도말고 딱 1시간만 하자");

                            System.out.println("1. 막상 과제를 하다보니 재미도 있어서 1시간으론 부족하다고 생각한다.");
                            System.out.println("2. 1시간 정도하고 나니 휴식이 필요해 잠시 쉰다.");
                            System.out.println("3. 1시간도 너무 많다 20분만해도 충분하다는 생각을 한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }



                        }else if(selectNum == 2){
                            // 알람 소리를 듣고 일어난다.
                            // 자기전에 옆에 두었던 휴대폰을 본다.
                            // 하루 계획표를 짠다.
                            // 공부도 적당히하고 노는 계획을 세운다.
                            // 1시간 공부도 너무 많은데..? 30분만 하자
                            // depth : 5

                            finalScore += 2;

                            System.out.println("아 뭔 1시간이나 해 30분만 하자");

                            System.out.println("1. 30분 공부하면 인생이 달라지는가에 대해 진지하게 고민해본다.");
                            System.out.println("2. 30분 공부를 하고나니 약간 부족하다는 생각이든다.");
                            System.out.println("3. 30분할바엔 그냥 안하고 쉬자 라는 마인드를 갖는다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){
                            // 알람 소리를 듣고 일어난다.
                            // 자기전에 옆에 두었던 휴대폰을 본다.
                            // 하루 계획표를 짠다.
                            // 공부도 적당히하고 노는 계획을 세운다.
                            // 책 한번만 쓱 훑고 놀러가야지
                            // depth : 5

                            finalScore += 3;

                            System.out.println("책 한번 쓱 흝는중...");

                            System.out.println("1. 책을 읽다보니 생각보다 재미있어서 놀 생각을 까먹는다.");
                            System.out.println("2. 우선 1회독을 했으니, 공부는 했다고 생각한다.");
                            System.out.println("3. 첫 페이지에서 막히자 책 읽는 것을 중단한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{
                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 3){
                        // 알람 소리를 듣고 일어난다.
                        // 자기전에 옆에 두었던 휴대폰을 본다.
                        // 하루 계획표를 짠다.
                        // 공부는 1시간, 노는건 10시간 계획을 세운다.
                        // depth : 4

                        finalScore += 3;

                        System.out.println("공부는 딱 1시간만 하자");

                        System.out.println("1. 오늘은 딱 과제 1번 개념만 익히자~");
                        System.out.println("2. 아직 시간많은데 천천히 개념만 익혀야지~");
                        System.out.println("3. 오늘은 일단 쉬고, 내일부터 하자~");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){
                            // 알람 소리를 듣고 일어난다.
                            // 자기전에 옆에 두었던 휴대폰을 본다.
                            // 하루 계획표를 짠다.
                            // 공부는 1시간, 노는건 10시간 계획을 세운다.
                            // 오늘은 딱 과제 1번 개념만 익히자~
                            // depth : 5

                            finalScore += 1;

                            System.out.println("오늘은 딱 과제 1번 개념만 익히자");

                            System.out.println("1. 생각보다 과제 1번 개념이 빨리 끝나서, 과제 1번을 시작한다.");
                            System.out.println("2. 과제 1번 개념을 다 익혀서, 과제 2번에 대한 개념도 공부한다.");
                            System.out.println("3. 아 개념 익히기도 귀찮네.. 그냥 놀 계획부터 세우자를 시전한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){
                            // 알람 소리를 듣고 일어난다.
                            // 자기전에 옆에 두었던 휴대폰을 본다.
                            // 하루 계획표를 짠다.
                            // 공부는 1시간, 노는건 10시간 계획을 세운다.
                            // 아직 시간많은데 천천히 개념만 익혀야지~
                            // depth : 5

                            finalScore += 2;

                            System.out.println("천천히 개념만 익혀보자~");

                            System.out.println("1. 개념공부를 하다보니 응용도 해보고 싶은 마음이 들어 응용도 해본다.");
                            System.out.println("2. 차분하고 꼼꼼히 개념 공부를 한다.");
                            System.out.println("3. 어차피 나중에 알게된다는 마인드로 대충 개념을 훑는다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){
                            // 알람 소리를 듣고 일어난다.
                            // 자기전에 옆에 두었던 휴대폰을 본다.
                            // 하루 계획표를 짠다.
                            // 공부는 1시간, 노는건 10시간 계획을 세운다.
                            // 오늘은 일단 쉬고, 내일부터 하자~
                            // depth : 5

                            finalScore += 3;

                            System.out.println("일단 오늘은 쉬자!");

                            System.out.println("1. 이왕 쉬는거 공부하면서 못했던 활동들을 한다.");
                            System.out.println("2. 마음에 안정을 주는 음악을 틀어놓고, 침대에 누워 휴식을 취한다.");
                            System.out.println("3. 막상 오늘을 쉬어보니, 내일도 쉴까? 라는 생각을 가진다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{

                            // depth :5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else{

                        // depth : 4
                        finalScore = 0;
System.out.println("게임 종료");
                    }

                }else if(selectNum == 2){
                    // 알람 소리를 듣고 일어난다.
                    // 자기전에 옆에 두었던 휴대폰을 본다.
                    // 어제 온 카카오톡을 확인한다.
                    // depth : 3

                    finalScore += 2;

                    System.out.println("카톡이 10개가 와있다.");
                    System.out.println("1. 같이 공부하자는 친구의 카톡을 읽는다.");
                    System.out.println("2. 같이 헬스장가자는 친구의 카톡을 읽는다.");
                    System.out.println("3. 같이 PC방가자는 친구의 카톡을 읽는다.");

                    System.out.print("나의 선택 : ");
                    selectNum = sc.nextInt();

                    if(selectNum == 1){
                        // 알람 소리를 듣고 일어난다.
                        // 자기전에 옆에 두었던 휴대폰을 본다.
                        // 어제 온 카카오톡을 확인한다.
                        // 같이 공부하자는 친구의 카톡을 읽는다.
                        // depth : 4

                        finalScore += 1;

                        System.out.println("카톡 내용 : 오늘 스터디 카페에서 같이 공부하자");

                        System.out.println("1. \"ㅇㅋ\"라고 답장을 보낸다. ");
                        System.out.println("2. 음 일단 알겠어.. 준비하고 나갈게 라고 보낸다.");
                        System.out.println("3. pc방에서 1시간만 하고 가실? 이라고 보낸다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1 ){
                            // 알람 소리를 듣고 일어난다.
                            // 자기전에 옆에 두었던 휴대폰을 본다.
                            // 어제 온 카카오톡을 확인한다.
                            // 같이 공부하자는 친구의 카톡을 읽는다.
                            // ㅇㅋ 라고 답장을 보낸다.
                            // depth : 5

                            finalScore += 1;

                            System.out.println("나의 답장 : ㅇㅋ~");

                            System.out.println("1. 공부할 책을 챙겨 같이 공부할 친구를 만나러 간다.");
                            System.out.println("2. 30분 뒤에 공부하자고 한다.");
                            System.out.println("3. pc방 부터 먼저가서 즐기고 공부하자고 한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){
                            // 알람 소리를 듣고 일어난다.
                            // 자기전에 옆에 두었던 휴대폰을 본다.
                            // 어제 온 카카오톡을 확인한다.
                            // 같이 공부하자는 친구의 카톡을 읽는다.
                            // 음 일단 알겠어.. 준비하고 나갈게 라고 보낸다.
                            // depth : 5

                            finalScore += 2;

                            System.out.println("준비하고 나갈게...");

                            System.out.println("1. 공부를 오래할 생각으로 치약,칫솔,슬리퍼를 가지고 나간다.");
                            System.out.println("2. 밥먹기 전까지 할 생각으로 준비하고 나간다.");
                            System.out.println("3. 막상 준비하고 나가려니 귀찮아서 친구에게 \"오늘은 집에서 할게\"라고 연락한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){
                            // 알람 소리를 듣고 일어난다.
                            // 자기전에 옆에 두었던 휴대폰을 본다.
                            // 어제 온 카카오톡을 확인한다.
                            // 같이 공부하자는 친구의 카톡을 읽는다.
                            // pc방에서 1시간만 하고 가실? 이라고 보낸다.
                            // depth : 5

                            finalScore += 3;

                            System.out.println("pc방에서 1시간만 하고 가실?");

                            System.out.println("1. 친구가 정신차리고 공부하자는 답장에 정신을 차리고 공부하러간다.");
                            System.out.println("2. 친구가 정신차리고 공부하자는 답장에 딱 1시간만 하고 공부하자라고 다시 보낸다.");
                            System.out.println("3. 다른 친구에게 연락을 돌려 PC방 갈 친구들을 찾는다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{

                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 2){
                        // 알람 소리를 듣고 일어난다.
                        // 자기전에 옆에 두었던 휴대폰을 본다.
                        // 어제 온 카카오톡을 확인한다.
                        // 같이 헬스장가자는 친구의 카톡을 읽는다.
                        // depth : 4

                        finalScore += 2;

                        System.out.println("카톡 내용 : 오늘 등이랑 삼두 죠지실");

                        System.out.println("1. 뿌셔보자~ 오늘 데드리프트 1rm 재보려고");
                        System.out.println("2. 아 나오늘 가슴이랑 이두 해야해 가서 따로 운동 하자");
                        System.out.println("3. 음.. 아 그냥 오늘 쉴까?");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){
                            // 알람 소리를 듣고 일어난다.
                            // 자기전에 옆에 두었던 휴대폰을 본다.
                            // 어제 온 카카오톡을 확인한다.
                            // 같이 헬스장가자는 친구의 카톡을 읽는다.
                            // 뿌셔보자~ 오늘 데드리프트 1rm 재보려고
                            // depth : 5

                            finalScore += 1;

                            System.out.println("친구와 만나 헬스장에 도착했다.");

                            System.out.println("1. 음악으로 풀도핑한다음 최선을 다해서 1rm을 재본다.");
                            System.out.println("2. 막상 하려니 겁이나서 망설이다가 결국 1rm을 재본다.");
                            System.out.println("3. 1rm 안재도 난 충분하다고 자만하며, 1rm 측정을 다음기회에 하기로 한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){
                            // 알람 소리를 듣고 일어난다.
                            // 자기전에 옆에 두었던 휴대폰을 본다.
                            // 어제 온 카카오톡을 확인한다.
                            // 같이 헬스장가자는 친구의 카톡을 읽는다.
                            // 아 나오늘 가슴이랑 이두 해야해 가서 따로 운동하자
                            // depth : 5

                            finalScore += 2;

                            System.out.println("가슴, 이두 운동을 시작한다.");

                            System.out.println("1. 횟수 하나하나에 진심을 다하고, 근육의 수축과 이완을 느끼면서 운동한다.");
                            System.out.println("2. 음악에 정신을 맡기고, 음악에 취해 운동을 한다.");
                            System.out.println("3. 깔짝깔짝하면서 내 한계치를 넘지 않는다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth: 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){
                            // 알람 소리를 듣고 일어난다.
                            // 자기전에 옆에 두었던 휴대폰을 본다.
                            // 어제 온 카카오톡을 확인한다.
                            // 같이 헬스장가자는 친구의 카톡을 읽는다.
                            // 음.. 아 그냥 오늘 쉴까?
                            // depth : 5

                            finalScore += 3;

                            System.out.println("후... 그냥 오늘은 쉴까?");

                            System.out.println("1. 쉰다는 나약한 생각은 집어치우고 집문을 박차고 헬스장으로 간다.");
                            System.out.println("2. 20분 정도만 쉬다가 친구에게 헬스장을 가자고 연락한다.");
                            System.out.println("3. 그냥 침대에 퍼질러져 쉰다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{

                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 3){
                        // 알람 소리를 듣고 일어난다.
                        // 자기전에 옆에 두었던 휴대폰을 본다.
                        // 어제 온 카카오톡을 확인한다.
                        // 같이 PC방 가자는 친구의 카톡을 읽는다.
                        // depth : 4

                        finalScore += 3;

                        System.out.println("카톡 내용 : 오늘 10시간 땡겨보실? 롤 승급이나 하자");
                        System.out.println("1. 10시간? 너무 많은데 나 좀만 하고 공부하러 가야해");
                        System.out.println("2. 5시간만해도 롤 승급 충분히함 5시간 하자");
                        System.out.println("3. 뭔소리여 하루종일 하자");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){
                            // 알람 소리를 듣고 일어난다.
                            // 자기전에 옆에 두었던 휴대폰을 본다.
                            // 어제 온 카카오톡을 확인한다.
                            // 같이 PC방 가자는 친구의 카톡을 읽는다.
                            // 10시간? 너무 많은데 나 좀만 하고 공부하러 가야해
                            // depth : 5

                            finalScore += 1;

                            System.out.println("10시간 너무 많아 나 공부도 해야해..");

                            System.out.println("1. 공부도 해야하기 때문에 친구에게 1시간만 하자고 한다.");
                            System.out.println("2. 딱 2시간만하고, 같이 공부하자고 한다.");
                            System.out.println("3. 친구가 \"뭔 소리야?\"라고 해서 맞지 뭔 공부냐를 시전한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){
                            // 알람 소리를 듣고 일어난다.
                            // 자기전에 옆에 두었던 휴대폰을 본다.
                            // 어제 온 카카오톡을 확인한다.
                            // 같이 PC방 가자는 친구의 카톡을 읽는다.
                            // 5시간만해도 롤 승급 충분히함 5시간만 하자.
                            // depth : 5

                            finalScore += 2;

                            System.out.println("5시간이 지났다.");

                            System.out.println("1. 5시간을 풀로 게임했기 때문에, 즐거움을 뒤로하고 독서실에 가서 teamNova 과제를 한다.");
                            System.out.println("2. 5시간을 온 열정을 쏟아서 하는 바람에 너무 피곤해서 집에가 30분정도 잠을 잔다.");
                            System.out.println("3. 5시간이 지났음에도, 카운터에가 5시간을 더 추가한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){
                            // 알람 소리를 듣고 일어난다.
                            // 자기전에 옆에 두었던 휴대폰을 본다.
                            // 어제 온 카카오톡을 확인한다.
                            // 같이 PC방 가자는 친구의 카톡을 읽는다.
                            // 뭔소리여 하루종일 하자
                            // depth : 5

                            finalScore += 3;

                            System.out.println("뭔소리여 하루종일 하자");

                            System.out.println("1. 막상 하루종일 하려니 시간이 너무 아깝다는 생각을 한다.");
                            System.out.println("2. 하루종일은 너무많고 딱 3시간 정도만 하자고 한다.");
                            System.out.println("3. 무박 2일도 가능하다고 친구에게 보낸다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{

                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else{

                        //depth : 4
                        finalScore = 0;
System.out.println("게임 종료");
                    }


                }else if(selectNum == 3){

                    // 알람 소리를 듣고 일어난다.
                    // 자기전에 옆에 두었던 휴대폰을 본다.
                    // 유튜브를 켠다.
                    // depth : 3

                    finalScore += 3;

                    System.out.println("유튜부를 켰다");
                    System.out.println("1. teamNova 채널을 켜서 마인드셋을 한다.");
                    System.out.println("2. 축구 전술 분석해주는 채널을 들어간다.");
                    System.out.println("3. 아무 생각 없이 보는 게임 채널을 들어간다.");

                    System.out.print("나의 선택 : ");
                    selectNum = sc.nextInt();

                    if(selectNum == 1){
                        // 알람 소리를 듣고 일어난다.
                        // 자기전에 옆에 두었던 휴대폰을 본다.
                        // 유튜브를 켠다.
                        // teamNova 채널을 켜서 마인드셋을 한다.
                        // depth : 4
                        finalScore+=1;

                        System.out.println("노프 팀장님 : 여러분 충분히 할 수 있어요~");

                        System.out.println("1. 영상을 다 시청하고 teamNova 과제를 시작한다.");
                        System.out.println("2. 다른 영상을 또 찾아본다.");
                        System.out.println("3. 유튜브 알고리즘에 의해 영화 소개해주는 영상을 본다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){
                            // 알람 소리를 듣고 일어난다.
                            // 자기전에 옆에 두었던 휴대폰을 본다.
                            // 유튜브를 켠다.
                            // teamNova 채널을 켜서 마인드셋을 한다.
                            // 영상을 다 시청하고 teamNova 과제를 시작한다.
                            // depth : 5

                            finalScore += 1;

                            System.out.println("teamNova 과제를 시작했다.");

                            System.out.println("1. 과제를 하면서, 같은 기수 팀원들과 하브루타를 진행한다.");
                            System.out.println("2. 우선 혼자서 teamNova 과제에 몰입해서 한다.");
                            System.out.println("3. teamNova 과제를 시작하자마자 어렵고 하기 싫어서 나도 모르게 휴대폰을 꺼내본다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){

                            // 알람 소리를 듣고 일어난다.
                            // 자기전에 옆에 두었던 휴대폰을 본다.
                            // 유튜브를 켠다.
                            // teamNova 채널을 켜서 마인드셋을 한다.
                            // 다른 영상을 또 찾아본다.
                            // depth : 5

                            finalScore += 2;

                            System.out.println("다른 영상을 찾는 중..");

                            System.out.println("1. 차라이 영상찾을 시간에 더 공부를 하자는 생각을 갖는다.");
                            System.out.println("2. 다른 영상을 찾아 1개더 신청하고 감명을 받는다.");
                            System.out.println("3. 다른 영상 찾다가 유튜브 알고리즘에 올라온 \"돈 쉽게 버는법\"을 시청한다. ");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth :  6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){

                            // 알람 소리를 듣고 일어난다.
                            // 자기전에 옆에 두었던 휴대폰을 본다.
                            // 유튜브를 켠다.
                            // teamNova 채널을 켜서 마인드셋을 한다.
                            // 유튜브 알고리즘에 의해 영화 소개해주는 영상을 본다.
                            // depth : 5

                            finalScore += 3;

                            System.out.println("영화 소개영상을 보는중..");

                            System.out.println("1. 영화 소개영상을 보다가 평소에 자신이 되고싶은 사람의 인생과 관련된 영상이 눈에 보여 클릭한다.");
                            System.out.println("2. 영화 소개영상을 처음부터 끝까지 보고, 평소에 관심 있던 영화 소개 영상을 더 찾아본다.");
                            System.out.println("3. 영화 소개 영상의 맨 뒷부분을 보며 결말만 습득하고, 다른 영상을 보러 간다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{

                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 2){
                        // 알람 소리를 듣고 일어난다.
                        // 자기전에 옆에 두었던 휴대폰을 본다.
                        // 유튜브를 켠다.
                        // 축구 전술 분석해주는 채널을 들어간다.
                        // depth : 4

                        finalScore+=2;


                        System.out.println("홀란드가 잘하는 이유는 ~ 영상이 끝났다.");

                        System.out.println("1. 재미있게 즐겼으니, teamNova 과제를 시작한다.");
                        System.out.println("2. 눈의 피로도를 풀기위해 눈 마사지를 해준다.");
                        System.out.println("3. 메시가 잘하는 이유는 ~ 영상을 본다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){
                            // 알람 소리를 듣고 일어난다.
                            // 자기전에 옆에 두었던 휴대폰을 본다.
                            // 유튜브를 켠다.
                            // 축구 전술 분석해주는 채널을 들어간다.
                            // 재미있게 즐겼으니, teamNova 과제를 시작한다.
                            // depth : 5

                            finalScore += 1;

                            System.out.println("재미있게 즐겼다.. 이제 과제를 해볼까");

                            System.out.println("1. 휴대폰은 최대한 공부하는 곳과 멀리 떨어트려 놓고, 과제를 시작한다.");
                            System.out.println("2. 과제에 몰입하기 위해 잠시 눈 휴식 시간을 갖는다.");
                            System.out.println("3. 막상 과제를 하려니 막막하다.. 좀 더 쉼으로 현실도피를 시전한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){
                            // 알람 소리를 듣고 일어난다.
                            // 자기전에 옆에 두었던 휴대폰을 본다.
                            // 유튜브를 켠다.
                            // 축구 전술 분석해주는 채널을 들어간다.
                            // 눈의 피로도를 풀기위해 눈 마사지를 해준다.
                            // depth : 5

                            finalScore += 2;

                            System.out.println("눈 마사지 중..");

                            System.out.println("1. 눈의 피로도가 다 풀려서 teamNova 2번과제를 시작한다.");
                            System.out.println("2. 아직 좀 덜풀려서 눈에 좋은 초록색을 보고 있는다.");
                            System.out.println("3. 눈의 피로보다 축구 전술 분석이 여운에 남아 다른 축구 전술 분석 영상을 찾아본다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3 ){
                            // 알람 소리를 듣고 일어난다.
                            // 자기전에 옆에 두었던 휴대폰을 본다.
                            // 유튜브를 켠다.
                            // 축구 전술 분석해주는 채널을 들어간다.
                            // 메시가 잘하는 이유는 ~ 영상을 본다.
                            // depth : 5

                            finalScore += 3;
                            System.out.println("아.. 메시가 이래서 잘하는거구나");

                            System.out.println("1. 메시의 삶을 보고 감명을받아 메시처럼 성공하고자 하는 삶을 지금 이순간부터 살아가고자는 마인드를 갖는다.");
                            System.out.println("2. 메시처럼 열심히 사는 모습을 보고 동경한다.");
                            System.out.println("3. 메시니깐 가능한 인생이지... 하면서 자신의 삶을 부정적으로 바라본다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{
                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 3){
                        // 알람 소리를 듣고 일어난다.
                        // 자기전에 옆에 두었던 휴대폰을 본다.
                        // 유튜브를 켠다.
                        // 아무 생각 없이 보는 게임 채널을 들어간다.
                        // depth : 4

                        finalScore+=3;

                        System.out.println("생각 없이 보는중...");

                        System.out.println("1. 번뜩 팀노바 과제를 해야한다는 생각이 들어 책상앞에 앉았다.");
                        System.out.println("2. 영상이 끝나고 휴대폰을 잠시 내려놓는다.");
                        System.out.println("3. 연관 영상에 롤 하이라이트 영상이 있어서 클릭한다.");

                        if(selectNum == 1){

                            finalScore += 1;

                            // 알람 소리를 듣고 일어난다.
                            // 자기전에 옆에 두었던 휴대폰을 본다.
                            // 유튜브를 켠다.
                            // 아무 생각 없이 보는 게임 채널을 들어간다.
                            // 번뜩 팀노바 과제를 해야한다는 생각이 들어 책상앞에 앉았다.
                            // depth : 5

                            System.out.println("책상에 앉았다..");

                            System.out.println("1. 과제1, 과제2를 다 끝내겠다는 생각으로 과제를 시작한다.");
                            System.out.println("2. 책상에 앉았으니, 자연스럽게 공부를 시작한다.");
                            System.out.println("3. 책상에 앉자마자 배가 고파 밥을 먹으러 간다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{

                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){

                            finalScore += 2;

                            // 알람 소리를 듣고 일어난다.
                            // 자기전에 옆에 두었던 휴대폰을 본다.
                            // 유튜브를 켠다.
                            // 아무 생각 없이 보는 게임 채널을 들어간다.
                            // 영상이 끝나고 휴대폰을 잠시 내려놓는다.
                            // depth : 5

                            System.out.println("영상이 끝나고 휴대폰 잠시 내려놓았다..");

                            System.out.println("1. 5분정도 쉬고 공부를 시작하자라는 생각을 갖는다.");
                            System.out.println("2. 휴대폰을 충전시켜 놓고, 물을 한잔 마시러 간다.");
                            System.out.println("3. 내려 놓은지 30초도 안되서 다른 게임 채널을 시청한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){

                            finalScore += 3;

                            // 알람 소리를 듣고 일어난다.
                            // 자기전에 옆에 두었던 휴대폰을 본다.
                            // 유튜브를 켠다.
                            // 아무 생각 없이 보는 게임 채널을 들어간다.
                            // 연관 영상에 롤 하이라이트 영상이 있어서 클릭한다.
                            // depth : 5

                            System.out.println("SKT vs GENG 경기 시작~ 합니다!");

                            System.out.println("1. 롤 하이라이트 영상을 보고 나서, teamNova과제 하기로 마음먹는다.");
                            System.out.println("2. 볼때는 집중을 딱 해서 본다.");
                            System.out.println("3. 지금 보는 영상의 연관 영상에 다른 하이라이트 영상이 눈에 들어와 다른 영상을 클릭해서본다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{
                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else{
                        // depth : 4
                        finalScore = 0;
System.out.println("게임 종료");
                    }

                }else{
                    // depth : 3
                    finalScore = 0;
System.out.println("게임 종료");
                }
            }else{

                // depth : 2
                finalScore = 0;
System.out.println("게임 종료");
            }
        }else if(selectNum == 2){
            finalScore+=2;
            // 30분뒤로 알람을 다시 맞추고 잔다.
            // depth : 1
            System.out.println("30분후...삐비비빅! 삐비비빅! 알람이 울린다.");
            System.out.println("1. 잠을 깨기 위해 냉수를 마시러 간다.");
            System.out.println("2. 냉장고 앞에서 아침 메뉴를 고민한다.");
            System.out.println("3. 알람을 30분 연기한다.");

            System.out.print("나의 선택 : ");
            selectNum = sc.nextInt();

            if(selectNum == 1){
                // 30분뒤로 알람을 다시 맞추고 잔다.
                // 잠을 깨기 위해 냉수를 마시러 간다.
                // depth : 2
                finalScore += 1;

                System.out.println("냉수를 마시고 잠이 완전히 깼다.");
                System.out.println("1. 간단하게 씻으러 화장실에 간다.");
                System.out.println("2. 허기가져 아침을 먹으러 편의점에 간다.");
                System.out.println("3. 삐리리리 ~ 친구에게 온 전화를 받는다.");

                System.out.print("나의 선택 : ");
                selectNum = sc.nextInt();

                if(selectNum == 1){
                    // 30분뒤로 알람을 다시 맞추고 잔다.
                    // 잠을 깨기 위해 냉수를 마시러 간다.
                    // 간단하게 씻으러 화장실에 간다.
                    // depth 3

                    System.out.println("화장실 안으로 들어왔다");
                    System.out.println("1. TeamNova 과제에 필요한 개념을 수강하며 씻는다.");
                    System.out.println("2. 음악을 감상하며 여유롭게 씻는다.");
                    System.out.println("3. 롤 하이라이트 영상을 보며 다 볼때까지 씻는다.");

                    System.out.print("나의 선택 : ");
                    selectNum = sc.nextInt();

                    if(selectNum == 1){
                        // 30분뒤로 알람을 다시 맞추고 잔다.
                        // 잠을 깨기 위해 냉수를 마시러 간다.
                        // 간단하게 씻으러 화장실에 간다.
                        // TeamNova 과제에 필요한 개념을 수강하며 씻는다.
                        // depth : 4

                        finalScore += 1;

                        System.out.println("샤워하면서 과제에 필요한 필수 개념을 익혔다.");

                        System.out.println("1. 머리를 말리고, 익힌개념으로 책상에 앉아 과제를 한다.");
                        System.out.println("2. 이해가 되지 않아 다시한번 영상을 돌려본다.");
                        System.out.println("3. 샤워도 했고 개운하니 잠시 침대에 누워 휴식을 취한다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){
                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 잠을 깨기 위해 냉수를 마시러 간다.
                            // 간단하게 씻으러 화장실에 간다.
                            // TeamNova 과제에 필요한 개념을 수강하며 씻는다.
                            // 머리를 말리고, 익힌 개념으로 책상에 앉아 과제를 한다.
                            // depth : 5

                            finalScore += 1;

                            System.out.println("과제를 시작해보자..");

                            System.out.println("1. 과제를 하다보니 씻으면서 들었던 개념 강의내용이 잘 이해가 되지 않아서 다시 공부한다.");
                            System.out.println("2. 과제를 하면서 이해가 안되는 개념이 있어 하브루타를 통해 팀원에게 배웠다.");
                            System.out.println("3. 과제 5분하고 휴대폰 20분 보는 것을 반복한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){
                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 잠을 깨기 위해 냉수를 마시러 간다.
                            // 간단하게 씻으러 화장실에 간다.
                            // TeamNova 과제에 필요한 개념을 수강하며 씻는다.
                            // 이해가 되지 않아 다시한번 영상을 돌려본다.
                            // depth : 5

                            finalScore += 2;

                            System.out.println("영상을 돌려보는중...");

                            System.out.println("1. 다시 돌려보고 개념을 완벽히 이해해서 머리를 말리러 간다.");
                            System.out.println("2. 영상을 잠시 멈춰놓고 몸을 닦고, 다 닦은 후에 영상을 다시 시청한다.");
                            System.out.println("3. 영상을 멈추고 밑에 나온 런닝맨 예능모음집을 시청한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){

                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 잠을 깨기 위해 냉수를 마시러 간다.
                            // 간단하게 씻으러 화장실에 간다.
                            // TeamNova 과제에 필요한 개념을 수강하며 씻는다.
                            // 샤워도 했고 개운하니 잠시 침대에 누워 휴식을 취한다.
                            // depth : 5

                            finalScore += 3;

                            System.out.println("휴식을 취하는 중이다...");

                            System.out.println("1. 20분정도 휴식을 취하고 나서, 다시 과제하러 간다.");
                            System.out.println("2. 휴식을 취하면서, 씻으면서 봤던 개념영상을 되짚어본다.");
                            System.out.println("3. 휴식을 취하다가 잠이 든다...");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{

                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 2){
                        // 30분뒤로 알람을 다시 맞추고 잔다.
                        // 잠을 깨기 위해 냉수를 마시러 간다.
                        // 간단하게 씻으러 화장실에 간다.
                        // 음악을 감상하며 여유롭게 씻는다.
                        // depth : 4

                        finalScore += 2;

                        System.out.println("음악이 끝났다..");

                        System.out.println("1. 음악이 끝났으니, 얼른 마무리하고 팀노바 과제를 하러 간다.");
                        System.out.println("2. 듣고싶은 음악이 떠올라 1곡만 더듣는다.");
                        System.out.println("3. 화장실이 갑자기 노래방이 되어 30분간 노래를 부른다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){

                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 잠을 깨기 위해 냉수를 마시러 간다.
                            // 간단하게 씻으러 화장실에 간다.
                            // 음악을 감상하며 여유롭게 씻는다.
                            // 음악이 끝났으니, 얼른 마무리하고 팀노바 과제를 하러 간다.
                            // depth : 5

                            finalScore += 1;

                            System.out.println("팀노바 과제를 하기 위해 책상에 앉았다.");

                            System.out.println("1. 팀노바 과제를 하면서 모르는게 생겨 구글링을 통해 충분히 알아본 후 멘토링을 신청했다.");
                            System.out.println("2. 팀노바 과제를 하면서 모르는게 생겨 바로 멘토링을 신청했다.");
                            System.out.println("3. 팀노바 과제를 하면서 모르는게 있어도 대충 이런식으로 동작하겠지 하고 넘어간다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){
                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 잠을 깨기 위해 냉수를 마시러 간다.
                            // 간단하게 씻으러 화장실에 간다.
                            // 음악을 감상하며 여유롭게 씻는다.
                            // 듣고싶은 음악이 떠올라 1곡만 더 듣는다.
                            // depth : 5

                            finalScore += 2;

                            System.out.println("듣고 싶던 노래를 재생한다.");

                            System.out.println("1. 막상 1곡을 듣다보니 이미 다 씻어서 안듣고, 수건으로 몸을 닦고 나온다.");
                            System.out.println("2. 이번 곡만 듣고 그만 듣는다.");
                            System.out.println("3. 1곡을 들으면서 노래를 부르다보니, 씻다말고 화장실에서 노래를 부르기 시작한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){
                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 잠을 깨기 위해 냉수를 마시러 간다.
                            // 간단하게 씻으러 화장실에 간다.
                            // 음악을 감상하며 여유롭게 씻는다.
                            // 화장실이 갑자기 노래방이 되어 30분간 노래를 부른다.
                            // depth : 5

                            finalScore += 3;

                            System.out.println("30분 동안 노래를 불렀다..");

                            System.out.println("1. 해야할 것도 많은데 30분동안 뻘짓한 자신을 후회하며, 몸을 닦고 방으로 간다.");
                            System.out.println("2. 마지막으로 한곡 더 부르고 몸을 닦기로 한다.");
                            System.out.println("3. 이 기세를 이어 노래방을 가기 위해 몸을 닦고, 옷을 입는다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{

                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 3){
                        // 30분뒤로 알람을 다시 맞추고 잔다.
                        // 잠을 깨기 위해 냉수를 마시러 간다.
                        // 간단하게 씻으러 화장실에 간다.
                        // 롤 하이라이트 영상을 보며 다 볼때까지 씻는다.
                        // depth : 4

                        finalScore += 3;

                        System.out.println("롤 하이라이트 영상이 끝났다.");

                        System.out.println("1. 샤워를 마무리하고, 하다 남은 teamNova 과제를 시작한다.");
                        System.out.println("2. 몸과 머리를 말리고,따뜻한 우유를 들고 책상앞에 앉는다.");
                        System.out.println("3. 머리를 말리고나서 자연스럽게 다른 롤 하이라이트 영상을 본다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){
                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 잠을 깨기 위해 냉수를 마시러 간다.
                            // 간단하게 씻으러 화장실에 간다.
                            // 롤 하이라이트 영상을 보며 다 볼때까지 씻는다.
                            // 샤워를 마무리하고, 하다 남은 teamNova 과제를 시작한다.
                            // depth : 5

                            finalScore += 1;

                            System.out.println("남은 teamNova 과제를 해볼까나..?");

                            System.out.println("1. 남은 과제를 다하고, 현재 내가 한 과제를 다시한번 잘못된게 없는지 짚고 넘어간다.");
                            System.out.println("2. 우선 과제가 끝났기 때문에, 휴식을 취하러 간다.");
                            System.out.println("3. 얼마 안남았으니 다음 수업 전날 해야지를 시전한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){
                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 잠을 깨기 위해 냉수를 마시러 간다.
                            // 간단하게 씻으러 화장실에 간다.
                            // 롤 하이라이트 영상을 보며 다 볼때까지 씻는다.
                            // 따듯한 우유를 들고 책상앞에 앉는다.
                            // depth : 5

                            finalScore += 2;

                            System.out.println("따뜻한 우유를 홀짝.. 홀짝 마신다.");

                            System.out.println("1. 우유를 다마시고 나서 예약해 두었던 teamNova 멘토링을 시작한다.");
                            System.out.println("2. 책상위에 있던 초코빵을 우유와 같이 먹는다.");
                            System.out.println("3. 따뜻한 우유를 마시면서 롤 하이라이트 영상을 다시 시청한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){
                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 잠을 깨기 위해 냉수를 마시러 간다.
                            // 간단하게 씻으러 화장실에 간다.
                            // 롤 하이라이트 영상을 보며 다 볼때까지 씻는다.
                            // 머리를 말리고나서 자연스럽게 다른 롤 하이라이트 영상을 본다.
                            // depth : 5

                            finalScore += 3;

                            System.out.println("롤 하이라이트 영상을 보는중...");

                            System.out.println("1. 오늘 일어나서 한일에대해 되돌아보고, 아무것도 한 것이 없는 자신을 자책하며 공부를 시작한다.");
                            System.out.println("2. 지금 보는 영상은 다보고, 공부하고자 마음을 먹는다.");
                            System.out.println("3. 롤 하이라이트 영상이 너무 재미있어서 오늘 하루종일 보자는 생각을 가진다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{
                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else{
                        // depth : 4
                        finalScore = 0;
System.out.println("게임 종료");
                    }

                }else if(selectNum == 2){
                    // 30분뒤로 알람을 다시 맞추고 잔다.
                    // 잠을 깨기 위해 냉수를 마시러 간다.
                    // 허기가져 아침을 먹으러 편의점에 간다.
                    // depth 3

                    finalScore += 2;

                    System.out.println("편의점에 도착했다.");
                    System.out.println("1. 도시락을 구매하고, 따뜻하게 데워 먹는다.");
                    System.out.println("2. 차가운 삼각김밥에, 육개장 라면을 먹는다.");
                    System.out.println("3. 주먹밥을 데우지도 않고 먹는다.");

                    System.out.print("나의 선택 : ");
                    selectNum = sc.nextInt();

                    if(selectNum == 1){
                        // 30분뒤로 알람을 다시 맞추고 잔다.
                        // 잠을 깨기 위해 냉수를 마시러 간다.
                        // 허기가져 아침을 먹으러 편의점에 간다.
                        // 도시락을 구매하고, 따뜻하게 데워 먹는다.
                        // depth : 4

                        finalScore += 1;

                        System.out.println("따듯한 도시락을 다 먹었다.");

                        System.out.println("1. 배도 부르니 웨이트 트레이닝 하러 간다.");
                        System.out.println("2. 잠시 소화도 시킬겸 동네를 한바퀴 산책한다.");
                        System.out.println("3. 배가 부르니 침대에서 눈을 감아 잠시 배부름을 만끽하다 잠이든다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){
                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 잠을 깨기 위해 냉수를 마시러 간다.
                            // 허기가져 아침을 먹으러 편의점에 간다.
                            // 도시락을 구매하고, 따뜻하게 데워 먹는다.
                            // 배도 부르니 웨이트 트레이닝 하러 간다.
                            // depth : 5

                            finalScore += 1;

                            System.out.println("웨이트 트레이닝을 하러 헬스장에 도착했다.");

                            System.out.println("1. 오늘은 어깨, 하체하는 날이니 어떤 순서로 할지 스캔한다.");
                            System.out.println("2. 하체보다 어깨운동 하는게 더 좋으니, 어깨운동에 더 많은 비중을 두고 운동한다.");
                            System.out.println("3. 헬스장에 도착하자마자 하기 싫다는 생각이들어 다시 헬스장 밖으로 뛰쳐 나갔다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){

                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 잠을 깨기 위해 냉수를 마시러 간다.
                            // 허기가져 아침을 먹으러 편의점에 간다.
                            // 도시락을 구매하고, 따뜻하게 데워 먹는다.
                            // 잠시 소화도 시킬겸 동네를 한바퀴 산책한다.
                            // depth : 5

                            finalScore += 2;

                            System.out.println("동네 한바퀴를 산책하는중..");

                            System.out.println("1. 한바퀴 산책하면서 자신의 꿈에 대해서 진지하게 고민해본다.");
                            System.out.println("2. 아무런 생각없이 자연을 즐기면서 산책을 한다.");
                            System.out.println("3. 산책 중에 편의점에서 술마시는 친구를 보고 같이 합석한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){

                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 잠을 깨기 위해 냉수를 마시러 간다.
                            // 허기가져 아침을 먹으러 편의점에 간다.
                            // 도시락을 구매하고, 따뜻하게 데워 먹는다.
                            // 배가 부르니 침대에서 눈을 감아 잠시 배부름을 만끽하다 잠이든다.
                            // depth : 5

                            finalScore += 3;

                            System.out.println("잠이 들었다가 잠시 일어났다.");

                            System.out.println("1. 바로 일어나서 책상에 앉아 공부를 한다.");
                            System.out.println("2. 혹시 또 자는 것을 대비해서 30분 알람을 따로 맞춰놓는다.");
                            System.out.println("3. 제일 맛있고, 몸에 나쁜 냉동식품을 먹는다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{

                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 2){
                        // 30분뒤로 알람을 다시 맞추고 잔다.
                        // 잠을 깨기 위해 냉수를 마시러 간다.
                        // 허기가져 아침을 먹으러 편의점에 간다.
                        // 차가운 삼각김밥에, 육개장 라면을 먹는다.
                        // depth : 4

                        finalScore += 2;

                        System.out.println("뜨뜻한 육개장에 차가운 삼각김밥은 일품이군!");

                        System.out.println("1. 편의점을 나와 집으로가서 책상에 앉는다.");
                        System.out.println("2. 소화도 시킬 겸 편의점 주변을 산책한다.");
                        System.out.println("3. 편의점을 나와 집근처 노래방을 간다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){
                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 잠을 깨기 위해 냉수를 마시러 간다.
                            // 허기가져 아침을 먹으러 편의점에 간다.
                            // 차가운 삼각김밥에, 육개장 라면을 먹는다.
                            // 편의점을 나와 집으로 가서 책상에 앉는다.
                            // depth : 5

                            finalScore += 1;

                            System.out.println("책상에 앉았다...");

                            System.out.println("1. 테슬라 신기술 발표회가 있어서 유튜브로 시청한다.");
                            System.out.println("2. 공부가 안땡겨서, 빌게이츠 자서전을 읽는다.");
                            System.out.println("3. 책상에 앉아서 가만히 멍때리다가 꾸벅꾸벅 존다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }


                        }else if(selectNum == 2){
                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 잠을 깨기 위해 냉수를 마시러 간다.
                            // 허기가져 아침을 먹으러 편의점에 간다.
                            // 차가운 삼각김밥에, 육개장 라면을 먹는다.
                            // 소화도 시킬 겸 편의점 주변을 산책한다.
                            // depth : 5

                            finalScore += 2;

                            System.out.println("편의점 주변을 산책중이다...");

                            System.out.println("1. 산책을 하다보니 철봉이 보여서 바로 턱걸이를 땡기러간다.");
                            System.out.println("2. 스트레칭하면서 산책을 즐긴다.");
                            System.out.println("3. 낮술이 땡겨서 편의점에 다시들어가 맥주와 오징어땅콩을 사온다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){
                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 잠을 깨기 위해 냉수를 마시러 간다.
                            // 허기가져 아침을 먹으러 편의점에 간다.
                            // 차가운 삼각김밥에, 육개장 라면을 먹는다.
                            // 편의점을 나와 집근처 노래방을 간다.
                            // depth : 5

                            finalScore += 3;

                            System.out.println("노래방에 도착했다.");

                            System.out.println("1. 노래방에서 모든 스트레스를 노래를 불러서 해소한다.");
                            System.out.println("2. 우선 1시간을 충전하고 노래를 시작한다.");
                            System.out.println("3. 노래방 옆에 PC방이 보여서 노래를 부른 후 PC방을 가는 계획을 세운다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{

                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 3){
                        // 30분뒤로 알람을 다시 맞추고 잔다.
                        // 잠을 깨기 위해 냉수를 마시러 간다.
                        // 허기가져 아침을 먹으러 편의점에 간다.
                        // 주먹밥을 데우지도 않고 먹는다.
                        // depth : 4

                        finalScore += 3;

                        System.out.println("1. 역시 주먹밥은 차게 먹어야 맛있지");
                        System.out.println("2. 배도 부르고 하니 teamNova 1번과제를 시작한다.");
                        System.out.println("3. 아직 살짝 부족하다.. 샌드위치를 사먹는다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){
                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 잠을 깨기 위해 냉수를 마시러 간다.
                            // 허기가져 아침을 먹으러 편의점에 간다.
                            // 주먹밥을 데우지도 않고 먹는다.
                            // 역시 주먹밥은 차게 먹어야 맛있지
                            // depth : 5

                            finalScore += 1;

                            System.out.println("주먹밥을 다 먹었다...");

                            System.out.println("1. 다 먹었으니,집에와서 바로 공부를 시작한다.");
                            System.out.println("2. 주먹밥을 먹어도 배가 덜 불러서 도시락을 하나 사서 집에간다.");
                            System.out.println("3. 다먹고 집에가서 누워 있는다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){
                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 잠을 깨기 위해 냉수를 마시러 간다.
                            // 허기가져 아침을 먹으러 편의점에 간다.
                            // 주먹밥을 데우지도 않고 먹는다.
                            // 배도 부르고 하니 teamNova 1번과제를 시작한다.
                            // depth : 5

                            finalScore += 2;

                            System.out.println("1번 과제를 시작했다.");

                            System.out.println("1. 1번 과제를 완료했다. 2번과제를 시작한다.");
                            System.out.println("2. 1번 과제를 완료했으니, 2번과제는 다음번에 한다.");
                            System.out.println("3. 1번 과제의 절반은 했으니 남은건 다음번에 하자.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){
                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 잠을 깨기 위해 냉수를 마시러 간다.
                            // 허기가져 아침을 먹으러 편의점에 간다.
                            // 주먹밥을 데우지도 않고 먹는다.
                            // 아직 살짝 부족하다.. 샌드위치를 사먹는다.
                            // depth : 5

                            finalScore += 3;

                            System.out.println("샌드위치 정말 맛있군..");

                            System.out.println("1. 샌드위치를 다먹고나서 집으로 곧장가서 책상에 앉아 공부를 한다.");
                            System.out.println("2. 샌드위치를 먹고 배가 불러 소화를 시키고 집을 간다.");
                            System.out.println("3. 배도 부르니.. 게임을 하고싶은 욕구가 올라와 게임을 하러 간다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{
                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else{
                        // depth : 4
                        finalScore = 0;
System.out.println("게임 종료");
                    }

                }else if(selectNum == 3){
                    // 30분뒤로 알람을 다시 맞추고 잔다.
                    // 잠을 깨기 위해 냉수를 마시러 간다.
                    // 삐리리리 ~ 친구에게 온 전화를 받는다.
                    // depth 3

                    finalScore += 3;

                    System.out.println("삐리리리 ~ 친구에게 온 전화를 받는다.");
                    System.out.println("1. 지금 한강에가서 놀자는 친구에게 TeamNova 과제를 해야한다며 거절한다.");
                    System.out.println("2. 간단하게 밥이나 먹자며 친구를 회유한다.");
                    System.out.println("3. 과제고 뭐고 박차고 나간다.");

                    System.out.print("나의 선택 : ");
                    selectNum = sc.nextInt();

                    if(selectNum == 1){
                        // 30분뒤로 알람을 다시 맞추고 잔다.
                        // 잠을 깨기 위해 냉수를 마시러 간다.
                        // 삐리리리 ~ 친구에게 온 전화를 받는다.
                        // 지금 한강에서 놀자는 친구에게 TeamNova 과제를 해야한다며 거절한다.
                        // depth 4

                        finalScore += 1;

                        System.out.println("나 TeamNova 과제 해야해서 못갈거 같다..");

                        System.out.println("아쉬운 마음을 뒤로하고 teamNova 과제를 시작한다.");
                        System.out.println("거절을 하고, 이 악물고 책상에 앉는다.");
                        System.out.println("라고 머릿속으로 생각만하고 입은 이미 간다고 말하고 있다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){

                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 잠을 깨기 위해 냉수를 마시러 간다.
                            // 삐리리리 ~ 친구에게 온 전화를 받는다.
                            // 지금 한강에서 놀자는 친구에게 TeamNova 과제를 해야한다며 거절한다.
                            // 아쉬운 마음을 뒤로하고 teamNova 과제를 시작한다.
                            // depth 5
                            finalScore += 1;

                            System.out.println("teamNova 과제가 이게 맞는지 잘 모르겠다.");

                            System.out.println("1. teamNova 과제에 대해 확실하게 이해를 하지 못해서 팀장님께 다시 여쭈어 본다.");
                            System.out.println("2. teamNova 과제에 대해 정확히 알지 못해서 팀원과 하브루타를 통해 과제를 이해한다.");
                            System.out.println("3. 그냥 내가 듣고 이해한대로 과제를 수행한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){

                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 잠을 깨기 위해 냉수를 마시러 간다.
                            // 삐리리리 ~ 친구에게 온 전화를 받는다.
                            // 지금 한강에서 놀자는 친구에게 TeamNova 과제를 해야한다며 거절한다.
                            // 거절을 하고, 이 악물고 책상에 앉는다.
                            // depth 5

                            finalScore += 2;

                            System.out.println("이를 악물고 책상에 앉는다.");

                            System.out.println("1. 이를 악문만큼 오기를 갖고 공부를 시작한다.");
                            System.out.println("2. 놀고싶은 마음이 올라오지만 꾹 참고 공부를한다.");
                            System.out.println("3. 한강에 가자고 했던 친구에게 다시 전화한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){

                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 잠을 깨기 위해 냉수를 마시러 간다.
                            // 삐리리리 ~ 친구에게 온 전화를 받는다.
                            // 지금 한강에서 놀자는 친구에게 TeamNova 과제를 해야한다며 거절한다.
                            // 라고 머릿속으로 생각만하고 입은 이미 간다고 말하고 있다.
                            // depth 5

                            finalScore += 3;

                            System.out.println("지금 당장 갈게~~");

                            System.out.println("1. 한강에서 기분전환하고 근처 카페에서 공부하기 위해 노트북을 가져간다.");
                            System.out.println("2. 공부할 시간도 생각 하면서, 한강으로 간다.");
                            System.out.println("3. 끝나고 술도 마실 생각으로 놀러간다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else {

                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 2){
                        // 30분뒤로 알람을 다시 맞추고 잔다.
                        // 잠을 깨기 위해 냉수를 마시러 간다.
                        // 삐리리리 ~ 친구에게 온 전화를 받는다.
                        // 간단하게 밥이나 먹자며 친구를 회유한다.
                        // depth 4

                        finalScore += 2;

                        System.out.println("친구가 알겠다하여 밥 약속을 잡았다.");

                        System.out.println("먹고 바로 공부할 수 있게 집근처에서 간단하게 먹는다.");
                        System.out.println("이왕 먹는거 맛있는거 먹고 공부하면 된다는 마인드로 집에서 좀 떨어진 맛집을 간다.");
                        System.out.println("밥먹고 술까지 먹을 수 있게 술집으로 간다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){
                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 잠을 깨기 위해 냉수를 마시러 간다.
                            // 삐리리리 ~ 친구에게 온 전화를 받는다.
                            // 간단하게 밥이나 먹자며 친구를 회유한다.
                            // 먹고 바로 공부할 수 있게 집근처에서 간단하게 먹는다.
                            // depth 5

                            finalScore += 1;

                            System.out.println("간단하게 김밥천국에서 밥 다먹고 난후, 친구가 뭐할거냐고 물어본다.");

                            System.out.println("1. 해야할게 너무 많아서 집에 가야한다고 말한다.");
                            System.out.println("2. 밖에 나온김에 헬스장가자고 친구에게 말한다.");
                            System.out.println("3. 그러게..? 그냥 PC방이나 갈까? 라고 말한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){
                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 잠을 깨기 위해 냉수를 마시러 간다.
                            // 삐리리리 ~ 친구에게 온 전화를 받는다.
                            // 간단하게 밥이나 먹자며 친구를 회유한다.
                            // 이왕 먹는거 맛잇는거 먹고 공부하면 된다는 마인드로 집에서 좀 떨어진 맛집을 간다.
                            // depth 5

                            finalScore += 2;

                            System.out.println("맛집에 가서 맛있게 밥을 먹었다..");

                            System.out.println("1. 거리가 먼 만큼 공부시간을 확보하기 위해 카페에 가지않고 바로 집에 간다.");
                            System.out.println("2. 어차피 운동은 해야하니, 친구랑 같이 맛집 근처에 있는 헬스장에서 운동을 한다.");
                            System.out.println("3. 밥을 먹고나서 근처 카페에가서 수다를 떤다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){
                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 잠을 깨기 위해 냉수를 마시러 간다.
                            // 삐리리리 ~ 친구에게 온 전화를 받는다.
                            // 간단하게 밥이나 먹자며 친구를 회유한다.
                            // 밥먹고 술까지 먹을 수 있게 술집으로 간다.
                            // depth 5

                            finalScore += 3;

                            System.out.println("술집에서 친구가 먹고 죽자는 마인드로 소주 4병을 시킨다.");

                            System.out.println("1. 친구에게 내일 지장있을 정도로 마시면 안된다고 1병만 먹는다고 말한다.");
                            System.out.println("2. 4병은 너무 많고, 적당히 먹자고 말한다.");
                            System.out.println("3. 4병가지고 되겠어? 라고 말하며 소주를 추가로 더 시킨다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{

                            //depth 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 3){
                        // 30분뒤로 알람을 다시 맞추고 잔다.
                        // 잠을 깨기 위해 냉수를 마시러 간다.
                        // 삐리리리 ~ 친구에게 온 전화를 받는다.
                        // 과제고 뭐고 박차고 나간다.
                        // depth 4

                        finalScore += 3;

                        System.out.println("과제고 뭐고 일단 나가자!~");

                        System.out.println("1. 집 밖에 몇걸음 가지도 않아서.. 이건 아니지 라며 집에와 책상에 앉아 친구한테 담에 보자고 한다.");
                        System.out.println("2. 일단 산책을 한번해보면서 놀고싶은 생각을 추스른다.");
                        System.out.println("3. 친구에게 전화를 걸어 오늘 술도 먹자고 한다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){
                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 잠을 깨기 위해 냉수를 마시러 간다.
                            // 삐리리리 ~ 친구에게 온 전화를 받는다.
                            // 과제고 뭐고 박차고 나간다.
                            // 집 밖에 몇걸음 가지도 않아서.. 이건 아니지 라며 집에와 책상에 앉아 친구한테 담에 보자고 한다.
                            // depth 5

                            finalScore += 1;

                            System.out.println("공부 해야겠다... 담에보자!");

                            System.out.println("1. 바로 빡집중해서 공부를 시작한다.");
                            System.out.println("2. 놀고싶은 마음을 동네 산책을 하며 달랜다.");
                            System.out.println("3. 담에 보자고 하자마자 바로 다시 그냥 오늘은 놀래를 시전한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){
                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 잠을 깨기 위해 냉수를 마시러 간다.
                            // 삐리리리 ~ 친구에게 온 전화를 받는다.
                            // 과제고 뭐고 박차고 나간다.
                            // 친구에게 전화를 걸어 오늘 술도 먹자고 한다.
                            // depth 5

                            finalScore += 2;

                            System.out.println("나 : 오늘 술먹자! 친구 : 오늘 술은 좀 아닌거 같아");

                            System.out.println("1. 그런가..? 내가 너무 갔나봐 술 먹지말자");
                            System.out.println("2. 에이 딱 1잔만 하자..");
                            System.out.println("3. 너가 친구야? 너말고 딴애랑 마시러갈게");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){
                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 잠을 깨기 위해 냉수를 마시러 간다.
                            // 삐리리리 ~ 친구에게 온 전화를 받는다.
                            // 과제고뭐고 박차고 나간다.
                            // 친구에게 전화를 걸어 오늘 술도 먹자고 한다.
                            // depth 5

                            finalScore += 3;

                            System.out.println("잠이 들었다가 잠시 일어났다.");

                            System.out.println("1. 바로 일어나서 책상에 앉아 공부를 한다.");
                            System.out.println("2. 혹시 또 자는 것을 대비해서 30분 알람을 따로 맞춰놓는다.");
                            System.out.println("3. 제일 맛있고, 몸에 나쁜 냉동식품을 먹는다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{

                            // depth 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else{
                        // depth 4
                        finalScore = 0;
System.out.println("게임 종료");
                    }

                }else{
                    // depth 3
                    finalScore = 0;
System.out.println("게임 종료");
                }

            }else if(selectNum == 2){
                // 30분뒤로 알람을 다시 맞추고 잔다.
                // 냉장고 앞에서 아침 메뉴를 고민한다.
                // depth : 2
                finalScore += 2;

                System.out.println("음... 무엇을 먹을까?");

                System.out.println("1. 소고기 덮밥을 해먹는다.");
                System.out.println("2. 참치주먹밥을 만들어 먹는다.");
                System.out.println("3. 라면을 뿌셔서 칠성사이다랑 같이 먹는다.");

                System.out.print("나의 선택 : ");
                selectNum = sc.nextInt();

                if(selectNum == 1){
                    // 30분뒤로 알람을 다시 맞추고 잔다.
                    // 냉장고 앞에서 아침 메뉴를 고민한다.
                    // 소고기 덮밥을 먹는다.
                    // depth : 3
                    finalScore+=1;

                    System.out.println("1. 소고기 덮밥을 먹고 teamNova 학원을 간다.");
                    System.out.println("2. 소고기 덮밥을 먹고, 동네 카페에가서 공부한다.");
                    System.out.println("3. 집에서 어영부영 공부를 한다.");

                    System.out.print("나의 선택 : ");
                    selectNum = sc.nextInt();

                    if(selectNum == 1){
                        // 30분뒤로 알람을 다시 맞추고 잔다.
                        // 냉장고 앞에서 아침 메뉴를 고민한다.
                        // 소고기 덮밥을 먹는다.
                        // 소고기 덮밥을 먹고 teamNova 학원을 간다.
                        // depth : 4

                        finalScore += 1;

                        System.out.println("teamNova 학원에 도착했다.");
                        System.out.println("1. 자리를 잡고 집중모드로 과제를 시작한다.");
                        System.out.println("2. 달달한 누네띠네를 먹으며 잠깐 휴식을 취한다.");
                        System.out.println("3. 일단 자리에는 앉고, 휴대폰을 본다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1 ) {
                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 냉장고 앞에서 아침 메뉴를 고민한다.
                            // 소고기 덮밥을 먹는다.
                            // 소고기 덮밥을 먹고 teamNova 학원을 간다.
                            // 자리를 잡고 집중모드로 과제를 시작한다.
                            // depth : 5

                            finalScore += 1;

                            System.out.println("집중모드 on~, 3시간 후..");

                            System.out.println("1. 3시간동안 집중을해서 잠시 눈과 마음의 휴식을 취한다.");
                            System.out.println("2. 3시간동안 집중하니 배도 고프고 해서 옆에있는 초코쿠키를 먹는다.");
                            System.out.println("3. 3시간이면 충분히 공부했다 침대에 쉬러간다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        } else if(selectNum == 2 ){
                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 냉장고 앞에서 아침 메뉴를 고민한다.
                            // 소고기 덮밥을 먹는다.
                            // 소고기 덮밥을 먹고 teamNova 학원을 간다.
                            // 달달한 누네띠네를 먹으며 잠깐 휴식을 취한다.
                            // depth : 5

                            finalScore += 2;

                            System.out.println("누네띠네를 먹었다.");

                            System.out.println("1. 간식 보충도 했으니 teamNova 과제를 본격적으로 시작한다.");
                            System.out.println("2. 누네띠네가 너무 맛있어 1개를 더 먹는다.");
                            System.out.println("3. 밥도먹고 간식도 먹으니 잠이와서 책상에 엎드려 잠을 잔다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        } else if(selectNum == 3){
                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 냉장고 앞에서 아침 메뉴를 고민한다.
                            // 소고기 덮밥을 먹는다.
                            // 소고기 덮밥을 먹고 teamNova 학원을 간다.
                            // 일단 자리에는 앉고, 휴대폰을 본다.
                            // depth : 5

                            finalScore += 3;

                            System.out.println("휴대폰을 보는중..");

                            System.out.println("1. 휴대폰을 이렇게 보다보면 시간이 금방 사라질 것 같아서 휴대폰을 잠시 접어둔다.");
                            System.out.println("2. 음.. 재밌는 영상 하나만 보고 꺼야겠다고 생각한다.");
                            System.out.println("3. 2시간짜리 LCK 풀영상을 시청한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        } else {
                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 2){
                        // 30분뒤로 알람을 다시 맞추고 잔다.
                        // 냉장고 앞에서 아침 메뉴를 고민한다.
                        // 소고기 덮밥을 먹는다.
                        // 소고기 덮밥을 먹고, 동네 카페에가서 공부한다.
                        // depth : 4
                        finalScore += 2;

                        System.out.println("동네 카페에 도착했는데, 친한친구가 앉아있다.");
                        System.out.println("1. 공부에 방해가 될까봐 카페 구석에 짱박혀 있는다.");
                        System.out.println("2. 친구랑 잠시 담소를 나누고 공부하러 자리를 옮긴다.");
                        System.out.println("3. 이때다 싶어 공부할 생각은 안하고 친구 앞자리에 앉는다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){
                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 냉장고 앞에서 아침 메뉴를 고민한다.
                            // 소고기 덮밥을 먹는다.
                            // 소고기 덮밥을 먹고, 동네 카페에가서 공부한다.
                            // 공부에 방해가 될까봐 카페 구석에 짱박혀 있는다.
                            // depth : 5

                            finalScore += 1;

                            System.out.println("카페 구석 자리에 읹았다.");

                            System.out.println("1. 노트북을 꺼내서 공부를 시작한다.");
                            System.out.println("2. 카페가 생각보다 소음이 좀 있어서 근처 스터디 카페에 간다.");
                            System.out.println("3. 노트북을 꺼내야 하는데 휴대폰을 꺼낸다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){
                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 냉장고 앞에서 아침 메뉴를 고민한다.
                            // 소고기 덮밥을 먹는다.
                            // 소고기 덮밥을 먹고, 동네 카페에가서 공부한다.
                            // 친구랑 잠시 담소를 나누고 공부하러 자리를 옮긴다.
                            // depth : 5

                            finalScore += 2;

                            System.out.println("자리를 옮겨 앉았다.");

                            System.out.println("1. 자리를 옮겼으니 본격적으로 공부를 시작한다.");
                            System.out.println("2. 자리를 옮기고 청결한 공부환경을 위해 자리를 깨끗히 치운다.");
                            System.out.println("3. 막상 자리를 옮기니 다시 수다가 떨고싶어져서 친구에게 돌아간다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }


                        }else if(selectNum == 3){
                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 냉장고 앞에서 아침 메뉴를 고민한다.
                            // 소고기 덮밥을 먹는다.
                            // 소고기 덮밥을 먹고, 동네 카페에가서 공부한다.
                            // 이때다 싶어 공부할 생각은 안하고 친구 앞자리에 앉는다.
                            // depth : 5

                            finalScore += 3;

                            System.out.println("친구 앞자리에 앉았다.");

                            System.out.println("1. 30분정도 수다를 떨고 공부하러 갈 생각을 한다.");
                            System.out.println("2. 마음 한구석에 teamNova 과제를 해야되는데 해야되는데 하면서 수다를 떤다.");
                            System.out.println("3. 신명나게 떠들기를 시전한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{
                            // depth:5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 3){
                        // 30분뒤로 알람을 다시 맞추고 잔다.
                        // 냉장고 앞에서 아침 메뉴를 고민한다.
                        // 소고기 덮밥을 먹는다.
                        // 집에서 어영부영 공부를 한다.
                        // depth : 4

                        finalScore += 3;

                        System.out.println("집에서 어영부영 공부를 시작했다.");
                        System.out.println("1. 집중이 너무 안되어서 teamNova 자습실에가서 공부한다.");
                        System.out.println("2. 집중은 잘 안되지만, 최대로 과제에 몰입하려고 한다.");
                        System.out.println("3. 인스타도 보면서, 유투브도 보면서 어영부영 공부한다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){
                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 냉장고 앞에서 아침 메뉴를 고민한다.
                            // 소고기 덮밥을 먹는다.
                            // 집에서 어영부영 공부를 한다.
                            // 집중이 너무 안되어서 teamNova 자습실에가서 공부한다.
                            // depth : 5

                            finalScore += 1;

                            System.out.println("teamNova 자습실에 도착했다.");

                            System.out.println("1. 구석진 곳에 자리를 잡아 바로 과제를 시작한다.");
                            System.out.println("2. 일단 누네띄네를 먹어 두뇌 회전력을 높인다.");
                            System.out.println("3. 도착하자마자 하기 싫다는 생각이 밀려와 다시 집에 돌아간다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){

                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 냉장고 앞에서 아침 메뉴를 고민한다.
                            // 소고기 덮밥을 먹는다.
                            // 집에서 어영부영 공부를 한다.
                            // 집중은 잘 안되지만, 최대로 과제에 몰입하려고 한다.
                            // depth : 5

                            finalScore += 2;

                            System.out.println("집중은 안되지만, 최대로 과제에 몰입해보자");

                            System.out.println("1. 최대한 집중을 해서 과제를 한다.");
                            System.out.println("2. 5분정도 마음을 가다듬고 최대한 집중해서 과제를 한다.");
                            System.out.println("3. 집중이 안되는데 몰입을 어떻게 하지? 편하게 포기하자를 시전한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){

                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 냉장고 앞에서 아침 메뉴를 고민한다.
                            // 소고기 덮밥을 먹는다.
                            // 집에서 어영부영 공부를 한다.
                            // 인스타도 보면서, 유튜브도 보면서 어영부영 공부한다.
                            // depth : 5

                            finalScore += 3;

                            System.out.println("인스타, 유튜브 재밌군.. 공부는 노잼이야");

                            System.out.println("1. 이렇게 시간을 할애하면 결국 내손해라는 사실을 깨닫고 휴대폰을 침대위로 던져버린다.");
                            System.out.println("2. 공부랑 동시에 할바엔 미리 공부를 하고 인스타,유튜브를 하자고 마음을 먹는다.");
                            System.out.println("3. 공부는 저멀리하고, 인스타, 유튜브에 치중한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{
                            //depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else {
                        // depth 4
                        finalScore = 0;
System.out.println("게임 종료");
                    }

                }else if(selectNum == 2){
                    // 30분뒤로 알람을 다시 맞추고 잔다.
                    // 냉장고 앞에서 아침 메뉴를 고민한다.
                    // 참치주먹밥을 만들어 먹는다.
                    // depth : 3
                    finalScore+=2;

                    System.out.println("참치 주먹밥을 다먹었다.");

                    System.out.println("1. 화장실에가서 양치를 한후, 책상에 앉아 전날 수업을 복습한다.");
                    System.out.println("2. 책상에 앉아, 자연스럽게 휴대폰을 꺼낸다.");
                    System.out.println("3. 침대에 누운 상태로 자연스럽게 휴대폰을 꺼낸다.");

                    System.out.print("나의 선택 : ");
                    selectNum = sc.nextInt();

                    if(selectNum == 1){
                        // 30분뒤로 알람을 다시 맞추고 잔다.
                        // 냉장고 앞에서 아침 메뉴를 고민한다.
                        // 참치주먹밥을 만들어 먹는다.
                        // 화장실에가서 양치를 한후, 책상에 앉아 전날 수업을 복습한다.
                        // depth : 4

                        finalScore += 1;

                        System.out.println("전날 수업을 복습하던 중 이해가 잘되지 않는다");
                        System.out.println("1. TeamNova new:0에 들어가서 멘토링을 받는다.");
                        System.out.println("2. 구글링을 해본다");
                        System.out.println("3. 언젠가는 알게 되겠지 하면서 넘어간다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){
                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 냉장고 앞에서 아침 메뉴를 고민한다.
                            // 참치주먹밥을 만들어 먹는다.
                            // 화장실에가서 양치를 한후, 책상에 앉아 전날 수업을 복습한다.
                            // TeamNova new:0에 들어가서 멘토링을 받는다.
                            // depth : 5

                            finalScore += 1;

                            System.out.println("멘토링 받는중..");

                            System.out.println("1. 멘토 분께 이해가 안됬던 것들을 다 물어본다.");
                            System.out.println("2. 멘토 분을 생각해서 도저히 내가 모르겠다는 것만 물어본다.");
                            System.out.println("3. 대충대충 넘어가며 멘토링을 어영부영 끝내려고 한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){
                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 냉장고 앞에서 아침 메뉴를 고민한다.
                            // 참치주먹밥을 만들어 먹는다.
                            // 화장실에가서 양치를 한후, 책상에 앉아 전날 수업을 복습한다.
                            // 구글링을 해본다.
                            // depth : 5

                            finalScore += 2;

                            System.out.println("구글링중..");

                            System.out.println("1. 구글링을 통해 몰랐던 부분을 완전히 이해하고, 응용을 하기 위해 과제를 시작한다.");
                            System.out.println("2. 구글링하고 몰랐던 부분을 이해하고 넘어간다.");
                            System.out.println("3. 구글링을 대충하면서 너무 어렵다고 불평만한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){
                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 냉장고 앞에서 아침 메뉴를 고민한다.
                            // 참치주먹밥을 만들어 먹는다.
                            // 화장실에가서 양치를 한후, 책상에 앉아 전날 수업을 복습한다.
                            // 언젠가는 알게 되겠지 하면서 넘어간다.
                            // depth : 5
                            finalScore += 3;

                            System.out.println("언젠가는 알게 되겠지...");

                            System.out.println("1. 항상 이런 태도로 공부를 했던 과거 나의 모습을 떠올리며 제대로 짚고 넘어간다.");
                            System.out.println("2. 딱 3번만 더 읽어보자를 시전한다.");
                            System.out.println("3. 몰라 다른걸로 넘어가야지를 시전한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{

                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 2){
                        // 30분뒤로 알람을 다시 맞추고 잔다.
                        // 냉장고 앞에서 아침 메뉴를 고민한다.
                        // 참치주먹밥을 만들어 먹는다.
                        // 책상에 앉아, 자연스럽게 휴대폰을 꺼낸다.
                        // depth : 4
                        finalScore += 2;

                        System.out.println("휴대폰 화면이 켜졌다");

                        System.out.println("1. 동기부여 영상을 보며 공부하고자 하는 마음 다진다.");
                        System.out.println("2. 카트라이더 모바일을 30분만 하고 공부하고자 마음 먹는다.");
                        System.out.println("3. 공부는 뒷전이고 모바일 롤을 켜서 친구들과 5인큐를 한다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){
                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 냉장고 앞에서 아침 메뉴를 고민한다.
                            // 참치주먹밥을 만들어 먹는다.
                            // 책상에 앉아, 자연스럽게 휴대폰을 꺼낸다.
                            // 동기부여 영상을 보며 공부하고자 하는 마음을 다진다.
                            // depth : 5

                            finalScore += 1;

                            System.out.println("동기부여 영상 보는중..");

                            System.out.println("1. 영상이 끝나자마자 바로 공부를 시작한다.");
                            System.out.println("2. 영상이 끝나고 자신이 왜 안되는지에 대해 돌아본다.");
                            System.out.println("3. 관련 동영상에 롤 하이라이트 영상이 있어서 클릭한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){
                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 냉장고 앞에서 아침 메뉴를 고민한다.
                            // 참치주먹밥을 만들어 먹는다.
                            // 책상에 앉아, 자연스럽게 휴대폰을 꺼낸다.
                            // 카트라이더 모바일을 30분만 하고 공부하고자 마음 먹는다.
                            // depth : 5

                            finalScore += 2;

                            System.out.println("30분이 지났다...");

                            System.out.println("1. 휴대폰을 집어던지고 바로 초집중 공부모드에 들어간다.");
                            System.out.println("2. 스트레스 해소가 됬으니 잠시 눈을 휴식하고 공부하고자 한다.");
                            System.out.println("3. 30분만 하자고 했던 생각도 나지 않아 그 자리에서 3시간을 더한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3) {
                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 냉장고 앞에서 아침 메뉴를 고민한다.
                            // 참치주먹밥을 만들어 먹는다.
                            // 책상에 앉아, 자연스럽게 휴대폰을 꺼낸다.
                            // 공부는 뒷전이고 모바일 롤을 켜서 친구들과 5인큐를 한다.
                            // depth : 5
                            finalScore += 3;

                            System.out.println("모바일롤 5인큐중...");

                            System.out.println("1. 1판을 하던 도중.. teamNova 과제에 대해 떠올라서 게임을 강제종료하고 과제를 하러간다.");
                            System.out.println("2. 이번판을 마지막판으로 생각하고 친구들에게 공부하러가야한다고 말한다.");
                            System.out.println("3. 미친듯이 재밌다! 하루종일 친구들이랑 하자고 권유한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{
                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 3){
                        // 30분뒤로 알람을 다시 맞추고 잔다.
                        // 냉장고 앞에서 아침 메뉴를 고민한다.
                        // 참치주먹밥을 만들어 먹는다.
                        // 침대에 누운 상태로 자연스럽게 휴대폰을 꺼낸다.
                        // depth : 4

                        finalScore += 3;

                        System.out.println("침대에 누워 휴대폰을 하니 벗어날 수가 없다...");

                        System.out.println("1. 생각을 바로잡아 휴대폰을 집어넣고 책상 앞에 앉는다.");
                        System.out.println("2. 팀노바 톡방에 \"과제 계획 미리미리 세우세요\"라는 톡 내용을보고 정신을 차린다. ");
                        System.out.println("3. 침대가 하나가 된듯 아무것도 안하고 휴대폰만 본다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){
                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 냉장고 앞에서 아침 메뉴를 고민한다.
                            // 참치주먹밥을 만들어 먹는다.
                            // 침대에 누운 상태로 자연스럽게 휴대폰을 꺼낸다.
                            // 생각을 바로잡아 휴대폰을 집어넣고 책상 앞에 앉는다.
                            // depth : 5

                            finalScore += 1;

                            System.out.println("책상 앞에 앉았다.");

                            System.out.println("1. teamNova 공부 계획을 세우고 체계적으로 공부를 시작한다.");
                            System.out.println("2. 휴대폰을 다시꺼내서 보다가 이대로는 안된다고 생각하여 침대로 집어던져버린다.");
                            System.out.println("3. 휴대폰을 다시 꺼내서 유튜브를 시청한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){
                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 냉장고 앞에서 아침 메뉴를 고민한다.
                            // 참치주먹밥을 만들어 먹는다.
                            // 침대에 누운 상태로 자연스럽게 휴대폰을 꺼낸다.
                            // 팀노바 톡방에 과제 계획 미리미리 세우세요 라는 톡 내용을보고 정신을 차린다.
                            // depth : 5

                            finalScore += 2;

                            System.out.println("정신차리자!!");

                            System.out.println("1. 팀장님 말을 듣고 바로 공부 계획을 세우고 톡방에 올린다.");
                            System.out.println("2. 일단 남들이 세우고 보낸 계획을 읽어본다.");
                            System.out.println("3. 벌써 계획을 세운다고?를 시전하며 계획세우는 일도 미룬다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){
                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 냉장고 앞에서 아침 메뉴를 고민한다.
                            // 참치주먹밥을 만들어 먹는다.
                            // 침대에 누운 상태로 자연스럽게 휴대폰을 꺼낸다.
                            // 침대가 하나가 된듯 아무것도 안하고 휴대폰만 본다.
                            // depth : 5

                            finalScore += 3;

                            System.out.println("아무것도 하기 싫다...");

                            System.out.println("1. 과거에 열정적으로 살았던 모습을 떠올리며 휴대폰을 집어던지고 책상 앞에 앉아 공부한다.");
                            System.out.println("2. 음.. 딱 5분만 이따가 일어나서 공부하자고 마음먹는다.");
                            System.out.println("3. 아니? 이미 망했어 그냥 아무것도 하지말자를 시전한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{

                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else {
                        // depth : 4
                        finalScore = 0;
System.out.println("게임 종료");
                    }

                }else if(selectNum == 3){
                    // 30분뒤로 알람을 다시 맞추고 잔다.
                    // 냉장고 앞에서 아침 메뉴를 고민한다.
                    // 라면을 뿌셔서 칠성사이다랑 같이 먹는다.
                    // depth : 3

                    finalScore+=3;

                    System.out.println("라면을 다먹었다!");

                    System.out.println("1. 집 근처 도서관에 가서 teamNova 과제를 한다.");
                    System.out.println("2. 배도 부르고 하니 잠시 소화시킬 시간을 갖는다.");
                    System.out.println("3. 어영부영 침대에 앉아 시간을 보낸다.");

                    System.out.print("나의 선택 : ");
                    selectNum = sc.nextInt();

                    if(selectNum == 1){

                        // 30분뒤로 알람을 다시 맞추고 잔다.
                        // 냉장고 앞에서 아침 메뉴를 고민한다.
                        // 라면을 뿌셔서 칠성사이다랑 같이 먹는다.
                        // 집 근처 도선관에 가서 teamNova 과제를 한다.
                        // depth : 4

                        finalScore += 1;

                        System.out.println("과제를 하다보니 과제 자체에 질문이 생겼다.");
                        System.out.println("1. 팀장님께 직접 본인이 이해한 과제가 맞는지 물어본다.");
                        System.out.println("2. 다른 팀원들과 하브루타하며 과제가 맞는지 확인한다.");
                        System.out.println("3. 혼자 그려려니 하고 넘어간다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){

                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 냉장고 앞에서 아침 메뉴를 고민한다.
                            // 라면을 뿌셔서 칠성사이다랑 같이 먹는다.
                            // 집 근처 도선관에 가서 teamNova 과제를 한다.
                            // 팀장님께 직접 본인이 이해한 과제가 맞는지 물어본다.
                            // depth : 5

                            finalScore += 1;

                            System.out.println("물어본후 답장이 왔다.");

                            System.out.println("1. 답장을 바로 확인하고 과제에 대해 이해를 한후, 과제를 시작한다.");
                            System.out.println("2. 과제에 대해 이해하고, 이해한 내용을 하브루타를 진행한다.");
                            System.out.println("3. 이해도 하지않고 확인만 한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){

                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 냉장고 앞에서 아침 메뉴를 고민한다.
                            // 라면을 뿌셔서 칠성사이다랑 같이 먹는다.
                            // 집 근처 도선관에 가서 teamNova 과제를 한다.
                            // 다른 팀원들과 하브루타하며 과제가 맞는지 확인한다.
                            // depth : 5

                            finalScore += 2;

                            System.out.println("하브루타 중... 다른 팀원이 말하는 의견이 내가 아는 의견과 다르다");

                            System.out.println("1. 의견이 다른 팀원에게 내가 알고있는 의견을 이야기하며 진정한 하브루타를 시작한다.");
                            System.out.println("2. 내가 잘못 알고 있나? 라고 생각하며 다른 팀원의 의견을 주의깊게 들어본다.");
                            System.out.println("3. 의견이 다르더라도 조용히 넘어간다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){

                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 냉장고 앞에서 아침 메뉴를 고민한다.
                            // 라면을 뿌셔서 칠성사이다랑 같이 먹는다.
                            // 집 근처 도선관에 가서 teamNova 과제를 한다.
                            // 혼자 그려려니 하고 넘어간다.
                            // depth : 5

                            finalScore += 3;

                            System.out.println("음 그렇구나.. 넘어가야지");

                            System.out.println("1. 넘어가려던 찰나.. 이런 태도가 반복되면 나중에 무너진다는 생각이 들어 그냥 넘어가지 않는다.");
                            System.out.println("2. 팀원들에게 재차 확인해본다.");
                            System.out.println("3. 내 고집대로 한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{

                            //depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 2){

                        // 30분뒤로 알람을 다시 맞추고 잔다.
                        // 냉장고 앞에서 아침 메뉴를 고민한다.
                        // 라면을 뿌셔서 칠성사이다랑 같이 먹는다.
                        // 배도 부르고 하니 잠시 소화시킬 시간을 갖는다.
                        // depth : 4

                        finalScore += 2;

                        System.out.println("소화좀 시켜 볼까...");

                        System.out.println("웨이트 트레이닝을 하러 간다.");
                        System.out.println("집 앞에 있는 산책로에서 산책을 한다.");
                        System.out.println("잠시 쇼파에 앉아 소화를 시킨다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){

                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 냉장고 앞에서 아침 메뉴를 고민한다.
                            // 라면을 뿌셔서 칠성사이다랑 같이 먹는다.
                            // 배도 부르고 하니 잠시 소화시킬 시간을 갖는다.
                            // 웨이트 트레이닝을 하러 간다.
                            // depth : 5

                            finalScore += 1;

                            System.out.println("헬스장에 도착했다.");

                            System.out.println("1. 제대로 운동하고 싶어서 헬스 트레이너에게 OT를 신청한다.");
                            System.out.println("2. 헬스장 내에 판매하고 있는 프로틴부터 마신다.");
                            System.out.println("3. 헬스장 오는 것이 운동이라며 헬스장에서 도망친다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){

                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 냉장고 앞에서 아침 메뉴를 고민한다.
                            // 라면을 뿌셔서 칠성사이다랑 같이 먹는다.
                            // 배도 부르고 하니 잠시 소화시킬 시간을 갖는다.
                            // 집 앞에 있는 산책로에서 산책을 한다.
                            // depth : 5

                            finalScore += 2;

                            System.out.println("산책하는중 ...");

                            System.out.println("1. 미래에대해 깊은 고민을 하면서 산책을 한다.");
                            System.out.println("2. 제일 좋아하는 음악 모음을 들으면서 산책을 한다.");
                            System.out.println("3. 산책하다말고 근처 편의점에서 맥주 한캔을 마신다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){

                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 냉장고 앞에서 아침 메뉴를 고민한다.
                            // 라면을 뿌셔서 칠성사이다랑 같이 먹는다.
                            // 배도 부르고 하니 잠시 소화시킬 시간을 갖는다.
                            // 잠시 쇼파에 앚아 소화를 시킨다.
                            // depth : 5

                            finalScore += 3;

                            System.out.println("소화 시키는 중...");

                            System.out.println("1. 소화가 다되었다고 생각해서 바로 teamNova 과제공부를 시작한다.");
                            System.out.println("2. 소화가 좀 더 필요하다고 생각해 잠시 간단한 운동을 한다.");
                            System.out.println("3. 소화가 다되니 과자가 땡겨서 침대에 앉아 과자를 먹는다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }
                        }else{

                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 3){
                        // 30분뒤로 알람을 다시 맞추고 잔다.
                        // 냉장고 앞에서 아침 메뉴를 고민한다.
                        // 라면을 뿌셔서 칠성사이다랑 같이 먹는다.
                        // 어영부영 침대에 앉아 시간을 보낸다.
                        // depth : 4

                        finalScore += 3;

                        System.out.println("침대는 정말 편하다.");
                        System.out.println("1. 1시간 정도 시간을 보내보니 오늘 하루 회의감이 느껴저 책상앞에 앉아 과제를 한다. ");
                        System.out.println("2. 앉아 있다가 문득 과제에 대한 걱정으로 8기 팀원과 디스코드로 하브루타를 진행한다.");
                        System.out.println("3. 편한게 최고다! 침대에 드러 눕는다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){
                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 냉장고 앞에서 아침 메뉴를 고민한다.
                            // 라면을 뿌셔서 칠성사이다랑 같이 먹는다.
                            // 어영부영 침대에 앉아 시간을 보낸다.
                            // 1시간 정도 시간을 보내보니 오늘 하루 회의감이 느껴저 책상앞에 앉아 과제를 한다.
                            // depth : 5

                            finalScore += 1;

                            System.out.println("과제중입니다...");

                            System.out.println("1. 빡 집중해서 과제1을 완료하고 과제 2를 한다.");
                            System.out.println("2. 과제1을 완료하고 잠시 휴식시간을 갖는다.");
                            System.out.println("3. 과제하다 막히니 하기 싫어져서 자연스럽게 휴대폰을 꺼낸다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){
                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 냉장고 앞에서 아침 메뉴를 고민한다.
                            // 라면을 뿌셔서 칠성사이다랑 같이 먹는다.
                            // 어영부영 침대에 앉아 시간을 보낸다.
                            // 앉아 있다가 문득 과제에 대한 걱정으로 8기 팀원과 디스코드로 하브루타를 진행한다.
                            // depth : 5

                            finalScore += 2;

                            System.out.println("하브루타 진행중..");

                            System.out.println("1. 하브루타 하면서 나의 의견을 스스럼 없이 표현한다.");
                            System.out.println("2. 상대방 눈치를 보면서 의견을 하나씩 던진다.");
                            System.out.println("3. 아무런 말도 하지 않고, 듣기만 한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){
                            // 30분뒤로 알람을 다시 맞추고 잔다.
                            // 냉장고 앞에서 아침 메뉴를 고민한다.
                            // 라면을 뿌셔서 칠성사이다랑 같이 먹는다.
                            // 어영부영 침대에 앉아 시간을 보낸다.
                            // 편한게 최고다! 침대에 드러 눕는다.
                            // depth : 5

                            finalScore += 3;

                            System.out.println("침대에 누웠다...");

                            System.out.println("1. 막상 침대에 누우니 마음이 불편해 일어나서 공부하러 책상앞에 앉았다.");
                            System.out.println("2. 공부는 해야하기 때문에 혹시 몰라 30분 알람을 맞춰놓는다.");
                            System.out.println("3. 잠을 잔다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{

                            //depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    } else{

                        // depth : 4
                        finalScore = 0;
System.out.println("게임 종료");
                    }

                }else{
                    // depth : 3
                    finalScore = 0;
System.out.println("게임 종료");
                }

            }else if(selectNum == 3){
                // 30분 뒤로 알람을 맞추고 다시 잔다.
                // 알람을 30분 연기한다.
                // depth : 2
                finalScore += 3;

                System.out.println("30분후.. 알람이 울린다.");

                System.out.println("1. 더 자지 않고 벌떡 일어난다.");
                System.out.println("2. 10분간 멍때리면서 더 잔것에 대해 후회한다.");
                System.out.println("3. TV를 켠다.");

                System.out.print("나의 선택 : ");
                selectNum = sc.nextInt();

                if(selectNum == 1){
                    // 30분 뒤로 알람을 맞추고 다시 잔다.
                    // 알람을 30분 연기한다.
                    // 더 자지 않고 벌떡 일어난다.
                    // depth : 3

                    finalScore += 1;

                    System.out.println("벌떡 일어났다!");

                    System.out.println("1. 오늘 하루 목표를 세운다.");
                    System.out.println("2. 나의 멋짐을 위해 미용실에 간다.");
                    System.out.println("3. 자연스럽게 컴퓨터 앞에 앉는다.");

                    System.out.print("나의 선택 : ");
                    selectNum = sc.nextInt();

                    if(selectNum == 1){
                        // 30분 뒤로 알람을 맞추고 다시 잔다.
                        // 알람을 30분 연기한다.
                        // 더 자지 않고 벌떡 일어난다.
                        // 오늘 하루 목표를 세운다.
                        // depth : 4

                        finalScore += 1;

                        System.out.println("목표를 세워보자!");
                        System.out.println("1. teamNova 과제에 필요한 개념 익히고, 과제 1,2 다하기");
                        System.out.println("2. teamNova 과제에 필요한 개념 익히고, 과제 1만 하기");
                        System.out.println("3. teamNova 과제에 필요한 개념만 익히기");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){
                            // 30분 뒤로 알람을 맞추고 다시 잔다.
                            // 알람을 30분 연기한다.
                            // 더 자지 않고 벌떡 일어난다.
                            // 오늘 하루 목표를 세운다.
                            // teamNova 과제에 필요한 개념을 익히고, 과제 1,2 다하기
                            // depth : 5

                            finalScore += 1;

                            System.out.println("개념익히고, 과제 1, 과제 2를 둘다 해보자.");

                            System.out.println("1. 오늘 다 못하면 죽는다는 마음으로 임한다.");
                            System.out.println("2. 우선 현실적으로 개념익히기랑 과제1만 한다고 생각하고 과제를한다.");
                            System.out.println("3. 언제다하냐... 라는 마음으로 임한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){
                            // 30분 뒤로 알람을 맞추고 다시 잔다.
                            // 알람을 30분 연기한다.
                            // 더 자지 않고 벌떡 일어난다.
                            // 오늘 하루 목표를 세운다.
                            // teamNova 과제에 필요한 개념 익히고, 과제 1만 다하기
                            // depth : 5

                            finalScore += 2;

                            System.out.println("개념 익히고 과제 1만 완벽하게 하자");

                            System.out.println("1. 과제 1을 완벽하게 하기 위해 상세한 계획을 세운다.");
                            System.out.println("2. 우선 개념부터 완벽하게 익힌다.");
                            System.out.println("3. 개념은 언제 익히고 과제 1은 언제하지..?를 시전한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){
                            // 30분 뒤로 알람을 맞추고 다시 잔다.
                            // 알람을 30분 연기한다.
                            // 더 자지 않고 벌떡 일어난다.
                            // 오늘 하루 목표를 세운다.
                            // teamNova 과제에 필요한 개념만 익히기
                            // depth : 5

                            finalScore += 3;

                            System.out.println("필요한 개념만 익히자");

                            System.out.println("1. 필요한 개념만 익히고 나서, 바로 과제를 시작한다.");
                            System.out.println("2. 딱 필요한 개념만 익힌다.");
                            System.out.println("3. 개념 익히는 것도 하기 싫어 그냥 포기할래 그게 편해를 시전한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else {

                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 2){
                        // 30분 뒤로 알람을 맞추고 다시 잔다.
                        // 알람을 30분 연기한다.
                        // 더 자지 않고 벌떡 일어난다.
                        // 나의 멋짐을 위해 미용실에 간다.
                        // depth : 4

                        finalScore += 2;

                        System.out.println("미용실에 도착해서 자리에 앉았다.");
                        System.out.println("1. 하고 싶은 머리를 미리 조사해놓은 뒤 미용사분께 보여준다.");
                        System.out.println("2. 앞머리는 2cm 옆머리는 5cm 정확한 수치를 제공한다.");
                        System.out.println("3. 알아서 잘라주라 한다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){
                            // 30분 뒤로 알람을 맞추고 다시 잔다.
                            // 알람을 30분 연기한다.
                            // 더 자지 않고 벌떡 일어난다.
                            // 나의 멋짐을 위해 미용실에 간다.
                            // 하고 싶은 머리를 미리 조사해놓은 뒤 미용사분께 보여준다.
                            // depth : 5

                            finalScore += 1;

                            System.out.println("애즈펌으로 해주세요.. 머리가 완료되었다.");

                            System.out.println("1. 미용실에서 기분전환도 했으니 바로 근처 스터디카페에가서 공부를 시작한다.");
                            System.out.println("2. 미용실 근처에 다이소가 있어 공부에 필요한 다쓴 볼펜을 버리고 좋은 새 볼펜을 산다.");
                            System.out.println("3. 머리도 했으니 저녁 술약속을 잡는다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){
                            // 30분 뒤로 알람을 맞추고 다시 잔다.
                            // 알람을 30분 연기한다.
                            // 더 자지 않고 벌떡 일어난다.
                            // 나의 멋짐을 위해 미용실에 간다.
                            // 앞머리는 2cm 옆머리는 5cm 정확한 수치를 제공한다.
                            // depth : 5

                            finalScore += 1;

                            System.out.println("앞머리는 2cm 옆머리는 5cm 요렇게 해주세요.. 미용이 끝났다..");

                            System.out.println("1. 머리에 만족하면서.. 해야할 과제를 하러 집에간다.");
                            System.out.println("2. 이제 무엇을 해야할지 고민한다.");
                            System.out.println("3. 머리도 했으니.. 친구랑 같이 한강에 놀러가자고 전화한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){
                            // 30분 뒤로 알람을 맞추고 다시 잔다.
                            // 알람을 30분 연기한다.
                            // 더 자지 않고 벌떡 일어난다.
                            // 나의 멋짐을 위해 미용실에 간다.
                            // 알라서 잘라주라 한다.
                            // depth : 5

                            finalScore += 1;

                            System.out.println("알아서 잘라주세요... 미용이 끝났다.");

                            System.out.println("1. 머리가 맘에들지 않아 기분이 꿀꿀하지만, 근처 카페에 가서 할일을 한다.");
                            System.out.println("2. 머리가 맘에들지 않아 꿀꿀한 마음으로 집에가서 휴식을 취한다.");
                            System.out.println("3. 미용실 잘라주신분께 맘에 안든다며 불평 불만을 한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{

                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 3){
                        // 30분 뒤로 알람을 맞추고 다시 잔다.
                        // 알람을 30분 연기한다.
                        // 더 자지 않고 벌떡 일어난다.
                        // 자연스럽게 컴퓨터 앞에 앉는다.
                        // depth : 4

                        finalScore += 3;

                        System.out.println("자연스럽게 컴퓨터 앞에 앉았다 무엇을 할까?");
                        System.out.println("1. new:0에 들어가 질문하기 위해 멘토링을 신청한다.");
                        System.out.println("2. 다운 받아놓은 웹드라마 1편을 본다.");
                        System.out.println("3. 디스코드를 켜서 배그하고 있는 친구들과 함께 배틀그라운드를 한다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){
                            // 30분 뒤로 알람을 맞추고 다시 잔다.
                            // 알람을 30분 연기한다.
                            // 더 자지 않고 벌떡 일어난다.
                            // 자연스럽게 컴퓨터 앞에 앉는다.
                            // new:0에 들어가 질문하기 위해 멘토링을 신청한다.
                            // depth : 5

                            finalScore += 1;

                            System.out.println("멘토링 신청이 완료되었다.");

                            System.out.println("1. 멘토링이 필요한 질문들을 미리 준비 및 정리해놓는다.");
                            System.out.println("2. 멘토링을 시작할때 질문을 임기응변식으로 한다.");
                            System.out.println("3. 멘토링을 취소한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){
                            // 30분 뒤로 알람을 맞추고 다시 잔다.
                            // 알람을 30분 연기한다.
                            // 더 자지 않고 벌떡 일어난다.
                            // 자연스럽게 컴퓨터 앞에 앉는다.
                            // 다운 받아놓은 웹드라마 1편을 본다.
                            // depth : 5

                            finalScore += 2;

                            System.out.println("웹드라마 보는중..");

                            System.out.println("1. 웹드라마를 보다가 끄고 공부를 한다.");
                            System.out.println("2. 웹드라마 1편을 다보고 공부하고자 마음을 먹는다.");
                            System.out.println("3. 웹드라마 1편에서 그치지않고 5편을 더본다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){
                            // 30분 뒤로 알람을 맞추고 다시 잔다.
                            // 알람을 30분 연기한다.
                            // 더 자지 않고 벌떡 일어난다.
                            // 자연스럽게 컴퓨터 앞에 앉는다.
                            // 디스코드를 켜서 배그하고 있는 친구들과 함께 배틀 그라운드를 한다.
                            // depth : 5

                            finalScore += 3;

                            System.out.println("배틀그라운드중...");

                            System.out.println("1. 오늘 일어나서 게임만하고 있는 나의 모습에 회의감을 느껴 친구들에게 공부한다고 말하고 게임을 종료한다.");
                            System.out.println("2. 이왕 하는거 딱 1시간만 하고 공부를 하고자 마음 먹는다.");
                            System.out.println("3. 아무생각없이 친구들이랑 치킨 내기를 한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{
                            // depth: 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else{

                        // depth : 4
                        finalScore = 0;
System.out.println("게임 종료");
                    }

                }else if(selectNum == 2){
                    // 30분 뒤로 알람을 맞추고 다시 잔다.
                    // 알람을 30분 연기한다.
                    // 10분간 멍때리면서 더 잔것에 대해 후회한다.
                    // depth : 3

                    finalScore += 2;

                    System.out.println("내가 왜 더 잤을까...? 후회되네");

                    System.out.println("1. 마음을 다잡고 하루의 남은 시간을 누구보다 열심히 살겠다고 다짐한다.");
                    System.out.println("2. 더 자면 어때?라며 스스로 괜찮다고 토닥이며 남은 시간을 잘 활용하려 한다.");
                    System.out.println("3. 후회만하고 \"난 게을러..\" 라고 신세한탄하며 남은 시간에 놀 궁리를 한다.");

                    System.out.print("나의 선택 : ");
                    selectNum = sc.nextInt();

                    if(selectNum == 1) {
                        // 30분 뒤로 알람을 맞추고 다시 잔다.
                        // 알람을 30분 연기한다.
                        // 10분간 멍때리면서 더 잔것에 대해 후회한다.
                        // 마음을 다잡고 하루의 남은 시간을 누구보다 열심히 살겠다고 다짐한다.
                        // depth : 4

                        finalScore += 1;

                        System.out.println("열심히 살아보자!");

                        System.out.println("1. 남은시간에 대한 효율적인 계획을 세운다.");
                        System.out.println("2. 급한 불부터 끄고 보자! teamNova 과제부터 한다.");
                        System.out.println("3. 마음만 먹고 다시 나태해져 휴대폰을 켠다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){

                            // 30분 뒤로 알람을 맞추고 다시 잔다.
                            // 알람을 30분 연기한다.
                            // 10분간 멍때리면서 더 잔것에 대해 후회한다.
                            // 마음을 다잡고 하루의 남은 시간을 누구보다 열심히 살겠다고 다짐한다.
                            // 남은시간에 대한 효율적인 계획을 세운다.
                            // depth : 5

                            finalScore += 1;

                            System.out.println("어떻게 계획을 짜볼까?");

                            System.out.println("1. 해야할일, 우선순위를 매겨 계획을 짜고 당장 행동한다.");
                            System.out.println("2. 해야할일, 우선순위를 매겨 계획만 짠다.");
                            System.out.println("3. 무계획이 유계획이다라고 생각하여.. 다시 침대로 돌아간다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){

                            // 30분 뒤로 알람을 맞추고 다시 잔다.
                            // 알람을 30분 연기한다.
                            // 10분간 멍때리면서 더 잔것에 대해 후회한다.
                            // 마음을 다잡고 하루의 남은 시간을 누구보다 열심히 살겠다고 다짐한다.
                            // 급한 불붙터 끄고 보자! teamNova 과제부터 한다.
                            // depth : 5

                            finalScore += 2;

                            System.out.println("teamNova 과제중이다..");

                            System.out.println("1. 빡집중을해서 과제를 완료했고, 완료한것에 대한 보상으로 유튜브를 보았다.");
                            System.out.println("2. 집중이 덜되어서 과제 1번만 완료했다.");
                            System.out.println("3. 의자에 앉아만 있지 수시로 유튜브와 인스타그램을 들락날락거렸다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){

                            // 30분 뒤로 알람을 맞추고 다시 잔다.
                            // 알람을 30분 연기한다.
                            // 10분간 멍때리면서 더 잔것에 대해 후회한다.
                            // 마음을 다잡고 하루의 남은 시간을 누구보다 열심히 살겠다고 다짐한다.
                            // 마음만 먹고 다시 나태해져 휴대폰을 켠다.
                            // depth : 5

                            finalScore += 3;

                            System.out.println("휴대폰 하는중...");

                            System.out.println("1. 휴대폰을 하다가 진짜 이대로는 안되겠다 싶어서 책상앞에 앉아 공부를 한다.");
                            System.out.println("2. 성공하는 법에대한 유튜브 영상을 보고.. 공부에대한 각오를 다시 다진다.");
                            System.out.println("3. 내가 좋아하는 유튜버 정주행을 5시간 한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }


                        }else{

                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 2){
                        // 30분 뒤로 알람을 맞추고 다시 잔다.
                        // 알람을 30분 연기한다.
                        // 10분간 멍때리면서 더 잔것에 대해 후회한다.
                        // 더 자면 어때?라며 스스로 괜찮다고 토닥이며 남은 시간을 잘 활용하려 한다.
                        // depth : 4

                        finalScore += 2;

                        System.out.println("더 자도 상관 없어 남은 시간에 최선을 다하자!");

                        System.out.println("1. 오늘 하루 남은시간에 대한 목표를 정하고 바로 행동한다.");
                        System.out.println("2. 동기부여를 위한 동기부여 영상을 시청한다.");
                        System.out.println("3. 갑자기 내 최선은 쉬엄쉬엄 하는 거야라고 합리화 한다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){

                            // 30분 뒤로 알람을 맞추고 다시 잔다.
                            // 알람을 30분 연기한다.
                            // 10분간 멍때리면서 더 잔것에 대해 후회한다.
                            // 더 자면 어때?라며 스스로 괜찮다고 토닥이며 남은 시간을 잘 활용하려 한다.
                            // 오늘 하루 남은시간에 대한 목표를 정하고 바로 행동한다.
                            // depth : 5

                            finalScore += 1;

                            System.out.println("오늘의 목표는 과제 다하기");

                            System.out.println("1. 목표에 걸맞게 바로 과제에 몰입하는 행동을 한다.");
                            System.out.println("2. 다하기는 살짝 버거운거 같아 목표를 과제1 다하기로 낮춘다.");
                            System.out.println("3. 너무 버거운 목표라고 생각하고 목표를 현저히 낮춘다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){

                            // 30분 뒤로 알람을 맞추고 다시 잔다.
                            // 알람을 30분 연기한다.
                            // 10분간 멍때리면서 더 잔것에 대해 후회한다.
                            // 더 자면 어때?라며 스스로 괜찮다고 토닥이며 남은 시간을 잘 활용하려 한다.
                            // 동기부여를 위한 동기부여 영상을 시청한다.
                            // depth : 5

                            finalScore += 2;

                            System.out.println("동기부여 영상을 시청중...");

                            System.out.println("1. 동기부여 영상을 보고나서, 해야할 teamNova 과제를 한다.");
                            System.out.println("2. 동기부여 영상을 보고, 공부에대한 의지를 다잡는다.");
                            System.out.println("3. 연관 동영상에 프리미어리그 하이라이트 영상이 올라와 시청한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){

                            // 30분 뒤로 알람을 맞추고 다시 잔다.
                            // 알람을 30분 연기한다.
                            // 10분간 멍때리면서 더 잔것에 대해 후회한다.
                            // 더 자면 어때?라며 스스로 괜찮다고 토닥이며 남은 시간을 잘 활용하려 한다.
                            // 갑자기 내 최선은 쉬엄쉬엄 하는 거야라고 합리화 한다.
                            // depth : 5

                            finalScore += 3;

                            System.out.println("쉬엄쉬엄하는게 내 최선이야...");

                            System.out.println("1. 문득 이렇게 쉬엄쉬엄 하는것에 대해 회의감이 들어 책상에가서 책을펴서 공부를 한다.");
                            System.out.println("2. 안하는 쉬엄쉬엄이 아닌, 꾸준히 쉬엄쉬엄하자고 마음을 다잡는다.");
                            System.out.println("3. 쉬엄쉬엄 하루에 10분만 해야겠다를 시전한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{
                            //depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 3){
                        // 30분 뒤로 알람을 맞추고 다시 잔다.
                        // 알람을 30분 연기한다.
                        // 10분간 멍때리면서 더 잔것에 대해 후회한다.
                        // 후회만하고 "난 게을러.." 라고 신세한탄하며 남은 시간에 놀 궁리를 한다.
                        // depth : 4

                        finalScore += 3;

                        System.out.println("난 너무 게을러.. 이왕 이리된거 남은시간 놀자");
                        System.out.println("1. 말로만 놀자하고 이미 책상에 앉아서 1번 과제는 어떻게 해야할지 생각하고 있다.");
                        System.out.println("2. 조금만 놀고, 공부할 시간은 확보해둔다.");
                        System.out.println("3. 뭐하고 놀지 계획을 세운다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){
                            // 30분 뒤로 알람을 맞추고 다시 잔다.
                            // 알람을 30분 연기한다.
                            // 10분간 멍때리면서 더 잔것에 대해 후회한다.
                            // 후회만하고 "난 게을러.." 라고 신세한탄하며 남은 시간에 놀 궁리를 한다.
                            // 말로만 놀자하고 이미 책상에 앉아서 1번 과제는 어떻게 해야할지 생각하고 있다.
                            // depth : 5

                            finalScore += 1;

                            System.out.println("하.. 1번과제는 어떻게 하지..");

                            System.out.println("1. 내가 생각하는 과제 방향성을 팀장님께 직접 확인받는다.");
                            System.out.println("2. 팀원들과의 하브루타를 통해서 힌트를 얻는다.");
                            System.out.println("3. 몰라 일단 미루고 보자를 시전한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){

                            // 30분 뒤로 알람을 맞추고 다시 잔다.
                            // 알람을 30분 연기한다.
                            // 10분간 멍때리면서 더 잔것에 대해 후회한다.
                            // 후회만하고 "난 게을러.." 라고 신세한탄하며 남은 시간에 놀 궁리를 한다.
                            // 조금만 놀고, 공부할 시간은 확보해둔다.
                            // depth : 5

                            finalScore += 2;

                            System.out.println("조금만 놀고.. 공부할 시간을 확보하자");

                            System.out.println("1. 공부할 시간과 놀 시간을 8:2 비율로 확보해 놓는다.");
                            System.out.println("2. 공부할 시간과 놀 시간을 5:5 비율로 확보해 놓는다.");
                            System.out.println("3. 공부할 시간과 놀 시간을 1:9 비율로 확보해 놓는다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){

                            // 30분 뒤로 알람을 맞추고 다시 잔다.
                            // 알람을 30분 연기한다.
                            // 10분간 멍때리면서 더 잔것에 대해 후회한다.
                            // 후회만하고 "난 게을러.." 라고 신세한탄하며 남은 시간에 놀 궁리를 한다.
                            // 뭐하고 놀지 계획을 세운다.
                            // depth : 5

                            finalScore += 3;

                            System.out.println("놀 계획을 세워보자!");

                            System.out.println("1. 다음날에 지장이 없이 좀 활동적으로 움직이면서 놀 계획을 세운다.");
                            System.out.println("2. PC방에서 게임만 해보자는 생각으로 놀 계획을 세운다.");
                            System.out.println("3. 다음날도 상관없어 술을 퍼질나게 마셔보자라고 계획을 세운다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{

                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else{

                        //depth : 4
                        finalScore = 0;
System.out.println("게임 종료");
                    }

                }else if(selectNum == 3){
                    // 30분 뒤로 알람을 맞추고 다시 잔다.
                    // 알람을 30분 연기한다.
                    // TV를 켠다.
                    // depth : 3

                    finalScore += 3;

                    System.out.println("TV를 켰다");

                    System.out.println("1. \"개발자가 필요한 역량\"이라는 프로그램을 본다. ");
                    System.out.println("2. \"스티브잡스\" 영화를 본다.");
                    System.out.println("3. 게임 방송을 본다.");

                    System.out.print("나의 선택 : ");
                    selectNum = sc.nextInt();

                    if(selectNum == 1){
                        // 30분 뒤로 알람을 맞추고 다시 잔다.
                        // 알람을 30분 연기한다.
                        // TV를 켠다.
                        // 개발자가 필요한 역량이라는 프로그램을 본다.
                        // depth : 4

                        finalScore += 1;

                        System.out.println("개발자가 필요한 역량이라는 프로그램을 시청중..");

                        System.out.println("1. 핵심 내용을 메모해가며 프로그램을 시청한다.");
                        System.out.println("2. \"그렇구나\" 라고 이해만 하면서 시청한다. ");
                        System.out.println("3. 휴대폰으로 유튜브 쇼츠를 보면서 시청한다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){

                            // 30분 뒤로 알람을 맞추고 다시 잔다.
                            // 알람을 30분 연기한다.
                            // TV를 켠다.
                            // 개발자가 필요한 역량이라는 프로그램을 본다.
                            // 핵심 내용을 메모해가며 프로그램을 시청한다.
                            // depth : 5

                            finalScore += 1;

                            System.out.println("음.. 이런 이런 내용이 있구나");

                            System.out.println("1. 메모한 핵심내용을 보고 삶에 적용시키고자 노력한다.");
                            System.out.println("2. 메모만 해놓은 것을 한번 보고 다음에 또 봐야겠다를 시전한다.");
                            System.out.println("3. 메모를 하다보니 귀찮아서 그냥 편하게 보기만 한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){

                            // 30분 뒤로 알람을 맞추고 다시 잔다.
                            // 알람을 30분 연기한다.
                            // TV를 켠다.
                            // 개발자가 필요한 역량이라는 프로그램을 본다.
                            // 그렇구나 라고 이해만 하면서 시청한다.
                            // depth : 5

                            finalScore += 2;

                            System.out.println("음 .. 그렇구나...");

                            System.out.println("1. 이런식으로 하면 남는게 없을것 같다고 생각해서 메모장을 꺼내 주요 내용을 메모한다.");
                            System.out.println("2. 일단 한번 쭉 보고 다른 사람들이 보고 올린 후기를 읽으며 중요한 점을 되짚어본다.");
                            System.out.println("3. 음.. 별로 재미가 없네.. 그냥 도움된다니까 보자를 시전한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){

                            // 30분 뒤로 알람을 맞추고 다시 잔다.
                            // 알람을 30분 연기한다.
                            // TV를 켠다.
                            // 개발자가 필요한 역량이라는 프로그램을 본다.
                            // 휴대폰으로 유튜브 쇼츠를 보면서 시청한다.
                            // depth : 5

                            finalScore += 3;

                            System.out.println("유튜브 쇼츠는 재밌어..");

                            System.out.println("1. 멀티플레이로 집중이 분산된 현 상황을 파악하고 바로 유튜브 쇼츠를 끄고 휴대폰을 집어던진다.");
                            System.out.println("2. 일단 프로그램을 집중해서 보고 난 다음 유튜브 쇼츠를 보자고 마음 먹는다.");
                            System.out.println("3. 유튜브 쇼츠를 시간가는 줄 모르고 계속 본다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{

                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 2){
                        // 30분 뒤로 알람을 맞추고 다시 잔다.
                        // 알람을 30분 연기한다.
                        // TV를 켠다.
                        // 스티브잡스 영화를 본다.
                        // depth : 4

                        finalScore += 2;

                        System.out.println("스티브 잡스 영화를 시청중...");

                        System.out.println("1. 영화를 보고나서 느낀점을 메모하고, 두고두고 실천하고자 한다.");
                        System.out.println("2. 영화가 지루해도 끝까지 몰입해서 보려고 한다.");
                        System.out.println("3. 영화를 끄고 \"원피스\"를 시청한다. ");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){

                            // 30분 뒤로 알람을 맞추고 다시 잔다.
                            // 알람을 30분 연기한다.
                            // TV를 켠다.
                            // 스티브잡스 영화를 본다.
                            // 영화를 보고나서 느낀점을 메모하고, 두고두고 실천하고자 한다.
                            // depth : 5

                            finalScore += 1;

                            System.out.println("메모 완료...");

                            System.out.println("1. 메모한 내용을 매일 매일 되짚으며 삶에 적용시키고자 노력한다.");
                            System.out.println("2. 메모한 내용을 다시 살펴본다.");
                            System.out.println("3. 메모만 해놓고 행실이 절대 변하려고 하지 않는다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }


                        }else if(selectNum == 2){

                            // 30분 뒤로 알람을 맞추고 다시 잔다.
                            // 알람을 30분 연기한다.
                            // TV를 켠다.
                            // 스티브잡스 영화를 본다.
                            // 영화가 지루해도 끝까지 몰입해서 보려고 한다.
                            // depth : 5

                            finalScore += 2;

                            System.out.println("지루하지만.. 분명히 얻어가는게 있을거야");

                            System.out.println("1. 끝까지 집중해서 보면서 내가 얻어갈 것들을 메모한다.");
                            System.out.println("2. 잠깐 졸때도 있지만, 잠을 깨면서 끝가지 보려고 노력한다.");
                            System.out.println("3. 영화를 틀어놓고 그냥 잔다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){

                            // 30분 뒤로 알람을 맞추고 다시 잔다.
                            // 알람을 30분 연기한다.
                            // TV를 켠다.
                            // 스티브잡스 영화를 본다.
                            // 영화를 끄고 "원피스"를 시청한다.
                            // depth : 5

                            finalScore += 3;

                            System.out.println("원피스 시청중....");

                            System.out.println("1. 왜 만화를 보고있는거지? 이게 뭐가 도움이 된다고? 라며 다시 스티브잡스 영화를 본다.");
                            System.out.println("2. 보다보니 시간도 아깝고 해서 만화를 끈다.");
                            System.out.println("3. 재미만있으면 되지라며 2시간동안 시청한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 3){
                        // 30분 뒤로 알람을 맞추고 다시 잔다.
                        // 알람을 30분 연기한다.
                        // TV를 켠다.
                        // 게임 방송을 본다.
                        // depth : 4

                        finalScore += 3;

                        System.out.println("롤드컵을 보고 있는 중이다..");
                        System.out.println("1. 롤드컵을 보면서 저 마음 한구석엔 과제에 대한 걱정을 한다.");
                        System.out.println("2. 이왕보는거 한국팀을 응원한다.");
                        System.out.println("3. 롤드컵 보고 또 무엇을 볼까 생각한다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){
                            // 30분 뒤로 알람을 맞추고 다시 잔다.
                            // 알람을 30분 연기한다.
                            // TV를 켠다.
                            // 게임 방송을 본다.
                            // 롤드컵을 보면서 저 마음 한구석엔 과제에 대한 걱정을 한다.
                            // depth : 5

                            finalScore += 1;

                            System.out.println("아.. 과제해야 되는데");

                            System.out.println("1. 롤드컵을 끄고 과제를 하러간다.");
                            System.out.println("2. 지금 보는 경기만 보고 과제를 하러간다는 마음가짐을 갖는다.");
                            System.out.println("3. 공부보단 롤드컵이지~를 시전한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }


                        }else if(selectNum == 2){
                            // 30분 뒤로 알람을 맞추고 다시 잔다.
                            // 알람을 30분 연기한다.
                            // TV를 켠다.
                            // 게임 방송을 본다.
                            // 이왕보는거 한국팀을 응원한다.
                            // depth : 5

                            finalScore += 2;

                            System.out.println("한국팀 응원중..");

                            System.out.println("1. 한국팀을 응원하고 있지만.. 오늘 아무것도 하지 않은 사실에 회의감이 들어 공부를한다.");
                            System.out.println("2. 한국팀 이기는 것만보고 공부를 하자라는 마음을 가진다.");
                            System.out.println("3. 음.. 이거보고 또 경기가 있을려나? 하고 찾아본다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }


                        }else if(selectNum == 3){

                            // 30분 뒤로 알람을 맞추고 다시 잔다.
                            // 알람을 30분 연기한다.
                            // TV를 켠다.
                            // 게임 방송을 본다.
                            // 롤드컵 보고 또 무엇을 볼까 생각한다.
                            // depth : 5

                            finalScore += 3;

                            System.out.println("음 이제 뭐보지..?");

                            System.out.println("1. 일어나서 아무것도 안한 사실에 회의감을 느끼며 롤드컵을 끄고 공부하러 간다.");
                            System.out.println("2. 롤드컵만 보고 공부를 하고자 마음먹는다.");
                            System.out.println("3. 맨유:맨시티 경기를 봐야한다고 생각한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{

                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else{

                        // depth : 4
                        finalScore = 0;
System.out.println("게임 종료");
                    }

                }else{

                    // depth : 3
                    finalScore = 0;
System.out.println("게임 종료");
                }

            }else{

                // depth : 2
                finalScore = 0;
System.out.println("게임 종료");
            }

        }else if(selectNum == 3){
            finalScore+=3;
            // 알람 소리도 못듣고 잔다.
            // depth : 1
            System.out.println("2시간후.. 눈이 떠졌다");
            System.out.println("1. 홀가분한 몸으로 샤워를 하러간다.");
            System.out.println("2. 시간이 애매해 아침겸 점심으로 배달을 시켜먹는다.");
            System.out.println("3. 에라잇! 모르겠다 하고 1시간 잠을 더 청한다.");

            System.out.print("나의 선택 : ");
            selectNum = sc.nextInt();


            if(selectNum == 1){
                // 알람 소리도 못듣고 잔다.
                // 홀가분한 몸으로 샤워를 하러간다.
                // depth : 2
                finalScore += 1;

                System.out.println("화장실에 도착했다.");

                System.out.println("1. 바디워시, 샴푸로 깔끔하게 샤워한다.");
                System.out.println("2. 물로만 씻는다.");
                System.out.println("3. 귀찮아서 안씻고 방으로 들어간다.");

                System.out.print("나의 선택 : ");
                selectNum = sc.nextInt();

                if(selectNum == 1){
                    // 알람 소리도 못듣고 잔다.
                    // 홀가분한 몸으로 샤워를 하러간다.
                    // 바디워시, 샴푸로 깔끔하게 샤워한다.
                    // depth : 3

                    finalScore += 1;

                    System.out.println("깔끔하게 씻으니 개운하다!");

                    System.out.println("1. 개운하고 기분도 좋으니, 노트북을 꺼내 TeamNova 과제를 한다.");
                    System.out.println("2. 노트북을 꺼내 음악 감상을 한다.");
                    System.out.println("3. 노트북을 꺼내 노트북 파일 정리를 한다.");

                    System.out.print("나의 선택 : ");
                    selectNum = sc.nextInt();

                    if(selectNum == 1){
                        // 알람 소리도 못듣고 잔다.
                        // 홀가분한 몸으로 샤워를 하러간다.
                        // 바디워시, 샴푸로 깔끔하게 샤워한다.
                        // 개운하고 기분도 좋으니, 노트북을 꺼내 TeamNova 과제를 한다.
                        // depth : 4

                        finalScore += 1;

                        System.out.println("TeamNova 과제를 하다가 막히는 문제가 생겼다.");

                        System.out.println("1. 막히는 부분에 대해 정리하고, 멘토링 신청을 한 후 기다린다.");
                        System.out.println("2. 하브루타를 통해 막히는 부분을 해결하고자 한다.");
                        System.out.println("3. 좀 쉬면 되겠지.. 일단 미루고 본다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){
                            // 알람 소리도 못듣고 잔다.
                            // 홀가분한 몸으로 샤워를 하러간다.
                            // 바디워시, 샴푸로 깔끔하게 샤워한다.
                            // 개운하고 기분도 좋으니, 노트북을 꺼내 TeamNova 과제를 한다.
                            // 막히는 부분에 대해 정리하고, 멘토링 신청을 한 후 기다린다.
                            // depth : 5

                            finalScore += 1;

                            System.out.println("멘토링시간이 다가왔다...");

                            System.out.println("1. 멘토분께 막히는 부분을 정확히 짚어서 질문한다.");
                            System.out.println("2. 멘토분께 애매하게 질문을 한다.");
                            System.out.println("3. 멘토분께 엉뚱한 말을 건다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }


                        }else if(selectNum == 2){
                            // 알람 소리도 못듣고 잔다.
                            // 홀가분한 몸으로 샤워를 하러간다.
                            // 바디워시, 샴푸로 깔끔하게 샤워한다.
                            // 개운하고 기분도 좋으니, 노트북을 꺼내 TeamNova 과제를 한다.
                            // 하브루타를 통해 막히는 부분을 해결하고자 한다.
                            // depth : 5

                            finalScore += 2;

                            System.out.println("하브루타 하는중... 의견충돌이 발생했다.");

                            System.out.println("1. 나의 주장과 적절한 근거를 기반으로 진정한 하브루타를 진행한다.");
                            System.out.println("2. 우선 나와 다른이의 의견을 들어본다.");
                            System.out.println("3. 너는 너 알아서 말해라 나는 내의견만 말한다를 시전한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }


                        }else if(selectNum == 3){

                            // 알람 소리도 못듣고 잔다.
                            // 홀가분한 몸으로 샤워를 하러간다.
                            // 바디워시, 샴푸로 깔끔하게 샤워한다.
                            // 개운하고 기분도 좋으니, 노트북을 꺼내 TeamNova 과제를 한다.
                            // 좀 쉬면 되겠지... 일단 미루고 본다.
                            // depth : 5

                            finalScore += 3;

                            System.out.println("미루자 미뤄~");

                            System.out.println("1. 10분만 쉬고 다시 마음을 가다듬고 마저 TeamNova과제를 시작한다.");
                            System.out.println("2. 1시간 정도 뒤에 할수있다를 시전하며 잠시 미뤘던 과제를 다시 한다.");
                            System.out.println("3. 메모만 해놓고 행실이 절대 변하려고 하지 않는다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }


                        }else {

                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 2){
                        // 알람 소리도 못듣고 잔다.
                        // 홀가분한 몸으로 샤워를 하러간다.
                        // 바디워시, 샴푸로 깔끔하게 샤워한다.
                        // 노트북을 꺼내 음악 감상을 한다.
                        // depth : 4

                        finalScore += 2;

                        System.out.println("음악을 듣고 있다");

                        System.out.println("1. 음악을 감상하다가 문득 teamNova 다짐을 떠올린다..");
                        System.out.println("2. 성공한 스토리가 주제인 음악을 듣는다.");
                        System.out.println("3. 음악을 감상하다 책상에 엎드려 잠에 든다.");


                        if(selectNum == 1){
                            // 알람 소리도 못듣고 잔다.
                            // 홀가분한 몸으로 샤워를 하러간다.
                            // 바디워시, 샴푸로 깔끔하게 샤워한다.
                            // 노트북을 꺼내 음악 감상을 한다.
                            // 음악을 감상하다가 문득 teamNova 다짐을 떠올린다..
                            // depth : 5

                            finalScore += 1;

                            System.out.println("내가 teamNova시작할때 다짐을 적었었지...");

                            System.out.println("1. 적었던 다짐대로 행동하고자 음악감상을 멈추고 공부를 시작한다.");
                            System.out.println("2. 지금 듣고 있는 음악만 듣고, 공부하고자 마음을 먹는다.");
                            System.out.println("3. 다짐의 효과는 미비했다.. 하던 음악 감상을 계속한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){
                            // 알람 소리도 못듣고 잔다.
                            // 홀가분한 몸으로 샤워를 하러간다.
                            // 바디워시, 샴푸로 깔끔하게 샤워한다.
                            // 노트북을 꺼내 음악 감상을 한다.
                            // 성공한 스토리가 주제인 음악을 듣는다.
                            // depth : 5

                            finalScore += 2;

                            System.out.println("그렇구나.. 이 가수의 삶은 이랬구");

                            System.out.println("1. 나도 할수 있다며 다짐을 하고 AI 공부를 한다.");
                            System.out.println("2. 너무 감명깊어서 한번 더 듣는다.");
                            System.out.println("3. 성공한 스토리는 나의 이야기는 아니라고 생각을한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){
                            // 알람 소리도 못듣고 잔다.
                            // 홀가분한 몸으로 샤워를 하러간다.
                            // 바디워시, 샴푸로 깔끔하게 샤워한다.
                            // 노트북을 꺼내 음악 감상을 한다.
                            // 음악을 감상하다 책상에 엎드려 잠에 든다.
                            // depth : 5

                            finalScore += 3;

                            System.out.println("잠에 들었다...");

                            System.out.println("1. 꿈에서 과거에 내가 열정을 갖고 공부했던 모습을 보다가 잠을깼고 공부에대한 열정을 찾고자 노력한다.");
                            System.out.println("2. 2시간뒤 친구가 공부하자고 전화가와 잠을 깬다.");
                            System.out.println("3. 일어나보니 저녁 7시다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{

                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 3){
                        // 알람 소리도 못듣고 잔다.
                        // 홀가분한 몸으로 샤워를 하러간다.
                        // 바디워시, 샴푸로 깔끔하게 샤워한다.
                        // 노트북을 꺼내 노트북 파일 정리를 한다.
                        // depth : 4

                        finalScore += 3;

                        System.out.println("파일을 말끔하게 정리중...");
                        System.out.println("1. 노트북이 깨끗해졋으니, 나도 깨끗한 마음으로 과제를 시작해야겠다.");
                        System.out.println("2. 음.. 아직 좀 부족해 더 깔끔하게 치워보자");
                        System.out.println("3. 노트북이 깨끗해 졋으니 새로운 게임을 깔아볼까?");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){
                            // 알람 소리도 못듣고 잔다.
                            // 홀가분한 몸으로 샤워를 하러간다.
                            // 바디워시, 샴푸로 깔끔하게 샤워한다.
                            // 노트북을 꺼내 노트북 파일 정리를 한다.
                            // 노트북이 깨끗해졌으니, 나도 깨끗한 마음으로 과제를 시작해야겠다.
                            // depth : 5

                            finalScore += 1;

                            System.out.println("좋아 이제 과제를 해보자");

                            System.out.println("1. 깔끔한 노트북으로 기분좋게 과제를 시작한다.");
                            System.out.println("2. 잠시 친구에게 연락이와서 연락만 받고 공부하고자 마음먹는다.");
                            System.out.println("3. 노트북이 깨끗해졌으니깐.. 전에 용량이 부족해서 못한게임을 해볼까?");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }


                        }else if(selectNum == 2){
                            // 알람 소리도 못듣고 잔다.
                            // 홀가분한 몸으로 샤워를 하러간다.
                            // 바디워시, 샴푸로 깔끔하게 샤워한다.
                            // 노트북을 꺼내 노트북 파일 정리를 한다.
                            // 음.. 아직 좀 부족해 더 깔끔하게 치워보자
                            // depth : 5

                            finalScore += 2;

                            System.out.println("휴.. 다치웠다.");

                            System.out.println("1. 힘은들지만, 그래도 밀린 teamNova과제가 있어서 밀린 과제를 한다.");
                            System.out.println("2. 너무 힘이들어, 20분정도 휴식을 취하고 공부하고자 마음먹는다.");
                            System.out.println("3. 그대로 침대로 직행한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){
                            // 알람 소리도 못듣고 잔다.
                            // 홀가분한 몸으로 샤워를 하러간다.
                            // 바디워시, 샴푸로 깔끔하게 샤워한다.
                            // 노트북을 꺼내 노트북 파일 정리를 한다.
                            // 노트북이 깨끗해 졌으니 새로운 게임을 깔아볼까?
                            // depth : 5

                            finalScore += 3;

                            System.out.println("음 어떤 게임을 깔아보지..?");

                            System.out.println("1. 미래 진로가 아닌 어떤 게임을 설치해야할지 고민하는 내 인생에 현타가 온다.");
                            System.out.println("2. 평소에 하고 싶은 게임을 다운받아서 하다가 현타가 온다.");
                            System.out.println("3. 게임 10개를 깔아놓고 미친듯이 한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else {

                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else {
                        // depth : 4
                        finalScore = 0;
System.out.println("게임 종료");
                    }

                }else if(selectNum == 2) {
                    // 알람 소리도 못듣고 잔다.
                    // 홀가분한 몸으로 샤워를 하러간다.
                    // 물로만 씻는다.
                    // depth : 3

                    finalScore += 2;

                    System.out.println("물로 덜 개운하게 씻었다!");

                    System.out.println("1. 하루의 마음가짐을 위해 다시 깨끗하게 씻어준다.");
                    System.out.println("2. 거울을 보며 물로만 씻어도 충분하다고 생각하고, 뭘 할까 고민한다.");
                    System.out.println("3. 책상 앞에서 공부를 하려고 책을 꺼내다 휴대폰을 잡는다.");

                    System.out.print("나의 선택 : ");
                    selectNum = sc.nextInt();

                    if(selectNum == 1){
                        // 알람 소리도 못듣고 잔다.
                        // 홀가분한 몸으로 샤워를 하러간다.
                        // 물로만 씻는다.
                        // 하루의 마음가짐을 위해 다시 깨끗하게 씻어준다.
                        // depth : 4

                        finalScore += 1;

                        System.out.println("일단 몸이 깨끗해야지~");
                        System.out.println("1. 책상앞에 달려가, 팀노바 과제의 방향성에 대해 멘토링을 받는다.");
                        System.out.println("2. 과제의 방향성만 잡고, 멘토링 신청은 하지 않는다.");
                        System.out.println("3. 과제는 일단 미루고, 놀고자 하는 방향성을 잡는다.");

                        if(selectNum == 1){
                            // 알람 소리도 못듣고 잔다.
                            // 홀가분한 몸으로 샤워를 하러간다.
                            // 물로만 씻는다.
                            // 하루의 마음가짐을 위해 다시 깨끗하게 씻어준다.
                            // 책상앞에 달려가, 팀노바 과제의 방향성에 대해 멘토링을 받는다.
                            // depth : 5

                            finalScore += 1;

                            System.out.println("멘토링 중...");

                            System.out.println("1. 멘토분께 나의 생각을 명확하게 잘 전달한다.");
                            System.out.println("2. 방향성 조차 잘 모르겠다고 무턱대고 물어본다.");
                            System.out.println("3. 답정너 스타일로 질문을 한다. ");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){
                            // 알람 소리도 못듣고 잔다.
                            // 홀가분한 몸으로 샤워를 하러간다.
                            // 물로만 씻는다.
                            // 하루의 마음가짐을 위해 다시 깨끗하게 씻어준다.
                            // 과제의 방향성만 잡고, 멘토링 신청은 하지 않는다.
                            // depth : 5

                            finalScore += 2;

                            System.out.println("음.. 멘토링 신청은 다음에 하자");

                            System.out.println("1. 팀장님께서 멘토링을 받으라는 말이 떠올라 과제의 방향성에 대해서 멘토링을 받는다.");
                            System.out.println("2. 두려운 마음은 잠깐 접어두고 new:0에서 멘토링 신청을 한다.");
                            System.out.println("3. 내 고집대로 과제의 방향성을 밀고간다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){
                            // 알람 소리도 못듣고 잔다.
                            // 홀가분한 몸으로 샤워를 하러간다.
                            // 물로만 씻는다.
                            // 하루의 마음가짐을 위해 다시 깨끗하게 씻어준다.
                            // 과제는 일단 미루고, 놀고자 하는 방향성을 잡는다.
                            // depth : 5

                            finalScore += 3;

                            System.out.println("메모 완료...");

                            System.out.println("1. 요즘 한게 노는 것밖에 없다고 생각이들어 회의감을 느낀다.");
                            System.out.println("2. 공부가 하기 싫으니 1시간 정도 놀고 공부하고자 한다.");
                            System.out.println("3. 과제는 전날하는게 국룰이지를 시전한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{

                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 2){
                        // 알람 소리도 못듣고 잔다.
                        // 홀가분한 몸으로 샤워를 하러간다.
                        // 물로만 씻는다.
                        // 거울을 보며 물로만 씻어도 충분하다고 생각하고, 뭘 할까 고민한다.
                        // depth : 4

                        finalScore += 2;

                        System.out.println("음.. 뭘하면 좋을까..?");

                        System.out.println("1. 훌륭한 개발자가 되기 위해, 팀노바 과제를 한다.");
                        System.out.println("2. 운동을 하기 위해 운동복을 입는다.");
                        System.out.println("3. 아무런 생각이 없다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){
                            // 알람 소리도 못듣고 잔다.
                            // 홀가분한 몸으로 샤워를 하러간다.
                            // 물로만 씻는다.
                            // 거울을 보며 물로만 씻어도 충분하다고 생각하고, 뭘 할까 고민한다.
                            // 훌륭한 개발자가 되기 위해, 팀노바 과제를 한다.
                            // depth : 5

                            finalScore += 1;

                            System.out.println("팀노바 과제중...");

                            System.out.println("1. 과제를 하다 모르는 부분이 나와, 하나씩 다 짚어가면서 한다.");
                            System.out.println("2. 모르는 부분은 따로 메모했다가 멘토링을 받는다.");
                            System.out.println("3. 모르면 모르는대로 과제를 한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){

                            // 알람 소리도 못듣고 잔다.
                            // 홀가분한 몸으로 샤워를 하러간다.
                            // 물로만 씻는다.
                            // 거울을 보며 물로만 씻어도 충분하다고 생각하고, 뭘 할까 고민한다.
                            // 운동을 하기 위해 운동복을 입는다.
                            // depth : 5

                            finalScore += 2;

                            System.out.println("운동복 입는중..");

                            System.out.println("1. 오늘 몇시간할지 어느 부위를 운동할지 생각하면서 운동갈 준비를 한다.");
                            System.out.println("2. 빨리 운동복을 입고 운동갈 생각을 한다.");
                            System.out.println("3. 운동복이 생각보다 커서 다른 딱 달라붙는 운동복을 찾다가 1시간을 보낸다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){

                            // 알람 소리도 못듣고 잔다.
                            // 홀가분한 몸으로 샤워를 하러간다.
                            // 물로만 씻는다.
                            // 거울을 보며 물로만 씻어도 충분하다고 생각하고, 뭘 할까 고민한다.
                            // 아무런 생각이 없다.
                            // depth : 5

                            finalScore += 3;

                            System.out.println("아무런 생각이 읎어요....");

                            System.out.println("1. 문득 난 왜이리 생각이 없이 살까라는 생각이 들면서 공부하러 간다.");
                            System.out.println("2. 일단 운동이라도 하자며 밖에 나간다.");
                            System.out.println("3. 생각안하면 편해.. 그냥 이렇게 살자를 시전한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{

                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }


                    }else if(selectNum == 3){
                        // 알람 소리도 못듣고 잔다.
                        // 홀가분한 몸으로 샤워를 하러간다.
                        // 물로만 씻는다.
                        // 책상 앞에서 공부를 하려고 책을 꺼내다 휴대폰을 잡는다.
                        // depth : 4

                        finalScore += 3;

                        System.out.println("얼굴 인식중 ....");
                        System.out.println("1.휴대폰을 침대에 던저버리고, 공부 집중모드에 들어간다.");
                        System.out.println("2.일정을 보니, 팀노바 과제 발표가 얼마남지 않음을 감지하고 공부계획 짜기에 들어간다.");
                        System.out.println("3. 얼굴인식에 실패해서 비밀번호를 누르고 휴대폰 잠금장치를 해제한다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){
                            // 알람 소리도 못듣고 잔다.
                            // 홀가분한 몸으로 샤워를 하러간다.
                            // 물로만 씻는다.
                            // 책상 앞에서 공부를 하려고 책을 꺼내다 휴대폰을 잡는다.
                            // 휴대폰을 침대에 던저버리고, 공부 집중모드에 들어간다.
                            // depth : 5

                            finalScore += 1;

                            System.out.println("빡공모드 온");

                            System.out.println("1. 너무 집중을한 나머지 과제를 다 끝낸다.");
                            System.out.println("2. 과제1을 끝내고 휴식모드로 들어간다.");
                            System.out.println("3. 빡공모드 쿨타임이 돌았다... 휴대폰 게임을 한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){

                            // 알람 소리도 못듣고 잔다.
                            // 홀가분한 몸으로 샤워를 하러간다.
                            // 물로만 씻는다.
                            // 책상 앞에서 공부를 하려고 책을 꺼내다 휴대폰을 잡는다.
                            // 일정을 보니, 팀노바 과제 발표가 얼마남지 않음을 감지하고 공부계획 짜기에 들어간다.
                            // depth : 5

                            finalScore += 2;

                            System.out.println("계획을 짜보자!");

                            System.out.println("1. 최대한 효율적으로 30분 단위로 굉장히 상세하게 계획을 짠다.");
                            System.out.println("2. 급한불 끄기 방식으로 계획을 짠다.");
                            System.out.println("3. 계획짜기가 갑자기 귀찮아지고, 인스타그램을 킨다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){
                            // 알람 소리도 못듣고 잔다.
                            // 홀가분한 몸으로 샤워를 하러간다.
                            // 물로만 씻는다.
                            // 책상 앞에서 공부를 하려고 책을 꺼내다 휴대폰을 잡는다.
                            // 얼굴인식에 실패해서 비밀번호를 누르고 휴대폰 잠금장치를 해제한다.
                            // depth : 5

                            finalScore += 3;

                            System.out.println("잠금이 해제되었습니다.");

                            System.out.println("1. 이게 뭐라고 이렇게까지 할려고하지 라는 생각을 갖고 휴대폰을 집어 던지고 다시 책을 편다.");
                            System.out.println("2. 20분짜리 유튜브 영상만 보고 공부하자를 시전한다.");
                            System.out.println("3. 모바일 배틀그라운드를 켠다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{

                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else{
                        // depth : 4
                        finalScore = 0;
System.out.println("게임 종료");
                    }

                }else if(selectNum == 3){
                    // 알람 소리도 못듣고 잔다.
                    // 홀가분한 몸으로 샤워를 하러간다.
                    // 귀찮아서 안씻고 방으로 들어간다.
                    // depth : 3

                    finalScore += 3;

                    System.out.println("아.. 귀찮아 그냥 저녁에 씻어야지");

                    System.out.println("1. 방에 들어가 무엇을 할지 생각한다.");
                    System.out.println("2. 배가 고프니 일단 뭐라도 먹는다.");
                    System.out.println("3. 방에 들어가 누워서 눈을 감고 편안함을 즐긴다.");

                    System.out.print("나의 선택 : ");
                    selectNum = sc.nextInt();

                    if(selectNum == 1){
                        // 알람 소리도 못듣고 잔다.
                        // 홀가분한 몸으로 샤워를 하러간다.
                        // 귀찮아서 안씻고 방으로 들어간다.
                        // 방에 들어가 무엇을 할지 생각한다.
                        // depth : 4

                        finalScore += 1;

                        System.out.println("흠... 정말 뭘해야 할까..?");
                        System.out.println("1. 생활코딩 java 강의를 수강한다.");
                        System.out.println("2. 잠깐 생각에 빠지다가.. 만들고 싶은 앱이 생겼다.");
                        System.out.println("3. 뭘해야할지 몰라서 인스타그램부터 켰다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){

                            // 알람 소리도 못듣고 잔다.
                            // 홀가분한 몸으로 샤워를 하러간다.
                            // 귀찮아서 안씻고 방으로 들어간다.
                            // 방에 들어가 무엇을 할지 생각한다.
                            // 생활코딩 java 강의를 수강한다.
                            // depth : 5

                            finalScore += 1;

                            System.out.println("강의 수강중..");

                            System.out.println("1. 강의중 이해가 안된 부분은 하나하나 메모해 해결하고 넘어간다.");
                            System.out.println("2. 일단 한번 듣고 본다.");
                            System.out.println("3. 생각보다 너무 어려워서 졸면서 강의를 수강한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){

                            // 알람 소리도 못듣고 잔다.
                            // 홀가분한 몸으로 샤워를 하러간다.
                            // 귀찮아서 안씻고 방으로 들어간다.
                            // 방에 들어가 무엇을 할지 생각한다.
                            // 잠깐 생각에 빠지다가.. 만들고 싶은 앱이 생겼다
                            // depth : 5

                            finalScore += 2;

                            System.out.println("이 앱을 만들어 보자!");

                            System.out.println("1. 앱에 필요한 개발 지식, 개발 언어등을 조사하고 공부한다.");
                            System.out.println("2. 대략적인 구상만 해놓고 공부하고자 마음먹는다.");
                            System.out.println("3. 생각만하고 행동은 하지 않는다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){

                            // 알람 소리도 못듣고 잔다.
                            // 홀가분한 몸으로 샤워를 하러간다.
                            // 귀찮아서 안씻고 방으로 들어간다.
                            // 방에 들어가 무엇을 할지 생각한다.
                            // 뭘해야할지 몰라서 인스타그램부터 켰다.
                            // depth : 5

                            System.out.println("인스타그램을 켰다.");

                            System.out.println("1. 왜 항상나는 집중이 안되면 인스타그램을 키지? 라는 생각과 함께 뭘할지 고민한다.");
                            System.out.println("2. 친구와 DM만 주고 받고, 뭘해야 할지 정하고 마음먹는다.");
                            System.out.println("3. 아무 생각없이 인스타를 한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{

                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 2){
                        // 알람 소리도 못듣고 잔다.
                        // 홀가분한 몸으로 샤워를 하러간다.
                        // 귀찮아서 안씻고 방으로 들어간다.
                        // 배가 고프니 일단 뭐라도 먹는다.
                        // depth : 4

                        finalScore += 2;

                        System.out.println("배고프네.. 뭐라도 먹자");
                        System.out.println("1. 식탁에 있는 음식을 얼른 먹고, 초집중 공부 모드에 돌입한다.");
                        System.out.println("2. 삼겹살을 구워먹고, 운동을 간다");
                        System.out.println("3. 배달음식을 시켜먹는다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){

                            // 알람 소리도 못듣고 잔다.
                            // 홀가분한 몸으로 샤워를 하러간다.
                            // 귀찮아서 안씻고 방으로 들어간다.
                            // 배가 고프니 일단 뭐라도 먹는다.
                            // 식탁에 있는 음식을 얼른 먹고, 초집중 공부 모드에 돌입한다.
                            // depth : 5

                            finalScore += 1;

                            System.out.println("초집중모드 on");

                            System.out.println("1. 쉬지도 않고 5시간동안 빡집중모드에 들어간다.");
                            System.out.println("2. 1시간 집중하니 피곤해서 잠시 쉰다.");
                            System.out.println("3. 초집중모드가 on 되자마자 off가 되어 휴대폰을 본다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){

                            // 알람 소리도 못듣고 잔다.
                            // 홀가분한 몸으로 샤워를 하러간다.
                            // 귀찮아서 안씻고 방으로 들어간다.
                            // 배가 고프니 일단 뭐라도 먹는다.
                            // 삼겹살을 구워먹고, 운동을 간다
                            // depth : 5

                            finalScore += 2;

                            System.out.println("헬스장에 도착했다.");

                            System.out.println("1. 배가 부르고 피곤하지만 헬스에 최선을 다한다.");
                            System.out.println("2. 배가 부르니 쉬엄쉬엄 한다.");
                            System.out.println("3. 배부른데 그냥 집에 갈까?를 시전한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){

                            // 알람 소리도 못듣고 잔다.
                            // 홀가분한 몸으로 샤워를 하러간다.
                            // 귀찮아서 안씻고 방으로 들어간다.
                            // 배가 고프니 일단 뭐라도 먹는다.
                            // 배달음식을 시켜먹는다.
                            // depth : 5

                            finalScore += 3;

                            System.out.println("마라탕을 시켰고 다먹었다...");

                            System.out.println("1. 배가 부르니 편안한 마음으로 책상앞에 앉아 공부를 한다.");
                            System.out.println("2. 배가 불러 15분 정도 휴식하고 공부를 하고자 마음 먹는다.");
                            System.out.println("3. 편의점에서 과자를 사와 유튜브보면서 먹는다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{

                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 3){

                        // 알람 소리도 못듣고 잔다.
                        // 홀가분한 몸으로 샤워를 하러간다.
                        // 귀찮아서 안씻고 방으로 들어간다.
                        // 방에 들어가 누워서 눈을 감고 편안함을 즐긴다.
                        // depth : 4

                        finalScore += 3;

                        System.out.println("아 너무 편한걸...");
                        System.out.println("1. 편안한 마음으로 java가 구동되는 원리에 대해서 듣는다.");
                        System.out.println("2. 지금 나의 문제는 과거의 나의 태도가 쌓은 것이라는 문제를 직감한다.");
                        System.out.println("3. 너무 편한 나머지 잠을 잔다");


                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){

                            // depth : 5
                            // 1. 편안한 마음으로 java가 구동되는 원리에 대해서 듣는다.
                            // 2. 지금 나의 문제는 과거의 나의 태도가 쌓은 것이라는 문제를 직감한다.
                            // 3. 너무 편한 나머지 잠을 잔다.

                            finalScore += 1;

                            System.out.println("음.. java가 이렇게 돌아가는 구나");

                            System.out.println("1. java 원리에 대해서 모르는 부분은 확실하게 짚고 넘어간다.");
                            System.out.println("2. 전체적인 java에 대한 흐름을 일단 한번 배운다.");
                            System.out.println("3. java 정말 재미없다.. 때려친다..");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){

                            // depth : 5

                            // 지금 나의 문제는 과거의 나의 태도가 쌓은 것이라는 문제를 직감한다.

                            finalScore += 2;

                            System.out.println("과거의 행실이 지금까지 날 이렇게 만든거야..");

                            System.out.println("1. 지금 이순간부터 마음을 바로잡고 열심히 살고자 한다.");
                            System.out.println("2. 인정을 못하다가 결국 인정하는 자세를 가진다.");
                            System.out.println("3. 아니라고 부정하고, 계속 이러한 태도로 살아간다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){

                            // depth : 5

                            finalScore += 3;

                            System.out.println("잠에 들었다...");

                            System.out.println("1. 친구 전화소리에 일어난다.");
                            System.out.println("2. 친구 전화소리에 전화를 받고 다시 잔다.");
                            System.out.println("3. 전화소리도 못듣고 잔다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{
                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else{
                        // depth : 4
                        finalScore = 0;
System.out.println("게임 종료");
                    }
                }

            }else if(selectNum == 2){
                // 알람 소리도 못듣고 잔다.
                // 시간이 애매해 아침겸 점심으로 배달을 시켜먹는다.
                // depth : 2
                finalScore += 2;

                System.out.println("배달의 민족앱을 켰다");

                System.out.println("1. 간단하게 샌드위치를 주문한후, 직접 가지러 간다");
                System.out.println("2. 짬뽕을 주문하고, 기다리는 동안 팀노바 공부 계획을 짠다.");
                System.out.println("3. 햄버거를 주문하고, 냅다 침대에 눕는다.");

                System.out.print("나의 선택 : ");
                selectNum = sc.nextInt();

                if(selectNum == 1){
                    // 알람 소리도 못듣고 잔다.
                    // 시간이 애매해 아침겸 점심으로 배달을 시켜먹는다.
                    // 간단하게 샌드위치를 주문한 후, 직접 가지러 간다.
                    // depth 3

                    finalScore += 1;

                    System.out.println("1. 샌드위치 가게에 가는 동안 오늘 하루의 목표를 세운다.");
                    System.out.println("2. 음악을 들으면서 샌드위치 가게에 간다.");
                    System.out.println("3. 오늘은 뭐하고 놀지?라며 놀궁리를 하면서 샌드위치 가게에 간다.");

                    System.out.print("나의 선택 : ");
                    selectNum = sc.nextInt();

                    if(selectNum == 1){
                        // 알람 소리도 못듣고 잔다.
                        // 시간이 애매해 아침겸 점심으로 배달을 시켜먹는다.
                        // 간단하게 샌드위치를 주문한 후, 직접 가지러 간다.
                        // 샌드위치 가게에 가는 동안 오늘 하루의 목표를 세운다.
                        // depth :4

                        finalScore += 1;

                        System.out.println("오늘의 목표는...");
                        System.out.println("1. 누구보다 완벽하게 과제1번 수행하기");
                        System.out.println("2. 팔굽혀펴기, 턱걸이 100개씩 하기");
                        System.out.println("3. 샌드위치 먹으면서 볼 유튜브 영상 생각하기");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){

                            // depth : 5
                            // 누구보다 완벽하게 과제 1번 수행하기

                            finalScore += 1;

                            System.out.println("어떻게 하면 완벽하게 할까..?");

                            System.out.println("1. 팀장님, 멘토링을 통해 완벽히 과제1번을 수행한다.");
                            System.out.println("2. 우선 혼자서 고민해보고 그 기준에 완벽한 과제1번을 수행한다.");
                            System.out.println("3. 뭔 완벽이야 대충 적당히만 하자를 시전한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){

                            // depth : 5
                            // 팔굽혀펴기, 턱걸이 100개씩 하기

                            finalScore += 2;

                            System.out.println("팔굽혀펴기 + 턱걸이 100개 하자");

                            System.out.println("1. 횟수를 다 채울때까지 한다.");
                            System.out.println("2. 적당히 30개씩 한다.");
                            System.out.println("3. 하나하고 그만둔다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){

                            // depth : 5
                            // 샌드위치 먹으면서 볼 유튜브 영상 생각하기

                            finalScore += 3;

                            System.out.println("어떤 영상을 보지?");

                            System.out.println("1. 최대한 나한테 도움이 될만한 영상을 본다.");
                            System.out.println("2. 밥먹으면서 스트레스는 안받게 재밌는 영상을 본다.");
                            System.out.println("3. 게임 영상을 본다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{
                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 2){
                        // 알람 소리도 못듣고 잔다.
                        // 시간이 애매해 아침겸 점심으로 배달을 시켜먹는다.
                        // 간단하게 샌드위치를 주문한 후, 직접 가지러 간다.
                        // 음악을 들으면서 샌드위치 가게에 간다.
                        // depth : 4

                        finalScore += 2;

                        System.out.println("이 음악 너무 좋네..");
                        System.out.println("1. 샌드위치를 먹고 난후, 해야할 공부에 대해 계획을 세운다.");
                        System.out.println("2. 잠깐 샌드위치를 맛있게 먹을 생각을 잊고, 과제에 대한 아이디어를 떠올린다.");
                        System.out.println("3. 샌드위치 먹고난 후, 먹을 간식거리를 생각한다.");


                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();


                        if(selectNum == 1){

                            // depth ; 5
                            // 샌드위치를 먹고 난후, 해야할 공부에 대해 계획을 세운다.

                            finalScore += 1;

                            System.out.println("어떻게 계획을 세우지..?");

                            System.out.println("1. 날짜순으로 끊어서 급하고 우선순위가 높은 순으로 계획을 작성한다.");
                            System.out.println("2. 하고 싶은 것을 먼저 한다.");
                            System.out.println("3. 굳이 계획을 세워야 하나..? 를 시전한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){

                            // depth : 5
                            // 잠깐 샌드위치를 맛잇게 먹을 생각을 잊고, 과제에 대한 아이디어를 떠올린다.

                            finalScore += 2;

                            System.out.println("음.. 과제는 이렇게 하면 되겠구나.");

                            System.out.println("1. 아이디어가 떠오르는 즉시 나중에 볼 수 있게 메모한다.");
                            System.out.println("2. 다른 아이디어를 더 생각해본다.");
                            System.out.println("3. 그냥 그순간만 떠올리고 잊어버린다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){

                            // depth : 5
                            // 샌드위치 먹고난 후, 먹을 간식거리를 생각한다.

                            finalScore += 3;

                            System.out.println("아.. 샌드위치 먹고 간식 뭐먹지");

                            System.out.println("1. 간단하게 초콜릿정도를 먹는다.");
                            System.out.println("2. 육개장 라면을 먹는다.");
                            System.out.println("3. 배도 많이 안고픈데 굳이 돈까스를 시켜먹는다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{

                            // dpeth ; 5

                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 3){
                        // 알람 소리도 못듣고 잔다.
                        // 시간이 애매해 아침겸 점심으로 배달을 시켜먹는다.
                        // 간단하게 샌드위치를 주문한 후, 직접 가지러 간다.
                        // 오늘은 뭐하고 놀지?라며 놀궁리를 하면서 샌드위치 가게에 간다.
                        // depth : 4

                        finalScore += 3;

                        System.out.println("뭐하고 놀까?");
                        System.out.println("1. 오늘 하루종일 쉬기만 한 자신을 한심하게 바라보며, 샌드위치를 먹고 난후엔 공부를 하고자 다짐한다.");
                        System.out.println("2. 이왕 노는거 활동적이고 건강에 도움이 되는 풋살을 하자");
                        System.out.println("3. 담배를 한대 물고, PC방에 걸어간다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){

                            // depth : 5
                            // 오늘 하루종일 쉬기만 한 자신을 한심하게 바라보며, 샌드위치를 먹고 난후엔 공부를 하고자 다짐한다.
                            finalScore += 1;

                            System.out.println("샌드위치 먹고나선 진짜 공부 해야지");

                            System.out.println("1. 샌드위치를 먹으면서 공부에 방해될 요소들을 제거한다.");
                            System.out.println("2. 음악감상만 하면서 샌드위치를 먹는다.");
                            System.out.println("3. 샌드위치를 먹으면서 자연스럽게 유튜브를 켠다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){

                            // depth : 5
                            // 이왕노는거 활동적이고 건강에 도움이 되는 풋살을 하자

                            finalScore += 2;

                            System.out.println("풋살 해야지..");

                            System.out.println("1. 주도해서 풋살 경기장을 잡고 친구들을 부른다.");
                            System.out.println("2. 친구에게 풋살하자고 전화한다.");
                            System.out.println("3. 친구들이 안한다해서 풋살 안하고 집에 박혀있는다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){

                            // depth : 5
                            // 담배를 한대 물고, PC방에 걸어간다.

                            finalScore += 3;

                            System.out.println("담배를 한대물면서.. 후~ 하~");

                            System.out.println("1. PC방가는 길에 문득 왜 이런 삶을 살고있는지 에 대한 회의감이 든다.");
                            System.out.println("2. 딱 1시간만 하고 공부하고자 다짐한다.");
                            System.out.println("3. PC방에 가자마자 10만원을 충저한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{

                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else {

                        // depth 4
                        finalScore = 0;
System.out.println("게임 종료");
                    }

                }else if(selectNum == 2){
                    // 알람 소리도 못듣고 잔다.
                    // 시간이 애매해 아침겸 점심으로 배달을 시켜먹는다.
                    // 짬뽕을 주문하고, 기다리는 동안 팀노바 공부 계획을 짠다.
                    // depth 3

                    finalScore += 2;

                    System.out.println("짬뽕은 주문했고... 계획은 어떻게 짤까?");

                    System.out.println("1. 팀노바 과제에 필요한 개념 공부와 과제에 대한 대략적인 계획을 짠다.");
                    System.out.println("2. 팀노바 과제계획을 대략적으로 짠다.");
                    System.out.println("3. 계획? 난 그런거 몰라를 시전한다.");

                    System.out.print("나의 선택 : ");
                    selectNum = sc.nextInt();

                    if(selectNum == 1){
                        // 알람 소리도 못듣고 잔다.
                        // 시간이 애매해 아침겸 점심으로 배달을 시켜먹는다.
                        // 짬뽕을 주문하고, 기다리는 동안 팀노바 공부 계획을 짠다.
                        // 팀노바 과제에 필요한 개념 공부와 과제에 대한 대략적인 계획을 세운다.
                        // depth : 4

                        finalScore += 1;

                        System.out.println("음... 우선 개념공부 하고, 과제 1번은 이렇게, 과제 2번은 이렇게");
                        System.out.println("1. 팀장님께 과제에 대한 방향성을 검사맡는다.");
                        System.out.println("2. 전반적인 계획이 맘에 들지 않아 수정한다.");
                        System.out.println("3. 계획을 세우려니 너무 복잡해서 그냥 흘러가는 대로 하고자 마음먹는다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){

                            // depth : 5
                            // 팀장님께 과제에 대한 방향성을 검사맡는다.

                            finalScore += 1;

                            System.out.println("방향성에 대해 피드백이 들어왔다.");

                            System.out.println("1. 피드백을 즉각 수용하고 방향성을 수정하고 멘토링을 신청한다.");
                            System.out.println("2. 피드백을 읽고 곰곰히 생각한다.");
                            System.out.println("3. 피드백을 읽고도 나의 고집대로 행동한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){

                            // depth : 5
                            // 전반적인 계획이 맘에 들지 않아 수정한다.

                            finalScore += 2;

                            System.out.println("계획을 수정해 볼까..");

                            System.out.println("1. 너무 대략적으로 계획을 짜서 세부적으로 수정을 한다.");
                            System.out.println("2. 지금 보단 좀 더 빡빡하게 계획을 짠다.");
                            System.out.println("3. 막상 계획을 짜려니 귀찮아서 수정을 안한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){

                            // depth : 5
                            // 계획을 세우려니 너무 복잡해서 그냥 흘러가는 대로 하고자 마음먹는다.

                            finalScore += 3;

                            System.out.println("그냥 흘러가는대로 하자~");

                            System.out.println("1. 과거에 계획을 안세워서 망했던 기억을 떠올리고, 계획을 짠다.");
                            System.out.println("2. 현재 내가 할 수 있는 것부터 찾아본다.");
                            System.out.println("3. 흘러가는대로 하는 것도 귀찮아서 침대에 눕는다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 2){
                        // 알람 소리도 못듣고 잔다.
                        // 시간이 애매해 아침겸 점심으로 배달을 시켜먹는다.
                        // 짬뽕을 주문하고, 기다리는 동안 팀노바 공부 계획을 짠다.
                        // 팀노바 과제계획을 대략적으로 짠다.
                        // depth : 4

                        finalScore += 2;

                        System.out.println("음... 우선 개념공부 하고, 과제 1번은 이렇게, 과제 2번은 이렇게");
                        System.out.println("1. 팀장님께 과제에 대한 방향성을 검사맡는다.");
                        System.out.println("2. 전반적인 계획이 맘에 들지 않아 수정한다.");
                        System.out.println("3. 계획을 세우려니 너무 복잡해서 그냥 흘러가는 대로 하고자 마음먹는다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){

                            // depth : 5
                            // 팀장님께 과제에 대한 방향성을 검사맡는다.

                            finalScore += 1;

                            System.out.println("검사 맡고, 욕을 한바가지 먹었다.");

                            System.out.println("1. 수업시간에 과제에 대해 제대로 집중해서 듣지 않은 모습을 반성한다.");
                            System.out.println("2. 기분은 좋지 않았지만, 잘못을 인정한다.");
                            System.out.println("3. 카카오톡 읽씹을 한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){

                            // depth : 5
                            // 전바적인 계획이 맘에 들지 않아 수정한다.

                            finalScore += 2;

                            System.out.println("전반적으로 계획이 너무 불분명해");

                            System.out.println("1. 시간분배, 우선순위 같은 명확한 기준을 세워서 계획을 짠다.");
                            System.out.println("2. 좀 더 분명하게 세부적이게 짠다.");
                            System.out.println("3. 그냥 불분명한대로 귀찮아서 내비둔다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){

                            // depth : 5
                            // 계획을 세우려니 너무 복잡해서 그냥 흘러가는 대로 하고자 마음먹는다.

                            finalScore += 3;

                            System.out.println("아 계획짜기 귀찮다..");

                            System.out.println("1. 그래도 계획을 짜고자 노력을 한다.");
                            System.out.println("2. 계획이 짜기 어려워 일단 행동부터 한다.");
                            System.out.println("3. 계획을 왜짜야지..? 라며 시간을 보낸다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 3){
                        // 알람 소리도 못듣고 잔다.
                        // 시간이 애매해 아침겸 점심으로 배달을 시켜먹는다.
                        // 짬뽕을 주문하고, 기다리는 동안 팀노바 공부 계획을 짠다.
                        // 계획? 난 그런거 몰라를 시전한다.
                        // depth : 4

                        finalScore += 3;

                        System.out.println("계획따위 필요 없어~~");
                        System.out.println("1. 계획따윈 필요없지만, 그래도 일단 책상앞에 앉는다.");
                        System.out.println("2. 짬뽕을 먹고, 공부하고자 마음 먹는다.");
                        System.out.println("3. 무계획이 유계획이여 인생은 편하게 살자라고 하며 침대에 대자로 뻗는다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){

                                // depth : 5
                                // 계획따윈 필요없지만, 그래도 일단 책상앞에 앉는다.
                            finalScore += 1;

                            System.out.println("책상앞에 앉았다..");

                            System.out.println("1. 앉자마자 바로 teamNova과제를 시작한다.");
                            System.out.println("2. 앉고나서 책상위에 있는 귤 2개를 까먹는다.");
                            System.out.println("3. 자연스럽게 휴대폰을 꺼내 유튜브를 시청한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){

                            // depth : 5
                            // 짬뽕을 먹고, 공부하고자 마음을 먹는다.
                            finalScore += 2;

                            System.out.println("짬뽕 다먹고, 공부해야지");

                            System.out.println("1. 짬뽕을 들 먹어서, 공부하는데 방해가 되지 않게 한다.");
                            System.out.println("2. 짬뽕을 다먹고, 배를 채우고 잠시 소화를 시킨다.");
                            System.out.println("3. 짬뽕을 다먹자마자 드러 눕는다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){

                            // depth : 5
                            // 무계획이 유계획이여 인생은 편하게 살자라고 하며 침대에 대자로 뻗는다.
                            finalScore += 3;

                            System.out.println("아으 ~ 무계획이 유계획이지 편하게 누워야지");

                            System.out.println("1. 저번주 과제를 제대로 하지 않아 혼났던 나의 모습을 떠올리며 다시 책상에 앉아 계획을 짠다.");
                            System.out.println("2. 침대에서 30분 정도 휴식후 공부하고자 마음먹는다.");
                            System.out.println("3. 너무 편한나머지 깊은 잠을 잔다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{
                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else{
                        // depth : 4
                        finalScore = 0;
System.out.println("게임 종료");
                    }

                }else if(selectNum == 3){
                    // 알람 소리도 못듣고 잔다.
                    // 시간이 애매해 아침겸 점심으로 배달을 시켜먹는다.
                    // 햄버거를 주문하고, 냅다 침대에 눕는다.
                    // depth 3

                    finalScore += 3;

                    System.out.println("편한게 최고지 일단 눕자~");

                    System.out.println("1. 눕자마자 난 왜 이렇게 게으르게 사는지에 대해 자아성찰을 한다.");
                    System.out.println("2. 햄버거를 먹고, 부지런히 살아보자 마음을 다잡는다.");
                    System.out.println("3. 공부는 내일부터 라며 합리화 하면서 시간을 보낸다.");

                    System.out.print("나의 선택 : ");
                    selectNum = sc.nextInt();

                    if(selectNum == 1){
                        // 알람 소리도 못듣고 잔다.
                        // 시간이 애매해 아침겸 점심으로 배달을 시켜먹는다.
                        // 햄버거를 주문하고, 냅다 침대에 눕는다.
                        // 눕자마자 난 왜이리 게으르게 사는지에 대해 자아 성찰을 한다.
                        // depth : 4

                        finalScore += 1;

                        System.out.println("좀 더 부지런하게 살 수 없을까?");
                        System.out.println("1. 햄버거를 먹으면서 멘토링때 받았던 내가 부족했던 부분을 확인한다.");
                        System.out.println("2. 마음을 다잡기 위해 팔굽혀펴기 10번을 한다.");
                        System.out.println("3. 생각은 잠시 미뤄두고 일단 햄버거를 먹는다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){

                            // depth : 5
                            // 햄버거를 먹으면서 멘토링때 받았던 내가 부족했던 부분을 확인한다.

                            finalScore += 1;

                            System.out.println("음.. 내가 뭐가 부족했더라");

                            System.out.println("1. 부족했던 부분을 다시 곱씹으면서 상기키고 바뀌려고 노력한다.");
                            System.out.println("2. 어떤 부분이 부족했는지를 알아차린다.");
                            System.out.println("3. 난 완벽해~ 를 시전한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){

                            // depth : 5
                            // 마음을 다잡기 위해 팔굽혀펴기 10번을 한다.

                            finalScore += 2;

                            System.out.println("팔굽혀 펴기 10번을 하자");

                            System.out.println("1. 10번을 다 했는데 너무 쉬워서 100개를 더한다.");
                            System.out.println("2. 팔굽혀펴기 10개를 하고 딥스 10개를 더한다.");
                            System.out.println("3. 팔굽혀펴기 하려고 자세를 잡고나서 그대로 바닥에 눕는다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){

                            // depth : 5
                            // 생각은 잠시 미뤄두고 일단 햄버거를 먹는다.

                            finalScore += 3;

                            System.out.println("일단 햄버거 부터 먹자");

                            System.out.println("1. 햄버거를 다먹고, 공부를 하고자 다짐한다.");
                            System.out.println("2. 햄버거를 다먹고, 소화를 시키기 위해 산책을 한다.");
                            System.out.println("3. 햄버거를 다먹고, 자연스럽게 쇼파에 누워 tv를 시청한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 2){

                        // 알람 소리도 못듣고 잔다.
                        // 시간이 애매해 아침겸 점심으로 배달을 시켜먹는다.
                        // 햄버거를 주문하고, 냅다 침대에 눕는다.
                        // 햄버거를 먹고, 부지런히 살아보자 마음을 다잡는다.
                        // depth : 4

                        finalScore += 2;

                        System.out.println("꺼억 ~ 햄버거를 다 먹 었다.");
                        System.out.println("1. 다 먹자마자 책상에 앉아 과제를 시작한다.");
                        System.out.println("2. 앞으로도 이렇게 살게되면 어떻게 될지 진지하게 고민을 해본다.");
                        System.out.println("3. 모르겠다. 일단 쉬고 보자");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){

                            // depth : 5
                            // 다 먹자마자 책상에 앉아 과제를 시작한다.

                            finalScore += 1;
                            System.out.println("과제를 하는중..");

                            System.out.println("1. 완벽하게 과제1, 과제2를한다.");
                            System.out.println("2. 과제1번이 너무 어려워 과제2번을 하고 멘토링 신청을 한다.");
                            System.out.println("3. 과제를 하다가 노트북을 닫고, 침대에 누워 휴대폰을 본다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }


                        }else if(selectNum == 2){

                            // depth : 5
                            // 앞으로도 이렇게 살게되면 어떻게 될지 진지하게 고민을 해본다.

                            finalScore += 2;

                            System.out.println("진지하게 이렇게 살면 망한다...");

                            System.out.println("1. 고민을 하고, 앞으로 열심히 살아야 겠다고 다짐한다.");
                            System.out.println("2. 이렇게 살아온 것에대해 후회를 한다.");
                            System.out.println("3. 이렇게도 살수있지 뭐 어때를 시전한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){

                            // depth : 5
                            // 모르겠다. 일단 쉬고 보자

                            finalScore += 3;

                            System.out.println("일단 쉬자~");

                            System.out.println("1. 30분 정도 쉬고서 다시 공부하러 책상에 앉는다.");
                            System.out.println("2. 2시간 정도 쉬고서 다시 공부하러 책상에 앉는다.");
                            System.out.println("3. 공부는 개나줘버려를 외치면서 쇼파에 누워 잠을잔다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{
                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 3){

                        // 알람 소리도 못듣고 잔다.
                        // 시간이 애매해 아침겸 점심으로 배달을 시켜먹는다.
                        // 햄버거를 주문하고, 냅다 침대에 눕는다.
                        // 햄버거가 빨리 안오는 것에 대해 불평 불만하며 시간을 보낸다.
                        // depth : 4

                        finalScore += 3;

                        System.out.println("햄버거가 도대체 언제 오는걸까? 배고픈데..");
                        System.out.println("1. 같이 스터디카페에 가자고 한 친구에게 온 전화를 받는다.");
                        System.out.println("2. 오늘 같이 헬스하기로 약속한 친구의 전화를 받는다.");
                        System.out.println("3. 오랜만에 술 한잔 하자는 친구의 연락을 받는다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){

                            // depth : 5
                            // 같이 스터디카페에 가자고 한 친구에게 온 전화를 받는다.

                            finalScore += 1;

                            System.out.println("띠리리리리링... 가자 공부하러");

                            System.out.println("1. 바로 뛰쳐나간다.");
                            System.out.println("2. 30분뒤에 가자고 한다.");
                            System.out.println("3. 누구세요?를 시전한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }


                        }else if(selectNum == 2){

                            // depth : 5
                            // 오늘 같이 헬스하기로 약속한 친구의 전화를 받는다.

                            finalScore += 2;

                            System.out.println("띠리리링 ~ 야! 헬스가자");

                            System.out.println("1. 미리 준비 다 해놨지 지금 바로 출발할게를 시전한다.");
                            System.out.println("2. 아 1시간만 이따가면 안되나..? 나좀 쉬고싶다를 시전한다.");
                            System.out.println("3. ?? 내가 헬스장 가자고 했었나..? 를 시전한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){

                            // depth : 5
                            // 오랜만에 술 한잔 하자는 친구의 연락을 받는다.
                            finalScore += 3;

                            System.out.println("야! 술한잔 하자");

                            System.out.println("1. 뭔 술이야 나 팀노바 과제해야된다고 하며 거절한다.");
                            System.out.println("2. 술 말고 밥이나먹자 할게 많다 라고 말한다.");
                            System.out.println("3. 술 좋지? 어떻게 알았데 나 술마시고 싶은지..를 시전한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{

                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else{

                        // depth : 4
                        finalScore = 0;
System.out.println("게임 종료");
                    }


                }else{
                    // depth 3
                    finalScore = 0;
System.out.println("게임 종료");
                }

            }else if(selectNum == 3){
                // 알람 소리도 못듣고 잔다.
                // 에라잇! 모르겠다 하고 1시간 잠을 더 청한다.
                // depth : 2
                finalScore += 3;

                System.out.println("1시간이 지나고, 눈이 떠졌다.");

                System.out.println("1. 자고 일어나니 활기가 넘치네, 운동이나 하러가자");
                System.out.println("2. 푹 자니 좀 기분이 좋네 조금만 더 누워있어야지");
                System.out.println("3. 잠만 자느라 하루 망했네 그냥 놀자 오늘은!");

                System.out.print("나의 선택 : ");
                selectNum = sc.nextInt();

                if(selectNum == 1){

                    // 알람 소리도 못듣고 잔다.
                    // 에라잇! 모르겠다 하고 1시간 잠을 더 청한다.
                    // 자고 일어나니 활기가 넘치네, 운동이나 하러가자
                    // depth : 3

                    finalScore += 1;

                    System.out.println("흐잇자 운동을 가볼까나~");

                    System.out.println("1. 오늘은 어떤 운동을 할껀지 구체적인 계획을 세운다.");
                    System.out.println("2. 운동갈 준비를 하고 헬스장으로 간다.");
                    System.out.println("3. 운동 영상을 잠시 보려고 유튜브를 킨다.");

                    System.out.print("나의 선택 : ");
                    selectNum = sc.nextInt();

                    if(selectNum == 1){
                        // 알람 소리도 못듣고 잔다.
                        // 에라잇! 모르겠다 하고 1시간 잠을 더 청한다.
                        // 자고 일어나니 활기가 넘치네, 운동이나 하러가자
                        // 오늘은 어떤 운동을 할껀지 구체적인 계획을 세운다.
                        // depth : 4

                        System.out.println("오늘은 어떤 운동을 하면 좋을까");

                        System.out.println("1. 3분할 루틴에 맞게, 어제 등, 삼두 운동을 했으니, 오늘은 가슴, 이두 운동을 한다.");
                        System.out.println("2. 제일 좋아하고 자신있는 부위를 한다.");
                        System.out.println("3. 모든 부위를 조금씩 한다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){

                            finalScore += 1;

                            // depth : 5
                            // 3분할 루틴에 맞게, 어제 등, 삼두 운동을 했으니, 오늘은 가슴, 이두 운동을 한다.
                            System.out.println("루틴에 맞게 운동을 하자");

                            System.out.println("1. 가슴, 이두 운동에 온 집중을 다해서 잔다.");
                            System.out.println("2. 가슴 운동을 더 좋아해서 가슴을 더 열심히한다.");
                            System.out.println("3. 그냥 대충대충 시간때우기용으로 설렁설렁한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){

                            finalScore += 2;

                            // depth : 5
                            // 제일 좋아하고 자신있는 부위를 한다.

                            System.out.println("오늘은 제일 자신있는 부위인 등운동을 하자");

                            System.out.println("1. 등운동을 할때 갯수 1개마다 초집중을해서 근육을 자극해준다.");
                            System.out.println("2. 무거운 무게로 한계를 이기고자 한다.");
                            System.out.println("3. 막상하려니 귀찮아서 그냥 대충한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){

                            finalScore += 3;

                            // depth : 5
                            // 모든 부위를 조금씩 한다.

                            System.out.println("어떻게 하면 완벽하게 할까..?");

                            System.out.println("1. 모든 부위를 해야하므로, 하고자하는 기구 및 시간등을 정한다.");
                            System.out.println("2. 모든 부위를 기구 하나씩 하되 제대로 한다.");
                            System.out.println("3. 막상 하려니 너무 많아서 그냥 포기하고 집에 간다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{

                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 2){
                        // 알람 소리도 못듣고 잔다.
                        // 에라잇! 모르겠다 하고 1시간 잠을 더 청한다.
                        // 자고 일어나니 활기가 넘치네, 운동이나 하러가자
                        // 운동갈 준비를 하고 헬스장으로 간다.
                        // depth : 4

                        System.out.println("헬스장에 걸어가는 중...");

                        System.out.println("1. 지나가다 만난 친구도 마침 헬스장을 가고 있어서 같이 간다.");
                        System.out.println("2. 좀 더 활력있게 하기 위해서 아이스아메리카노를 마신다.");
                        System.out.println("3. 지나가다 만난 친구가 PC방에 가자고 해서 같이 간다.");

                        System.out.println("나의 선택");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){

                            finalScore += 1;

                            // depth : 5
                            // 지나가다 만난 친구도 마침 헬스장을 가고 있어 같이 간다.

                            System.out.println("헬스장 같이 가자");

                            System.out.println("1. 헬스장에 운동하면서 서로의 코치가 되어 서로의 한계를 돌파시켜주는 운동을 한다.");
                            System.out.println("2. 서로 갯수랑 자세만 봐주면서 한다.");
                            System.out.println("3. 운동하다 의견충돌로 각자 따로 한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){

                            finalScore += 2;

                            // depth : 5
                            // 좀 더 활력있게 하기 위해서 아이스아메리카노를 마신다.

                            System.out.println("아이스아메리카노 먹는중 ..");

                            System.out.println("1. 아이스아메리카노를 먹으면서 카페인의 힘을빌려 운동 준비를한다.");
                            System.out.println("2. 급 달달한게 땡겨서 아이스티를 먹으며 운동 준비를 한다.");
                            System.out.println("3. 카페에 들어가 진열된 케익을 먹으며, 운동은 생각도 안한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }


                        }else if(selectNum == 3){

                            finalScore += 3;

                            // depth : 5
                            // 지나가다 만난 친구가 PC방에 가자고 해서 같이 간다.

                            System.out.println("야~ PC방 ㄱ?");

                            System.out.println("1. 그 친구 멱살을 붙잡고 같이 헬스장에 간다.");
                            System.out.println("2. 1시간만하고 같이 운동가자고 한다.");
                            System.out.println("3. 미리 기다리고 있었던것처럼 바로 오케이를 시전한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{

                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 3){
                        // 알람 소리도 못듣고 잔다.
                        // 에라잇! 모르겠다 하고 1시간 잠을 더 청한다.
                        // 자고 일어나니 활기가 넘치네, 운동이나 하러가자
                        // 운동 영상을 잠시 보려고 유튜브를 킨다.
                        // depth : 4

                        System.out.println("오늘도 열심히 해볼까...");
                        System.out.println("1. 오늘 운동하면서 들을 음악을 고른다.");
                        System.out.println("2. 유튜브에서 오늘 운동할 부위에 대해 자세히 알려주는 영상을 본다.");
                        System.out.println("3. 운동 영상 밑에 있는 피파온라인 게임 하이라이트 영상을 클릭한다.");

                        System.out.println("나의 선택");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){

                            // depth : 5
                            // 오늘 운동하면서 들을 음악을 고른다.
                            finalScore += 1;

                            System.out.println("어떤 음악을 들을까?");

                            System.out.println("1. 운동하면서 힘이 나는 파워풀한 음악을 듣는다.");
                            System.out.println("2. 마음을 편안하게 해주는 음악을 듣는다.");
                            System.out.println("3. 평소 좋하는 유튜브 영상을 튼다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){

                            // depth : 5
                            // 유튜브에서 오늘 운동할 부위에 대해 자세히 알려주는 영상을 본다.
                            finalScore += 2;

                            System.out.println("아.. 이렇게 하는거구나");

                            System.out.println("1. 유튜브에서 본 운동영상을 그대로 따라하며 실천한다.");
                            System.out.println("2. 영상을 다 보고 기억나는대로 실천한다.");
                            System.out.println("3. 3분보다 지루해서 영상을 끄고, 내 고집대로 운동한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){

                            // depth : 5
                            // 운동 영상 밑에 있는 피파온라인 게임 하이라이트 영상을 클릭한다.
                            finalScore += 3;

                            System.out.println("피파온라인 하이라이트 영상 보는중..");

                            System.out.println("1. 마음을 다잡고 영상을끄고 운동을 한다.");
                            System.out.println("2. 이것만 보고 운동하자는 마음먹는다.");
                            System.out.println("3. 계속 게임 하이라이트 영상만 주구장창 보고있는다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{
                            // depth : 5

                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else{
                        // depth : 4

                        finalScore = 0;
System.out.println("게임 종료");
                    }

                }else if(selectNum == 2){

                    // 알람 소리도 못듣고 잔다.
                    // 에라잇! 모르겠다 하고 1시간 잠을 더 청한다.
                    // 푹 자니 좀 기분이 좋네 조금만 더 누워있어야지
                    // depth : 3

                    finalScore += 2;

                    System.out.println("편하면 장땡이여~ 누워보자~");

                    System.out.println("1. 누워서 미래에 대한 생각을 해본다.");
                    System.out.println("2. 누워서 이제 뭐해야 할지에 대해 생각해본다.");
                    System.out.println("3. 아! 오늘 환승연애2 나오는데 봐야겠다.");

                    System.out.print("나의 선택 : ");
                    selectNum = sc.nextInt();

                    if(selectNum == 1){
                        // 알람 소리도 못듣고 잔다.
                        // 에라잇! 모르겠다 하고 1시간 잠을 더 청한다.
                        // 푹 자니 좀 기분이 좋네 조금만 더 누워있어야지
                        // 누워서 미래에 대한 생각을 해본다.
                        // depth : 4

                        finalScore += 1;

                        System.out.println("이러다가 난 어떻게 될까..?");
                        System.out.println("1. 이러다간 답이 없다고 생각해서 이번달 1달 목표를 정한다.");
                        System.out.println("2. 유튜브와 구글링을 통해 내가 해야할 것들을 찾아본다.");
                        System.out.println("3. 나의 미래보단 현실에 안주하는 것이 더 좋다고 생각한다.");

                        System.out.print("나의 선택");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){

                            // depth : 5
                            // 이러다간 답이 없다고 생각해서 이번달 1달 목표를 정한다.

                            finalScore += 1;

                            System.out.println("목표를 뭘로 정할까..?");

                            System.out.println("1. 팀노바 과제 완벽하게 수행하기로 정한다.");
                            System.out.println("2. 매일 꾸준히 운동하기로 정한다.");
                            System.out.println("3. 매일 게임 5시간씩 하기로 정한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }


                        }else if(selectNum == 2){

                            // depth : 5
                            // 유튜브와 구글링을 통해 내가 해야할 것들을 찾아본다.

                            finalScore += 2;

                            System.out.println("어떤것을 하면 좋을까..?");

                            System.out.println("1. 개발자");
                            System.out.println("2. 음식점 사장");
                            System.out.println("3. 백수");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){

                            // depth : 5
                            // 나의 미래보단 현실에 안주하는 것이 더 좋다고 생각한다.

                            finalScore += 3;

                            System.out.println("현실에 안주하자..");

                            System.out.println("1. 이러다간 큰일날 것 같다는 생각을 한다.");
                            System.out.println("2. 내가 진짜 꿈꾸는 미래에 대해 생각한다.");
                            System.out.println("3. 현실에 순응하며 꿈을 접고 안주하는 태도를 취한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{

                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 2){
                        // 알람 소리도 못듣고 잔다.
                        // 에라잇! 모르겠다 하고 1시간 잠을 더 청한다.
                        // 푹 자니 좀 기분이 좋네 조금만 더 누워있어야지
                        // 누워서 이제 뭐해야 할지에 대해 생각해본다.
                        // depth : 4

                        finalScore += 2;

                        System.out.println("이제 뭐하지..?");
                        System.out.println("1. 벌떡 일어나 책상에 앉아 Open AI에 대해서 공부한다.");
                        System.out.println("2. 누워있는 자신을 한심하게 생각하며, 해야할 teamNova 과제에 대해 생각한다.");
                        System.out.println("3. 휴대폰에서 제주도 브이로그를 보다가 뜬금없이 여행 계획을 잡는다.");

                        System.out.print("나의 선택");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){

                            // depth : 5
                            // 벌떡 일어나 책상에 앉아 Open AI에 대해서 공부한다.

                            finalScore += 1;

                            System.out.println("Open AI 공부중..");

                            System.out.println("1. Open AI 공부를 하다가 막히는 부분에대해 직접 Open AI에 문의한다.");
                            System.out.println("2. 모르는 부분이 있더라도 우선 Open AI에 대해 전반적으로 공부를 다 해본다.");
                            System.out.println("3. Open AI 공부하다 막히는 부분이 있어서 바로 때려친다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){

                            // depth : 5
                            // 누워있는 자신을 한심하게 생각하며, 해야할 teamNova 과제에 대해 생각한다.

                            finalScore += 2;

                            System.out.println("teamNova 과제할 생각이나 하자..");

                            System.out.println("1. teamNova 과제를 바로 시작한다.");
                            System.out.println("2. 과제에 대해 더 생각을 해본다.");
                            System.out.println("3. 막상 생각하려니 귀찮아서 아무 생각도 안한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){

                            // depth : 5
                            // 휴대폰에서 제주도 브이로그를 보다가 뜬금없이 여행 계획을 잡는다.

                            finalScore += 3;

                            System.out.println("제주도 여행계획을 세워야지");

                            System.out.println("1. 제주도 가서도 공부할 시간을 따로 빼놓고 계획을 짠다.");
                            System.out.println("2. 시간, 장소 등을 정확히 인지하고 효율적으로 짠다.");
                            System.out.println("3. 무계획이 유계획이지를 시전한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }


                        }else{

                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 3){
                        // 알람 소리도 못듣고 잔다.
                        // 에라잇! 모르겠다 하고 1시간 잠을 더 청한다.
                        // 푹 자니 좀 기분이 좋네 조금만 더 누워있어야지
                        // 아! 오늘 환승연애2 나오는데 봐야겠다.
                        // depth : 4

                        finalScore += 3;

                        System.out.println("환승연애 봐야지~~");
                        System.out.println("1. 환승연애를 키다가 기찬 팀장님의 팩트폭행하시는 모습이 떠올라 휴대폰을 집어 던진다.");
                        System.out.println("2. 30분 정도만 보고나서 teamNova 발표 ppt를 만들려고 한다.");
                        System.out.println("3. 2시간 풀로 환승연애를 보고 나서 뭐 먹을지 생각한다.");

                        System.out.print("나의 선택");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){

                            // depth : 5
                            // 한승연애를 키다가 기찬 팀장님의 팩트폭행하시는 모습이 떠올라 휴대폰을 집어 던진다.
                            finalScore += 1;

                            System.out.println("뭔 환승연애야 과제나 하자");

                            System.out.println("1. 과제에 온힘을 쏟아서 열심히 최선을다해서 완벽하게 한다.");
                            System.out.println("2. 팩트폭행 안당할 정도로만 적당히 한다.");
                            System.out.println("3. 그냥 또 팩폭당하면되지 라는 생각으로 환승연애를 다본다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }


                        }else if(selectNum == 2){

                            // depth : 5
                            // 30분 정도만 보고나서 teamNova 발표 ppt를 만든다.
                            finalScore += 2;

                            System.out.println("ppt 발표자료 만들어야지");

                            System.out.println("1. 두괄식으로 주장-근거 순으로 팀장님이 피드백해주시기 좋은 순서로 만든다.");
                            System.out.println("2. 공부한 내용을 바탕으로 형식은 없지만, 양을 많이 늘려서 만든다.");
                            System.out.println("3. 발표 전날 만들면 충분하다고 생각하고 미룬다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }


                        }else if(selectNum == 3){

                            // depth : 5
                            // 2시간 풀로 환승연애를 보고 나서 뭐 먹을지 생각한다.

                            finalScore += 3;


                            System.out.println("뭐먹지..?");

                            System.out.println("1. 즐길거 다 즐겼으니 간단히 먹고 공부를 한다.");
                            System.out.println("2. 이왕 먹는거 배부르게 맛있는거 먹고 소화시키고 공부하면 된다는 생각을 한다.");
                            System.out.println("3. 치킨 + 맥주를 시킨다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{

                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else{

                        // depth : 4
                        finalScore = 0;
System.out.println("게임 종료");
                    }

                }else if(selectNum == 3){

                    // 알람 소리도 못듣고 잔다.
                    // 에라잇! 모르겠다 하고 1시간 잠을 더 청한다.
                    // 잠만 자느라 하루 망했네 그냥 놀자 오늘은!
                    // depth : 3

                    finalScore += 3;

                    System.out.println("오늘은 이미 글렀어 놀아보자~~");

                    System.out.println("1. 뭐하고 놀면 더 의미있게 보낼 수 있을까?");
                    System.out.println("2. 일단 친구들한테 연락해 봐야지");
                    System.out.println("3. 몰라 게임이나 하자~");

                    System.out.print("나의 선택 : ");
                    selectNum = sc.nextInt();

                    if(selectNum == 1){
                        // 알람 소리도 못듣고 잔다.
                        // 에라잇! 모르겠다 하고 1시간 잠을 더 청한다.
                        // 잠만 자느라 하루 망했네 그냥 놀자 오늘은!
                        // 뭐하고 놀면 더 의미있게 보낼 수 있을까?
                        // depth : 4

                        finalScore += 1;

                        System.out.println("뭘하고 놀까?");

                        System.out.println("1. 기분 전환을 위해 집에서 좀 떨어진 맛집을 간다.");
                        System.out.println("2. 친구들과 등산을 하러 간다.");
                        System.out.println("3. 노는 것마저 귀찮다.. 다시 침대에 눕는다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){

                            // depth : 5
                            // 기분 전환을 위해 집에서 좀 떨어진 맛집을 간다.
                            
                            finalScore += 1;

                            System.out.println("맛집에가서 야무지게 먹자..");

                            System.out.println("1. 맛집에서 밥을 먹고, 할일이 많기 때문에 바로 친구와 헤어진다.");
                            System.out.println("2. 밥을 먹고 커피까지 같이 마시고 헤어진다.");
                            System.out.println("3. 밥먹고 커피먹고 바로 술자리로 이어진다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }
                            
                        }else if(selectNum == 2){

                            // depth : 5
                            // 친구들과 등산을 하러 간다.
                            
                            finalScore += 2;

                            System.out.println("운동을 하려하는데 어떠한 산을 갈까?");

                            System.out.println("1. 관악산");
                            System.out.println("2. 소래산");
                            System.out.println("3. 동네 뒷산");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){

                            // depth : 5
                            // 노는 것마저 귀찮다.. 다시 침대에 눕는다.
                            
                            finalScore += 3;

                            System.out.println("침대에 눕는다..");

                            System.out.println("1. 침대에 누워서 마음의 평안을 위해 음악감상을 한다.");
                            System.out.println("2. 침대에 누워서 눈감고 가만히 사색을 즐긴다.");
                            System.out.println("3. 침대에 눕자마자 자연스럽게 휴대폰을 꺼낸다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{

                            // depth : 5
                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else if(selectNum == 2){
                        // 알람 소리도 못듣고 잔다.
                        // 에라잇! 모르겠다 하고 1시간 잠을 더 청한다.
                        // 잠만 자느라 하루 망했네 그냥 놀자 오늘은!
                        // 일단 친구들한테 연락해 봐야지
                        // depth : 4

                        finalScore += 2;

                        System.out.println("친구에게 전화를 걸었다. 친구가 AI 세미나에 간다고 한다.");

                        System.out.println("1. 친구에게 같이 가자고 한다.");
                        System.out.println("2. AI 세미나..? 일단 뭐하는 곳인지 물어본다.");
                        System.out.println("3. 세미나는 왜가냐며 같이 맥주나 한잔 하자고 한다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){

                            // depth : 5

                            finalScore += 1;
                            // 친구에게 같이 가자고 한다.

                            System.out.println("나도 같이 갈래");

                            System.out.println("1. 언제 어디서 하는지 물어보고 달력에 기록해둔다.");
                            System.out.println("2. 언제 어디서 하는지 물어만 본다.");
                            System.out.println("3. 장소를 듣고 귀찮다며 안간다고 다시 말한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){

                            // depth : 5
                            // AI 세미나..? 일단 뭐하는 곳인지 물어본다.

                            finalScore += 2;
                            System.out.println("AI 세미나 뭐하는 곳이야..?");

                            System.out.println("1. AI 세미나에 대해 주의깊게 듣고 조사한다.");
                            System.out.println("2. 친구가 이야기하는 AI 세미나에 대해서만 듣는다.");
                            System.out.println("3. 한귀로 듣고 한귀로 흘린다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){

                            // depth : 5
                            // 세미나는 왜가냐며 같이 맥주나 한잔 하자고 한다.

                            finalScore += 3;

                            System.out.println("에이 ~ 맥주나 하자");

                            System.out.println("1. 맥주는 무슨 맥주냐 그냥 세마나 같이 가자고 한다.");
                            System.out.println("2. 세미나 끝나고 맥주한잔 하자고 한다.");
                            System.out.println("3. 맥주 사줄테니 먹자고 한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else{

                            // depth : 5

                            finalScore = 0;
                            System.out.println("게임 종료");
                        }

                    }else if(selectNum == 3){
                        // 알람 소리도 못듣고 잔다.
                        // 에라잇! 모르겠다 하고 1시간 잠을 더 청한다.
                        // 잠만 자느라 하루 망했네 그냥 놀자 오늘은!
                        // 몰라 게임이나 하자
                        // depth : 4

                        finalScore += 3;

                        System.out.println("게임이나 해야지 ~");

                        System.out.println("1. 게임할 시간을 정해놓고 게임을 시작한다.");
                        System.out.println("2. 오늘만 질리도록 해보자 라는 마인드로 게임을 시작한다.");
                        System.out.println("3. 음 200렙 찍으려면 이번주는 게임만 해야겠다라고 생각한다.");

                        System.out.print("나의 선택 : ");
                        selectNum = sc.nextInt();

                        if(selectNum == 1){

                            // depth : 5
                            // 게임할 시간을 정해놓고 게임을 시작한다.

                            finalScore += 1;

                            System.out.println("게임할 시간을 정하자..");

                            System.out.println("1. 공부를 해야하므로 1시간으로 정한다.");
                            System.out.println("2. 어느정도 하고싶기 때문에 3시간으로 정한다.");
                            System.out.println("3. 미친듯이 하고 싶기 때문에 15시간으로 정한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 2){

                            // depth : 5
                            // 오늘만 질리도록 해보자 라는 마인드로 게임을 시작한다.

                            finalScore += 2;

                            System.out.println("오늘만 질리도록 하자..");

                            System.out.println("1. 공부로 인해 받았던 스트레스를 오늘 하루에 그 누구보다 열심히 게임을해서 소진한다.");
                            System.out.println("2. 내일 지장이 없을 정도로만 한다.");
                            System.out.println("3. 게임을 하고나서 술마실 생각을 한다.");

                            System.out.print("나의 선택 : ");
                            selectNum = sc.nextInt();

                            if(selectNum == 1){
                                // depth : 6
                                finalScore += 1;
                            }else if(selectNum == 2){
                                // depth : 6
                                finalScore += 2;
                            }else if(selectNum == 3){
                                // depth : 6
                                finalScore += 3;
                            }else{
                                // depth : 6
                                selectNum = 0;
                                System.out.println("게임종료");
                            }

                        }else if(selectNum == 3){

                            // depth : 5
                            // 음 200 렙 찍으려면 이번주는 게임만 해야겠다라고 생각한다.

                            finalScore += 3;

                        }else{

                            // depth : 5

                            finalScore = 0;
System.out.println("게임 종료");
                        }

                    }else {

                        // depth : 4

                        finalScore = 0;
System.out.println("게임 종료");
                    }

                }else{
                    // depth : 3
                    finalScore = 0;
System.out.println("게임 종료");
                }

            }else{
                //depth : 2
                finalScore = 0;
System.out.println("게임 종료");
            }

        }else {
            // depth: 1
            System.out.println("게임이 종료됩니다.");
        }

        if(finalScore == 0){
            System.out.println("선택지를 잘못 고르셧습니다! 처음부터 다시해주세요.");
        }
        else if(finalScore<=5){
            System.out.println("최종 점수 : " + finalScore);
            System.out.print("오늘의 조언 : ");
            System.out.println("상당히 잘 살고 계시는 군요!");
        }else if(finalScore<=10){
            System.out.println("최종 점수 : " + finalScore);
            System.out.print("오늘의 조언 : ");
            System.out.println("음.. 조금 개선할 필요가 있습니다");
        }else{
            System.out.println("최종 점수 : " + finalScore);
            System.out.print("오늘의 조언 : ");
            System.out.println("삶을 송두리채 바꿔야 합니다!");
        }

    }
}
