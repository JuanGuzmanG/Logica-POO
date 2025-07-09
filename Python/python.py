from re import match

def suma(a, b):
    return a + b
def resta(a, b):
    return a - b
def multiplicacion(a, b):
    return a * b
def division(a, b):
    if b == 0:
        return "Error: Division por cero"
    return a / b
def comparar(a, b):
    if a > b:
        return "Mayor"
    elif a < b:
        return "Menor"
    else:
        return "Igual"

print("ingrese dos numeros enteros:")
num1 = int(input("Numero 1: "))
num2 = int(input("Numero 2: "))

print("1. calculadora")
print("***************************************************")
print("* CALCULADORA AVANZADA *")
print("***************************************************")
print()
print("--- Operaciones Aritmeticas Basicas ---")
print(" 1. Sumar")
print(" 2. Restar")
print(" 3. Multiplicar")
print(" 4. Dividir")
print()
print("--- Analisis y Propiedades de Numeros (Resultado de la suma de ambos numeros) ---")
print(" 5. Comparar (mayor, menor o igual)")
print(" 6. Positividad si el resultado es positivo o negativo")
print(" 7. Paridad (par o impar)")
print(" 8. Tipo de numero (entero o decimal)")
print(" 9. Primalidad (primo o compuesto)")
print("10. Perfeccion (perfecto o no)")
print("11. Amistad (amigos o no)")
print("12. capicua o no")
print()
print("--- Analisis de Secuencias y Series ---")
print("13. Pertenencia a la secuencia Fibonacci")
print("14. Verificar si es un numero triangular")
print("15. Verificar si es un numero cuadrado perfecto")
print("---------------------------------------------------")

print("Ingrese el numero de la operacion que desea realizar:")
opcion = int(input())

match opcion:
    case 1: print(num1 + num2)
    case 2: print(resta(num1, num2))
    case 3: print(multiplicacion(num1, num2))
    case 4: print(division(num1, num2))
    case 5: print(comparar(num1, num2))
    case 6: print("Positivo" if (suma(num1, num2)) > 0 else "Negativo")
    case 7: print("Par" if (suma(num1, num2)) % 2 == 0 else "Impar")
    case 8: print("Entero" if (suma(num1, num2)) % 1 == 0 else "Decimal")
    case 9: print("Primo" if all((suma(num1, num2)) % i != 0
                      for i in range(2, int((suma(num1, num2)) ** 0.5) + 1))
                        and (suma(num1, num2)) > 1 else "Compuesto")
    case 10: print("Perfecto" if (suma(num1, num2)) == sum(i for i in range(1, (suma(num1, num2)) // 2 + 1) if (suma(num1, num2)) % i == 0) else "No Perfecto")
    case 11: print("Amigos" if (suma(num1, num2)) == (sum(i for i in range(1, num1) if num1 % i == 0) +
                        sum(i for i in range(1, num2) if num2 % i == 0)) else "No Amigos")
    case 12: print("Capicua" if str(suma(num1, num2)) == str(suma(num1, num2))[::-1] else "No Capicua")
    case 13:
        a, b = 0, 1
        while b < suma(num1, num2):
            a, b = b, a + b
        print("Pertenece a la secuencia Fibonacci" if b == suma(num1, num2) else "No pertenece a la secuencia Fibonacci")
    case 14: print("Triangular" if (((8 * (suma(num1, num2)) + 1) ** 0.5).is_integer()) else "No Triangular")
    case 15: print("Cuadrado Perfecto" if (int((suma(num1, num2)) ** 0.5) ** 2 == (suma(num1, num2))) else "No Cuadrado Perfecto")
    case _:
        print("Opcion no valida")
