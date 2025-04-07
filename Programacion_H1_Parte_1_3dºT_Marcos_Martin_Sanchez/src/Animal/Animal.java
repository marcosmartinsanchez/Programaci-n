package Animal;

public abstract class Animal {
	int chip;
	String nombre;
	int edad;
	String raza;
	boolean adoptado;

public Animal(int chip, String nombre, int edad, String raza, boolean adoptado) {
	this.chip= chip;
	this.nombre=nombre;
	this.edad=edad;
	this.raza=raza;
	this.adoptado=adoptado;
	}
	public abstract void mostrar();
	public Object getchip() {
		// TODO Auto-generated method stub
		return null;
	}
}

