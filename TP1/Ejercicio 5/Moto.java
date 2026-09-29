class Moto extends Vehiculo{
  private double tarifa;

  public Moto(String marca, String patente, String color, double tarifa){
    super(marca,patente,color);
    this.tarifa = tarifa;
  }

  public double getTarifa(){
    return tarifa;
  }

  public void setTarifa(double tarifa){
    this.tarifa = tarifa;
  }

  @Override

  public double calcularAlquiler(int dias){
    return tarifa * dias;
  }
  
}
