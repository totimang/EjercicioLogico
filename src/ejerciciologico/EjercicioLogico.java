/* Realizar un programa que permita el intercambio de valores entre dos variables
 * Por ejemplo: Si una variable numero vale 35 y una variable numero2 vale 20,
 * realizar las acciones necesarias para que numero pase a valer 20 y numero2
 * pase a valer 35. Una vez realizado el cambio mostrar
 * el resultado en pantalla
 */
package ejerciciologico;


public class EjercicioLogico {

    
    public static void main(String[] args) {
        
        int num1 = 35;
        int num2 = 20;
        int aux;
        
        System.out.println("-----Antes-----");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
        
        aux = num2; //aux va a ser igual a num2 que vale 20
        num2 = num1; //num2 va a ser igual a num1 que vale 35
        num1 = aux; //num1 toma el valor de aux que vale 20, se anula la linea 23
        
        System.out.println("-----Después-----");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
        
    }
    
}
