package app;

public class Main {

    public static void main(String[] args) {
        Automovil carro = new CarroElectrico(new CarroEstandar("Chevy"));
        carro.encender();
        carro.acelerar();
        carro.frenar();
    }    
}