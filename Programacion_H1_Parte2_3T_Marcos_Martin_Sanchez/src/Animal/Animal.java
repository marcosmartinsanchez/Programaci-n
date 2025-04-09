package Animal;

public abstract class Animal {
	int numeroChip;
	String nombre;
	int edad;
	String raza;
	boolean adoptado;

	public Animal (int i, String nombre, int edad, String raza, boolean adoptado) {
		this.numeroChip = i;
		this.nombre = nombre;
		this.edad = edad;
		this.raza = raza;
		this.adoptado = adoptado;
	}


	public Animal(String string, String nombre2, int edad2, String raza2, boolean adoptado2) {
	}

	public abstract void mostrar();
	protected abstract Object getnumero_de_chip();

}