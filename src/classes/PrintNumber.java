package classes;

public class PrintNumber extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            System.out.println(i);
            System.out.println("Thread id: " + this.getId());
        }
    }
}
