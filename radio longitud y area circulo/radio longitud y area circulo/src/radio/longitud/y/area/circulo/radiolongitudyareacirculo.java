
package radio.longitud.y.area.circulo;
import java.util.Scanner;

public class radiolongitudyareacirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el radio de la circunferencia: ");
        double radio = scanner.nextDouble();
        
        double longitud = 2 * 3.14 * radio;
        double area = (3.14 * radio * 2);
        
        System.out.println("La longitud de la circunferencia es: " + longitud);
        System.out.println("El área del círculo inscrito es: " + area);
    }

}