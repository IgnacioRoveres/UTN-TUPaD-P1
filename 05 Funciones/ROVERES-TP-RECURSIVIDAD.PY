# Ejercicio 1
def factorial(n):
    if n == 0 or n == 1:
        return 1
    return n * factorial(n - 1)

# Ejercicio 2
def fibonacci(n):
    if n == 0:
        return 0
    if n == 1:
        return 1
    return fibonacci(n - 1) + fibonacci(n - 2)

# Ejercicio 3
def potencia(n, m):
    if m == 0:
        return 1
    return n * potencia(n, m - 1)

# Ejercicio 4
def decimal_a_binario(n):
    if n == 0:
        return ''
    return decimal_a_binario(n // 2) + str(n % 2)

# Ejercicio 5
def es_palindromo(palabra):
    if len(palabra) <= 1:
        return True
    if palabra[0] != palabra[-1]:
        return False
    return es_palindromo(palabra[1:-1])

# Ejercicio 6
def suma_digitos(n):
    if n < 10:
        return n
    return n % 10 + suma_digitos(n // 10)

# Ejercicio 7
def contar_bloques(n):
    if n == 1:
        return 1
    return n + contar_bloques(n - 1)

# Ejercicio 8
def contar_digito(numero, digito):
    if numero == 0:
        return 0
    if numero % 10 == digito:
        return 1 + contar_digito(numero // 10, digito)
    return contar_digito(numero // 10, digito)