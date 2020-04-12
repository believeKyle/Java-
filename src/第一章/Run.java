package 第一章;

public class Run {
    public static void main(String... args) throws InterruptedException{

        MyThread thread = new MyThread();
        thread.start();
        thread.sleep(1000);
        thread.suspend();
        thread.stop();
        System.out.println("main end!");

    }
}
