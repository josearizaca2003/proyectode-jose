package trabjode1;
import java.util.Scanner;
 
public class trabajo01 {
    static Scanner teclado=new Scanner(System.in);
    public static void ingresarsueldo() {
        float sueldo;
        System.out.println("Ingrese el sueldo");
        sueldo=teclado.nextFloat();
        if (sueldo>5000) {
            System.out.println("Debe pagar inpuesto ala SUNAT");
        }
        else {
            System.out.println(" NO debe pagar inpuesto ala SUNAT");
        }
 
    }
    public static void main(String[] args) {
        ingresarsueldo();
        
    }
}
