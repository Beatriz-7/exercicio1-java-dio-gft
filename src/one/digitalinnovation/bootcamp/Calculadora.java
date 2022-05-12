package one.digitalinnovation.bootcamp;

/**
 * exercício aula 1, métodos
 */


public class Calculadora {

     public static void soma(double num1, double num2) {

         double result = num1 + num2;

         System.out.println("A soma de " + num1 + " mais " + num2 + " é igual a " + result);
     }

     public static void subtracao(double num1, double num2) {

         double result = num1 - num2;

         System.out.println(" A subtracao de " + num1 + " menos " + num2 + " é igual a " + result);
     }

     public static void multiplicacao(double num1, double num2) {

         double result = num1 * num2;

         System.out.println(" A multiplicacao de " + num1 + " vezes " + num2 + " é igual a " + result);
     }

     public static void divisao(double num1, double num2) {

         double result = num1 / num2;

         System.out.println(" A divisao de " + num1 + " por " + num2 + " é igual a " + result);
     }
}
