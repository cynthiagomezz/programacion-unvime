abstract class Vehiculo{
  private String marca;
  private String patente;
  private String color;

  //Constructor

  public Vehiculo(String marca, String patente, String color){
    this.marca = marca;
    this.patente = patente;
    this.color = color;
  }

  //Getters and Setters

  public String getMarca(){
    return marca;
  }

  public void setMarca(String marca){
    this.marca = marca;
  }

  public String getPatente(){
    return patente;
  }

  public void setPatente(String patente){
    this.patente = patente;
  }

  public String getColor(){
    return color;
  }

  public void setColor(String color){
    this.color = color;
  }

  //Metodos

  public abstract double calcularAlquiler(int dias);
}
