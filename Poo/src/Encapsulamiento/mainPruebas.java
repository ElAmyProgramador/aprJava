package Encapsulamiento;

public class mainPruebas {
    public static void main(String[] args) {
        Persona amy = new Persona();
        amy.setEdad(20);
        amy.setNombre("Amy");
        System.out.println("La edad de " + amy.getNombre() + " es de " + amy.getEdad());
    }
}