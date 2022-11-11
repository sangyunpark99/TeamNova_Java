package TeamNova_4주차과제;

import java.util.Scanner;

public class 인벤토리 {
    Character ch;
    String job;

    Scanner sc = new Scanner(System.in);

    인벤토리(Character getCh){
        this.ch = getCh;
        this.job = ch.job;
    }

    public void start(){

        int selectedNum = 0;

        System.out.println();
        System.out.println("---------인벤토리--------");
        System.out.println();
        System.out.println("장비");

        if(ch.itemList.size() > 0){
            for(int i = 0; i < ch.itemList.size();i++){
                System.out.println(ch.itemList.get(i).name);
            }
        }else{
            System.out.println("갖고있는 장비가 없습니다.");
        }

        System.out.println();

        System.out.println("물약");

        System.out.println("HP 물약 : " + ch.liquidMedicineHp + "개");
        System.out.println("MP 물약 : " + ch.liquidMedicineMp + "개");

        System.out.println();

        System.out.println("기타");
        if(job == "Archer"){
            System.out.println("화살 : " + ((Archer)ch).arrow + "개");
        }else if(job == "Bandit"){
            System.out.println("표창 : " + ((Bandit)ch).dagger + "개");
        }else{
            System.out.println("갖고있는 기타아이템이 없습니다.");
        }

        System.out.println();
        System.out.println("돈");
        System.out.println("액수 : " + ch.money + "$");
        System.out.println();
        System.out.println("----------------------");

        System.out.println();

        if(ch.itemList.size()>0){// 아이템이 존재하는 경우

            while(ch.itemList.size()>0){
                System.out.println("1. 장비 착용하기 2. 나가기");
                System.out.print("선택 : ");
                selectedNum = sc.nextInt();


                System.out.println();
                // 공격력 300, 스킬 공격력 600, 10레벨 이상
                // 방어구 -> 방어력 올려준다.
                if(selectedNum == 1){ // 장비를 착용하는 경우

                    for(int i = 0; i < ch.itemList.size(); i++){

                        Item item = ch.itemList.get(i); // 아이템 받아오기

                        System.out.println(i+1 +". "+item.name); // 숫자 + 아이템 이름
                    }
                    System.out.println();
                    System.out.print("선택 : ");
                    selectedNum = sc.nextInt(); // 인덱스, 선택번호 유의

                    if(selectedNum > ch.itemList.size()){
                        System.out.println("올바른 항목을 입력하세요");
                        break;
                    }

                    Item selectedItem = ch.itemList.get(selectedNum-1); // 아이템 선택

                    //이미 같은 종류의 아이템을 착용한 경우

                    if(selectedItem.name == ch.equipment.get(selectedItem.kind).name){ // 같은 장비를 이미 착용하고 있는 경우
                        System.out.println("이미 착용한 장비입니다.");
                    }else{// 그렇지 않은 경우
                        if(selectedItem.kind == "무기"){ // 무기인 경우

                            //다른 장비를 착용하고 있는 경우
                            if(ch.equipment.get(selectedItem.kind).name.length()!=0){
                                ch.itemList.add(ch.equipment.get(selectedItem.kind)); // 아이템 리스트에 추가해준다.
                            }

                            if(selectedItem.minLevel > ch.level){ // 레벨이 낮은 경우
                                System.out.println("레벨이 낮아 착용이 불가능합니다.");
                                return;
                            }

                            // 전직에 따라 나눠줘야 한다. 스킬이 다름
                            System.out.println("공격력이 " + selectedItem.addAttack + "만큼 올라갑니다.");
                            System.out.println("스킬 공격력이 " + selectedItem.skillAttack + "만큼 올라갑니다.");
                            System.out.println();

                            ch.equipment.replace(selectedItem.kind,selectedItem);
                            ch.attack += selectedItem.addAttack; // 공격력 상승

                            if(ch.전직){ // 전직을 한 경우, 스킬 공격력 상승
                                if(job == "Warrior"){
                                    for(Skill s : ((PowerWarrior)ch).powerSkills){
                                        s.skillAttack += selectedItem.skillAttack;
                                    }
                                }else if(job == "Wizard"){
                                    for(Skill s : ((PowerWizard)ch).powerSkills){
                                        s.skillAttack += selectedItem.skillAttack;
                                    }
                                }else if(job == "Archer"){
                                    for(Skill s : ((PowerArcher)ch).powerSkills){
                                        s.skillAttack += selectedItem.skillAttack;
                                    }
                                }else{
                                    for(Skill s : ((PowerBandit)ch).powerSkills){
                                        s.skillAttack += selectedItem.skillAttack;
                                    }
                                }
                            }else{ // 전직을 하지 않은 경우, 스킬 공격력 상승
                                if(job == "Warrior"){
                                    for(Skill s : ((Warrior)ch).skills){
                                        s.skillAttack += selectedItem.skillAttack;
                                    }
                                }else if(job == "Wizard"){
                                    for(Skill s : ((Wizard)ch).skills){
                                        s.skillAttack += selectedItem.skillAttack;
                                    }
                                }else if(job == "Archer"){
                                    for(Skill s : ((Archer)ch).skills){
                                        s.skillAttack += selectedItem.skillAttack;
                                    }
                                }else{
                                    for(Skill s : ((Bandit)ch).skills){
                                        s.skillAttack += selectedItem.skillAttack;
                                    }
                                }
                            }
                        }else{ // 무기가 아닌경우

                            if(ch.equipment.get(selectedItem.kind).name.length()!=0){
                                ch.itemList.add(ch.equipment.get(selectedItem.kind)); // 아이템 리스트에 추가해준다.
                            }

                            if(selectedItem.minLevel > ch.level){
                                System.out.println("레벨이 낮아 착용이 불가능합니다.");
                                return;
                            }


                            ch.equipment.replace(selectedItem.kind,selectedItem);
                            System.out.println(selectedItem.name + "을(를) 착용하였습니다");
                            System.out.println("방어력이 " + selectedItem.addDefense + "만큼 올라갑니다.");
                            ch.defense += selectedItem.addDefense;
                            System.out.println();
                        }


                        for(int i = 0 ; i < ch.itemList.size(); i++){
                            if(ch.itemList.get(i).name == selectedItem.name){
                                ch.itemList.remove(i); // 아이템 목록에서 제거
                            }
                        }

                    }


                }else if(selectedNum == 2){
                    break;
                }else{
                    System.out.println("올바른 항목을 입력하세요");
                }
            }


            } else{ // 아이템이 존재하지 않는 경우
                System.out.println("아무 숫자 입력시 나가집니다.");
                selectedNum = sc.nextInt();
            }
        }
}
