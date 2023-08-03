package Envio;

public class Municipal extends Envio {

    public Municipal() {
        this.precio = 5000;
    }

    @Override
    public String obtenerTiempoDeEnvio() {
        return "Tiempo envio 12 horas";
    }

    public int obtenerPrecio() {
        return this.precio;
    }

    /*@Override
    public boolean permitidoEnAvion() {
        return false;
    }*/
}

//Eliminar perimitirdo,rastrear,cargar (?)

