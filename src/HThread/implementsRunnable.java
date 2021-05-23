package HThread;

public class implementsRunnable {
    public static class MyThread implements Runnable{
        @Override
        public void run() {
            System.out.println("Mythread");
        }
    }
    public static class MyThread2 implements Runnable{
        @Override
        public void run() {
            System.out.println("ddd");
        }
    }
    public static void main(String[] args) {
        new Thread(new MyThread()).start();
        new Thread(()->{
            System.out.println("java8");
        }).start();
        new Thread(()->{
            System.out.println("huyihang");
        }).start();
        new Thread(()->{
            System.out.println("ddd");
        }).start();
    }
}
