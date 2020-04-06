package opdracht4;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Observable;
import java.util.Random;

public class Model extends Observable {
    String[] names = {"Jeffrey", "Jordan", "Dylan", "Bram", "Andy"};
    String chosenName = "";
    public Model() {

    }
    public void setName(){
        int randomNumber = new Random().nextInt(names.length);
        chosenName = names[randomNumber];
        setChanged();
        notifyObservers();
    }
    public String getName() {
        return chosenName;
    }
}
