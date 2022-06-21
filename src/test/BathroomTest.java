package test;

import bathroom.Bathroom;
import bathroom.TaskNumb1;
import bathroom.TaskNumb2;

public class BathroomTest {
    public static void main(String[] args) {
        Bathroom bathroom = new Bathroom();
        Thread guest1 = new Thread(new TaskNumb1(bathroom), "João");

        Thread guest2 = new Thread(new TaskNumb2(bathroom), "Pedro");

        guest1.start();
        guest2.start();
    }
}
