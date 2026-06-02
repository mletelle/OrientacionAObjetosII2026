package unrn.clima;

public class Main {
    public static void main(String[] args) {
        Medidor medidor = new Medidor(new WeatherChannelService());
        medidor.agregarObservador(new ObservadorConsola());
        medidor.agregarObservador(new ObservadorArchivo());
        medidor.leerTemperatura();
    }
}
