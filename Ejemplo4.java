import java.util.function.Supplier;

public class Ejemplo4 {
    public static void main(String[] args) {
        // Se multiplica 25 por 2 -> variable "numero"
        int numero = (25 * 2);

        // Se llama a la función -> "numero" como argumento
        int resultado = incrementar(numero);

        // Se imprime actual valor -> "numero"
        System.out.println("El valor de numero después de llamar a incrementarNumero: " + numero);
    }

    public static int incrementar(int n) {
        // Declara una variable local "m"= 50
        int m = 50;

        // Raíz cuadrada de la suma de "n" y "m"
        int v = (int) Math.sqrt(n + m);

        // Imprime el mensaje del resultado
        System.out.println("La raiz cuadrada de " + (n + m) + " es " + v);

        // Se retorna el valor final
        return v;
    }
}