package TeamNova_4주차과제;

import java.util.Scanner;

public class 상점가기 {
    Character ch;
    String job;

    Scanner sc = new Scanner(System.in);

    BackgroundMusicThread storeMusic = new BackgroundMusicThread("./src/상점음악.wav"); // 버섯의 숲 음악

    EffectMusicThread buyMusic = new EffectMusicThread("./src/아이템구매.wav");

    상점가기(Character getCh){
        ch = getCh;
        this.job = ch.job;

    }

    int hpValue = 50;
    int mpValue = 50;

    int arrowValue = 150;
    int daggerValue = 150;


    // 무기
    Item 깔끔한양손검 = new Item("깔끔한 양손검",50,0,100,"무기",300,1);
    Item 깔끔한완드 = new Item("깔끔한 완드",50,0,100,"무기",300,1);
    Item 깔끔한활 = new Item("깔끔한 활",50,0,100,"무기",300,1);
    Item 깔끔한아대 = new Item("깔끔한 아대",50,0,100,"무기",300,1);

    Item 깔끔한상의 = new Item("깔끔한 상의",0,10,100,"상의",100,1);
    Item 깔끔한하의 = new Item("깔끔한 하의",0,10,100,"하의",100,1);
    Item 깔끔한모자 = new Item("깔끔한 모자",0,10,100,"모자",100,1);
    Item 깔끔한목걸이 = new Item("깔끔한 목걸이",0,10,100,"목걸이",100,1);
    Item 깔끔한신발 = new Item("깔끔한 신발",0,10,100,"신발",100,1);



