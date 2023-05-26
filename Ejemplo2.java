import java.util.function.Supplier;

public class Ejemplo2 {
    public static void main(String[] args) {
        // Llamada a la función obtenerMaximo con los argumentos 5, 8, 3, 10, 15
        int resultado = obtenerMaximo(5, 8, 3, 10, 15);
        System.out.println("Maximo: " + resultado);
    }

    // Función que encuentra el valor máximo entre cinco números enteros
    public static int obtenerMaximo(int num1, int num2, int num3, int num4, int num5) {
        /* La clase Math y el método max, se comparan los números de forma sucesiva
         para encontrar el máximo entre ellos*/
        int maximo = Math.max(num1, Math.max(num2, Math.max(num3, Math.max(num4, num5))));
        return maximo;
    }

    // Función func_a que retorna un entero
    public static int func_a() {
        return 0;
    }

    // Función func_b que toma un parámetro y lo retorna
    public static int func_b(int y) {
        return y;
    }

    // Función func_c que toma un Supplier (proveedor) como parámetro y retorna un entero
    public static int func_c(Supplier<Integer> z) {
        /*La lambda "z.get()" se utiliza para invocar el método get() del proveedor
        y obtener el valor que retorna*/
        z.get();
        return 0;
    }
}
