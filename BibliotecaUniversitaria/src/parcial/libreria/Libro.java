/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial.libreria;

/**
 *
 * @author juane
 */
public class Libro {
     //Creo los datos que tiene cada libro que se va a subir
        private String titulo; //Nombre del libro
        private String autor; //Quien es el autor
        private String categoria; //Categoria del libro
        private Boolean disponible; // El libro está disponible
        // Para añadir más libros creamos un constructor
     public Libro(String titulo,String autor,String categoria, Boolean disponible){
        this.titulo = titulo;   //Para guardar el nuevo titulo al añadir un libro
        this.autor = autor;     //Guardar el autor del libro añadido
        this.categoria = categoria;  //Guardar la categoria del libro
        this.disponible = disponible; // Guardar si está disponible
                } 
                //Metodo para obtener el titulo
        public String getTitulo(){
            return titulo;
        }       
            //Metodo para obtener el autor
        public String getAutor(){
            return autor;
        }
            //Metodo para obtener la categoria
        public String getCategoria(){
            return categoria;
        }
            // Método para saber si el libro está disponible
        public Boolean getDisponible(){
            return disponible;
        }
        // Método para cambiar la disponibilidad 
        public void setDisponible(Boolean disponible){
            this.disponible = disponible;
        }
        // Y método para mostrar un resumen del libro, o sea toda la info junta
         @Override
    public String toString() {
        return "Libro: " + titulo + " | Autor: " + autor + " | Categoría: " + categoria +
               " | Disponible: " + (disponible ? "Sí" : "No");
        }
       } 
