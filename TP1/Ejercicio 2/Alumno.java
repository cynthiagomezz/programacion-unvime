class Alumno extends Persona{
  private int legajo;
  private double promedio;

//Constructores

public Alumno(String nombre,int dni, int legajo, double promedio){
  super(nombre, dni);
  this.legajo = legajo;
  this.promedio = promedio;
}

//Getters and Setters
  public int getLegajo(){
    return legajo;
  }

  public void setLegajo(int legajo){
    this.legajo = legajo;
  }

  public double getPromedio(){
    return promedio;
  }

  public void setPromedio(double promedio){
    this.promedio = promedio;
  }

  //Metodo 

  public void mostrarDatos(){
    super.mostrarDatos();
    System.out.println("Legajo: " + getLegajo());
    System.out.println("Promedio: " + getPromedio());
  }
  
}
