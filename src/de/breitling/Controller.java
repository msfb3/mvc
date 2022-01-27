package de.breitling;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        initiActions();



    }
    public void initiActions() {
        view.getCmdIncrement().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.increment();
                view.getTxtCounter().setText(String.valueOf(model.getCounter()));
            }
        });
    }
}
