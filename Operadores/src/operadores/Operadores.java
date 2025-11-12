// basicamente una calculadora que toma una operacion y 2 numeros y devuelve un numero

package operadores;

import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Qué opción quieres hacer (1..4)?");
        System.out.println("\n 1. Suma\n 2. Resta\n 3. Multiplicación\n 4. División");
        int opcion = teclado.nextInt();
        float a, b, res;
        System.out.println("Ingrese primer número: ");
        a = teclado.nextFloat();
        System.out.println("Ingrese segundo número: ");
        b = teclado.nextFloat();
        switch (opcion) {
            case 1:
                res = a + b;
                break;
            case 2:
                res = a - b;
                break;
            case 3:
                res = a * b;
                break;
            case 4:
                res = a / b;
                break;
            default:
                System.out.println("Opción no valida");
                res = 0;
                break;
        }
        System.out.println("El resutlado es:" + res);
    }   
}