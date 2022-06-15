import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionButton implements ActionListener {

    Thread threadCalc = new Thread();

    private JTextField first;
    private JTextField second;
    private JLabel result;

    public ActionButton(JTextField first, JTextField second, JLabel result) {
        this.first = first;
        this.second = second;
        this.result = result;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        TaskMultipliesNumber task = new TaskMultipliesNumber(first, second, result);

        Thread threadCalc = new Thread(task, "Calculadora");
        threadCalc.start();

    }
}
