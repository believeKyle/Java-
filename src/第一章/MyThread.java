package 第一章;

public class MyThread extends Thread{
    private long i = 0;

    public void setI(long i) {
        this.i = i;
    }

    public long getI() {
        return i;
    }

    @Override
     public void run() {
        while (true){
            i++;
        }
    }
}
