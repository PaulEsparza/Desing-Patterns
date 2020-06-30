package app;

public class CarroElectrico extends AutomovilDecorator {

    public CarroElectrico(Automovil auto) {
        super(auto);
    }

    @Override
    public void acelerar() {
        System.out.println("Automovil Electrico Iniciando Sistema");
        getAuto().acelerar();
    }

    @Override
    public void frenar() {
        System.out.println("Automovil Detenido A Traves De Frenos Electricos");
        getAuto().frenar();
    }

    @Override
    public void encender() {
        getAuto().encender();
        System.out.println("Automovil Encendido De Forma Electricamente");
    }
}