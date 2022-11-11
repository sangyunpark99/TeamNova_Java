package TeamNova_4주차예제;

public class 쓰레드연습 {

    static int num;

    public static void main(String[] args) {
        thread1 th = new thread1();
        th.start();

        thread1 th2 = new thread1();
        th2.start();
    }
}
