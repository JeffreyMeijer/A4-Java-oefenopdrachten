package opdracht4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Observable;
import java.util.Observer;

public class Controller extends JPanel implements Observer {
    JButton clickButton;
    private View view;
    private Model model;

    public Controller() {
        model = new Model();
        model.addObserver(this);
        view = new View();
        this.add(view);

        clickButton = new JButton("Generate name");
        clickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setName();
            }
        });
        this.add(clickButton);
    }
    @Override
    public void update(Observable o, Object arg) {
        view.setDisplay(model.getName());
    }
}

