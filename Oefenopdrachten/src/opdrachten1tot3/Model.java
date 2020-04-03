package opdrachten1tot3;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Observable;

public class Model extends Observable {
    int counter = 0;
    private PropertyChangeSupport pcs = new PropertyChangeSupport(this);
    public Model() {

    }
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        this.pcs.addPropertyChangeListener(listener);
    }
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        this.pcs.removePropertyChangeListener(listener);
    }
    public void increase(){
        int oldvalue = counter;
        counter++;

        this.pcs.firePropertyChange("counter", oldvalue, counter);
    }
    public Integer getCounter() {
        return counter;
    }
}
