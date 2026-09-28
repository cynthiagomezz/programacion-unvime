import java.util.ArrayList;
class Carrera{
  private String nombre;
  private ArrayList<Estudiante> estudiantes; 

  public Carrera(){};

  public Carrera(String nombre){
    this.nombre = nombre;
    this.estudiantes = new ArrayList<>();
  }

  //Metodos 

  public int size(){
    return estudiantes.size();
  }

  public void agregarEstudiante(Estudiante estudiante){
    this.estudiantes.add(estudiante);
  }

  public void listarEstudiante(){
    if(estudiantes.size() > 0){
      for(Estudiante estudiante : estudiantes){
      System.out.println("Nombre: " + estudiante.getNombre());
      System.out.println("Carrera: " + estudiante.getCarrera());
    }
    }
    else{
      System.out.println("Aun no hay estudiantes agregados.");
    }
    
  }

  public void buscarEstudiantes(String nombre){
    boolean encontrado = false;
    for(Estudiante estudiante: estudiantes){
      if(nombre.equals(estudiante.getNombre())){
      System.out.println("Nombre: " + estudiante.getNombre());
      System.out.println("Carrera: " + estudiante.getCarrera());
      encontrado = true;
    }
    }
    if(!encontrado){
      System.out.println("No se ha encontrado el estudiante");
    }
  }


  
}
