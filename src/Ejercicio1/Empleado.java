package Ejercicio1;

public class Empleado {
    public Empleado() {
    }
    String nombre;
    int edad;
    double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre= nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }

    public void aplicarDescuento() {
        if (this.salario < 3000) {
            this.salario = 1.10;
        }
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + this.nombre + "edad" + this.edad + "salario: " + this.salario);
    }

    public static void main(String[] args) {
        Empleado empleados =
                new Empleado("Carlos", 25, 2500);
                new Empleado("Juan", 30, 3200);
                new Empleado("Miguel", 28, 2900);

        System.out.println("Salarios del aumento ");
            for (Empleado empleado = empleados) {
                empleado.mostrarInfo();
        }
            for (Empleado empleado = empleados) {
                empleado.aplicarDescuento();
            }
        System.out.println("Salario despues del descuento");
            for (Empleado empleado = empleados ) {
                empleado.mostrarInfo();
            }
    }
}
