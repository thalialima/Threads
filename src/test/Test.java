package test;


import classes.PrintString;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("This is the main thread");

        //Thread.sleep(30000);

        System.out.println("30s has past");

        Thread printStringTask = new PrintString();
        printStringTask.start();

        Thread newThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("New thread");
            }
        });

        newThread.start();

    }
}
