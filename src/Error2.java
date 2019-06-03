
import java.util.InputMismatchException;
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
public class Error2 {
    
    public static int numero1;
    private static int numero2;
    
    public static void tomarNumeros(){
        try{
        System.out.println("Ingresa el primer valor");
        Scanner Sn = new Scanner(System.in);
        numero1= Sn.nextInt();
        System.out.println("Ingresa el segundo valor");
        Scanner Sn2 = new Scanner (System.in);
        numero2= Sn2.nextInt();
        }catch(InputMismatchException ex2){
            throw new MiExceptionInput();
            
        }
    }
    
    public static void error (){
        try {
        
           tomarNumeros();
        }catch(MiExceptionInput ex2){
            System.out.println("ERROR: "+ ex2.getMessage());
            System.out.println("Pa primaria mijo, meta NUMEROS!!");
            error();
        }finally{   
            
        }
    }
}

class MiExceptionInput extends InputMismatchException{
    public String getMessage(){
        return "No se esperaba esta entrada";
    }
}
    
    

