package TeamNova_공부;

public class 자료형_Short {
    public static void main(String[] args) {

        String s1 = "123";

        // short로 할당
        Short a = new Short((short)123);

        // string으로 할당
        Short b = new Short(s1);

        System.out.println(a);
        System.out.println(b);

        // primitive type
        short a1 = (short)25;

        // Method

        // byteValue()
        // byte로 변환
        System.out.println("a.byteValue() : " + a.byteValue());

        // compare(short x, short y)
        // x == y : 0, x > y : x - y , x < y : x - y
        System.out.println("Short.compare((short)123, (short)456) : " + Short.compare((short)123,(short)456));

        // compareTo(short x)
        // x == y : 0, x > y : x - y, x < y : x - y
        System.out.println("a.compareTo((short)23) : " + a.compareTo((short)23));

        // Decode
        // String -> Short로 변환
        System.out.println("Short.decode(String nm) : " + Short.decode(s1));

        // doubleValue
        // double로 변환
        System.out.println("a.doubleValue() : " + a.doubleValue());

        // equals(Object obj)
        // 자료형 + 값이 같은지 판별
        System.out.println("a.equals(Object obj) : " + a.equals("123"));
        System.out.println("a.equals(Object obj) : " + a.equals((short)123));

        // floatValue()
        // short -> float으로 변환
        System.out.println("a.floatValue() : " + a.floatValue());

        // hashCode()
        // intValue()의 return 값과 같다.
        System.out.println("a.hashCode() : " + a.hashCode());

        // intValue()
        // short -> int
        System.out.println("a.intValue() : " + a.intValue());

        // longValue()
        // short -> long
        System.out.println("a.longValue() : " + a.longValue());

        //parseShort(String s)
        // 10진수, short형으로 반환
        System.out.println("Short.parseShort(\"456\")" + Short.parseShort("456"));

        //parseShort(String s, int radix)
        // 원하는 진수로 계산한 결과값 출력
        System.out.println("Short.parseShort(\"12\") : " + Short.parseShort("12",8));
        System.out.println("Short.parseShort(\"12\") : " + Short.parseShort("12",10));
        System.out.println("Short.parseShort(\"12\") : " + Short.parseShort("12",16));

        // reverseBytes(short i) -> 왜 사용하는 거임?
        System.out.println("Short.reverseBytes : " + Short.reverseBytes((short)123));

        // shortValue()
        // 객체에서 primitive short type 값인 value 가져오기
        System.out.println("a.shortValue() : " + a.shortValue());

        // toString()
        // Short obj 문자열로 변환
        System.out.println("a.toString() : " + a.toString());

        // toString(short s)
        // short s -> 문자열 변환
        System.out.println("Short.toString(short s) : " + Short.toString((short)123));

        // valueOf(short s)
        // primitive type short -> Short instance
        System.out.println("Short.valueOf(short s) : " + Short.valueOf((short)123));
        System.out.println(Short.valueOf((short)123).shortValue()); // 객체이므로 메소드 사용 가능

         // valueOf(String s)
        // String s -> Short instance
        System.out.println("Short.valueOf(String s) : " + Short.valueOf("123"));
        System.out.println(Short.valueOf("123").shortValue());

        // valueOf(String s, int radix)
        // 원하는 진수로 계산
        System.out.println("Short.valueOf(String s, int radix) : " + Short.valueOf("12",16));
    }
}