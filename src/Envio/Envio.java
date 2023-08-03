package Envio;
public abstract class Envio{
  Integer precio;
  public abstract String obtenerTiempoDeEnvio();
  public abstract int obtenerPrecio();


 /* String tipo;
  Integer precio;


  Envio(String tipo, Integer precio) {
    this.tipo = tipo;
    this.precio = precio;
  }

  String getTipoEnvio() {
    return this.tipo;
  }

  void crearTipoEnvio(Envio envio) {
    //Save Envio DB
  }

  */
}