import java.util.Scanner;
class trabajo5{
static Scanner teclado=new Scanner(System.in);
static void sueldo7diasl(){
//definir variables y otros xd
System.out.println("Ejemplo estructura Condicional Multiple 1 ");
String descuenta="";
//datos de entrada xd
int ganancias= teclado.nextInt();
if(ganancias<=150){
descuenta="0.5";
}else if (ganancias>150 && ganancias<300){
 descuenta="0.7";}
 else if (ganancias>300 && ganancias<450){
 descuenta="0.9";}
  //datos de salida:xd
  System.out.println("se le descuenta : "+descuenta);
}
public static void main(String[] arg){sueldo7diasl();}
}