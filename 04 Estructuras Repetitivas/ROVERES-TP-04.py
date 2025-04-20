# Ejercicio 1
for i in range(101):
    print(i)

# Ejercicio 2
numero = int(input("Ingrese un número entero: "))
cantidadDigitos = len(str(abs(numero)))
print(f"El número tiene {cantidadDigitos} dígitos.")

# Ejercicio 3
inicio = int(input("Ingrese el primer número: "))
fin = int(input("Ingrese el segundo número: "))

suma = 0
for i in range(inicio + 1, fin):
    suma += i

print(f"La suma de los números entre {inicio} y {fin} es {suma}")

# Ejercicio 4
suma = 0
while True:
    numero = int(input("Ingrese un número (0 para terminar): "))
    if numero == 0:
        break
    suma += numero
print(f"La suma total es {suma}")

# Ejercicio 5
import random
numeroSecreto = random.randint(0, 9)
intentos = 0
while True:
    intento = int(input("Adivina el número (entre 0 y 9): "))
    intentos += 1
    if intento == numeroSecreto:
        print(f"¡Correcto! Lo adivinaste en {intentos} intentos.")
        break
    else:
        print("No es correcto, intentá de nuevo.")

# Ejercicio 6
for i in range(100, -1, -1):
    if i % 2 == 0:
        print(i)

# Ejercicio 7
limite = int(input("Ingrese un número entero positivo: "))
suma = 0
for i in range(limite + 1):
    suma += i
print(f"La suma de los números del 0 al {limite} es {suma}")

# Ejercicio 8
cantidad = 4  # Cambiar este valor por 100 o cualquier otra cantidad de nuemeros
pares = 0
impares = 0
positivos = 0
negativos = 0
for _ in range(cantidad):
    numero = int(input("Ingrese un número entero: "))
    if numero % 2 == 0:
        pares += 1
    else:
        impares += 1
    if numero > 0:
        positivos += 1
    elif numero < 0:
        negativos += 1
print(f"Pares: {pares}")
print(f"Impares: {impares}")
print(f"Positivos: {positivos}")
print(f"Negativos: {negativos}")

# Ejercicio 9
cantidad = 4  # Cambiar este valor por 100 o cualquier otra cantidad de nuemeros
suma = 0
for _ in range(cantidad):
    numero = int(input("Ingrese un número entero: "))
    suma += numero
media = suma / cantidad
print(f"La media de los números ingresados es {media}")

# Ejercicio 10
numero = input("Ingrese un número entero: ")
invertido = numero[::-1]
print(f"El número invertido es {invertido}")



