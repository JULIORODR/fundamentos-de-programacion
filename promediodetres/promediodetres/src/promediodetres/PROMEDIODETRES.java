
package promediodetres;

import java.util.Scanner;

public class PROMEDIODETRES {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();
        
        System.out.print("Ingrese el tercer número: ");
        int numero3 = scanner.nextInt();
        
        int suma = numero1 + numero2 + numero3;
        double promedio = suma / 3.0;
        
        System.out.println("Los números ingresados son: " + numero1 + ", " + numero2 + ", " + numero3);
        System.out.println("El promedio de los números es: " + promedio);
    }
}
