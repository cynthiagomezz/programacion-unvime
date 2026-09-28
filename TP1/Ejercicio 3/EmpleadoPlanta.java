class EmpleadoPlanta extends Empleado{
  private double sueldoBase;
  private int antiguedadAnios;

  //constructor
  public EmpleadoPlanta(String nombre, String apellido, int dni, double sueldoBase, int antiguedadAnios  ){
    super(nombre, apellido, dni);
    this.sueldoBase = sueldoBase;
    this.antiguedadAnios = antiguedadAnios;
  }

  //Getters and Setters 

  public double getSueldoBase(){
    return sueldoBase;
  }

  public void setSueldoBase(double sueldoBase){
    this.sueldoBase = sueldoBase;
  }

  public int getAntiguedadAnios(){
    return antiguedadAnios;
  }

  public void setAntiguedadAnios(int antiguedadAnios){
    this.antiguedadAnios = antiguedadAnios;
  }

  //Metodos 
  @Override
  public double calcularSueldo(){
    double resultado = sueldoBase + (sueldoBase * 0.02 * antiguedadAnios);
    return resultado;
  }

}
