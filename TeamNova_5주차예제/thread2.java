package TeamNova_5주차예제;

public class thread2 extends Thread{
    @Override
    public void run() {
        super.run();

        while(true){
            System.out.println("goodbye");
        }
    }
}
