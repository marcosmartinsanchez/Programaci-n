package Animal;

public class Perro extends Animal {
    String tamaño;
    public Perro(String string, String nombre, int edad, String raza, boolean adoptado, String tamaño) {
        super(string, nombre, edad, raza, adoptado);
        this.tamaño = tamaño;

    }

    public Perro(String nombre, int edad, String raza, boolean adoptado, String tamaño) {
        super(0, nombre, edad, raza, adoptado);
        this.tamaño = tamaño;
    }

    @Override

    public void mostrar() {
        System.out.println("Chip del perro: " + numeroChip);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Raza: " + raza);
        System.out.println("Adoptado: " + adoptado);
        System.out.println("Tamaño: " + tamaño);

    }

    @Override

    protected Object getnumero_de_chip() {
        return numeroChip;

    }

}