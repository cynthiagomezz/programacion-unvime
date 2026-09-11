public class Estudiante {
    public String nombre;
    public String apellido;
    public int edad;
    public String carrera;
    public double promedio;

    public Estudiante(){};


    public Estudiante(String nombre, String apellido, int edad,
                      String carrera, double promedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    

    public static void mostrarDatos(Estudiante[] estudiantes) {
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("************");
            System.out.println("Nombre: " + estudiantes[i].nombre);
            System.out.println("Promedio: " + estudiantes[i].promedio);
        }
    }
}
