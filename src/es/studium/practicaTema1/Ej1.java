package es.studium.practicaTema1;
import java.util.Scanner;
public class Ej1 {
	
    public static void main(String[] args) {
    	
    	//Inicializamos las varibles y declaramos a 0 las variables "a" y "b"
        int n, a = 0, b = 0;

        Scanner scanner = new Scanner(System.in);
        
        //Creamos un bucle que seguirá funcionando hasta que el usuario introduzca un 0 por teclado
        do {
            System.out.println("Dame un número entero:");
            n = scanner.nextInt();
            
            //Cuando el número sea negativo a la variable "a" se le resta 1
            if (n < 0) {
                a = a - 1;
                
            //Y cuando sea positivo se suma 1 a la varible "b"
            } else {
                b = b + 1;
            }
        } while (n != 0);
        
        //Imprimimos el resultado de las variables "a" y "b"
        System.out.println("a: " + a);
        
        System.out.println("b: " + b);
        
        scanner.close();
    }
}

