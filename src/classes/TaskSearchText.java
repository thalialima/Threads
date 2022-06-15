package classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TaskSearchText implements Runnable {
    private String fileName;
    private String name;

    public TaskSearchText(String fileName, String name) {
        this.fileName = fileName;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            Scanner scanner = new Scanner(new File(fileName));
            int numberLine = 1;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.toLowerCase().contains(name.toLowerCase())) {
                    System.out.println(fileName + " - " + numberLine + " - " + line);
                }
                numberLine++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
