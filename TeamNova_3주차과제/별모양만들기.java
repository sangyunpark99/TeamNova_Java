package TeamNova_3주차과제;

import java.util.Scanner;

public class 별모양만들기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("n : ");
            int p = Integer.parseInt(sc.next());
            int n = 2*p+1;
            int m = 3*(2*n-1);

            for (int i = 1; i <= n+1; i++) {

                for(int j = 1; j <=n-i+m/3+n; j++){
                    System.out.print(" ");
                }

                for(int j = 0; j <= 2*(i-1); j++){
                    System.out.print("*");
                }
                System.out.println();
            }// 맨위

            for(int i = n; i>1; i--){
                for(int j = 0; j< 2*(n-i); j++){
                    System.out.print(" ");
                }

                for(int j = 3*(2*n-1)-2*(n-2*i); j>=1; j--){
                    System.out.print("*");
                }
                System.out.println();
            }// 중간 1

            for(int i = 1; i<=n-1; i++){

                for(int j = n-i+n; j>1; j--){
                    System.out.print(" ");
                }

                for(int j = 0; j<3*(2*n-1)-2*(n-i)+2; j++){
                    System.out.print("*");
                }
                System.out.println(" ");
            }// 중간 2

            for(int i = 1; i <=n; i++){

                for(int j = 0; j<n-i; j++) {
                    System.out.print(" ");
                }

                for(int j = 0; j< 3*(2*n-1)+2*i; j++){

                    if(i==1){

                        if(j==(3*(2*n-1)+2*i)/2){
                            System.out.print(" ");
                        }else{
                            System.out.print("*");
                        }
                    }else{
                        if(j>(3*(2*n-1)+2*i)/2-4*(i-1) && j<(3*(2*n-1)+2*i)/2+4*(i-1)){
                            System.out.print(" ");
                        }else{
                            System.out.print("*");
                        }
                    }
                }
                System.out.println();

            } // 맨 아래

        }
    }
}
