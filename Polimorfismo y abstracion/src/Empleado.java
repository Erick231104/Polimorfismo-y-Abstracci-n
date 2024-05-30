 abstract class Empleado {

    private String nombre;
    private String numeroIdentificacion;
    private int edad;
    private  String EstadoCivil;
    private String cargo;

  
    public Empleado(String nombre, String numeroIdentificacion, int edad, String EstadoCivil, String cargo) {
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
        this.edad = edad;
        this.EstadoCivil = EstadoCivil;
        this.cargo = cargo;

    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public int getEdad() {
        return edad;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public String getCargo() {
        return cargo;
    }

    public int EmpleadoMayorEdad () {
        return edad;
    }
    
    //Metodo abstracto
    public abstract double calcularSalario();


   

}
