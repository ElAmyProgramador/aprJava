package ClasesYObjetos;

public class Coche {
    String color, marca;
    double kilometraje;
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        coche1.color = "Rojo";
        coche1.marca = "Audi";
        coche1.kilometraje = 123.4;
        System.out.println("El color del coche1 es " + coche1.color);
        System.out.println("La marca del coche1 es " + coche1.marca);
        System.out.println("El kilometraje del coche1 es " + coche1.kilometraje);
        coche2.color = "Blanco";
        coche2.marca = "Audi";
        coche2.kilometraje = 44.8;
        System.out.println("El color del coche2 es " + coche2.color);
        System.out.println("La marca del coche2 es " + coche2.marca);
        System.out.println("El kilometraje del coche2 es " + coche2.kilometraje);
    }
}