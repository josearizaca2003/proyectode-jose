import java.util.Scanner;

public class trabajo8 {
    static Scanner teclado=new Scanner(System.in);
    public static void tarea() {
   //definir variables y Otros xd 
   int ncantidad,ncero=0,nmayorcero=0,nmenorcero=0;
   //datos de entrada xd
  System.out.println("ingrese n cantidad:");
   ncantidad=teclado.nextInt();
   //proseso
   int contador=1;
   while (contador<=ncantidad) {
       System.out.println("ingrese un numero en la posicion "+contador+":");
       int numero=teclado.nextInt();
       if (numero==0 ) {
         ncero+=1;} 

        if (numero>0 ) {
        nmayorcero+=1;}

        if (numero<0) {
        nmenorcero+=1;}
        
    contador++;
            
   }
   //datos de salida xd
   System.out.println("el resultado es:");
   System.out.println(ncero+"=cero");
   System.out.println(nmayorcero+"=nmayorcero");
   System.out.println(nmenorcero+"=nmenorcero");
    }
public static void main(String[] args) {
    tarea();
}  
}