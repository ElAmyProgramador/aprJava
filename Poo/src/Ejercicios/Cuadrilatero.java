// recuerdo que esto se lo dejaron a una computologa conocida como tare en el primer mes; el plan de estudios de ahí empieza con POO y no con bases de programación
package Ejercicios;

public class Cuadrilatero {
    // suponiendo que sea un cuadrilatero regular...
    private float lado1, lado2;
    // constructores
    
    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    // solo si es un cuadrado regular
    public Cuadrilatero(float lado1) {
        this.lado1 = this.lado2 = lado1;
    }
    
    // gets
    public float getPerimetro() {
        float perimetro = 2 * (lado1 + lado2);
        return perimetro;
    }
    
    public float getArea() {
        float area = lado1 * lado2;
        return area;
    }
}
