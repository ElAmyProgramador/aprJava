package Ejs2;

public class Triangulo extends Poligono {
    double base, altura;
    
    public Triangulo(double base, double altura) {
        this.altura = altura;
        this.base = base;
    }
    
    @Override
    public double sacarArea() {
        double area = (base * altura) / 2;
        return area;
    }
    
    @Override
    public void mostrarDatos() {
        System.out.println("Base: " + base + " altura: " + altura);
    }
}