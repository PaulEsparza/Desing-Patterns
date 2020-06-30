package app;

import java.util.Observable;
import java.util.Observer;

public class ObserverClass implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Nueva Actualizacion: " + o + " -> " + arg);
    }
}