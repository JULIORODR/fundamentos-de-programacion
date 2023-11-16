
package areayvolumen;

import java.util.Scanner;

public class AREAYVOLUMEN {

 public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
  
        System.out.print("Ingrese el radio del cilindro: ");
        double radio = teclado.nextDouble();
        
        System.out.print("Ingrese la altura del cilindro: ");
        double altura = teclado.nextDouble();
        
        double areaBase =(3.14 * radio * 2);
         double areaLateral =( 2 * 3.14* radio * altura);
          double areaTotal = (2 * areaBase + areaLateral);
           double volumen = areaBase * altura;
            
            System.out.println("El área de la base del cilindro es: " + areaBase);
        System.out.println("El área lateral del cilindro es: " + areaLateral);
        System.out.println("El área total del cilindro es: " + areaTotal);
        System.out.println("El volumen del cilindro es: " + volumen);

        
 
 
 }
}