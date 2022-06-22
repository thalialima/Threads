package bathroom;

public class TaskCleaning implements Runnable {

    private Bathroom bathroom;
    public TaskCleaning(Bathroom bathroom) {
        this.bathroom = bathroom;
    }

    @Override
    public void run() {
        while (true){
            bathroom.cleaning();
            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

