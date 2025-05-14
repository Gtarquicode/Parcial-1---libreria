/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial.libreria;
/**
 *
 * @author juane
 */
//Creamos esta clase para representar los usuarios de la biblioteca
public class Usuario {
    private String nombre; //Nombre del usuario
    private String tipo; //Esto para diferenciar entre estudiante o docente
    
    public Usuario(String nombre, String tipo){
    this.nombre = nombre;
    this.tipo = tipo;
    }
    
    public String getNombre(){ 
        return nombre;
    }
    public String getTipo(){ 
        return tipo;
    }
}
