import java.util.Scanner;
class sumaNumeros{
static Scanner teclado=new Scanner(System.in);
public static void main(String[] arg){
  //definicion de variables u otros
  System.out.println("Ejercicio 01: ");
  int b, h, suma;
  //Datos de entrada
  System.out.println("Ingrese suma 1:");
  b=teclado.nextInt();
  System.out.println("Ingrese suma 2:");
  h=teclado.nextInt();  
  //Proceso
  suma=(b+h);
  //Datos de salida
  System.out.println("El suma es: "+suma);
}}