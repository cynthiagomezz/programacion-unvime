class Auto extends Vehiculo{
  private int cantidadPuertas;
  private double tarifa;

  public Auto(String marca, String patente, String color, int cantidadPuertas,double tarifa){
    super(marca,patente,color);
    this.cantidadPuertas = cantidadPuertas;
    this.tarifa = tarifa;
  }

  public int getCantidadPuertas(){
    return cantidadPuertas;
  }

  public void setCantidadPuertas(int cantidadPuertas){
    this.cantidadPuertas = cantidadPuertas;
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
