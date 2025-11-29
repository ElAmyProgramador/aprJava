package Ejs2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // el primero
        Poligono triangs[] = new Triangulo[3];
        Poligono quads[] = new Rectangulo[3];
        double altura, base;
        int i;
        for (i = 0; i < triangs.length; i++) {
            System.out.println("Información del triangulo " + (i + 1));
            System.out.print("Base: ");
            base = teclado.nextDouble();
            System.out.print("Altura: ");
            altura = teclado.nextDouble();
            triangs[i] = new Triangulo(base, altura);
        }
        for (i = 0; i < quads.length; i++) {
            System.out.println("Información del rectangulo " + (i + 1));
            System.out.print("Base: ");
            base = teclado.nextDouble();
            System.out.print("Altura: ");
            altura = teclado.nextDouble();
            if (base == altura) {
                quads[i] = new Rectangulo(base);
            } else {
                quads[i] = new Rectangulo(base, altura);
            }
        }
        for (Poligono obj : triangs) {
            obj.mostrarDatos();
            System.out.println("Tiene área de " + obj.sacarArea());
        }
        for (Poligono obj : quads) {
            obj.mostrarDatos();
            System.out.println("Tiene un área de " + obj.sacarArea());
        }
    }
}