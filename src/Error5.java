/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Error5 {
    
    public static String cadena = "abcdperros";
    public static int a;
    
    public static void conversion(){
        a= Integer.parseInt(cadena);
    }
    
    public void error(){
        try{
            conversion();
        } catch (NumberFormatException ex5){
            System.out.println("ERROR: "+ ex5.getMessage());
            System.out.println("La cadena no posible convertirla en numeros por su formato");
        }
    }
   
}
