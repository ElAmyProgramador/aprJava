package Ejs2;

public class Rectangulo extends Poligono {
    double base, altura;
    
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public Rectangulo(double base) {
        this.base = this.altura = base;
    }
    
    @Override
    public double sacarArea() {
        double area = base * altura;
        return area;
    }
    
    @Override
    public void mostrarDatos() {
        System.out.println("Base: " + base + " altura: " + altura);
    }
}