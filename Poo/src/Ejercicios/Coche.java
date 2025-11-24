package Ejercicios;

public class Coche {
    String marca, modelo;
    float precio;
    public Coche(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    
    public float getPrecio() {
        return precio;
    }
    
    public String mostrarDatos() {
        return "Marca: " + marca + " modelo: " + modelo + " precio" + precio;
    }
}