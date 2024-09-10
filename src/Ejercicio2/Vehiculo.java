package Ejercicio2;

public class Vehiculo {
    private String marca;
    private String modelo;
    private double precio;

    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void mostrarDetalles() {
        System.out.println("marca" + this.marca + "modelo: " + this.modelo + "precio" + this.precio);
    }

    public static void main(String[] args) {
        Vehiculo[] vehiculos = {
                new Vehiculo("Toyota", "corolla", 3500),
                new Vehiculo("Ford", "Fiesta", 2700),
                new Vehiculo("Honda", "Civic", 4500),
                new Vehiculo("Mazda", "3", 2900),
        };
        System.out.println("Lista de vehiculos");
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.mostrarDetalles();
        }
    }
}