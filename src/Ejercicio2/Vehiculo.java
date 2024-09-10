package Ejercicio2;

public class Vehiculo {
    private String marca;
    private String modelo;
    private  double precio;
    public Vehiculo (String marca, String modelo, double precio) {
        this.marca= marca;
        this.modelo = modelo;
        this.precio= precio;
    }
    public double getPrecio() {
        return this.precio;
    }
    public void mostrarDetalles() {
        System.out.println("marca" +this.marca+ "modelo: " +this.modelo+ "precio" +this.precio);
    }

}
