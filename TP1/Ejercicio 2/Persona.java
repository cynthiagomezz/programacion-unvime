class Persona{
  private String nombre;
  private int dni;


  public Persona(String nombre, int dni){
    setNombre(nombre);
    this.dni = dni;
  }

  public String getNombre(){
    return nombre;
  }

  public void setNombre(String nombre){
    if(!nombre.isBlank()){
      this.nombre = nombre;
    }
    else{
      System.out.println("Ingrese un nombre valido ");
    }
  }

  public int getDni(){
    return dni;
  }

  public void setDni(int dni){
    this.dni = dni;
  }

  //Metodos

  public void mostrarDatos(){
    System.out.println("Nombre:" + getNombre());
    System.out.println("Dni: " + getDni());
  }
}
