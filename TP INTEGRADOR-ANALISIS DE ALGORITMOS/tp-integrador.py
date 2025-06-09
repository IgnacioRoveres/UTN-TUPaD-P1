import time
# --- Algoritmos a comparar ---

def suma_bucle(n):
    resultado = 0
    for i in range(1, n + 1):
        resultado += i
    return resultado

def suma_gauss(n):
    return n * (n + 1) // 2

# --- Función para medir tiempos ---

def medir_tiempo(funcion, n, repeticiones=3):
    total = 0
    for _ in range(repeticiones):
        inicio = time.perf_counter()
        funcion(n)
        fin = time.perf_counter()
        total += (fin - inicio) * 1000  # milisegundos
    return total / repeticiones

# --- Tamaños de entrada (casos desde pequeños a extremos) ---

valores_n = [1, 10, 100, 1000, 10_000, 100_000, 1_000_000, 10_000_000]

# --- Resultados de tiempos ---

resultados_bucle = []
resultados_gauss = []

print("n\tBucle(ms)\tGauss(ms)\tCuadrático(ms)")
for n in valores_n:
    tiempo_bucle = medir_tiempo(suma_bucle, n)
    tiempo_gauss = medir_tiempo(suma_gauss, n)
    resultados_bucle.append(tiempo_bucle)
    resultados_gauss.append(tiempo_gauss)
    print(f"{n}\t{tiempo_bucle:.5f}\t{tiempo_gauss:.5f}")
