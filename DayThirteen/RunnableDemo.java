package DayThirteen;

public class RunnableDemo {
    public static void main(String[] args) {

        UsingRunnable obj = new UsingRunnable(20, 10, "Hello");

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable with Anonymous Class");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        runnable = () -> {
            System.out.println("Runnable with Lambda Expression");
        };

        new Thread(runnable).start();
    }System.out.println("----------------------------------------------------------");

    int n = 5;runnable=()->
    {
        for (int i = 1; i <= n; i++) {
            System.out.println("Loop Iteration " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Task Interrupted");
            }
        }
    };new Thread(runnable).start();
}
