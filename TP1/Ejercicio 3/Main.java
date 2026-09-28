public class Main{
  public static void main (String[] args) {
    EmpleadoPlanta emiliano = new EmpleadoPlanta("Emiliano", "Perez", 37654982, 400, 2 );
  EmpleadoPlanta ismael = new EmpleadoPlanta("Ismael", "Gomez", 56893652, 450, 3);
  EmpleadoContratado nicolas = new EmpleadoContratado("Nicolas", "Gutierrez", 78392027, 15, 8);
  EmpleadoContratado mauricio = new EmpleadoContratado("Mauricio", "Guzman", 67092635, 25, 17);
System.out.println("El sueldo de ismael es $" + ismael.calcularSueldo());
System.out.println("El sueldo de Nicolas es $" + nicolas.calcularSueldo());
System.out.println("El sueldo de Emiliano es $" + emiliano.calcularSueldo());
System.out.println("El sueldo de Mauricio es $" + mauricio.calcularSueldo());

  }
}
