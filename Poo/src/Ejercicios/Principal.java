package Ejercicios;

import java.util.Scanner;

public class Principal {
    /*
    public static int indiceCocheBarato(Coche autos[]) {
        float precio;
        int indice = 0;
        precio = autos[0].getPrecio();
        for (int i = 1; i < autos.length; i++) {
            if (autos[i].getPrecio() < precio) {
                precio = autos[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    } */
    
    public static int indiceGanador(Corredor lista[]) {
        double tiempo = lista[0].getTiempoCarrera();
        int indice = 0;
        for(int i = 1; i < lista.length; i++) {
            if (lista[i].getTiempoCarrera() < tiempo) {
                tiempo = lista[i - 1].getTiempoCarrera();
                indice = i;
            }
        }
        return indice;
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /*Cuadrilatero c1;
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
        */
        
        /*
        String marca, modelo;
        float precio;
        System.out.println("Cantidad de vehiculos? ");
        int cantidadAuto = Integer.parseInt(teclado.nextLine()); // evita problemas con el buffer de Scanner
        Coche coches[] = new Coche[cantidadAuto];
        for (int i = 0; i < cantidadAuto; i++) {
            System.out.println("Auto " + (i + 1));
            System.out.print("Marca: ");
            marca = teclado.nextLine();
            System.out.println("Modelo: ");
            modelo = teclado.nextLine();
            System.out.println("Precio: ");
            precio = Float.parseFloat(teclado.nextLine());
            coches[i] = new Coche(marca, modelo, precio);
        }
        int indiceBarato = indiceCocheBarato(coches);
        System.out.println("El coche mas barato es " + coches[indiceBarato].mostrarDatos());
        */
        
        String nombre;
        int numId;
        double tiempo;
        System.out.println("¿Cuántos corredores competiran?");
        int cantidadCorredores = teclado.nextInt();
        Corredor corredores[] = new Corredor[cantidadCorredores];
        for (int i = 0; i < cantidadCorredores; i++) {
            System.out.println("Información del corredor " + (i + 1));
            teclado.nextLine();
            System.out.println("Nombre del corredor: ");
            nombre = teclado.nextLine();
            System.out.println("ID del corredor: ");
            numId = teclado.nextInt();
            System.out.println("Tiempo que realizo el corredor: ");
            tiempo = teclado.nextDouble();
            corredores[i] = new Corredor(nombre, numId, tiempo);
        }
        int ganador = indiceGanador(corredores);
        System.out.println("Ganó el corredor:\n" + corredores[ganador].mostrarCorredor());
    }
}
