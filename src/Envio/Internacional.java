package Envio;

public class Internacional extends Envio{
    private int minPrecioEnvio = 100;
    public Internacional(Integer precio) {
        super(precio);
    }

    @Override
    public String tiempoDeEnvio() {
        return "Tiempo envio 190 horas";
    }

    @Override
    public void cargarMercancia() {

    }

    @Override
    public void rastrearPaquete() {

    }

    @Override
    public boolean permitidoEnAvion() {
        if (this.precio < minPrecioEnvio){
            return true;
        }else {
            return false;
        }
    }
}
