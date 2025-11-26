package Ejercicios;

public class Corredor {
    private int numAtleta;
    private String nombre;
    private double tiempoCarrera;
    
    public Corredor(String nombre, int numAtleta, double tiempoCarrera) {
        this.nombre = nombre;
        this.numAtleta = numAtleta;
        this.tiempoCarrera = tiempoCarrera;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getNumAtleta() {
        return numAtleta;
    }
    
    public double getTiempoCarrera() {
        return tiempoCarrera;
    }
    
    public String mostrarCorredor() {
        return ("\nNombre: " + nombre + "\nID: " + numAtleta + "\nTiempo: " + tiempoCarrera);
    }
}