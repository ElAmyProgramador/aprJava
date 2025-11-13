package vectores;

import java.util.Scanner;

public class Vectores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i;
        /*// ej 1
        String nombres[] = new String [8];
        for (i = 0; i < nombres.length; i++) {
            System.out.println("Ingrese el nombre en la posición " + (i + 1) + ":");
            nombres[i] = teclado.nextLine();
        }
        System.out.println("Los nombres cargado en el vector son:\n");
        for (i = 0; i < nombres.length; i++) {
            System.out.println("nombres " + i + " = " + nombres[i]);
        }
        // ej 2
        int numerosEj2[] = new int[10];
        for (i = 0; i < numerosEj2.length; i++) {
            System.out.println("Número en la posición " + (i + 1) + ":");
            numerosEj2[i] = teclado.nextInt();
        }
        int mayor = 0;
        for (i = 1; i < numerosEj2.length; i++) {
            if (numerosEj2[i -1] > numerosEj2[i]) {
                mayor = numerosEj2[i - 1];
            } else {
                mayor = numerosEj2[i];
            }
        }
        System.out.println("El mayor es: " + mayor);
        // ej 3
        int numeroEj3[] = new int[15];
        int contador = 0;
        for (i = 0; i < numeroEj3.length; i++) {
            System.out.println("¿Cuál es el némero en la posición " + i + "?");
            numeroEj3[i] = teclado.nextInt();
        }
        for (i = 0; i < numeroEj3.length; i++) {
            if (numeroEj3[i] == 3) {
                contador++;
            }
        }
        System.out.println("Se cargó " + contador + " veces el número 3");
        */// Ej 4
        int sueldos[] = new int[12];
        int suma = 0;
        for (i = 0; i < sueldos.length; i++) {
            System.out.println("¿Cuánto ganaste en el mes " + (i + 1) + "?");
            sueldos[i] = teclado.nextInt();
            suma += sueldos[i];
        }
        int promedio = suma / sueldos.length;
        System.out.println("Ganaste un total de " + suma + " con un sueldo promedio de " + promedio);
    }
}