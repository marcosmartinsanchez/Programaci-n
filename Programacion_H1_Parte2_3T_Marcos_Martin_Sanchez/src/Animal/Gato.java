package Animal;


public class Gato extends Animal {
    boolean testLeucemia;
    public Gato(String string, String nombre, int edad, String raza, boolean adoptado, boolean testLeucemia) {
        super(string, nombre, edad, raza, adoptado);
        this.testLeucemia = testLeucemia;

    }
    public Gato(String nombre, int edad, String raza, boolean adoptado, boolean testLeucemia) {
        super(0, nombre, edad, raza, adoptado);
        this.testLeucemia = testLeucemia;
    }

    @Override

    public void mostrar() {
        System.out.println("Chip del gato: " + numeroChip);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Raza: " + raza);
        System.out.println("Adoptado: " + adoptado);
        System.out.println("Test de leucemia: " + testLeucemia);

    }
    @Override
    protected Object getnumero_de_chip() {
        return numeroChip;
    }

}