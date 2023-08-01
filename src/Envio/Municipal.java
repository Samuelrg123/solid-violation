package Envio;

public class Municipal extends Envio{
    public Municipal(Integer precio) {
        super(precio);
    }

    @Override
    public String tiempoDeEnvio() {
        return "Tiempo envio 12 horas";
    }

    /*@Override
    public void cargarMercancia() {
    }*/

    /*@Override
    public void rastrearPaquete() {

    }*/

    /*@Override
    public boolean permitidoEnAvion() {
        return false;
    }*/
}

//Eliminar perimitirdo,rastrear,cargar (?)

