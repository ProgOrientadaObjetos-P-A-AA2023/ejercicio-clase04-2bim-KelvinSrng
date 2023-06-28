/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Persona {
    
    private String nombre;
    private String cedula;
    private String apellido;
    private int edad;
    
    public Persona(String n, String apell, String ide, int ed){
        nombre = n;
        apellido = apell;
        cedula = ide;
        edad = ed;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerCedula(String n){
        cedula = n;
    }
    
    public void establecerEdad(int x){
        edad = x;
    }
    
    public void establecerApellido(String x){
        apellido = x;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerCedula(){
        return cedula;
    }
    
    public int obtenerEdad(){
        return edad;
    }
    
    public String obtenerApellido(){
        return apellido;
    }
    
}
