import java.util.function.Supplier;

public class Ejemplo1 {
    public static void main(String[] args) {
        System.out.println(func_a());
        System.out.println(5 + func_b(2));
        System.out.println(func_c(() -> func_a()));
    }

    public static Integer func_a() {
        // System.out.println("Inside func_a");
        // Devuelve un valor entero
        return 0; // Puedes ajustar el valor de retorno según tus necesidades
    }

    public static int func_b(int y) {
        // System.out.println("Inside func_b");
        return y;
    }

    public static int func_c(Supplier<Integer> z) {
        // System.out.println("Inside func_c");
        z.get();
        return 0; // Un valor de retorno válido, puedes ajustarlo según tus necesidades
    }
}





