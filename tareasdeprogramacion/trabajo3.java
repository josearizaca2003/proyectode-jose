import java.util.Scanner;
public class trabajo3 {
    static Scanner teclado=new Scanner(System.in);
    public static void deposito () {
        double cantidad=0;
        int cantaños=0, contador=1;
        System.out.println("Cuantos años ingreso dinero ");
            cantaños=teclado.nextInt();
        while (contador<=cantaños) {
            System.out.println("Indique la cantidad de dinero que ingreso el año"+contador+": ");
            cantidad=teclado.nextInt();
            cantidad=(cantidad*0.1)+cantidad;
            System.out.println("el año "+cantaños+"ahorro :"+cantidad);
            contador++;
        }
        
    }
    public static void main(String[] args) {
        deposito ();
    }
    
}