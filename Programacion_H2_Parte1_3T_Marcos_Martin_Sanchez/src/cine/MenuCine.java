package cine;

import java.sql.*;
import java.util.Scanner;

public class MenuCine {

    public void verPeliculas() {
        try (Connection conexion = Conexion.getConnection();
             Statement stmt = conexion.createStatement()) {
            String sql = "SELECT p.titulo, p.director, p.año, p.genero, f.fecha, f.hora " +
                         "FROM peliculas p JOIN funciones f ON p.id = f.id_pelicula";
            ResultSet rs = stmt.executeQuery(sql);
            System.out.printf("%-30s %-20s %-5s %-15s %-10s %-8s%n", 
                              "Título", "Director", "Año", "Género", "Fecha", "Hora");
            while (rs.next()) {
                System.out.printf("%-30s %-20s %-5d %-15s %-10s %-8s%n",
                                  rs.getString("titulo"),
                                  rs.getString("director"),
                                  rs.getInt("año"),
                                  rs.getString("genero"),
                                  rs.getDate("fecha"),
                                  rs.getTime("hora"));
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar películas: " + e.getMessage());
        }
    }

    public void anadirPelicula(Scanner scanner) {
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Director: ");
        String director = scanner.nextLine();
        System.out.print("Año: ");
        int año = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Género: ");
        String genero = scanner.nextLine();

        String sql = "INSERT INTO peliculas (titulo, director, año, genero) VALUES (?, ?, ?, ?)";

        try (Connection conexion = Conexion.getConnection();
             PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setString(1, titulo);
            pstmt.setString(2, director);
            pstmt.setInt(3, año);
            pstmt.setString(4, genero);
            int filas = pstmt.executeUpdate();
            if (filas > 0) System.out.println("Película añadida.");
            else System.out.println("No se pudo añadir.");
        } catch (SQLException e) {
            System.out.println("Error al añadir película: " + e.getMessage());
        }
    }

    public void eliminarPelicula(Scanner scanner) {
        System.out.print("ID película a eliminar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        String sql = "DELETE FROM peliculas WHERE id = ?";

        try (Connection conexion = Conexion.getConnection();
             PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int filas = pstmt.executeUpdate();
            if (filas > 0) System.out.println("Película eliminada.");
            else System.out.println("No encontrada.");
        } catch (SQLException e) {
            System.out.println("Error al eliminar película: " + e.getMessage());
        }
    }

    public void modificarPelicula(Scanner scanner) {
        System.out.print("ID película a modificar: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nuevo título: ");
        String nuevoTitulo = scanner.nextLine();
        System.out.print("Nuevo director: ");
        String nuevoDirector = scanner.nextLine();

        String sql = "UPDATE peliculas SET titulo = ?, director = ? WHERE id = ?";

        try (Connection conexion = Conexion.getConnection();
             PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setString(1, nuevoTitulo);
            pstmt.setString(2, nuevoDirector);
            pstmt.setInt(3, id);
            int filas = pstmt.executeUpdate();
            if (filas > 0) System.out.println("Película modificada.");
            else System.out.println("No encontrada.");
        } catch (SQLException e) {
            System.out.println("Error al modificar película: " + e.getMessage());
        }
    }
}
