package app;

public class CarroEstandar implements Automovil {
    
    private String nombreCarro;
    
    public CarroEstandar(String nombre){
        nombreCarro = nombre;
    }

    @Override
    public void acelerar() {
        System.out.println("Automovil Estandar Avanzando");
    }

    @Override
    public void frenar() {
        System.out.println("Automovil Estandar Detenido");
    }

    @Override
    public void encender() {
        System.out.println("Automovil Estandar Encendido");
    }
    
}