    public void start(){

        int selectedNum = 0;

        if(ch.money <= 0){
            System.out.println();
            System.out.println("돈이 없어서 상점을 이용할 수 없습니다.");
            return;
        }

        storeMusic.run();
        while(true){

            System.out.println();

            System.out.println("--------------상점-------------");

            System.out.println();
            System.out.println("현재 갖고 있는 돈 : " + ch.money + "$");
            System.out.println();

            System.out.println("장비");
            if(job == "Warrior"){
                System.out.println("깔끔한 양손검 - " +깔끔한양손검.itemValue + "$");
            }else if(job == "Wizard"){
                System.out.println("깔끔한 완드 - " + 깔끔한완드.itemValue + "$");
            }else if(job == "Archer"){
                System.out.println("깔끔한 활 - " + 깔끔한활.itemValue + "$");
            }else{
                System.out.println("깔끔한 아대 - " + 깔끔한아대.itemValue + "$");
            }
            System.out.println("깔끔한 상의 - " + 깔끔한상의.itemValue + "$");
            System.out.println("깔끔한 하의 - " + 깔끔한하의.itemValue + "$");
            System.out.println("깔끔한 모자 - " + 깔끔한모자.itemValue + "$");
            System.out.println("깔끔한 목걸이 - " + 깔끔한목걸이.itemValue + "$");
            System.out.println();

            System.out.println("물약");
            System.out.println("HP 물약(100% 충전) - " + hpValue + "$");
            System.out.println("MP 물약(100% 충전 - " + mpValue + "$");

            System.out.println();

            System.out.println("기타");
            System.out.println("화살 1묶음(100개) - " + arrowValue + "$");
            System.out.println("표창 1묶음(100개) - " + daggerValue + "$");

            System.out.println();
            System.out.println("무엇을 할까?");
            System.out.println("1.장비구매  2. 물약구매  3. 기타구매  4. 아이템 판매  5. 상점 나가기");
            System.out.print("입력 : ");
            selectedNum = sc.nextInt();

            if(selectedNum == 1){

                System.out.println();
                System.out.println("어떤 장비를 구매하나요");

                String weaponName = "";

                if(ch.job == "Warrior"){
                    weaponName = "깔끔한 양손검";
                }else if(ch.job == "Wizard"){
                    weaponName = "깔끔한 완드";
                }else if(ch.job == "Archer"){
                    weaponName = "깔끔한 활";
                }else{
                    weaponName = "깔끔한 아대";
                }

                System.out.printf("1.%s 2. 깔끔한 상의 3. 깔끔한 하의 4. 깔끔한 모자 5. 깔끔한 목걸이 6. 깔끔한 신발",weaponName);
                System.out.println();

                System.out.print("선택 : ");
                selectedNum = sc.nextInt();

                Item selectedItem;

                if(selectedNum == 1){
                    if(job == "Warrior"){
                        selectedItem = 깔끔한양손검;
                    }else if(job == "Wizard"){
                        selectedItem = 깔끔한완드;
                    }else if(job == "Arhcer"){
                        selectedItem = 깔끔한활;
                    }else{
                        selectedItem = 깔끔한아대;
                    }
                }else if(selectedNum == 2){
                    selectedItem = 깔끔한상의;
                }else if(selectedNum == 3){
                    selectedItem = 깔끔한하의;
                }else if(selectedNum == 4){
                    selectedItem = 깔끔한모자;
                }else if(selectedNum == 5){
                    selectedItem = 깔끔한목걸이;
                }else if(selectedNum == 6){
                    selectedItem = 깔끔한신발;
                }else{
                    System.out.println("올바른 항목을 입력하세요");
                    storeMusic.stopMusic();
                    return;
                }

                System.out.println("가격 : " + selectedItem.itemValue + "$");
                System.out.println("현재 갖고 있는 돈 : " + ch.money + "$");
                System.out.println();
                System.out.println("1. 구매하기  2. 취소하기");
                System.out.print("입력 : ");
                selectedNum = sc.nextInt();
                System.out.println();

                if(selectedNum == 1){ // 구매하기
                    if(ch.money < selectedItem.itemValue){
                        System.out.println();
                        System.out.println("갖고 있는 돈이 부족합니다.");
                    }else{
                        System.out.println("구입했습니다!");
                        buyMusic.run();
                        ch.money -= selectedItem.itemValue;
                        ch.itemList.add(selectedItem);
                        System.out.println();
                        System.out.println("현재 갖고 있는 돈 : " + ch.money + "$");
                    }
                }else if(selectedNum == 2){
                    System.out.println("취소되었습니다..");
                }


            } else if(selectedNum == 2){ // 물약 구매
                System.out.println();
                System.out.println("어떤 물약을 구매하나요?");
                System.out.println("1. HP 물약  2. MP 물약");
                System.out.print("입력 : ");
                selectedNum = sc.nextInt();

                if(selectedNum == 1){ // HP 물약

                    int purchaseValue;

                    System.out.println();
                    System.out.println("몇 개를 구매하나요?");
                    System.out.print("입력 : ");
                    selectedNum = sc.nextInt();
                    purchaseValue = selectedNum * hpValue;
                    System.out.println();
                    System.out.println("가격 : " + purchaseValue + "$");
                    System.out.println("현재 갖고 있는 돈 : " + ch.money + "$");
                    System.out.println();
                    System.out.println("1. 구매하기  2. 취소하기");
                    System.out.print("입력 : ");
                    selectedNum = sc.nextInt();
                    System.out.println();

                    if(selectedNum == 1){ // 구매하기
                        if(ch.money < purchaseValue){
                            System.out.println();
                            System.out.println("갖고 있는 돈이 부족합니다.");
                        }else{
                            System.out.println("구입했습니다!");
                            buyMusic.run();
                            ch.money -= purchaseValue;
                            ch.liquidMedicineHp += purchaseValue/hpValue;
                            System.out.println();
                            System.out.println("현재 갖고 있는 돈 : " + ch.money + "$");
                        }
                    }else if(selectedNum == 2){
                        System.out.println("취소되었습니다..");
                    }

                }else{ // MP 물약

                    int purchaseValue;

                    System.out.println();
                    System.out.println("몇 개를 구매하나요?");
                    System.out.print("입력 : ");
                    selectedNum = sc.nextInt();
                    purchaseValue = selectedNum * mpValue;
                    System.out.println();
                    System.out.println("가격 : " + purchaseValue + "$");

                    System.out.println();
                    System.out.println("현재 갖고 있는 돈 : " + ch.money + "$");
                    System.out.println("1. 구매하기  2. 취소하기");
                    System.out.print("입력 : ");
                    selectedNum = sc.nextInt();

                    if(selectedNum == 1){ // 구매하기
                        if(ch.money < purchaseValue){
                            System.out.println("갖고 있는 돈이 부족합니다.");
                        }else{
                            System.out.println();
                            System.out.println("구입했습니다!");
                            buyMusic.run();
                            ch.money -= purchaseValue;
                            ch.liquidMedicineMp += purchaseValue/mpValue;
                            System.out.println();
                            System.out.println("현재 갖고 있는 돈 : " + ch.money + "$");
                        }
                    }else if(selectedNum == 2){
                        System.out.println("취소되었습니다..");
                    }
                }
            }else if(selectedNum == 3){ // 기타 구매

                if(job == "Bandit" || job == "Archer"){
                    System.out.println();
                    System.out.println("1. 화살  2. 표창");
                    System.out.print("입력 : ");
                    selectedNum = sc.nextInt();

                    if(selectedNum == 1){ // 화살

                        int purchaseValue = 0;

                        System.out.println();
                        System.out.println("몇 개를 구매하나요?");
                        System.out.print("입력 : ");
                        selectedNum = sc.nextInt();
                        purchaseValue = selectedNum * arrowValue;
                        System.out.println("가격 : " + purchaseValue + "$");
                        System.out.println("현재 갖고 있는 돈 : " + ch.money + "$");
                        System.out.println("1. 구매하기  2. 취소하기");
                        System.out.print("입력 : ");
                        selectedNum = sc.nextInt();

                        if(selectedNum == 1){ // 구매하기
                            if(ch.money < purchaseValue){
                                System.out.println("갖고 있는 돈이 부족합니다.");
                            }else{
                                System.out.println("구입했습니다!");
                                buyMusic.run();
                                ch.money -= purchaseValue;
                                ((Archer)ch).arrow += purchaseValue/arrowValue * 100;
                                System.out.println("현재 갖고 있는 돈 : " + ch.money + "$");
                            }
                        }else if(selectedNum == 2){
                            System.out.println("취소되었습니다..");
                        }

                    }else{ // 표창

                        int purchaseValue = 0;

                        System.out.println();
                        System.out.println("몇 개를 구매하나요?");
                        System.out.print("입력 : ");
                        selectedNum = sc.nextInt();
                        purchaseValue = selectedNum * daggerValue;
                        System.out.println("가격 : " + purchaseValue + "$");
                        System.out.println("현재 갖고 있는 돈 : " + ch.money + "$");
                        System.out.println("1. 구매하기  2. 취소하기");
                        System.out.print("입력 : ");
                        selectedNum = sc.nextInt();

                        if(selectedNum == 1){ // 구매하기
                            if(ch.money < purchaseValue){
                                System.out.println("갖고 있는 돈이 부족합니다.");
                            }else{
                                System.out.println("구입했습니다!");
                                buyMusic.run();
                                ch.money -= purchaseValue;
                                ((Bandit)ch).dagger += purchaseValue/arrowValue * 100;
                                System.out.println("현재 갖고 있는 돈 : " + ch.money + "$");
                            }
                        }else if(selectedNum == 2){
                            System.out.println("취소되었습니다..");
                        }
                    }
                }else{
                    System.out.println("전사, 마법사는 이 아이템을 구매할 수 없습니다.");
                }
            }else if(selectedNum == 4){ // 아이템 판매

                System.out.println();
                for(int i = 0; i < ch.itemList.size(); i++){
                    System.out.printf("%d. %s",i+1,ch.itemList.get(i).name);
                    System.out.println();
                }

               if(ch.itemList.size() > 0) {
                   System.out.println();
                   System.out.println("무엇을 팔까요?");

                   System.out.print("선택 : ");
                   selectedNum =  sc.nextInt();

                   System.out.println();
                   buyMusic.run();
                   System.out.println(ch.itemList.get(selectedNum-1).name + "을(를) 판매하였습니다.");
                   System.out.println("돈 " + ch.itemList.get(selectedNum-1).itemValue +"$ 을(를) 획득하였습니다.");
                   ch.money += ch.itemList.get(selectedNum-1).itemValue;
                   ch.itemList.remove(selectedNum-1);
               }else{
                   System.out.println("판매할 장비가 없습니다.");
               }


            }else if(selectedNum == 5){
                storeMusic.stopMusic();
                System.out.println();
                System.out.println("상점을 나갔습니다");
                break;
            }else{
                System.out.println("올바른 항목을 입력해주세요");
            }
        }
    }
}
