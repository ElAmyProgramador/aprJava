package integrador;

import java.util.Scanner;

public class Integrador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double matriz[][] = new double[4][3];
        double promedios[] = new double[4];
        int suma, i, j;
        for (i = 0; i < 4; i++) {
            suma = 0;
            System.out.println("Alumno " + (i + 1));
            for (j = 0; j < 3; j++) {
                System.out.println("\tCalifficacion del parcial " + (j + 1));
                matriz[i][j] = teclado.nextDouble();
                suma += matriz[i][j];
            }
            promedios[i] = suma;
        }
        for (i = 0; i < 4; i++) {
            System.out.println("Calfificaciónes del alumno " + (i + 1));
            for (j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("\nPromedio del alumno " + (i + 1) + ": " + promedios[i]);
        }
    }    
}