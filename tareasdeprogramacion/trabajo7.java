import java.util.Scanner;
public class trabajo7 {
    static Scanner tecladoj=new Scanner(System.in);
     public static void salario() {
       //definir variables y otros XD
         int años=1;
    double salario=1500;
       //prosesoXD
      while (años<=6) {
       salario=(salario*0.1)+salario;
       //datos de salida XD
       System.out.println("su salario del año es:"+años+"es:"+salario);
       años++;   
      }
    }


    public static void main(String[] args) {
        salario();
}
}