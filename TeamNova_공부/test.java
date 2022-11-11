package TeamNova_공부;

import java.util.Random;

public class test {
    public static void main(String[] args) {
        char a = '거';
        char a2 = '래';
        char a3 = '소';

        String b = "거래소";

        System.out.println("a 의 결과물 : " +a+a2+a3);
        System.out.println("b 의 결과물 : " +b);

        byte by1 = 1;
        byte by2 = 3;
        System.out.println(by1 + by2);

        byte num1 = 127;
        byte num2 = 1;

        short num3 = 30000;
        short num4 = 3000;

        int num5 = 2147483647;
        int num6 = 1;

        boolean bool1 = true;
        boolean bool2 = true;

        System.out.println(num1 + num2);

        System.out.println(num3 + num4);

        System.out.println(num5 + num6);

        short num7 = 1;

//        if(num7 == 1){
//            num7 = 33000;
//        }

        Random random = new Random();

        String s1 = "hello";
        System.out.println(s1 == "hello");
    }
}
