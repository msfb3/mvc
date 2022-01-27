package de.breitling;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame{
    private JTextField txtCounter;
    private JButton cmdIncrement;

    public View() {
        this.setLayout(new FlowLayout());

        this.txtCounter = new JTextField(3);
        txtCounter.setEditable(false);
        this.cmdIncrement = new JButton("+1");

        this.add(txtCounter);
        this.add(cmdIncrement);

        this.setVisible(true);
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);


    }
    public JButton getCmdIncrement() {
        return cmdIncrement;
    }
    public JTextField getTxtCounter() {
        return txtCounter;
    }
}
