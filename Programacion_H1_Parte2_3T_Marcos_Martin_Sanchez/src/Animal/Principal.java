package Animal;

import java.util.Scanner;

public class Principal {
	public static void main (String []args) {
		Scanner scanner = new Scanner(System.in);
		Sistema sistema = new Sistema();
	
		System.out.println("---MENU---");
		System.out.println("1. Dar de alta");
		System.out.println("2. Buscar Animal");
		System.out.println("3. Hacer adopción");
		System.out.println("4. Dar de baja");
		System.out.println("5. Mostrar estadisticas de gatos");
		System.out.println("6. Salir");
		
		System.out.println("Eliga una opción: ");
		int opcion=scanner.nextInt();
		
		switch (opcion) {
			case 1:
				DarDeAlta();
				break;
			case 2:
				BuscarAnimal();
				break;
			case 3:
				HacerAdopcion();
				break;
			case 4:
				DarDeBaja();
				break;
			case 5:
				MostrarEsta();
				break;
			case 6:
				System.out.println("Saliendo");
				break;
			
			
			}
		}
		static void DarDeAlta() {
			System.out.println("Que tipo es:");
			System.out.println("Perro");
			System.out.println("Gato");
			int tipo=scanner.nextInt();
			
			System.out.println("Numero de chip: ");
			int chip=scanner.nextInt();
			System.out.println("Nombre: ");
			String nombre=scanner.nextInt();
			System.out.println("Edad: ");
			int edad=scanner.nextInt();
			System.out.println("Raza: ");
			String raza=scanner.nextInt();
			System.out.println("Adoptado (treu/false): ");
			boolean adoptado=scanner.nextInt();
			
			if (tipo ==1) {
				System.out.println("Tamaño del perro;: ");
				String Tamaño=scanner.nextInt();
				Perro perro = new Perro(chip, nombre, edad, raza, adoptado, tamaño);
				sistema.altaAnimal(perro);
			}else if (tipo ==2) {
					System.out.println("Leucemia (true/false):");
					boolean leucemia = scanner.nextBoolean();
					Gato gato = new Gato(chip, nombre, edad, raza, adoptado, leucemia);
					sistema.altaAnimal(gato);
				}else {
					System.out.println("Opcopn incorrecta");
			}
		}
		static void BuscarAnimal() {
			System.out.println("Introduce el numero de chip");
			int chip= scanner.nextInt();
			sistema.IdAnimal(chip);
		}
		   static void HacerAdopcion() {
		        System.out.print("Introduce el chip del animal a adoptar: ");
		        int chip = scanner.nextInt();
		        Animal a = sistema.animales.get(chip);
		        if (a != null && !a.adoptado) {
		            a.adoptado = true;
		           System.out.println("¡Animal adoptado!");
		        } else {
		            System.out.println("El animal no existe o ya ha sido adoptado.");
		        }
		    }
		    static void DarDeBaja() {
		        System.out.print("Introduce el chip del animal a eliminar: ");
		        int chip = scanner.nextInt();
		        sistema.animales.remove(chip);
		        System.out.println("Animal eliminado si existía.");
		    }
		        
		        System.out.println("Total de gatos: " + totalGatos);
		        System.out.println("Gatos con leucemia: " + gatosConLeucemia);
		    }
}
