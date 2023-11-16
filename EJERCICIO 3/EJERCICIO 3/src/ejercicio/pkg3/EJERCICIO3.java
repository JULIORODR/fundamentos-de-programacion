package ejercicio.pkg3;
import java.util.Scanner;

public class EJERCICIO3 {

    
   public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese el valor: ");
        int num1 = teclado.nextInt();
        
        
        int  numero = (num1 * num1);
        
        System.out.println("El valor total es " + numero);
    }
}
