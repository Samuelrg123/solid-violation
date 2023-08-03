package Principal;

import Envio.Envio;
import Envio.Internacional;
import Envio.Municipal;

public class Principal {

    public static void main(String[] args) {

        Envio[] envios = {
                new Municipal(),
                new Internacional()
        };

        imprimirTiempoDeEnvio(envios);
        imprimirPrecioEnvio(envios);
    }

    public static void imprimirTiempoDeEnvio(Envio[] envios) {
        for (Envio envio : envios) {
            System.out.println(envio.obtenerTiempoDeEnvio());
        }
    }

    public static void imprimirPrecioEnvio(Envio[] envios){
        for (Envio envio : envios) {
            System.out.println(envio.obtenerPrecio());
        }
    }
}

