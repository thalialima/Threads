package bathroom;

public class TaskNumb1 implements Runnable {

    private Bathroom bathroom;

    public TaskNumb1(Bathroom bathroom) {
        this.bathroom = bathroom;
    }

    @Override
    public void run() {
        bathroom.fazendoNumero1();
    }
}


