using System;

namespace LogicaPOO
{
    class CSharp
    {
        static void Main(string[] args)
        {
            int num1 = 0, num2 = 0;

            Console.WriteLine("Ingrese el primer numero:");
            num1 = int.Parse(Console.ReadLine());
            Console.WriteLine("Ingrese el segundo numero:");
            num2 = int.Parse(Console.ReadLine());

            Console.WriteLine("1. calculadora");
            Console.WriteLine("***************************************************");
            Console.WriteLine("* CALCULADORA AVANZADA *");
            Console.WriteLine("***************************************************");
            Console.WriteLine();
            Console.WriteLine("--- Operaciones Aritmeticas Basicas ---");
            Console.WriteLine(" 1. Sumar");
            Console.WriteLine(" 2. Restar");
            Console.WriteLine(" 3. Multiplicar");
            Console.WriteLine(" 4. Dividir");
            Console.WriteLine();
            Console.WriteLine("--- Analisis y Propiedades de Numeros (Resultado de la suma de ambos numeros); ---");
            Console.WriteLine(" 5. Comparar (mayor, menor o igual);");
            Console.WriteLine(" 6. Positividad si el resultado es positivo o negativo");
            Console.WriteLine(" 7. Paridad (par o impar);");
            Console.WriteLine(" 8. Tipo de numero (entero o decimal);");
            Console.WriteLine(" 9. Primalidad (primo o compuesto);");
            Console.WriteLine("10. Perfeccion (perfecto o no);");
            Console.WriteLine("11. Amistad (amigos o no);");
            Console.WriteLine("12. capicua o no");
            Console.WriteLine();
            Console.WriteLine("--- Analisis de Secuencias y Series ---");
            Console.WriteLine("13. Pertenencia a la secuencia Fibonacci");
            Console.WriteLine("14. Verificar si es un numero triangular");
            Console.WriteLine("15. Verificar si es un numero cuadrado perfecto");
            Console.WriteLine("---------------------------------------------------");
            Console.WriteLine("Seleccione una opcion (1-15):");
            int opcion = int.Parse(Console.ReadLine());

            switch (opcion)
            {
                case 1:
                    Console.WriteLine($"Resultado: {Sumar(num1, num2)}");
                    break;
                case 2:
                    Console.WriteLine($"Resultado: {Restar(num1, num2)}");
                    break;
                case 3:
                    Console.WriteLine($"Resultado: {Multiplicar(num1, num2)}");
                    break;
                case 4:
                    Console.WriteLine($"Resultado: {Dividir(num1, num2)}");
                    break;
                case 5:
                    Console.WriteLine(
                        num1 == num2 ? "Los numeros son iguales." :
                        num1 > num2 ? "El primer numero es mayor que el segundo." :
                        "El primer numero es menor que el segundo."
                    );
                    break;
                default:
                    Console.WriteLine("Opcion no valida.");
                    break;
            }
        }

        #region Operaciones Aritmeticas Basicas
        static int Sumar(int a, int b) => a + b;
        static int Restar(int a, int b) => a - b;
        static int Multiplicar(int a, int b) => a * b;
        static double Dividir(int a, int b) => b != 0 ? (double)a / b : throw new DivideByZeroException("No se puede dividir por cero.");

        #endregion
    }
}