package opdrachten1tot3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Controller extends JPanel implements PropertyChangeListener {
    JButton clickButton;
    private View view;
    private Model model;

    public Controller() {
        model = new Model();
        model.addPropertyChangeListener(this);
        view = new View();
        this.add(view);

        clickButton = new JButton("+1");
        clickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.increase();
            }
        });
        this.add(clickButton);
    }
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if(evt.getPropertyName().equals("counter")) {
            view.setDisplay(evt.getNewValue().toString());
        }
    }
}

