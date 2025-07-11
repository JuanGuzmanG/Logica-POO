int suma(int number1, int number2)
{
    return number1 + number2;
}
int resta(int number1, int number2)
{
    return number1 - number2;
}
int multiplicacion(int number1, int number2)
{
    return number1 * number2;
}
double division(int number1, int number2)
{
    return static_cast<double>(number1) / number2;
}
bool esPrimo(int number)
{
    if (number <= 1)
        return false;
    for (int i = 2; i <= number / 2; ++i)
    {
        if (number % i == 0)
            return false;
    }
    return true;
}
int sumaDivisores(int number)