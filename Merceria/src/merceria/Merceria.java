package merceria;

import java.util.Scanner;

public class Merceria {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuántos productos llevas?");
        int cantidadProductos = teclado.nextInt();
        if (cantidadProductos < 5) {
            System.out.println("No se permiten compras inferiores a 5 productos");
        } else if (5 < cantidadProductos && cantidadProductos <= 15) {
            System.out.println("El costo de envío es de 10 USD");
        } else {
            System.out.println("El envío es gratis");
        }
        // parte del punto extra
        System.out.println("¿Cuánto es el total de su compra (100 USD)?");
        double precioTotal = teclado.nextDouble();
        if (precioTotal < 100) {
            System.out.println("No tiene descuento, se encuentra a " + (100 - precioTotal) + " para obtener un descuento del 5% sobre el total de su compre.");
        } else if (precioTotal > 100 && precioTotal < 300) {
            System.out.println("Cuenta con un descuento del 5% sobre el total, su total a pagar es de " + (precioTotal - (precioTotal / 20)) + ".");
        } else {
            System.out.println("Cuenta con un descuento del 10% sobre el total, su total a pagar es de " + (9 * (precioTotal / 10)) + ".");
        }
    }
}