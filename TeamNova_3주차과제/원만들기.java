package TeamNova_3주차과제;

import java.util.Scanner;

public class 원만들기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("n : ");
            int n = sc.nextInt();
            int m = n * 10;

            if(n == 0){
                n = 1;
            }

            // -n ~ n인 이유 원의 중심을 기점으로 y축 대칭이다.
            for(int i = -m+6*n; i<=m-6*n; i++){ // y축 갯수 줄이기
                for(int j = -m; j<=m;j++){
                    // 원이 너무 찌그러져 있어서 비율을 조정했다.
                    if(i*i*6 + j*j <= m*m+m){ // 위-아래로 포함되는 갯수 줄이기
                        // 반지름의 제곱보다 안쪽에 있으면 *표시
                        System.out.print("*");
                    }else{
                        // 그외의 범위에 있는경우 " "
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
