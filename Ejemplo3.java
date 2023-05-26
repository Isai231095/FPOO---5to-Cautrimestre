import java.util.Arrays;
import java.util.List;

public class Ejemplo3 {
    public static void main(String[] args) {
        // Crea de una lista de números enteros
        List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);
        
        // Llama a la función calcularPromedio 
        double promedio = calcularPromedio(numeros);
        
        // Imprimir promedio
        System.out.println("Promedio: " + promedio);
    }

    // Función calcular el promedio de una lista
    public static double calcularPromedio(List<Integer> numeros) {
        int suma = 0;
        
        /* Iterar sobre la lista de números utilizando un bucle for-each
        y sumar los números para obtener la suma total */
        for (int num : numeros) {
            suma += num;
        }
        
        /* Calcula el promedio dividiendo la suma entre el tamaño de la lista
        y convierte el resultado a un número de punto flotante (double)*/
        return (double) suma / numeros.size();
    }
}

