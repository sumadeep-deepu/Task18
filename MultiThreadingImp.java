package Task17;
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getId() + " - Count: " + i);

            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class MultiThreadingImp {
    public static void main(String[] args)throws Exception {
        
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        
        thread1.start();
        thread1.interrupt();
        thread1.join();
        System.out.println("exit");
        thread2.start();
        thread2.interrupt();
        thread2.join();
        System.out.println("execution completed");

    }
}
