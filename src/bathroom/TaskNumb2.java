package bathroom;

public class TaskNumb2 implements Runnable {

    private Bathroom bathroom;

    public TaskNumb2(Bathroom bathroom) {
        this.bathroom = bathroom;
    }

    @Override
    public void run() {
        bathroom.fazendoNumero2();
    }
}


