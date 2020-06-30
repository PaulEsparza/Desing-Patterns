package app;

import java.util.Observer;
import java.util.Observable;

public class ObservableClass extends Observable {
    String mensaje;
    
    public ObservableClass(){
        mensaje = "Objeto Observado Iniciado";
    }
    
    public void cambiarMensaje(String m){
        mensaje = m;
        //Marcamos el objeto observable como objeto que ha cambiado
        setChanged();
        //Notificamos a los observadores y le enviamos el nuevo valor
        notifyObservers(mensaje);
        //notifyObservers(); Este metodo solo notifica que hubo cambios en el objeto
    }
}