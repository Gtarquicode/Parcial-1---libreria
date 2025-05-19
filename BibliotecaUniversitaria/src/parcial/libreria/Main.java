/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial.libreria;
import java.util.Scanner;
/**
 *
 * @author juane
 */
//Creo la clase Main que es en la que se correrá todo el código en general
public class Main {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        System.out.println("=== Registro de Usuario ===");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Carrera: ");
        String carrera = scanner.nextLine();

        System.out.print("Tipo de usuario (profesor/estudiante): ");
        String tipo = scanner.nextLine().toLowerCase();

        Usuario usuario = new Usuario(nombre, carrera);
        biblioteca.registrarUsuario(usuario);

        // Si es profesor, permitir registrar libros
        if (tipo.equals("profesor")) {
            System.out.print("\n¿Cuántos libros desea registrar?: ");
            int cantidadLibros = scanner.nextInt();
            scanner.nextLine(); // Limpiar salto de línea

            for (int i = 0; i < cantidadLibros; i++) {
                System.out.println("\n=== Registro de Libro " + (i + 1) + " ===");
                System.out.print("Título: ");
                String titulo = scanner.nextLine();
                System.out.print("Autor: ");
                String autor = scanner.nextLine();
                System.out.print("Categoría: ");
                String categoria = scanner.nextLine();

                Libro libro = new Libro(titulo, autor, categoria, true);
                biblioteca.registrarLibro(libro);
            }
        }

        // Buscar libro
        System.out.print("\n¿Desea buscar un libro? (si/no): ");
        String respuesta = scanner.nextLine().toLowerCase();

        if (respuesta.equals("si")) {
            System.out.print("Ingrese el título del libro: ");
            String tituloBusqueda = scanner.nextLine();
            Libro libroEncontrado = biblioteca.buscarLibroPorTitulo(tituloBusqueda);

            if (libroEncontrado != null) {
                System.out.println("\n=== Libro Encontrado ===");
                System.out.println("Título: " + libroEncontrado.getTitulo());
                System.out.println("Autor: " + libroEncontrado.getAutor());
                System.out.println("Categoría: " + libroEncontrado.getCategoria());
                System.out.println("Disponible: " + (libroEncontrado.isDisponible() ? "Sí" : "No"));
            } else {
                System.out.println("Libro no encontrado.");
            }
        }

        System.out.println("\n=== Fin del programa ===");
    }
}
