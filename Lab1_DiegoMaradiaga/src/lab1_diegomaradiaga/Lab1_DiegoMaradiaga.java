package lab1_diegomaradiaga;

import java.util.Scanner;

public class Lab1_DiegoMaradiaga {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("--Bienvenido al sistema de calculo de promedio--");
        System.out.print("Ingrese un nombre: ");//Se ingresa el nombre del usuario
        String nombre = entrada.nextLine();
        
        //Se ingresan las notas de las cuatro clases
        System.out.print("Ingrese la nota final de la primera clase: ");
        double primeraClase = entrada.nextDouble();
        
        System.out.print("Ingrese la nota final de la segunda clase: ");
        double segundaClase = entrada.nextDouble();
        
        System.out.print("Ingrese la nota final de la tercera clase: ");
        double terceraClase = entrada.nextDouble();
        
        System.out.print("Ingrese la nota final de la cuarta clase: ");
        double cuartaClase = entrada.nextDouble();
        
        //Se calcula el promedio
        
        double sumaClase = primeraClase+segundaClase+terceraClase+cuartaClase;
        double promedio = sumaClase / 4;
        
        //Se imprime el calculo del promedio
        System.out.println("---- " + nombre + " el promedio de las cuatro clases es: " + promedio);
        
        
        
        
                
    }
    
}
