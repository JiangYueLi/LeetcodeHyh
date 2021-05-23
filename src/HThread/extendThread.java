package HThread;

public class extendThread {
    public static class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println("MyThread");
        }
    }

    public static class MyThread2 extends Thread{
        @Override
        public void run(){
            System.out.println("fff");
        }
    }
    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.start();
        Thread thread1 = new MyThread2();
        thread1.start();
    }
}
