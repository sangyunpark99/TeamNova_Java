package TeamNova_공부;

public class 자료형_Double {
    public static void main(String[] args) {
        // Constructor
        Double a = 13.0;
        System.out.println(a);

        Double b = (double) 13;
        System.out.println(b);

        // primitive
        double a1 = 2132.23213213;
        System.out.println(a1);

        // method

        // byteValue()
        // double -> byte 전환
        System.out.println("a.byteValue() : " + a.byteValue());

        // compare(double d1, double d2)
        // x == y : 0 / x < y : -1 : x > y : 1
        System.out.println("Double.compare() : " + Double.compare(125.232,124.123));

        // compareTo(Double anotherDouble)
        System.out.println("a.compareTo(123.3213) : " + a.compareTo(123.3123));

        // doubleToLongBits(double value)
        System.out.println("Double.doubleToLongBits(123.123123) : " + Double.doubleToLongBits(123.123));

        // doubleToRawLongBits(double value)
        System.out.println("Double.doubleToRawLongBits(123.123123) : " + Double.doubleToRawLongBits(213.123213));

        // doubleValue()
        // instance -> primitive type double값 추출
        System.out.println("a.doubleValue() : " + a.doubleValue());

        // equals(Object obj)
        System.out.println("a.equals(Object obj) : " + a.equals(123));

        // floatValue()
        // long -> float
        System.out.println("a.floatValue : " + a.floatValue());

        // hashCode()
        // intValue()랑 같은 값을 가진다
        System.out.println("a.hashCode() : " + a.hashCode());

        // intValue()
        // long -> int
        System.out.println("a.intValue() : " + a.intValue());

        // isInfinite()
        // 무한대 판별
        System.out.println("a.isInfinite() : " + a.isInfinite());
        Double inf = Double.POSITIVE_INFINITY;
        System.out.println("inf.isInfinite() : " + inf.isInfinite());

        // isInfinite(double v)
        System.out.println("Double.isInfinite(double v) : " + a.isInfinite(Double.POSITIVE_INFINITY));

        // isNaN()
        System.out.println("a.isNaN() : " + a.isNaN());

        // isNaN(double V)
        System.out.println("Double.isNaN(123.123) : " + Double.isNaN(123.123));

        // longBitstoDouble(long bits)
        // longBits -> Double
        System.out.println("Double.longBitstoDouble : " + Double.longBitsToDouble(121232));

        // longValue()
        // Long instance -> long value 추출
        System.out.println("a.longValue() : " + a.longValue());

        // parseDouble(String s)
        // String -> Double
        System.out.println("Double.parseDouble(String s) : " + Double.parseDouble("123.123"));

        // shortValue()
        // Double -> short
        System.out.println("a.shortValue() : " + a.shortValue());

        // toHexString(double d)
        // double -> 16진수로 변환
        System.out.println("Double.toHexString(double d) : " + Double.toHexString(123.3123));

        // toString()
        // Double obj -> string 변환
        System.out.println("a.toString() : " + a.toString());
        System.out.println(a.toString() instanceof String);

        // to String(dobule d)
        // double -> string 변환
        System.out.println("Double.toString(double d) : " + Double.toString(123.12312));
        System.out.println(Double.toString(123.12312) instanceof String);

        // valueOf(double d)
        System.out.println("Double.valueOf(123.123) : " + Double.valueOf(123.123));
        // instance여서 method 사용 가능
        System.out.println(Double.valueOf(123.123).floatValue());

        // valueOf(String s)
        System.out.println("Double.valuOf(\"123.123123\") : " + Double.valueOf("123.123123"));
        // String s를 class Double의 instance 변환
        System.out.println(Double.valueOf("123.123123").doubleValue());
    }
}
