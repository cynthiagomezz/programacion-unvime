import java.util.ArrayList;

public class Main{
  public static void main (String[] args) {
    EmpleadoPlanta emiliano = new EmpleadoPlanta("Emiliano", "Perez", 37654982, 400, 2 );
  EmpleadoPlanta ismael = new EmpleadoPlanta("Ismael", "Gomez", 56893652, 450, 3);
  EmpleadoContratado nicolas = new EmpleadoContratado("Nicolas", "Gutierrez", 78392027, 15, 8);
  EmpleadoContratado mauricio = new EmpleadoContratado("Mauricio", "Guzman", 67092635, 25, 17);


  ArrayList<Empleado> empleados = new ArrayList<>();
  empleados.add(emiliano);
  empleados.add(ismael);
  empleados.add(nicolas);
  empleados.add(mauricio);

  for(Empleado empleado: empleados){
    System.out.println("Nombre: " + empleado.getNombre());
    System.out.println("Sueldo: $" + empleado.calcularSueldo());
  }

  }
}
