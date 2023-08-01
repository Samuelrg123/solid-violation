package Envio;

public class Internacional extends Envio implements IpermitidoAV{
    private int minPrecioEnvio = 100;
    public Internacional(Integer precio) {
        super(precio);
    }
    @Override
    public String tiempoDeEnvio() {
        return "Tiempo envio 190 horas";
    }

    @Override
    public boolean permitidoEnAvion() {
        if (this.tipo.equals("Envio.Internacional")) {
            if (this.precio < 100) {
                return true;
            } else {
                return false;
            }
        }
        throw new IllegalArgumentException("no es posible cargar en avion un envio que no sea internacional");
    }

    /*@Override
    public void cargarMercancia() {
    }*/

    /*@Override
    public void rastrearPaquete() {
    }*/

    /*@Override
    public boolean permitidoEnAvion() {
        if (this.precio < minPrecioEnvio){
            return true;
        }else {
            return false;
        }
    }*/
}

//Eliminar reatrear, permitido y cargar (?)
