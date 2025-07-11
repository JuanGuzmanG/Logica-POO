#include <iostream>
#include <string>
using namespace std;
int main(int argc, char *argv[])
{

    int number1, number2, result;
    cout << "Calculadora!" << endl;
    cout << "ingresa un numero" << endl;
    cin >> number1;
    cout << "ingresa otro numero" << endl;
    cin >> number2;

    cout << "***************************************************" << endl;
    cout << "* CALCULADORA AVANZADA *" << endl;
    cout << "***************************************************" << endl;
    cout << endl;
    cout << "--- Operaciones Aritmeticas Basicas ---" << endl;
    cout << " 1. Sumar" << endl;
    cout << " 2. Restar" << endl;
    cout << " 3. Multiplicar" << endl;
    cout << " 4. Dividir" << endl;
    cout << endl;
    cout << "--- Analisis y Propiedades de Numeros (Resultado de la suma de ambos numeros) ---" << endl;
    cout << " 5. Comparar (mayor, menor o igual)" << endl;
    cout << " 6. Positividad si el resultado es positivo o negativo" << endl;
    cout << " 7. Paridad (par o impar)" << endl;
    cout << " 8. Tipo de numero (entero o decimal)" << endl;
    cout << " 9. Primalidad (primo o compuesto)" << endl;
    cout << "10. Perfeccion (perfecto o no)" << endl;
    cout << "11. Amistad (amigos o no)" << endl;
    cout << "12. capicua o no" << endl;
    cout << endl;
    cout << "--- Analisis de Secuencias y Series ---" << endl;
    cout << "13. Pertenencia a la secuencia Fibonacci" << endl;
    cout << "14. Verificar si es un numero triangular" << endl;
    cout << "15. Verificar si es un numero cuadrado perfecto" << endl;
    cout << "---------------------------------------------------" << endl;

    int option;
    cout << "Elige una opcion (1-15): ";
    cin >> option;

    switch (option)
    {
    case 1:
        cout << "Resultado de la suma: " << suma(number1, number2) << endl;
        break;
    case 2:
        result = resta(number1, number2);
        cout << "Resultado de la resta: " << result << endl;
        break;
    case 3:
        result = multiplicacion(number1, number2);
        cout << "Resultado de la multiplicacion: " << result << endl;
        break;
    case 4:
        cout << (number2 != 0 ? "Resultado de la division: " 
            + to_string(division(number1, number2)) : "Error: Division por cero no permitida.") << endl;
        break;
    case 5:
        cout << "(number1 + number2) ? " << (suma(number1, number2) > 0 ? "positivo" : "negativo") << endl;
        break;
    case 6:
        cout << "El resultado de la suma es: " << (suma(number1, number2) > 0 ? "positivo" : "negativo") << endl;
        break;
    case 7:
        cout << "El resultado de la suma es: " << (suma(number1, number2) % 2 == 0 ? "par" : "impar") << endl;
        break;
    case 8: 
        cout << "El resultado de la suma es: " << (suma(number1, number2) == static_cast<int>(suma(number1, number2)) ? "entero" : "decimal") << endl;
        break;
    case 9:
        int sum = suma(number1, number2);
        cout << "El resultado de la suma es: " << (esPrimo(sum) ? "primo" : "compuesto") << endl;
        break;
    case 10:

        break;
    default:
        cout << "Opcion no valida." << endl;
    }
}
int suma(int number1, int number2){
    return number1 + number2;
}
int resta(int number1, int number2){
    return number1 - number2;
}
int multiplicacion(int number1, int number2){
    return number1 * number2;
}
double division(int number1, int number2){
    return static_cast<double>(number1) / number2;
}
bool esPrimo(int number){
    if (number <= 1) return false;
    for (int i = 2; i <= number / 2; ++i) {
        if (number % i == 0) return false;
    }
    return true;
}