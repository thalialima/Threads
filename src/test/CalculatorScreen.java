package test;

import classes.ActionButton;

import javax.swing.*;

public class CalculatorScreen {
    public static void main(String[] args) {
        JFrame window = new JFrame("Late Multiplication");

        JTextField first = new JTextField(10);
        JTextField second = new JTextField(10);
        JButton button = new JButton(" = ");
        JLabel result = new JLabel("         ?           ");

        //when the button is hit the multiplier class is executed
        button.addActionListener(new ActionButton(first, second, result));

        JPanel painel = new JPanel();
        painel.add(first);
        painel.add(new JLabel("x"));
        painel.add(second);
        painel.add(button);
        painel.add(result);

        window.add(painel);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.setVisible(true);
    }
}
