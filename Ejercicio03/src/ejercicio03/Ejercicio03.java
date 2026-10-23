/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

   public static void main(String[] args) {
        // (25 + 15) / 8 + raiz de 49 + 2.5
        double numerador = 25 + 15;        // 40
        double division = numerador / 8;   // 5
        double raiz = Math.sqrt(49);       // 7
        double resultado = division + raiz + 2.5; // 5 + 7 + 2.5

        System.out.println("Expresion: (25 + 15) / 8 + sqrt(49) + 2.5");
        System.out.println("Resultado = " + resultado);
    }
}