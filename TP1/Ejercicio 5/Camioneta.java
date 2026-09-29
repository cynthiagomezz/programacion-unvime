class Camioneta extends Vehiculo {
  private double tarifa;
  public Camioneta(String marca, String patente, String color, double tarifa){
    super(marca,patente,color);
    this.tarifa = tarifa;
  }

  @Override 

  public double calcularAlquiler(int dias){
    return tarifa * dias;
  }
}
