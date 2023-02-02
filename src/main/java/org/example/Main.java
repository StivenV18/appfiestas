package org.example;

public class Main {
    public static void main(String[] args) {
        //Para usar una clase creo un objeto
    Empleado objeto=new Empleado();

    //Utilizar el objeto para acceder a un atributo
        objeto.nombre="EL PEPE";
        // Utilizar el objeto para acceder a un objeto

        objeto.saludar("EL PEPE");
        //Salida por consola
        System.out.println(objeto.saludar("EL PEPE"));

        int sumatoria = objeto.sumar(5, 3);
    }
}