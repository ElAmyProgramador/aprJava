package Encapsulamiento;

public class Estaticos {
    private static String frase = "Frase de mi estatico";
    public static int sumar(int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        Estaticos ob1 = new Estaticos();
        Estaticos ob2 = new Estaticos();
        System.out.println(ob1.frase);
        System.out.println(ob2.frase);
        ob2.frase = "frase modificada";
        System.out.println(ob1.frase);
        System.out.println(ob2.frase);
        // para llamar el atributo estio puedes usar
        System.out.println(Estaticos.frase);
        System.out.println(Estaticos.sumar(3, 52));
    }
}