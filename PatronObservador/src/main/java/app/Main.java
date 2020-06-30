package app;

public class Main {

    public static void main(String[] args) {
        ObservableClass observado = new ObservableClass();
        ObserverClass observador = new ObserverClass();

        observado.addObserver(observador);

        observado.cambiarMensaje("Cambio 1");
        observado.cambiarMensaje("Cambio 2");
        observado.cambiarMensaje("Cambio 3");
    }
}