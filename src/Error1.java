
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiantes
 */
public class Error1 {
    //ERROR ARITMETICO

    private static int numero1 =10;
    private static int numero2 =0;
    private static float resultado;

    public static float division() {

        resultado = numero1 / numero2;

        return resultado;
    }

    
    public void error(){
        
    try {

    division();

    }
    catch (ArithmeticException ex1){
        System.out.println("Error:"+ex1.getMessage());
   }finally {
        System.out.println("Aprenda a dividir perro jijueputa!! \n Por favor vuelve a digitar el denominador :3");
        Scanner entrada= new Scanner(System.in);
        numero2 = entrada.nextInt();
        System.out.println("El demonimador va a ser :"+numero2 );
        System.out.println("El resultado es: "+division());
    }
  
 }
}
