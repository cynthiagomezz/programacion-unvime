abstract class Empleado{
  private String nombre;
  private String apellido;
  private int dni;

  public Empleado(String nombre,String apellido, int dni){
    this.nombre = nombre;
    this.apellido = apellido;
    this.dni = dni;
  }

  public String getNombre(){
    return nombre;
  }

  public void setNombre( String nombre){
    if(!nombre.isBlank()){
      this.nombre = nombre;
    }
    else{
      System.out.println("Ingrese un nombre valido");
    }
  }

  public String getApellido(){
    return apellido;
  }

  public void setApellido(String apellido){
    if(!apellido.isBlank()){
      this.apellido = apellido;
    }
    else{
      System.out.println("Ingrese un apellido valido");
    }
  }

  public int getDni(){
    return dni;
  }

  public void setDni(int dni){
    this.dni = dni;
  }

  //metodos 

  public abstract double calcularSueldo();
}
