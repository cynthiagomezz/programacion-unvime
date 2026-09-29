class AutoElectrico extends Vehiculo{
  private double tarifa;
  private double costoCargaPorDia;

  public AutoElectrico(String marca, String patente, String color, double tarifa, double costoCargaPorDia){
    super(marca,patente,color);
    this.tarifa = tarifa;
    this.costoCargaPorDia = costoCargaPorDia;
  }

  public double getTarifa(){
    return tarifa;
  }

  public void setTarifa(double tarifa){
    this.tarifa = tarifa;
  }

  public double getCostoCargaPorDia() {
    return costoCargaPorDia;
  }

  public void setCostoCargaPorDia(double costoCargaPorDia){
    this.costoCargaPorDia = costoCargaPorDia;
  }

  @Override

  public double calcularAlquiler(int dias){
    return ((tarifa * dias) + (costoCargaPorDia * dias));
  }
}
