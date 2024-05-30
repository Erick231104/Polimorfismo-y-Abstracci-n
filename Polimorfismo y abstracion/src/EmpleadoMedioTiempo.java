public class EmpleadoMedioTiempo extends Empleado{
    
     private double salarioPorHora;
     private int horasTrabajadasPorSemana;

    public EmpleadoMedioTiempo(String nombre, String numeroIdentificacion, double salarioPorHora,
     int horasTrabajadasPorSemana, int edad, String EstadoCivil, String cargo) {
        super(nombre, numeroIdentificacion, edad, EstadoCivil, cargo);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadasPorSemana = horasTrabajadasPorSemana;
    }
    
    @Override
    public double calcularSalario() {
        return salarioPorHora * horasTrabajadasPorSemana * 4; // salrio semanal 
    }
}
