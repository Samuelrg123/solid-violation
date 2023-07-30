public class Principal {

  public static void main(String[] args) {
    /*
    Envio[] envios = {
        new Envio("Municipal",5000),
        new Envio("Internacional",25000)
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

      /*if(coche.tipo.equals("Municipal")) System.out.println("Tiempo envio 12 horas");
      if(coche.tipo.equals("Internacional")) System.out.println("Tiempo envio 190 horas");
       */
    }
  }
}
