// el ejercicio integrador del estacionamiento

package estacionamiento;

import java.util.Scanner;

public class Estacionamiento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /* definimos una biyeccion de la forma (1, por hora), (2, media jornada), (3 jornada completa)
        Se infiere que (3, por hora si son menos de 5 horas), (15 - 5%, si son 5 horas) y (30 - 10%, si son 10 horas)
        */
        System.out.println("¿Cuál es la matricula del vehiclo?");
        String matricula = teclado.nextStrign();
        System.out.println("¿Tipo de estacionamiento?");
        int tipoEstacionamiento = teclado.nextInt();
    }
}