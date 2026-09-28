import java.util.ArrayList;

class Materia{
  private String nombre;
  private int codigo;
  private int creditos;
  private double calificacion;

  public Materia(){} ;

  public Materia(String nombre){
    this.nombre = nombre;
  }

  public Materia(String nombre, int codigo,int creditos, double calificacion){

    this.nombre = nombre;
    this.codigo = codigo;
    this.creditos = creditos;
    this.calificacion = calificacion;
  }

  //Getter and Setters

  public String getNombre(){
    return nombre;
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public int getCodigo(){
    return codigo;
  }

  public void setCodigo(int codigo){
    this.codigo = codigo;
  }

  public int getCreditos(){
    return creditos;
  }

  public void setCreditos(int creditos){
    this.creditos = creditos;
  }

  public double getCalificacion(){
    return calificacion;
  }

  public void setCalificacion(double calificacion){

    this.calificacion = calificacion;

  }

}
