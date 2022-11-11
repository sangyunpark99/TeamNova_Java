package TeamNova_공부;

public class 자료형_Character {
    public static void main(String[] args) {

        //Constructor
        Character ex1 = 'a';

        //Primitive
        char ex2 = 'b';

        System.out.println(ex1);
        System.out.println(ex2);


        // Method

        // charCount(int codePoint)
        // 0x10000 보다 더 크거나 같은경우 2를 반환, 그렇지 않은 경우 1을 반환
        // 0x10000 : 16진수이므로 10진수로 변환시 65536
        System.out.println(Character.charCount(65535));
        System.out.println(Character.charCount(65536));
        System.out.println(Character.charCount(65537));

        // charValue()
        // Character object에서 value(Character 클래스 내부에 private으로 변수 선언되어 있음) 반환
        System.out.println(ex1.charValue());

        // codePointAt(char [] a, int index)
        // 문자열을 대표하는 정수 값
        // codePoint / 1 : 49, 2 : 50, 3 : 51 ~
        char []a = {'1','2','3','4','5'};
        System.out.println(Character.codePointAt(a,0));

        // codePointAt(char [] a, int index, int limit)
        // limit : 0 ~ 제한하고자 하는 index 전까지
        System.out.println(Character.codePointAt(a,2,a.length));

        // codePointBefore( char[] a, int index)
        // index 이전 값을 출력해준다.
        System.out.println(Character.codePointBefore(a,1));

        // codePointBefore( char[] a, int index, int start)
        // start : 시작 지점 지정해준다.
        System.out.println(Character.codePointBefore(a,3,2));

        // codePointCount( char[] a, int offset, int count)
        System.out.println(Character.codePointCount(a,4,2));
    }
}
