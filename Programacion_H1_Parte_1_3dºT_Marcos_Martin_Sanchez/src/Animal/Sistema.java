package Animal;
import java.util.HashMap;


public class Sistema {
	private HashMap<String, Animal> animales = new HashMap<>();
	
	public void alta(Animal animal) {
		if(animales.containsKey(animal.getchip())) {
			System.out.println("El chip ya está registrado");
		}else {
			animales.put((String) animal.getchip(), animal);
			System.out.println("Animal registrado");
		}
	}
	public void AnimalId (String chip) {
		Animal animal=animales.get(chip);
		if (animal !=null) {
			animal.mostrar();
		}else {
			System.out.println("El animal no existe");
		}
	}
}
