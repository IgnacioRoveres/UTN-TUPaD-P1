from datetime import date

# === FUNCIONES DE APOYO ===

def obtener_conjunto_digitos(dni):
    return set(int(d) for d in str(dni))

def operaciones_conjuntos(conjuntos):
    resultados = []
    n = len(conjuntos)
    for i in range(n):
        for j in range(i + 1, n):
            a, b = conjuntos[i], conjuntos[j]
            resultados.append({
                "pares": f"C{i+1} y C{j+1}",
                "union": a | b,
                "interseccion": a & b,
                "diferencia": a - b,
                "diferencia_simetrica": a ^ b
            })
    return resultados

def contar_digitos(dni):
    contador = {}
    for dig in str(dni):
        contador[dig] = contador.get(dig, 0) + 1
    return contador

def suma_digitos(dni):
    return sum(int(d) for d in str(dni))

def es_bisiesto(anio):
    return (anio % 4 == 0 and anio % 100 != 0) or (anio % 400 == 0)

# === INGRESO DE DATOS ===

dnis = [41676341, 42878902, 41676221]
anios_nacimiento = [1998, 2003, 1999]

# === PROCESAMIENTO DE DNIs ===

conjuntos = [obtener_conjunto_digitos(dni) for dni in dnis]

print("\n-Conjuntos de dígitos únicos por DNI-")
for i, c in enumerate(conjuntos):
    print(f"Conjunto C{i+1}: {c}")

# Operaciones entre pares
resultados_conjuntos = operaciones_conjuntos(conjuntos)
print("\n-Operaciones entre conjuntos-")
for res in resultados_conjuntos:
    print(f"\nEntre {res['pares']}:")
    print(f"  Unión: {res['union']}")
    print(f"  Intersección: {res['interseccion']}")
    print(f"  Diferencia: {res['diferencia']}")
    print(f"  Diferencia simétrica: {res['diferencia_simetrica']}")

# Frecuencia y suma de dígitos
print("\n-Frecuencia y suma de dígitos-")
for dni in dnis:
    print(f"DNI {dni} - Frecuencias: {contar_digitos(dni)} | Suma: {suma_digitos(dni)}")

# === CONDICIONES LÓGICAS ===
print("\n-Evaluaciones lógicas-")

# Ejemplo 1: Alta diversidad numérica
if all(len(c) >= 5 for c in conjuntos):
    print("Alta diversidad numérica")

# Ejemplo 2: Dígito compartido entre todos
interseccion_total = set.intersection(*conjuntos)
if interseccion_total:
    print(f"Dígito/s compartido/s entre todos los conjuntos: {interseccion_total}")

# Ejemplo 3: Ningún conjunto tiene el 0
if all(0 not in c for c in conjuntos):
    print("Grupo sin ceros")

# Ejemplo 4: Más conjuntos pares que impares
pares = sum(1 for c in conjuntos if len(c) % 2 == 0)
impares = len(conjuntos) - pares
if pares > impares:
    print("Grupo par")

# === OPERACIONES CON AÑOS DE NACIMIENTO ===

print("\n-Años de nacimiento-")
print(f"Años ingresados: {anios_nacimiento}")

# Cantidad de pares e impares
pares_anios = sum(1 for a in anios_nacimiento if a % 2 == 0)
impares_anios = len(anios_nacimiento) - pares_anios
print(f"Años pares: {pares_anios} | Años impares: {impares_anios}")

# Grupo Z
if all(a > 2000 for a in anios_nacimiento):
    print("Grupo Z")

# Año especial
if any(es_bisiesto(a) for a in anios_nacimiento):
    print("Tenemos un año especial")

# Producto cartesiano con edades
anio_actual = date.today().year
edades = [anio_actual - a for a in anios_nacimiento]
producto_cartesiano = [(a, e) for a in anios_nacimiento for e in edades]

print("\n-Producto cartesiano entre años y edades-")
for par in producto_cartesiano:
    print(par)
