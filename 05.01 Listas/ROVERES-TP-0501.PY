# ejercicio 1 
lista_multiplos_4 = list(range(4, 101, 4))
print(lista_multiplos_4)

#ejercicio 2
mis_favoritos = ["asado", "pizza", "milanesa", "pollo", "arroz"]
print(mis_favoritos[-2])

# ejercicio 3
lista_vacia = []
lista_vacia.append("Producto 1")
lista_vacia.append("Producto 2")
lista_vacia.append("Producto 3")
print(lista_vacia)

# ejercicio 4
animales = ["perro", "gato", "conejo", "pez"]
animales[1] = "loro"
animales[-1] = "oso"
print(animales)

# ejercicio 5 
# el programa interpreta la lista de numeros dada, elige el valor mas grande y lo remueve. Luego muestra la lista sin el valor mas grande

# ejercicio 6
lista_saltos = list(range(10, 31, 5))
print(lista_saltos[:2])

# ejercicio 7

autos = ["sedan", "polo", "suran", "gol"]
autos[1:3] = ["toyota", "clio"]
print(autos)

# ejercicio 8
dobles = []
dobles.append(5 * 2)
dobles.append(10 * 2)
dobles.append(15 * 2)
print(dobles)

# ejercicio 9
compras = [["pan", "leche"], ["arroz", "fideos", "salsa"], ["agua"]]
print(compras)
compras[2].append("jugo")
compras[1][1] = "tallarines"
compras[0].remove("pan")
print(compras)

# ejercicio 10 
lista_anidada = [15, True, [25.5, 57.9, 30.6], False]
print(lista_anidada)


