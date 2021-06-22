package pe.edu.epeu.arreglos;

public class ejemplovenctores {

    public static void conceptosvectores(){
        //Definir un vectores
        int[] vectorx;
        int  []vectorv;
        //Defeninir tamaño de un vector
        vectorx=new int[2];
        vectorx[0]=20;//[0]indice/posicion
        vectorx[1]=8;//[1]indice/posicion
        //vectorx[2]=5;
        System.out.println("Imprimir el valor del vector");
        System.out.println(vectorx[0]);//imprimiendo el valor o elemento
        int[] vA={12,1,2,3,4,5,6,7,8,9,10};
        int[] vB=new int[]{12,1,2,3,4,5,6,7,8,9,10};
        //conocer el tamaño del vector 
        System.out.println("tamaho del vector vB="+vB.length);



    } 
    //Crea un array de 10 posiciones de números con valores pedidos por teclado. 
    //Muestra por consola el indice y el valor al que corresponde. 
    //Haz dos métodos, uno para rellenar valores y otro para mostrar.


    public static void mostrarValores(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println("v["+i+"]= "+vector[i]+"   Su indice es: "+i+" Su valor es:"+vector[i]);        
        }
    }

    public static int[] rellenarVector(int tv) {
       int[] vector=new int[tv]; 
       Scanner cs=new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.print("ingrese el valor del indice "+i+":");
            vector[i]=cs.nextInt();
            System.out.println("");
        }
        mostrarValores(vector);
        return vector;
    }

    public static void main(String[] args) {
        conceptosVectores();
        System.out.println("Ejercicio 01");
        rellenarVector(10);
    }

}


    public static void main(String[] args) {
        System.out.println("hola mundo"); 
        
    }
}
