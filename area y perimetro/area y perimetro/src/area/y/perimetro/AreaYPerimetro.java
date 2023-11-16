
package area.y.perimetro;

import java.util.Scanner;

public class AreaYPerimetro{ 
     
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("calcular el Area: ");
        int lado1 = teclado.nextInt();
        
        
        int lado = (lado1 * lado1);
        
         System.out.println("El Area es " + lado);
        
          System.out.print("calcular el Perimetro: ");
        int lad2 = teclado.nextInt();
        
         lad2 = (lad2 * 4);
        System.out.println("El Perimetro es " + lad2);
    }
}
