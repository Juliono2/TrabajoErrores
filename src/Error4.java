
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Error4 {
    
    static int a;

    public int getA() {
        return a;
    }
    
      public static void tamañoDeArreglo(){
        System.out.println("De que tamaño desea el arreglo?");
        Scanner Sn = new Scanner(System.in);
        a=Sn.nextInt(); 
        int [] Array = new int[a];
    }
    public void error(){
        
        int b=0;

      try{
          tamañoDeArreglo();
      } catch (NegativeArraySizeException ex4){
          System.out.println("Error: "+ ex4.getMessage());
          System.out.println("Se tomara el valor absoluto de la cantidad ingresada");
          b = b -a;
          a=b;
      }finally{
          System.out.println("La dimension del arreglo es positiva "+a);
    
}
}
}