package neicunmoxing;


import java.util.concurrent.CountDownLatch;

public class countdownlatchdemo {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch startSignal = new CountDownLatch(1);
        CountDownLatch doneSignal = new CountDownLatch(5);
        for (int i = 0;i<5;i++)
        {
            new Thread(new Worker(startSignal,doneSignal)).start();
        }

        startSignal.countDown();
        System.out.println("yyy");
        doneSignal.await();
        System.out.println("fff");
    }
    static class Worker implements Runnable{
        private final CountDownLatch startSignal;
        private final CountDownLatch doneSignal;

        Worker(CountDownLatch startSignal,CountDownLatch doneSignal)
        {
            this.doneSignal = doneSignal;
            this.startSignal = startSignal;
        }
        @Override
        public void run() {
            try
            {
                startSignal.await();
                System.out.println("hhh");
                doneSignal.countDown();
            }catch (InterruptedException ex){

            }
        }
    }

}
