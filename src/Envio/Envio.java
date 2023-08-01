package Envio;
public abstract class Envio implements IEnvio, IpermitidoAV {
  public abstract String tiempoDeEnvio();
  Integer precio;
  String tipo;
  Envio(Integer precio) {
    this.precio = precio;
  }

  Envio(String tipo, Integer precio) {
    this.tipo = tipo;
    this.precio = precio;
  }

  String getTipoEnvio() {
    return this.tipo;
  }


  @Override
  public void cargarMercancia() {
    //Cargando mercancia
  }

  @Override
  public void rastrearPaquete() {
    //rastreando paquete
  }

  /*@Override
  public boolean permitidoEnAvion() {
    if (this.tipo.equals("Envio.Internacional")) {
      if (this.precio < 100) {
        return true;
      } else {
        return false;
      }
    }
    throw new IllegalArgumentException("no es posible cargar en avion un envio que no sea internacional");
  }*/
}