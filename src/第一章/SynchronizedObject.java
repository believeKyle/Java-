package 第一章;

public class SynchronizedObject{
    synchronized public void printString() {
        System.out.println("begin");
        if (Thread.currentThread().getName().equals("a")){
            Thread.currentThread().suspend();
        }
            System.out.println("a线程永远suspend了!");
            /*try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }*/


            try {
                for(int i = 0;i<10;i++){
                    System.out.println("当前线程："+Thread.currentThread().getName()+"----"+i++);
                    Thread.sleep(1000);
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }


    }
}


