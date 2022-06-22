package test;

import bathroom.Bathroom;
import bathroom.TaskCleaning;
import bathroom.TaskNumb1;
import bathroom.TaskNumb2;

public class BathroomTest {
    public static void main(String[] args) {
        Bathroom bathroom = new Bathroom();
        Thread guest1 = new Thread(new TaskNumb1(bathroom), "João");

        Thread guest2 = new Thread(new TaskNumb2(bathroom), "Pedro");

        Thread cleaning = new Thread(new TaskCleaning(bathroom), "Limpeza");

        cleaning.setDaemon(true);

        guest1.start();
        guest2.start();
        cleaning.start();
    }
}
