package Animal;

public class Perro extends Animal {
	String tamaño;
	
	public Perro(int chip, String nombre, int edad, String raza, boolean adoptado, String tamaño) {
		super(chip, nombre, edad, raza, adoptado);
		this.tamaño = tamaño;
	}
	@Override
	public void mostrar() {
		System.out.println("El número de chip es: "+chip);
		System.out.println("Su nombre es: "+nombre);
		System.out.println("El perro tiene: "+edad);
		System.out.println("Su raza es: "+raza);
		System.out.println("El perro es: "+adoptado);
	}
	
}
