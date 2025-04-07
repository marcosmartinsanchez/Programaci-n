package Animal;

public class Gato extends Animal {
	boolean tieneLeucemia;
	
	public Gato(int chip, String nombre, int edad, String raza, boolean adoptado, boolean tieneLeucimia, boolean tieneLeucemia) {
		super(chip, nombre, edad, raza, adoptado);
		this.tieneLeucemia =tieneLeucemia;
		
	}
	@Override
	public void mostrar() {
		System.out.println("El número de chip es: "+chip);
		System.out.println("Su nombre es: "+nombre);
		System.out.println("El gato tiene: "+edad);
		System.out.println("Su raza es: "+raza);
		System.out.println("El gato es : "+adoptado);
		System.out.println("El gato tiene : "+tieneLeucemia);
	}
}
