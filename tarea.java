import java.util.Scanner;

public class tarea{

    // Función sumar
    public static int sumar(int x, int p) {
        return x + p;
    }

    // Función factorial
    public static int factorial(int x) {
        if (x > 1) {
            return x * factorial(x - 1);
        } else {
            return 1; 
        }
    }

    // Función multiplicar usando suma recursiva
    public static int multiplicar(int x, int p) {
        if (p > 1) {
            return x + multiplicar(x, p - 1);
        } else {
            return x;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dato = 0, conteo = 0, cantidad = 0;
        boolean bandera = false;
        double promedio;

        System.out.println("¿Desea ingresar un dato? (true/false)");
        bandera = scanner.nextBoolean();

        while (bandera) {
            System.out.println("Ingrese un dato:");
            dato = scanner.nextInt();
            conteo += dato;
            cantidad++;
            System.out.println("¿Desea ingresar un dato? (true/false)");
            bandera = scanner.nextBoolean();
        }

        if (cantidad > 0) {
            promedio = (double) conteo / cantidad;
            System.out.println("Promedio: " + promedio);
        } else {
            System.out.println("No se ingresaron datos.");
        }

        System.out.println("Suma de 20 + 5: " + sumar(20, 5));
        System.out.println("Factorial de 5: " + factorial(5));
        System.out.println("Multiplicación de 3x3: " + multiplicar(3,3));
    }
}