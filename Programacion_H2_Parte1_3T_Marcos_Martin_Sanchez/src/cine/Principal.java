package cine;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenuCine menu = new MenuCine();
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1 - Ver películas");
            System.out.println("2 - Añadir película");
            System.out.println("3 - Eliminar película");
            System.out.println("4 - Modificar película");
            System.out.println("5 - Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    menu.verPeliculas();
                    break;
                case 2:
                    menu.anadirPelicula(scanner);
                    break;
                case 3:
                    menu.eliminarPelicula(scanner);
                    break;
                case 4:
                    menu.modificarPelicula(scanner);
                    break;
                case 5:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
