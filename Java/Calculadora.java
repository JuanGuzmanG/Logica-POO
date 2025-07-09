
public class Calculadora {

    public static void main(String[] args) {
        System.out.println("1. calculadora");
        System.out.println("agrega un numero: ");
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            int numero = scanner.nextInt();
            System.out.println("agrega otro numero: ");
            int numero2 = scanner.nextInt();

            System.out.println("***************************************************");
            System.out.println("* CALCULADORA AVANZADA *");
            System.out.println("***************************************************");
            System.out.println();
            System.out.println("--- Operaciones Aritmeticas Basicas ---");
            System.out.println(" 1. Sumar");
            System.out.println(" 2. Restar");
            System.out.println(" 3. Multiplicar");
            System.out.println(" 4. Dividir");
            System.out.println();
            System.out.println("--- Analisis y Propiedades de Numeros (Resultado de la suma de ambos numeros) ---");
            System.out.println(" 5. Comparar (mayor, menor o igual)");
            System.out.println(" 6. Positividad si el resultado es positivo o negativo");
            System.out.println(" 7. Paridad (par o impar)");
            System.out.println(" 8. Tipo de numero (entero o decimal)");
            System.out.println(" 9. Primalidad (primo o compuesto)");
            System.out.println("10. Perfeccion (perfecto o no)");
            System.out.println("11. Amistad (amigos o no)");
            System.out.println("12. capicua o no");
            System.out.println();
            System.out.println("--- Analisis de Secuencias y Series ---");
            System.out.println("13. Pertenencia a la secuencia Fibonacci");
            System.out.println("14. Verificar si es un numero triangular");
            System.out.println("15. Verificar si es un numero cuadrado perfecto");
            System.out.println("---------------------------------------------------");
            int operacion = scanner.nextInt();

            switch (operacion) {
                case 1 ->
                    System.out.println("Resultado: " + suma(numero, numero2));
                case 2 ->
                    System.out.println("Resultado: " + resta(numero, numero2));
                case 3 ->
                    System.out.println("Resultado: " + multiplicacion(numero, numero2));
                case 4 ->
                    System.out.println("Resultado: " + division(numero, numero2));
                case 5 -> {
                    System.out.println(numero == numero2 ? "Los números son iguales."
                            : (numero > numero2 ? "El primer número es mayor." : "El segundo número es mayor."));
                }
                case 6 -> {
                    System.out.println(esPositivo(numero, numero2)
                            ? "La suma de " + numero + " y " + numero2 + " es positiva."
                            : "La suma de " + numero + " y " + numero2 + " es negativa.");
                }
                case 7 -> {
                    System.out.println(esPar(numero, numero2)
                            ? "La suma de " + numero + " y " + numero2 + " es par. " + suma(numero, numero2)
                            : "La suma de " + numero + " y " + numero2 + " es impar. " + suma(numero, numero2));
                }
                case 8 -> {
                    System.out.println(suma(numero, numero2) % 1 == 0
                            ? "El resultado es entero."
                            : "El resultado es decimal.");
                }
                case 9 -> {
                    System.out.println(esPrimo(suma(numero, numero2))
                            ? "El resultado es un número primo."
                            : "El resultado es un número compuesto.");
                }
                case 10 -> {
                    int resultado = suma(numero, numero2);
                    System.out.println(sumaDivisores(resultado) == resultado
                            ? "El número " + resultado + " es un número perfecto."
                            : "El número " + resultado + " no es un número perfecto.");
                }
                case 11 -> {
                    int divisores1 = sumaDivisores(numero);
                    int divisores2 = sumaDivisores(numero2);
                    System.out.println(divisores1 == numero2 && divisores2 == numero
                            ? "Los números " + numero + " y " + numero2 + " son amigos."
                            : "Los números " + numero + " y " + numero2 + " no son amigos.");
                }
                case 12 -> {
                    String numeroStr = String.valueOf(suma(numero, numero2));
                    String numeroReverso = new StringBuilder(numeroStr).reverse().toString();
                    System.out.println(numeroStr.equals(numeroReverso)
                            ? "El número " + numeroStr + " es capicúa."
                            : "El número " + numeroStr + " no es capicúa.");
                }
                case 13 -> {
                    int resultado = suma(numero, numero2);
                    boolean esFibonacci = false;
                    int a = 0, b = 1;
                    while (b < resultado) {
                        int temp = b;
                        b += a;
                        a = temp;
                    }
                    if (b == resultado) {
                        esFibonacci = true;
                    }
                    System.out.println("El número " + resultado + (b == resultado
                    ? " pertenece" 
                    : " no pertenece") + " a la secuencia Fibonacci.");
                }
                case 14 -> {
                    int n = suma(numero, numero2);
                    int triangular = 0;
                    for (int i = 1; triangular < n; i++) {
                        triangular += i;
                    }
                    System.out.println(triangular == n
                    ? "El número " + n + " es un número triangular."
                    : "El número " + n + " no es un número triangular.");
                }
                case 15 -> {
                    int n = suma(numero, numero2);
                    double raiz = Math.sqrt(n);
                    System.out.println(raiz == Math.floor(raiz)
                    ? "El número " + n + " es un cuadrado perfecto."
                    : "El número " + n + " no es un cuadrado perfecto.");
                }
                default ->
                    System.out.println("Operación no válida. Por favor, elige una opción del menú.");
            }
        }
    }

    public static int sumaDivisores(int numero) {
        int suma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        return suma;
    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    public static float division(int a, int b) {
        try {
            return (float) a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division por cero no permitida.");
            return -1;
        }
    }

    public static boolean esPositivo(int numero, int numero2) {
        int resultado = suma(numero, numero2);
        return resultado >= 0;
    }

    public static boolean esPar(int numero, int numero2) {
        int resultado = suma(numero, numero2);
        return resultado % 2 == 0;
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            System.out.println("El número debe ser mayor que 1 para ser considerado primo o compuesto.");
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
