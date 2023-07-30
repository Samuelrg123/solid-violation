package Principal;
import Envio.Envio;
import Envio.Internacional;
import Envio.Municipal;
public class Principal {

  public static void main(String[] args) {
    /*
    Envio.Envio[] envios = {
        new Envio.Envio("Envio.Municipal",5000),
        new Envio.Envio("Envio.Internacional",25000)
    };
     */

    Envio[] envios = {
        new Municipal(5000),
        new Internacional(25000)
    };
    imprimirTiempoDeEnvio(envios);
    //imprimirTiempoDeEnvio(envios);
  }

  public static void imprimirTiempoDeEnvio(Envio[] envios){
    for (Envio coche : envios) {
      System.out.println(coche.tiempoDeEnvio());

      /*if(coche.tipo.equals("Envio.Municipal")) System.out.println("Tiempo envio 12 horas");
      if(coche.tipo.equals("Envio.Internacional")) System.out.println("Tiempo envio 190 horas");
       */
    }
  }
}
