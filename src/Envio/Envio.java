package Envio;

public abstract class Envio implements IEnvio {
  public abstract String tiempoDeEnvio();
  Integer precio;
  Envio(Integer precio) {
    this.precio = precio;
  }

 /* String tipo;
  Integer precio;

  Envio.Envio(String tipo, Integer precio) {
    this.tipo = tipo;
    this.precio = precio;
  }

  String getTipoEnvio() {
    return this.tipo;
  }

  void crearTipoEnvio(Envio.Envio envio) {
    //Save Envio.Envio DB
  }
  */
  /* @Override
  public void cargarMercancia() {
    //Cargando mercancia
  }

  @Override
  public void rastrearPaquete() {
    //rastreando paquete
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
   */
}