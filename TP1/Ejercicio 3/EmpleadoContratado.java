class EmpleadoContratado extends Empleado{
  
  private double valorPorHora;
  private double horasTrabajadas;

  //Constructor

  public EmpleadoContratado(String nombre, String apellido, int dni, double valorPorHora, double horasTrabajadas ){
    super(nombre, apellido,dni);
    this.valorPorHora = valorPorHora;
    this.horasTrabajadas = horasTrabajadas;
  }

  //Getters And Setters 

  public double getValorPorHora(){
    return  valorPorHora;
  }

  public void setValorPorHora(double valorPorHora){
    this.valorPorHora = valorPorHora;
  }

  public double getHorasTrabajadas(){
    return horasTrabajadas;
  }

  public void setHorasTrabajadas(double horasTrabajadas){
    this.horasTrabajadas = horasTrabajadas;
  }

  @Override

  public double calcularSueldo(){
    double resultado = horasTrabajadas * valorPorHora;
    return resultado;
  }
}
