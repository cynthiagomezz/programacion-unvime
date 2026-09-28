import java.util.ArrayList;
class Estudiante{
  private String nombre;
  private String apellido;
  private int edad;
  private String carrera;
  private ArrayList<Materia> materias;

  public Estudiante(String nombre,String apellido,int edad, String carrera){
    setNombre(nombre);
    setApellido(apellido);
    setEdad(edad);
    this.carrera = carrera;
    this.materias = new ArrayList<>();
  }

  public Estudiante(){
    this.materias = new ArrayList<>();
  }

  public String getNombre(){
    return nombre;
  }

  public void  setNombre (String nombre){
    if(!nombre.isBlank()){
      this.nombre = nombre;
    }
    else{ 
      System.out.println("Ingrese un nombre valido.");
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
  
  public int getEdad(){
    return edad;
  }

  public void setEdad(int edad){
    if(edad > 16){
      this.edad = edad;
    }
    else{
      System.out.println("La edad debe ser mayor a 16");
    }
  }

  public String getCarrera(){
    return carrera;
  }

  public void setCarrera(String carrera){
    this.carrera = carrera;
  }
   
  //Metodo 

  public void agregarMateria(Materia materia){
    this.materias.add(materia);
  }

  public double calcularPromedio(){
    if (materias.isEmpty()) {
      return 0;
    }

    double resultado = 0;
    for(Materia materia: materias){
      resultado += materia.getCalificacion();
    }
    return resultado / materias.size();
  }
}
