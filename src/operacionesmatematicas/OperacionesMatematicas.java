
package operacionesmatematicas;

/**
 * 
 * @author Alfonso
 * @version 1.1 04/10/2024
 * 
/**
 * Clase que contiene métodos para operaciones matemáticas básicas.
 */
public class OperacionesMatematicas {

    /**
     * Suma dos números enteros y devuelve el resultado.
     *
     * @param numero1 El primer número a sumar.
     * @param numero2 El segundo número a sumar.
     * @return La suma de numero1 y numero2.
     */
    
    public static int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }
    /**
     * Resta dos números enteros y devuelve el resultado.
     *
     * @param numero1 El primer número a restar.
     * @param numero2 El segundo número a restar.
     * @return La resta de numero1 y numero2.
     */
    public static int restar(int numero1, int numero2) {
        return numero1 - numero2;
    }

    /**
     * Método principal que ejecuta el programa para sumar dos números.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan aquí).
     */
    
    /**
     * Resta dos números enteros y devuelve el resultado.
     *
     * @param numero1 El primer número a restar.
     * @param numero2 El segundo número a restar.
     * @return La resta de numero1 y numero2.
     */
    public static int multiplicar(int numero1, int numero2) {
        return numero1 * numero2;
    }

    /**
     * Método principal que ejecuta el programa para sumar dos números.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan aquí).
     */
    public static void main(String[] args) {
        
        int num1 = 5;
        int num2 = 3;

        // Llamar al método sumar
        int resultado = sumar(num1, num2);
       
   // Llamar al método restar
        int resta = restar(num1, num2);
        
        // Imprimir el resultado
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + resultado);
        
         // Imprimir el resultado
        System.out.println("La resta de " + num1 + " y " + num2 + " es: " + resta);
        
        
    }
}
