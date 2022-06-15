package test;

import classes.TaskSearchText;

public class Main {
    public static void main(String[] args) {
        String name = "Dan";
        Thread threadSignature1 = new Thread(new TaskSearchText("assinaturas1.txt", name));
        Thread threadSignature2 = new Thread(new TaskSearchText("assinaturas2.txt", name));
        Thread authors = new Thread(new TaskSearchText("autores.txt", name));

        threadSignature1.start();
        threadSignature2.start();
        authors.start();
    }
}
