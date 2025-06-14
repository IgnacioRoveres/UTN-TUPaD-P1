# ejercicio 1

precios_frutas = {'Banana': 1200, 'Ananá': 2500, 'Melón': 3000, 'Uva': 
1450}

print(precios_frutas) # lista limpia

precios_frutas['Naranja'] = 1200
precios_frutas['Manzana'] = 1500
precios_frutas['Pera'] = 2300

print(precios_frutas) # lista con frutas nuevas 


# ejercicio 2

precios_frutas['Banana'] = 1330
precios_frutas['Manzana'] = 1700
precios_frutas['Melón'] = 2800

print(precios_frutas) # lista con precios actualizados

# ejercicio 3

solo_frutas = list(precios_frutas.keys())
print(solo_frutas) # lista con solo las frutas

# ejercicio 4

# Cargar 5 contactos
for i in range(5):
    nombre = input("Ingresá el nombre del contacto: ").strip().capitalize()
    numero = input("Ingresá el número de teléfono: ").strip()
    agenda = {}
    agenda[nombre] = numero

# Consultar número
buscar = input("¿De qué contacto querés ver el número?: ").strip().capitalize()
if buscar in agenda:
    print(f"Número de {buscar}: {agenda[buscar]}")
else:
    print("Contacto no encontrado.")

# ejercicio 5

frase = input("Ingresá una frase: ")
palabras = frase.lower().split()

# Palabras únicas
palabras_unicas = set(palabras)
print("Palabras únicas:", palabras_unicas)

# Frecuencia de palabras
frecuencia = {}
for palabra in palabras:
    if palabra in frecuencia:
        frecuencia[palabra] += 1
    else:
        frecuencia[palabra] = 1

print("Frecuencia de palabras:", frecuencia)

# ejercicio 6

alumnos = {}

for _ in range(3):
    nombre = input("Nombre del alumno: ")
    notas = tuple(float(input(f"Ingresá nota {i+1} para {nombre}: ")) for i in range(3))
    alumnos[nombre] = notas

# Mostrar promedios
for nombre, notas in alumnos.items():
    promedio = sum(notas) / len(notas)
    print(f"{nombre} tiene un promedio de {promedio:.2f}")

# ejercicio 7

parcial1 = {"Juan", "Pedro", "Augusto", "Ignacio", "Lucia"}
parcial2 = {"Juan", "Augusto", "Lucia", "María"}

# Ambos
ambos = parcial1 & parcial2
print("Aprobaron ambos:", ambos)

# Solo uno
solo_uno = parcial1 ^ parcial2
print("Solo uno de los dos:", solo_uno)

# Al menos uno
al_menos_uno = parcial1 | parcial2

# ejercicio 8

stock = {
    "arroz": 10,
    "fideos": 5
}

producto = input("Producto a consultar: ")

if producto in stock:
    print(f"Stock de {producto}: {stock[producto]}")
    agregar = int(input("¿Cuántas unidades querés agregar?: "))
    stock[producto] += agregar
else:
    nuevo_stock = int(input("Producto no encontrado. ¿Cuántas unidades querés agregar?: "))
    stock[producto] = nuevo_stock

print("Stock actualizado:", stock)

# ejercicio 9

agenda = {
    ("lunes", "10:00"): "Reunión",
    ("martes", "15:00"): "Gimnasio",
    ("miércoles", "09:00"): "Clase de yoga",
    ("jueves", "18:00"): "Cita médica",
    ("viernes", "20:00"): "Cena con amigos",
    ("domingo", "12:00"): "Asado en familia",
}

dia = input("Día (en minuscula ej: lunes): ").lower()
hora = input("Hora (ej: 10:00): ")

clave = (dia, hora)

if (dia, hora) in agenda:
    print(f"Actividad: {agenda[(dia, hora)]}")
else:
    print("No hay actividad registrada.")   

# ejercicio 10
paises_capitales = {
    "Argentina": "Buenos Aires",
    "Brasil": "Brasilia",
    "Francia": "París"
}

capitales_paises = {capital: pais for pais, capital in paises_capitales.items()}
print(capitales_paises)