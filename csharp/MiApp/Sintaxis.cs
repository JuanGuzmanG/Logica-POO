using System;

class Program
{
    static void Main(string[] args)
    {
        int entero = 10;
        const int constante = 20;
        double deci = 10.5;
        float flotante = 1.23123f;
        bool booleano = true;
        char caracter = 'a';
        string cadena = "Hola Mundo";
        object objeto = "Soy un objeto";

        Console.WriteLine("hola mundo");
        Console.WriteLine("aritmeticos: +,-,/,%,*");
        Console.WriteLine("Comparacion: ==,!=,>,<,>=,<=");
        Console.WriteLine("Logicos: && y, || o, ! negacion");

        //condicionales
        if (entero == constante)
        {
            Console.WriteLine("Los valores son iguales");
        }
        else if (entero > constante)
        {
            Console.WriteLine("El entero es mayor que la constante");
        }
        else
        {
            Console.WriteLine("Los valores son diferentes");
        }
        switch (entero)
        {
            case 1:
                Console.WriteLine("El entero es 1");
                break;
            default:
                Console.WriteLine("El entero no es 1");
                break;
        }

        //bucles
        for (int i = 0; i < 2; i++)
        {
            Console.WriteLine("Bucle for: " + i);
        }
        while (entero < 3)
        {
            Console.WriteLine("Bucle while: " + entero);
            entero++;
        }
        do
        {
            Console.WriteLine("Bucle do-while: " + entero);
            entero--;
        } while (entero > 0);

        //instanciar clase
        persona estudiante = new persona("juan", 20);
        estudiante.mostrar();

        //arreglos
        int[] numeros = [1, 2, 3, 4, 5];
        int[] numerosadd = new int[3];
        numeros[0] = 1;
        numerosadd.SetValue(6, 0);
        Console.WriteLine(numerosadd.GetValue(0));
        foreach (int numero in numeros)
        {
            Console.WriteLine("Numero: " + numero);
        }

        //matriz
        int[,] matriz = new int[2, 2] { { 1, 2 }, { 3, 4 } };
        int[,] matriz2 = new int[3, 2];
        matriz2[0, 0] = 5;
    }

    public class persona
    {
        public string nombre { get; set; }
        public int edad { get; set; }

        public persona(string nombre, int edad)
        {
            this.nombre = nombre;
            this.edad = edad;
        }

        public void mostrar()
        {
            Console.WriteLine("Nombre: " + nombre + ", Edad: " + edad);
        }
    }
}
