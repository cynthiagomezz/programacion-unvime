import java.util.ArrayList;
class Universidad{
  private String nombre;
  private String direccion;
  private ArrayList<Estudiante> estudiantes;


  public Universidad(String nombre, String direccion){
    this.nombre = nombre;
    this.direccion = direccion;
    this.estudiantes = new ArrayList<>();
    
  }

  //Metodo 

  public void agregarEstudiante(Estudiante estudiantes){
    this.estudiantes.add(estudiantes);
  }

}
