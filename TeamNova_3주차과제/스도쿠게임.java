package TeamNova_3주차과제;

import java.util.Random;
import java.util.Scanner;

public class 스도쿠게임 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        while(true){ // 맨 처음 반복
            System.out.print("n : ");
            int n = Integer.parseInt(sc.next());
            int[][] arr = new int[n][n]; // 게임판

            while(true){

                int num = random.nextInt(n)+1;
                arr = new int[n][n]; // 게임판 초기화

                // 첫번째 줄 랜덤으로 숫자 부여하기(중복 없이)
                for(int i = 0; i < arr.length; i++){
                    if(i == 0){ // 첫번째 값
                        arr[0][i] = num;
                    }else{ // 첫번째 값이 아닌 경우 전 값과 비교해주어야 한다.

                        while(true){ // 원하는 값이 나올때 까지 반복

                            int check = 0; // 이전의 값의 갯수

                            for(int j = 0; j < i; j++){
                                if(arr[0][j] == num){
                                    num = random.nextInt(n)+1; // 같은 값이 나오는 경우 랜덤값 재부여
                                    break; // 반복문 빠져나오기
                                }else{
                                    check++; // 다른 값인 경우 확인 변수 1 추가
                                }
                            }

                            if(check == i){ // 이전의 값의 갯수와 모드 다른 경우
                                arr[0][i] = num; // 배열에 값 부여하기
                                break;// while문 종료
                            }
                        }
                    }
                }

                // 나머지 줄 중복 판단
                for(int i = 1; i < arr.length; i++){ // 2번째 행부터 시작
                    for(int j = 0; j < arr.length; j++){
                        if(j == 0){ // 첫번째 열은 위에 값만 비교하면 된다.
                            while(true){

                                int check = 0;

                                for(int k = 0; k < i; k++){
                                    if(arr[k][0] == num){
                                        num = random.nextInt(n)+1;
                                        break;
                                    }else{
                                        check++;
                                    }
                                }

                                if(check == i){
                                    arr[i][0] = num;
                                    break;
                                }
                            }
                        }else{
                            int loop = 0; // 랜덤으로 부여하다 보면 들어갈 숫자가 없는 경우가 생긴다 -> 이것을 방지하기 위해
                            while(true){
                                int checkX = 0;
                                int checkY = 0;
                                loop++;

                                for(int k = 0; k < i; k++){
                                    if(arr[k][j] == num){
                                        num = random.nextInt(n)+1;
                                        break;
                                    }else{
                                        checkY++;
                                    }
                                }

                                for(int k = 0; k < j; k++){
                                    if(arr[i][k] == num){
                                        num = random.nextInt(n)+1;
                                        break;
                                    }else{
                                        checkX++;
                                    }
                                }

                                if(checkY == i && checkX == j){
                                    arr[i][j] = num;
                                    break;
                                }

                                if(loop == 300){ // 300번 돌려도 답을 못찾으면 반복문을 멈춰준다.
                                    break;
                                }
                            }
                        }
                    }
                }


                // 모든 값이 다 존재하는지에 대한 검사
                int count = 0;

                Loop2 : for(int i = 0; i < arr.length; i++){
                    for(int j = 0; j < arr.length ; j++){
                        if(arr[i][j] == 0){
                            break Loop2;
                        }else{
                            count++;
                        }
                    }
                }

                if(count == n*n){ // 모든 값이 다 존재하면 while문 탈출하기
                    break;
                }
            }


            for(int i = 0; i < arr.length; i++){ // 이차원 배열 출력하기
                for(int j = 0; j < arr.length; j++){
                    System.out.print(" ");
                    System.out.print(arr[i][j]);
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
