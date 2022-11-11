package TeamNova_4주차과제;

import java.util.Scanner;

public class 퀘스트 {

    Character ch;
    String job;

    퀘스트(Character getCh){
        this.ch = getCh;
        this.job = ch.job;
    }

    public void start(){

        Scanner sc = new Scanner(System.in);

        int selectedNum;

        if(!ch.bossticket){
            System.out.println("--------------퀘스트-------------");
            System.out.println();
            System.out.println("퀘스트를 완료해야 보스 던전 입장이 가능합니다.");
            System.out.println();
            System.out.println("# 5레벨이 되어 전직하기를 달성하세요");
            System.out.println("# 10레벨 이상을 달성하세요");
            System.out.println("# 몬스터를 잡아 다크데모닉 세트를 완성하세요");

            System.out.println();
            System.out.println("# 달팽이 숲");
            System.out.println("달팽이 - 다크데모닉 상의");
            System.out.println("파란달팽이 - 다크데모닉 하의");
            System.out.println("빨간달팽이 - 다크데모닉 신발");
            System.out.println();
            System.out.println("# 버섯 숲");
            System.out.println("버섯 - 다크데모닉 모자");
            System.out.println("초록버섯 - 다크데모닉 무기(직업별)");
            System.out.println("주황버섯 - 다크데모닉 목걸이");

            System.out.println();
            System.out.println("1. 퀘스트 조건 확인하기   2.나가기");
            System.out.print("선택 : ");
            selectedNum = sc.nextInt();
            System.out.println();

            while(true){
                if(selectedNum == 1){ // 필요한 조건
                    if(!ch.전직){
                        System.out.println();
                        System.out.println("아직 전직을 하지 않았습니다.");
                        System.out.println("전직은 보스 잡는 데에 필수적입니다.");
                        System.out.println();
                    }else{ // 전직을 한 경우
                        if(ch.level < 10){
                            System.out.println();
                            System.out.println("아직 10레벨이 되지 않았습니다");
                            System.out.println("10레벨이 되어야 보스와 싸울 능력이 생깁니다.");
                            System.out.println();
                        }else{ // 레벨이 10 이상인 경우

                            int set = 0;

                            if(!ch.equipment.get("상의").name.contains("다크데모닉")){
                                System.out.println("다크데모닉 상의가 없습니다.");
                            }else{
                                set++;
                            }

                            if(!ch.equipment.get("하의").name.contains("다크데모닉")){
                                System.out.println("다크데모닉 하의가 없습니다.");
                            }else{
                                set++;
                            }

                            if(!ch.equipment.get("목걸이").name.contains("다크데모닉")){
                                System.out.println("다크데모닉 목걸이가 없습니다.");
                            }else{
                                set++;
                            }

                            if(!ch.equipment.get("모자").name.contains("다크데모닉")){
                                System.out.println("다크데모닉 모자가 없습니다.");
                            }else{
                                set++;
                            }

                            if(!ch.equipment.get("신발").name.contains("다크데모닉")){
                                System.out.println("다크데모닉 신발이 없습니다.");
                            }else{
                                set++;
                            }

                            if(this.job == "Warrior"){
                                if(!ch.equipment.get("무기").name.contains("다크데모닉")){
                                    System.out.println("다크데모닉 양손검이 없습니다.");
                                }else{
                                    set++;
                                }
                            }else if(this.job == "Wizard"){
                                if(!ch.equipment.get("무기").name.contains("다크데모닉")){
                                    System.out.println("다크데모닉 완드가 없습니다.");
                                }else{
                                    set++;
                                }
                            }else if(this.job == "Archer"){
                                if(!ch.equipment.get("무기").name.contains("다크데모닉")){
                                    System.out.println("다크데모닉 활이 없습니다.");
                                }else{
                                    set++;
                                }
                            }else{
                                if(!ch.equipment.get("무기").name.contains("다크데모닉")){
                                    System.out.println("다크데모닉 아대가 없습니다.");
                                }else{
                                    set++;
                                }
                            }

                            if(set == 6){
                                ch.bossticket = true;
                                System.out.println("퀘스트를 완료했습니다!");
                                System.out.println("보스 소멸 입장권을 획득했다!");
                            }else{
                                System.out.println("퀘스트 완료 조건을 충족하지 못합니다.");
                            }
                        }
                    }
                    break;
                }else if(selectedNum == 2){
                    break;
                }else{
                    System.out.println("올바른 항목을 입력하세요");
                    break;
                }
            }
        }
    }
}
