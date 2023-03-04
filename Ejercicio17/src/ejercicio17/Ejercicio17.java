package ejercicio17;
import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        double radio, area, circunferencia;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el valor del radio:");
        radio = entrada.nextDouble();
        
        area = Math.PI * Math.pow(radio,2);
        circunferencia = 2 * Math.PI * radio;
        
        System.out.println("El area de la circunferencia es: " + area);
        System.out.println("La longitud de la circunferencia es: " + circunferencia);
        
    }
    
}
