/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiantes
 */
public class Error3 {

class Calculadora{
    public void calcular(){
        System.out.println(4 + 5);
    }
}

        public void error(Calculadora c){
        try {
            c.calcular();
            
        } catch (NullPointerException ex3) {
            System.out.println("ERROR: "+ ex3.getMessage());
        }finally{
            System.out.println("Falta inicializar un objeto de la clase Calculadora");
            Calculadora calc = new Calculadora();
            calc.calcular();
        }
    }
}