/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01;

/**
 *
 * @author su-usuario-github
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solución a la problemática
        
      // (18 + 6 * 3) / 4 + raiz cuadrada de 64
      double numerador = 18 + 6 * 3;        // 18 + 18 = 36 
      double division = numerador / 4;    // 36 / 4 = 9
      double raiz = Math.sqrt(64);        // raiz de 64 = 8      
      double resultado = division + raiz; // 9 + 8 = 17  
        
        System.out.println("Expresion: (18 +6 * 3) /4 + sqrt(64)");
        System.out.println("Resultado = " + resultado);
       

    }

}
