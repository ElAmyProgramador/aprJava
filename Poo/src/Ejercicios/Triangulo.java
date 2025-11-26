package Ejercicios;
public class Triangulo {
    private double base, lado;
    
    public Triangulo(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }

    public double getBase() {
        return base;
    }

    public double getLado() {
        return lado;
    }
    
    public double sacarPerimetro() {
        double perimetro = 2 * lado + base;
        return perimetro;
    }
    
    public double obtenerArea() {
        double aux1 = (lado * lado - (base * base / 4));
        double area = (base * Math.sqrt(aux1)) / 2;
        return area;
    }
    
    public String mostrarTriangulo() {
        String info = "Base: " + base + "; Lados: " + lado;
        return info;
    }
}
