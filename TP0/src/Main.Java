public class Main {
    public static void main(String[] args) {
      Estudiante[] estudiantes = new Estudiante[3];
        estudiantes[0] = new Estudiante(
            "Cindy", "Gomez", 20, "Programacion", 9.5
        );

        estudiantes[1] = new Estudiante();
        estudiantes[1].nombre = "Ismael";
        estudiantes[1].apellido = "Gomez";
        estudiantes[1].edad = 21;
        estudiantes[1].carrera = "Logistica";
        estudiantes[1].promedio = 10;

        estudiantes[2] = new Estudiante("Yazmin", "Mora", 18, "Enfermeria", 7.5);

        Estudiante.mostrarDatos(estudiantes);
    }
}
