
package conversion;
import java.util.Scanner;
public class Conversion {
    double euro;
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
     System.out.println("Introduzca el valor en euros");
     double euro = teclado.nextDouble();
     double conversion = (euro*1.07);
     System.out.println("El valor del euro a dolar "+ conversion);
     }


}
