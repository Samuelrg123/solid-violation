package Envio;


public class Internacional extends Envio {
    public Internacional() {
        this.precio = 25000;
    }

    @Override
    public String obtenerTiempoDeEnvio() {
        return "Tiempo envio 190 horas";
    }

    public int obtenerPrecio() {
        return this.precio;
    }
}
