package pe.edu.upeu.jqa.examen;

import pe.edu.upeu.jqa.utils.LeerTeclado;

public class ResoluciondelExamen {
    LeerTeclado teclado=new LeerTeclado();

    public  void Compañia() {
        int categoria, cantidad=0,i1=12,i2=8,i3=5;
        do {
            categoria=teclado.leer(0,"¿en que categoria es su auto: 1,2,3?");
            
        switch (categoria) {
            case 1:
                cantidad=teclado.leer(0,"cuantos vehiculos tiene de categoria 1");
                
                for (int j = 0; j < cantidad; j++) {
                System.out.println("Ustes debe pagar: "+i1+"%");
                }
                System.out.println("De toda la categoria se pagara"+i1+"%");
                break;
            case 2:
                cantidad=teclado.leer(0,"cuantos vehiculos tiene de categoria 2");
            
                for (int j = 0; j < cantidad; j++) {
                System.out.println("Ustes debe pagar: "+i2+"%");
               }
               System.out.println("De toda la categoria se pagara"+i2+"%");
                break;
            case 3:
                cantidad=teclado.leer(0,"cuantos vehiculos tiene de categoria 3");
                for (int j = 0; j < cantidad; j++) {
                System.out.println("Ustes debe pagar: "+i3+"%");
                }
                System.out.println("De toda la categoria se pagara"+i3+"%");
                break;
            default:System.out.println("Opcion incorrecta--escoja entre 1-2-3");
                break;
        }
        }
    
    while (categoria!=0);
 }
 public  void tablademultiplicaion1al20() {
    int numeros =1;

    for (int i = 0; i <20; i++) {
    for (int j = 1; j <=10; j++) {
        System.out.println(numeros+"x"+j+"="+(j*numeros));
        
    }
    numeros=numeros+1;
    System.out.println("................");
    }
}public  void divisores() {
    int nu,contn=0;
    nu=teclado.leer(0,"Indique la cantidad de numeros");
    
        while
        (contn<=nu) {
          if (nu % contn == 0) {
            System.out.println (contn);
          }  
       
      contn++;  
    
    }
}}

    
