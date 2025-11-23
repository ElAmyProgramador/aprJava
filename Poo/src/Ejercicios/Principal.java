package Ejercicios;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Cuadrilatero c1;
        float lado1, lado2;
        System.out.println("Cuanto vale el lado 1?");
        lado1 = teclado.nextFloat();
        System.out.println("Cuanto vale el lado 2?");
        lado2 = teclado.nextFloat();
        if (lado1 == lado2) {
            c1 = new Cuadrilatero(lado1);
        } else {
            c1 = new Cuadrilatero(lado1, lado2);
        }
        System.out.println("El perimetro es " + c1.getPerimetro() + " y el area es " + c1.getArea());
    }
}
