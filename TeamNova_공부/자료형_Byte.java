package TeamNova_공부;

public class 자료형_Byte {
    public static void main(String[] args) {

        // Byte(String s)
        Byte a = (byte) 'A';
        Byte b = (byte) 'A';
        // 문자열은 byte화 할 수 없다.

        // Byte(byte value)
        Byte c = new Byte((byte)127);
        Byte d = (byte) 127;

        // Primitive
        byte a1 = (byte)'A';

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);


        // Byte Method

        // byteValue()
        System.out.println("a.byteValue() : "+ a.byteValue());
        // instance a에서 순수 byte 값 가져오기

        // compare
        // x == y : 0, x < y : x에서 y를 뺀 값 , x > y : x에서 y를 뺀 값
        System.out.println("Byte.compare(byte x, byte y) : " + Byte.compare(a,c));

        // compareTo
        // compare와 같은 조건
        System.out.println("a.compareTo(Byte anotherByte) : " + a.compareTo(b));
        System.out.println("a.compareTo(Byte anotherByte) : " + a.compareTo(c));

         // decode
         //
         String s1 = "32";
         System.out.println("Byte.decode(String nm) : " + Byte.decode(s1));

        // doubleValue
        // byte 값을 double 값으로 변환
        System.out.println("a.doubleValue() : " + a.doubleValue());

        // equals(Object obj)
        System.out.println("a.equals(Object obj) : " + a.equals("hello"));
        System.out.println("a.equals(Object obj) : " + a.equals(123));
        System.out.println("a.equals(Object obj) : " + a.equals(b));

        // floatValue()
        // byte 값을 float로 변환
        System.out.println("a.floatValue() : " + a.floatValue());

        // hashCode()
        // intValue()와 같은 값을 가진다.
        System.out.println("Byte.hashCode() : " + Byte.hashCode((byte)123));
        System.out.println("Byte.hashCode() : " + Byte.hashCode((byte) 'a'));

        // intValue()
        // byte 값을 int로 변환
        System.out.println("a.intValue() : " + a.intValue());
        System.out.println("a.intValue() + 2 : " + a.intValue() + 2);

        // longValue()
        // byte 값을 long으로 변환
        System.out.println("a.longValue() : " + a.longValue());
        System.out.println(a.longValue() + 4); // long형으로 변환되어 덧셈이 가능하다.

        // parseByte(String s)
        // String을 10진법 byte로 변환
        String s2 = "13";
        System.out.println("Byte.parseByte(String s) : " + Byte.parseByte(s2));

        // parseByte(String s, int radix)
        // radix : 기수
        // String을 radix 진법 byte로 변환
        System.out.println("parseByte(String s, int index) : " + Byte.parseByte(s2,8));
        System.out.println("parseByte(String s, int index) : " + Byte.parseByte(s2,10));
        System.out.println("parseByte(String s, int index) : " + Byte.parseByte(s2,16));

        // shortValue()
        // Byte 값을 Short 형으로 변환
        System.out.println("a.shortValue() : " + a.shortValue());
        System.out.println(a.shortValue() + 4); // short 형으로 변환되어 덧셈이 가능하다.

        // toString()
        // Byte object ->  String 객체로 변환
        System.out.println("a.toString() : " + a.toString());
        // 객체 확인 여부
        System.out.println("a.toString().indexOf('6')" + a.toString().indexOf('6'));

        // toString(byte b)
        // byte 값을 String 객체로 변환
        System.out.println("Byte.toString(byte b) : " + Byte.toString(a));
        System.out.println("Byte.toString(a).indexOf('5') : " + a.toString().indexOf('5'));

        // valueOf(String s)
        // String을 byte instance 로 변환시켜준다.
        System.out.println("Byte.valueOf(String s) : " + Byte.valueOf("23"));
        System.out.println(Byte.valueOf("23").compareTo(Byte.parseByte("23")));

        // valueOf(String s, int radix)
        // radix (진수에 따라 다르게 표현해준다.)
        System.out.println("Byte.valueOf(String s, int radix) : " + Byte.valueOf("45",16));
        System.out.println("Byte.valueOf(String s, int radix) : " + Byte.valueOf("45",10));
        System.out.println("Byte.valueOf(String s, int radix) : " + Byte.valueOf("45",8));
    }
}
