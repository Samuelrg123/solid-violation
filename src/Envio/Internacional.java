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

    /*@Override
    public boolean permitidoEnAvion() {
        return true;
    }
     */
    /*@Override
    public void cargarMercancia() {
    }*/

    /*@Override
    public void rastrearPaquete() {
    }*/

    /*@Override
    public boolean permitidoEnAvion() {
        if (this.precio < maxPrecioEnvio){
            return true;
        }else {
            return false;
        }
    }*/
}

//Eliminar reatrear, permitido y cargar (?)
