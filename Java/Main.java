
public class Main {

    public static void main(String[] args) {
        System.out.println("1. calculadora");
        System.out.println("agrega un numero: ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        scanner.useDelimiter("\n");

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
        System.out.println("12. Palindromo (capicua o no)");
        System.out.println();
        System.out.println("--- Analisis de Secuencias y Series ---");
        System.out.println("13. Pertenencia a la secuencia Fibonacci");
        System.out.println("14. Verificar si es un numero triangular");
        System.out.println("15. Verificar si es un numero cuadrado perfecto");
        System.out.println();
        System.out.println("--- Validacion de Sistemas Numericos ---");
        System.out.println("16. Validar formato Hexadecimal");
        System.out.println("17. Validar formato Octal");
        System.out.println("---------------------------------------------------");
        int operacion = scanner.nextInt();

        switch (operacion) {
            case 1:
                System.out.println("Resultado: " + suma(numero, numero2));
                break;
            case 2:
                System.out.println("Resultado: " + resta(numero, numero2));
                break;
            case 3:
                System.out.println("Resultado: " + multiplicacion(numero, numero2));
                break;
            case 4:
                System.out.println("Resultado: " + division(numero, numero2));   
                break;
            case 5:
                if (numero > numero2) {
                    System.out.println(numero + " es mayor que " + numero2);
                } else if (numero < numero2) {
                    System.out.println(numero + " es menor que " + numero2);
                } else {
                    System.out.println("Los numeros son iguales.");
                }
            case 6: 
                if(esPositivo(numero, numero2)) {
                    System.out.println("La suma de " + numero + " y " + numero2 + " es positiva. "+ suma(numero, numero2));
                } else {
                    System.out.println("La suma de " + numero + " y " + numero2 + " es negativa."+ suma(numero, numero2));
                }
            case 7:
                if(esPar(numero, numero2)) {
                    System.out.println("La suma de " + numero + " y " + numero2 + " es par. " + suma(numero, numero2));
                } else {
                    System.out.println("La suma de " + numero + " y " + numero2 + " es impar. " + suma(numero, numero2));
                }
            case 8:
                if (suma(numero, numero2) % 1 == 0) {
                    System.out.println("El resultado es entero.");
                } else {
                    System.out.println("El resultado es entero.");
                }
            default:
                throw new AssertionError();
        }
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
        try{
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

}
