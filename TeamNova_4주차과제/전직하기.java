package TeamNova_4주차과제;

import java.util.Scanner;

public class 전직하기 {

    Character ch;
    int selectedNum;
    Scanner sc = new Scanner(System.in);

    String job;

    BackgroundMusicThread changeJobsMusic = new BackgroundMusicThread("./src/전직.wav"); // 버섯의 숲 음악
    EffectMusicThread successJob = new EffectMusicThread("./src/전직성공.wav"); // 버섯의 숲 음악


    전직하기(Character getCh){
        this.ch = getCh;
        this.job = ch.job;
    }

    public void start(){

        if(ch.전직){
            System.out.println("이미 전직을 한 상태입니다!");
            return;
        }

        if(ch.level >= 5 && !ch.전직 && ch.skillPoint == 0){// 전직은 한번만 가능하다.

            changeJobsMusic.run();
            System.out.println();
            System.out.println("현재 전직이 가능합니다!");
            System.out.println("1. 전직하기   2.나가기");
            System.out.print("선택 : ");
            selectedNum = sc.nextInt();

            if(selectedNum == 1){

                successJob.run();
                System.out.println();
                System.out.println("전직하는중....");
                System.out.printf("%s ------> %s",getJobName(this.job),"파워"+getJobName(this.job));
                System.out.println();
                System.out.println("전직이 완료되었습니다");
                ch.전직 = true;

                changeJobsMusic.stopMusic();
            }else if(selectedNum == 2){
                changeJobsMusic.stopMusic();
            }else{
                System.out.println("존재하지 않는 항목입니다");
            }
        }else{
            if(ch.skillPoint!=0){
                System.out.println("스킬포인트를 다 사용해야 합니다!");
            }else{
                System.out.println();
                System.out.println("아직 전직 가능한 레벨이 아닙니다");
                System.out.printf("현재 레벨 : %d | 전직 가능한 레벨 : %d",ch.level,5);
                System.out.println();
            }
        }
    }


    public String getJobName(String job){

        String jobName;

        if(this.job == "Warrior"){
            jobName = "전사";
        }else if(this.job == "Wizard"){
            jobName = "마법사";
        }else if(this.job == "Archer"){
            jobName = "궁수";
        }else{
            jobName = "도적";
        }

        return jobName;
    }
}
