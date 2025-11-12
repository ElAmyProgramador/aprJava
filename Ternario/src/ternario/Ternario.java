// un tipico prgrama que nos dice si alguien aprobo o no
package ternario;

import java.util.Scanner;

public class Ternario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese promedio: ");
        double promedio = teclado.nextDouble();
        String condFinal = (promedio >= 6) ? "Aprobó" : "Reprobado";
        System.out.println(condFinal + "\n");
    }    
}