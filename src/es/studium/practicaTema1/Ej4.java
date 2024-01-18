package es.studium.practicaTema1;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
    	
        // Definimos el tamaño de la tabla
        final int TAM = 10;
        
        Scanner teclado = new Scanner(System.in);
        
        // Creamos un array con el tamaño de TAM
        int tabla[] = new int[TAM];
        
        // Creamos las variables que usaremos después para sustituir y ordenar los valores
        int i,j,aux;
        
        // Pedimos al usuario que introduzca los números
        for(i = 0; i < TAM; i++) {
            System.out.println("Dame un número entero");
            tabla[i]=teclado.nextInt();
        }
        
        // Ordenamos la tabla usando el método de intercambio
        for (i = 0; i < TAM; i ++) {
            for(j = i+1; j < TAM; j ++) {
                if(tabla[i]>tabla[j]) {
                	
                    // Intercambiamos los valores de tabla[i] y tabla[j]
                    aux=tabla[i];
                    tabla[i]=tabla[j];
                    tabla[j]=aux;
                }
            }
        }
        
        // Imprimimos la tabla ordenada
        System.out.println("La tabla ordenada queda así");
        for(i = 0; i < TAM; i++) {
            System.out.print(tabla[i] + ", ");
        }
    }
}