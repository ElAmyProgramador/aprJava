package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Tablero {
    private static int x, y; // las coordenadas
    private static int entrada = 0;
    
    private static int[] getCoordenadas() {
        // creamos un arreglo ocn 2 elementos y guardamos ahi a x e y
        int coordenadas[] = {x, y};
        return coordenadas;
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        while (true) {
            System.out.println("¿Qué quieres hacer?");
            System.out.println("1. mover a la derecha");
            System.out.println("2. mover a la izquierda");
            System.out.println("3. mover hacia arriba");
            System.out.println("4. mover hacia abajo");
            System.out.println("0. Salir");
            entrada = teclado.nextInt();
            switch (entrada) {
                case 0 -> {
                    return;
                }
                case 1 -> x += 1;
                case 2 -> x -= 1;
                case 3 -> y += 1;
                case 4 -> y -= 1;
                default -> System.out.println("Opción no existente");
            }
            System.out.println("El objeto en las coordenadas " + Arrays.toString(Tablero.getCoordenadas()));
        }
    }
}