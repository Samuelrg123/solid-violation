package Principal;

import Envio.Envio;
import Envio.Internacional;
import Envio.Municipal;

public class Principal {

    public static void main(String[] args) {

    /*Envio[] envios = {
        new Municipal(5000),
        new Internacional(25000)
    };
     */
        //Correccion
        Envio[] envios = {
                new Municipal(),
                new Internacional()
        };

        imprimirTiempoDeEnvio(envios);
    }

    public static void imprimirTiempoDeEnvio(Envio[] envios) {
        for (Envio envio : envios) {
            System.out.println(envio.obtenerTiempoDeEnvio());
            System.out.println(envio.obtenerPrecio());
        }
    }
}

