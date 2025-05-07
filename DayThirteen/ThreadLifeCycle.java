package DayThirteen;

public class ThreadLifeCycle {
    public static void main(String[] args) {

        MyChildThread myThread = new MyChildThread();
        System.out.println("Before Runnable stage Thread is alive or not?" + myThread.isAlive());
        myThread.start();

        System.out.println("In Running stage Thread is alive or not?" + myThread.isAlive());

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println("Thread is interupped");
        }

        System.out.println("After complete execution Thread is alive or not?" + myThread.isAlive());

    }

}
