package TeamNova_3주차과제;

import java.util.Scanner;

public class 마름모만들기 {
    public static void main(String[] args) {

        while(true){
            Scanner sc = new Scanner(System.in);

            System.out.print("n : ");
            int n = sc.nextInt();

            if(n == 0){
                System.out.println("0을 입력해도 1로 간주합니다.");
                n = 1;
            }

            int num = 2*n+1;
            int middle = num/2 + 1; // 윗부분과 아랫부분의 경계

            // 윗부분
            for (int i = 1; i <=middle; i++){

                for(int j = 1; j < num-i-n+1; j++){
                    System.out.print(" ");
                } // -n+1을 해준 이유 : 공백이 한칸씩 밀린다 + 1일땐 밀린거 신경안써줘도 된다.

                for(int j = 1; j <= 2*i - 1; j++){
                    System.out.print("*");
                }
                System.out.println();
            }

            // 아랫부분
            for (int i = num-middle; i >= 1; i--){

                for(int j = 1; j< num-i-n+1 ; j++){
                    System.out.print(" ");
                }// -n+1을 해준 이유 : 공백이 한칸씩 밀린다 + 1일땐 밀린거 신경안써줘도 된다.

                for(int j = 1; j <= 2*i -1; j++){
                    System.out.print("*");
                }

                System.out.println();
            }
        }

    }
}
