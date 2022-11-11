package TeamNova_공부;

public class 자료형_Boolean {
    public static void main(String[] args) {
        //Boolean Constructor, Object
        Boolean a = new Boolean(true);
        System.out.println("a : " + a);

        Boolean b = true;
        System.out.println("b : " + b);

        Boolean c = new Boolean("true");
        System.out.println("c : " + c);

        Boolean d = new Boolean("hello");
        System.out.println("d : " + d);

        Boolean e = new Boolean("false");
        System.out.println("e : " + e);

        // primitive type
        boolean a1 = true;

        // Boolean Method
        Boolean test = true;
        Boolean test1 = false;

        // 1. booleanValue()
        System.out.println("test.booleanValue() : " + test.booleanValue());
        test.toString(); // 가능 instance이므로
        boolean test2 = test.booleanValue();
        // test.booleanValue().toString() 불가능함 왜? instance가 아닌 원시 boolean이므로

        // 2. compare(Boolean x, Boolean y)
        // x == y 0 / !x && y -1 / x && !y 1
        System.out.println("Boolean.compare(boolean x, boolean y) : x == y : " + Boolean.compare(test,test));
        System.out.println("Boolean.compare(boolean x, boolean y) : !x && y : " + Boolean.compare(test1,test));
        System.out.println("Boolean.compare(boolean x, boolean y) : x && !y : " + Boolean.compare(test,test1));

        // 3. compareTo(Boolean b)
        // 같은 boolean 값을 가지는 경우 0 / true - false : 1 / false - true : -1
        System.out.println("test.compareTo(boolean x) : " + test.compareTo(test));
        System.out.println("test.compareTo(test1) : " + test.compareTo(test1));
        System.out.println("test1.compareTo(test) : " + test1.compareTo(test));

        // 4. equals (Object obj)
        // 동일한 boolean 값일때만 true, 나머지는 false
        System.out.println("test.equals(true) : " + test.equals(true));
        System.out.println("test.equals(false) : "+ test.equals(false));
        System.out.println("test.equals(1231) : " +test.equals(12321));

        // 5. getBoolean (String name)
        // 문자열 "true"와 동일한 경우에만 true
        System.out.println("Boolean.getBoolean(\"true\") : " + Boolean.getBoolean("true"));
        System.out.println("Boolean.getBoolean(\"false\") : " + Boolean.getBoolean("false"));
        System.out.println("Boolean.getBoolean(\"hello\") : " + Boolean.getBoolean("hello"));

        // 6. hashCode()
        // true 인경우 1231, false인 경우 1237
        System.out.println("test.hashCode() : " + test.hashCode());

        // 7. hashCode(boolean value)
        System.out.println("Boolean.hashCode(false) : " + Boolean.hashCode(test1));
        System.out.println("Boolean.hashCode(true) : " + Boolean.hashCode(test));

        // 8. logicalAnd(boolean a, boolean b)
        // And 연산
        System.out.println("Boolean.logicalAnd(true,false) : " + Boolean.logicalAnd(test,test1));
        System.out.println("Boolean.logicalAnd(true,true) : " + Boolean.logicalAnd(test,test));
        System.out.println("Boolean.logicalAnd(false,false) : " + Boolean.logicalAnd(test1,test1));

        // 9. logicalOr(boolean a, boolean b)
        // Or 연산
        System.out.println("Boolean.logicalOr(true,false) : " + Boolean.logicalOr(test,test1));
        System.out.println("Boolean.logicalOr(true,true) : " + Boolean.logicalOr(test,test));
        System.out.println("Boolean.logicalOr(false,true) : " + Boolean.logicalOr(test1,test));
        System.out.println("Boolean.logicalOr(false,false) : " + Boolean.logicalOr(test1,test1));

        // 10. logicalXor(boolean a, boolean b)
        // Xor 연산
        System.out.println("Boolean.logicalXor(true,false) : " + Boolean.logicalXor(test,test1));
        System.out.println("Boolean.logicalXor(true,true) : " + Boolean.logicalXor(test,test));
        System.out.println("Boolean.logicalXor(false,false) : " + Boolean.logicalXor(test1,test1));
        System.out.println("Boolean.logicalXor(false,true) : " + Boolean.logicalXor(test1,test));

        // 11. pasreBoolean(String s)
        // 문자열 불리언으로 변경 "true" = true / "false" = false
        System.out.println("Boolean.parseBoolean(\"true\") : " + Boolean.parseBoolean("true"));
        System.out.println("Boolean.parseBoolean(\"false\") : " + Boolean.parseBoolean("false"));
        System.out.println("Boolean.parseBoolean(\"안녕하세요\") : " + Boolean.parseBoolean("안녕하세요"));

        // 12. toString()
        // 문자열로 변경
        System.out.println("test.toString() : " + test.toString());
        System.out.println("test1.toString() : " + test1.toString());

        // 13. valueOf(boolean b)
        // Boolean instance return 해서 Boolean 메소드 사용가능
        System.out.println("Boolean.valueOf(true).equals(false) : " + Boolean.valueOf(true).equals(false));

        // 14. valueOf(String s)
        // Boolean instance return 해서 Boolean 메소드 사용가능
        System.out.println("Boolean.valueOf(\"안녕하세요\").booleanValue() : " + Boolean.valueOf("안녕하세요").booleanValue());
    }
}
