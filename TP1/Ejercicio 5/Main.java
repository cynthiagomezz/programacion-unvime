import java.util.*;

class Main{
  public static void main (String[] args) {
    Vehiculo corven = new Moto("corven", "AA67C","rojo",16);
    Vehiculo siena = new Auto("siena", "AA606AN", "blanco",4, 25);
    Vehiculo renault = new AutoElectrico("renault", "ANP67G","gris", 20,5);

    System.out.println("El alquiler de Moto corven por dia es; $" + corven.calcularAlquiler(1));
    System.out.println("El alquiler de Auto siena por dia es: $" + siena.calcularAlquiler(1));
    System.out.println("El alquiler de Auto Electrico renault por dia es: $" + renault.calcularAlquiler(1));
  }
}
