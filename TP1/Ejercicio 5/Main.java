import java.util.*;

class Main{
  public static void main (String[] args) {
    Vehiculo corven = new Moto("corven", "AA67C","rojo",16);
    Vehiculo siena = new Auto("siena", "AA606AN", "blanco",4, 25);
    Vehiculo renault = new AutoElectrico("renault", "ANP67G","gris", 20,5);

    ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    vehiculos.add(corven);
    vehiculos.add(siena);
    vehiculos.add(renault);
    System.out.println("El alquiler de Moto corven por dia es; $" + vehiculos.get(0).calcularAlquiler(1));
    System.out.println("El alquiler de Auto siena por dia es: $" + vehiculos.get(1).calcularAlquiler(1));
    System.out.println("El alquiler de Auto Electrico renault por dia es: $" + vehiculos.get(2).calcularAlquiler(1));

    Vehiculo camionetaFord = new Camioneta("ford", "AP789CG", "azul", 60);

    vehiculos.add(camionetaFord);

    System.out.println("El alquiler de Camioneta Ford por dia es $" + vehiculos.get(3).calcularAlquiler(1));
  
  
  
  }
}
