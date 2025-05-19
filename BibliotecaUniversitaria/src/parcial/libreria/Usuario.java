/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial.libreria;

/**
 *
 * @author juane
 */ 
// Creo la clase usuario para representar a quienes usan el espacio de la biblioteca
public class Usuario {
    // Atributos del usuario
    private String nombre; //Nombre
    private String tipo; //Tipo de usuario

    // Constructor
    public Usuario(String nombre, String carrera) {
        this.nombre = nombre;
        this.tipo = carrera;
    }

    // Métodos getter
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    // El método para mostrar la información del usuario
    @Override
    public String toString() {
        return "Usuario: " + nombre + " | Carrera: " + tipo;
    }
}
