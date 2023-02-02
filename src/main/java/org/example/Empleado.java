package org.example;

public class Empleado {
    //Atributos
        String nombre;
    //Contructor

    public Empleado() {
    }

    //Metodos especiales

    //Licuadora
    public String saludar(String nombrecito){
        String saludo="Hola "+nombrecito;
        return saludo;

    }
    public int sumar(int numero1, int numero2){
            return numero1+numero2;
    }
}
