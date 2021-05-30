import java.util.Scanner;
class trabajo4{
static Scanner teclado=new Scanner(System.in);
static void preciosdeproductos(){
//definir variables y otros xd
System.out.println("algoritmo para definir cuanto le descontara");
String descuentoGEYV=""; 
//datos de entrada xd
int precio= teclado.nextInt();
if(precio<=200){
descuentoGEYV="0.15";
}else if (precio>100 && precio<200){
descuentoGEYV="0.12";}
else if (precio<100){
descuentoGEYV="0.10";}
 
System.out.println("la persona va a recivir un descuento de: "+descuentoGEYV);
}
public static void main(String[] arg){preciosdeproductos();
}
}