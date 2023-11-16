package suma;
import java.util.Scanner;

public class SUMA {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese el valor: ");
        int num1 = teclado.nextInt();
        
        System.out.print("Ingrese el valor: ");
        int num2 = teclado.nextInt();
        
        int suma = (num1 + num2);
        
        System.out.println("El valor total es " + suma);
    }
}