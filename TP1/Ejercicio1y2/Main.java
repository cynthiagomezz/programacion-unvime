import java.util.*;

public static void main (String[] args) {
  Carrera programacion = new Carrera("programacion");
  Estudiante cynthia = new Estudiante("Cynthia","Gomez", 20, "programacion");
  Estudiante ismael = new Estudiante("Ismael", "Gomez", 21, "programacion");
  Estudiante jazmin = new Estudiante("Jazmin", "Mora", 18, "programacion");
  Estudiante julieta = new Estudiante("Julieta", "Fernandez", 24, "programacion");
  Estudiante carlos = new Estudiante("Carlos", "Perez", 19, "programacion");
  programacion.agregarEstudiante(ismael);
  programacion.agregarEstudiante(cynthia);
  programacion.agregarEstudiante(jazmin);
  programacion.agregarEstudiante(julieta);
  programacion.agregarEstudiante(carlos);

  //Materia Cynthia

  Materia programacion1Cynthia = new Materia("programacion 1");
  cynthia.agregarMateria(programacion1Cynthia);
  programacion1Cynthia.setCalificacion(9);
  Materia inglesCynthia = new Materia ("ingles");
  cynthia.agregarMateria(inglesCynthia);
  inglesCynthia.setCalificacion(8);
  Materia paradigmasDeProgramacionCynthia = new Materia ("paradigmas de programacion");
  cynthia.agregarMateria(paradigmasDeProgramacionCynthia);
  paradigmasDeProgramacionCynthia.setCalificacion(7);

//Materia ismael 


Materia programacion1Isma = new Materia("programacion 1");
  ismael.agregarMateria(programacion1Isma);
  programacion1Isma.setCalificacion(7);
  Materia paradigmasDeProgramacionIsma = new Materia ("paradigmas de programacion");
  ismael.agregarMateria(paradigmasDeProgramacionIsma);
  paradigmasDeProgramacionIsma.setCalificacion(8);
  Materia baseDeDatosIsma = new Materia ("base de datos");
  ismael.agregarMateria(baseDeDatosIsma);
  baseDeDatosIsma.setCalificacion(8);
  Materia matematicasIsma = new Materia ("matematicas");
  ismael.agregarMateria(matematicasIsma);
  matematicasIsma.setCalificacion(10);

  //Materia jazmin

  Materia programacion1Jazmin = new Materia("programacion 1");
  jazmin.agregarMateria(programacion1Jazmin);
  programacion1Jazmin.setCalificacion(9);
  Materia inglesJazmin = new Materia ("ingles");
  jazmin.agregarMateria(inglesJazmin);
  inglesJazmin.setCalificacion(8);

  //Materia Carlos 

  
  Materia baseDeDatosCarlos = new Materia ("base de datos");
  carlos.agregarMateria(baseDeDatosCarlos);
  baseDeDatosCarlos.setCalificacion(8);
  Materia matematicasCarlos = new Materia ("matematicas");
  carlos.agregarMateria(matematicasCarlos);
  matematicasCarlos.setCalificacion(7);

  //Materia julieta

  
  Materia inglesJulieta = new Materia ("ingles");
  julieta.agregarMateria(inglesJulieta);
  inglesJulieta.setCalificacion(6);
  Materia paradigmasDeProgramacionJulieta = new Materia ("paradigmas de programacion");
  julieta.agregarMateria(paradigmasDeProgramacionJulieta);
  paradigmasDeProgramacionJulieta.setCalificacion(4);
  Materia baseDeDatosJulieta = new Materia ("base de datos");
  julieta.agregarMateria(baseDeDatosJulieta);
  baseDeDatosJulieta.setCalificacion(8);

  System.out.println("La carrera programacion tiene: " + programacion.size() + " estudiantes");
  programacion.listarEstudiante();
  System.out.println("Sus promedios son:");
  System.out.println("Cynthia: " + cynthia.calcularPromedio());
  System.out.println("Ismael:" + ismael.calcularPromedio());
  System.out.println("Jazmin: " + jazmin.calcularPromedio());
  System.out.println("Julieta: " + julieta.calcularPromedio());
  System.out.println("Carlos: " + carlos.calcularPromedio());
}
