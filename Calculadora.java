import java.math.BigInteger;
import java.util.Scanner;

public class Calculadora {

    public static final int MIN_VALOR = -99999;
    public static final int MAX_VALOR = 99999;

    // Comprueba que el valor introducido está dentro del rango permitido [-99999, 99999]
    public static boolean esValido(long numero) {
        return numero >= MIN_VALOR && numero <= MAX_VALOR;
    }

    // Operación 1: Suma
    public static long sumar(int a, int b) {
        return (long) a + (long) b;
    }

    // Operación 2: Resta
    public static long restar(int a, int b) {
        return (long) a - (long) b;
    }

    // Operación 3: Multiplicación
    public static long multiplicar(int a, int b) {
        return (long) a * (long) b;
    }

    // Operación 4: Potencia (base ^ exponente) con BigInteger para evitar overflow
    public static BigInteger potenciar(int base, int exponente) {
        if (exponente < 0) {
            throw new IllegalArgumentException("El exponente no puede ser negativo.");
        }
        return BigInteger.valueOf(base).pow(exponente);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Operaciones disponibles:");
        System.out.println("1 - Suma (+)");
        System.out.println("2 - Resta (-)");
        System.out.println("3 - Multiplicacion (*)");
        System.out.println("4 - Potencia (^)");
        System.out.print("Selecciona una opcion (1-4): ");

        if (!scanner.hasNextInt()) {
            System.out.println("Error: la opcion debe ser un numero entero del 1 al 4.");
            scanner.close();
            return;
        }
        int opcion = scanner.nextInt();

        if (opcion < 1 || opcion > 4) {
            System.out.println("Error: opcion no permitida. Solo 1, 2, 3 o 4.");
            scanner.close();
            return;
        }

        System.out.print("Introduce el primer numero entero [-99999..99999]: ");
        if (!scanner.hasNextLong()) {
            System.out.println("Error: debes introducir un numero entero valido.");
            scanner.close();
            return;
        }
        long n1 = scanner.nextLong();

        System.out.print("Introduce el segundo numero entero [-99999..99999]: ");
        if (!scanner.hasNextLong()) {
            System.out.println("Error: debes introducir un numero entero valido.");
            scanner.close();
            return;
        }
        long n2 = scanner.nextLong();

        if (!esValido(n1) || !esValido(n2)) {
            System.out.println("Error: ambos numeros deben estar entre -99999 y 99999.");
            scanner.close();
            return;
        }

        int a = (int) n1;
        int b = (int) n2;

        switch (opcion) {
            case 1:
                System.out.println("Resultado: " + sumar(a, b));
                break;
            case 2:
                System.out.println("Resultado: " + restar(a, b));
                break;
            case 3:
                System.out.println("Resultado: " + multiplicar(a, b));
                break;
            case 4:
                try {
                    System.out.println("Resultado: " + potenciar(a, b));
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                break;
            default:
                System.out.println("Error: operacion no valida.");
                break;
        }

        scanner.close();
    }
}