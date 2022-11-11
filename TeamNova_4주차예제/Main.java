package TeamNova_4주차예제;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();

        캐릭터 유저 = new 캐릭터(name);

        주황버섯 주황버섯1 = new 주황버섯();


        new Thread(new Runnable() {
            @Override
            public void run() {
                while(유저.체력 > 0 && 주황버섯1.체력>0){
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    if(주황버섯1.체력>0){
                        주황버섯1.공격하기(유저);
                    }

                    System.out.println("스킬 뭐 쓸거임");
                }
            }
        }).start();

        while(유저.체력 > 0 && 주황버섯1.체력>0){
            if(sc.next().equals("1")){
                유저.공격하기(주황버섯1);
            }
        }
    }
}
