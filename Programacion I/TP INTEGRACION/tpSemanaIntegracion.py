# === Importaciones ===
# tinker es para la interfaz grafica y random da la parte de numeros aleatorios
import tkinter as tk
import random

# === Personalización de interfaz grafica ===
colorFondo = "#e6f2ff"
colorTexto = "#003366"
fuenteTexto = ("Orbitron", 14)
fuenteTitulo = ("Orbitron", 16, "bold")
colorBtn = "#4da6ff"
colorCorrecto = "green"
colorIncorrecto = "red"

# ===  Variables de juego ===
puntaje = 0
preguntasRespondidas = 0

# === Funciones de conversión ===
def decimalABinario(n): return bin(n)[2:]
def binarioADecimal(b): return str(int(b, 2))
def decimalAHexadecimal(n): return hex(n)[2:].upper()
def hexadecimalADecimal(h): return str(int(h, 16))
def binarioAHexadecimal(b): return decimalAHexadecimal(int(b, 2))
def hexadecimalABinario(h): return decimalABinario(int(h, 16))

# === Generar preguntas ===
def generarPregunta():
    global valorCorrecto, preguntaMostrada
    conversion = seleccion.get()
    numero = random.randint(1, 255)

    if conversion == "Binario a Decimal":
        binario = decimalABinario(numero)
        preguntaMostrada = binario
        valorCorrecto = str(numero)
        etiquetaPregunta.config(text=f"¿Cuál es el decimal de {binario}?")
    elif conversion == "Decimal a Binario":
        preguntaMostrada = str(numero)
        valorCorrecto = decimalABinario(numero)
        etiquetaPregunta.config(text=f"¿Cuál es el binario de {numero}?")
    elif conversion == "Decimal a Hexadecimal":
        preguntaMostrada = str(numero)
        valorCorrecto = decimalAHexadecimal(numero)
        etiquetaPregunta.config(text=f"¿Cuál es el hexadecimal de {numero}?")
    elif conversion == "Hexadecimal a Decimal":
        hexa = decimalAHexadecimal(numero)
        preguntaMostrada = hexa
        valorCorrecto = str(numero)
        etiquetaPregunta.config(text=f"¿Cuál es el decimal de {hexa}?")
    elif conversion == "Binario a Hexadecimal":
        binario = decimalABinario(numero)
        preguntaMostrada = binario
        valorCorrecto = binarioAHexadecimal(binario)
        etiquetaPregunta.config(text=f"¿Cuál es el hexadecimal de {binario}?")
    elif conversion == "Hexadecimal a Binario":
        hexa = decimalAHexadecimal(numero)
        preguntaMostrada = hexa
        valorCorrecto = hexadecimalABinario(hexa)
        etiquetaPregunta.config(text=f"¿Cuál es el binario de {hexa}?")

# === Verificar respuesta ===
def verificarRespuesta():
    global puntaje, preguntasRespondidas
    respuesta = entradaRespuesta.get().strip().upper()
    preguntasRespondidas += 1

    if respuesta == valorCorrecto:
        etiquetaResultado.config(text="✅ ¡Correcto!", fg=colorCorrecto)
        puntaje += 1
    else:
        etiquetaResultado.config(
            text=f"❌ Incorrecto. Era: {valorCorrecto}", fg=colorIncorrecto
        )

    actualizarPuntaje()
    entradaRespuesta.delete(0, tk.END)

# === Mostrar puntaje ===
def actualizarPuntaje():
    etiquetaPuntaje.config(text=f"Puntaje: {puntaje}/{preguntasRespondidas}")

# === Ventana principal ===
ventana = tk.Tk()
ventana.title("Juego de Conversión Numérica")
ventana.geometry("450x350")
ventana.config(bg=colorFondo)

# === 🔽 Menú desplegable ===
seleccion = tk.StringVar(value="Binario a Decimal")
opciones = [
    "Binario a Decimal", "Decimal a Binario",
    "Decimal a Hexadecimal", "Hexadecimal a Decimal",
    "Binario a Hexadecimal", "Hexadecimal a Binario"
]

tk.Label(ventana, text="Selecciona el tipo de pregunta:", bg=colorFondo, fg=colorTexto, font=fuenteTexto).pack(pady=5)
tk.OptionMenu(ventana, seleccion, *opciones).pack()

tk.Button(ventana, text="🎲 Nueva Pregunta", command=generarPregunta, bg=colorBtn).pack(pady=10)

# === Pregunta y entrada ===
etiquetaPregunta = tk.Label(ventana, text="", font=fuenteTitulo, bg=colorFondo, fg=colorTexto)
etiquetaPregunta.pack(pady=10)

entradaRespuesta = tk.Entry(ventana, font=fuenteTexto, justify="center")
entradaRespuesta.pack(pady=5)

tk.Button(ventana, text="✅ Verificar", command=verificarRespuesta, bg=colorBtn).pack(pady=5)

# === Resultado y puntaje ===
etiquetaResultado = tk.Label(ventana, text="", font=fuenteTexto, bg=colorFondo)
etiquetaResultado.pack(pady=5)

etiquetaPuntaje = tk.Label(ventana, text="Puntaje: 0/0", font=fuenteTexto, bg=colorFondo)
etiquetaPuntaje.pack(pady=5)

ventana.mainloop()
