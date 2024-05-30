public class App {
   
    public static void main(String[] args) throws Exception {
        
        Empleado[] empleados = new Empleado[2];

        empleados[0] = new EmpleadoTiempoCompleto("Juan Palacios", "123", 40000.0, 25, "Casado", "Gerente General");
        empleados[1] = new EmpleadoMedioTiempo("Maria Sequeira", "456", 15.0, 20, 23, "Soltara", "Administradora");
        System.out.println("Informacion de los empleados ");

        for (Empleado empleado : empleados) {
            System.out.println("Nombre: " +empleado.getNombre() + ", Numero de Indentificacion: " + empleado.getNumeroIdentificacion() +", Salario Semanal: $"
            + empleado.calcularSalario()+ ", Edad: "+ empleado.getEdad()+ ", Estado civil: "+ empleado.getEstadoCivil()+ ", Cargo: "+ empleado.getCargo());
        }
    }
}
