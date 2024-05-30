public class EmpleadoTiempoCompleto extends Empleado {
    
    private double salarioAnual;

    public EmpleadoTiempoCompleto(String nombre, String numeroIdentificacion, double salarioAnual,
     int edad, String EstadoCivil, String cargo) {
        super(nombre, numeroIdentificacion, edad, EstadoCivil, cargo);
        this.salarioAnual = salarioAnual;
    }

    public double getSalarioAnual(){
        return salarioAnual;
    }

    @Override
    public double calcularSalario() {
        return salarioAnual / 12; // slario mensual 
    }

   

   
}
