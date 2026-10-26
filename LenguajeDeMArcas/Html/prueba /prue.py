import random
import tkinter as tk


TAMANO_CELDA = 25
COLUMNAS = 24
FILAS = 20
VELOCIDAD = 120


class JuegoSerpiente:
    def __init__(self, ventana):
        self.ventana = ventana
        self.ventana.title("Juego de la serpiente")
        self.ventana.resizable(False, False)

        self.marcador = tk.Label(
            ventana, text="Puntuación: 0", font=("Arial", 16, "bold"), pady=8
        )
        self.marcador.pack()

        self.lienzo = tk.Canvas(
            ventana,
            width=COLUMNAS * TAMANO_CELDA,
            height=FILAS * TAMANO_CELDA,
            bg="#101820",
            highlightthickness=0,
        )
        self.lienzo.pack()

        self.ventana.bind("<Key>", self.cambiar_direccion)
        self.nuevo_juego()

    def nuevo_juego(self):
        self.serpiente = [(12, 10), (11, 10), (10, 10)]
        self.direccion = (1, 0)
        self.siguiente_direccion = (1, 0)
        self.puntuacion = 0
        self.en_juego = True
        self.comida = self.crear_comida()
        self.actualizar_pantalla()
        self.mover()

    def crear_comida(self):
        posiciones_libres = [
            (x, y)
            for x in range(COLUMNAS)
            for y in range(FILAS)
            if (x, y) not in self.serpiente
        ]
        return random.choice(posiciones_libres)

    def cambiar_direccion(self, evento):
        teclas = {
            "Up": (0, -1), "w": (0, -1), "W": (0, -1),
            "Down": (0, 1), "s": (0, 1), "S": (0, 1),
            "Left": (-1, 0), "a": (-1, 0), "A": (-1, 0),
            "Right": (1, 0), "d": (1, 0), "D": (1, 0),
        }

        if not self.en_juego:
            if evento.keysym.lower() == "r":
                self.nuevo_juego()
            return

        nueva_direccion = teclas.get(evento.keysym)
        if nueva_direccion and nueva_direccion != (
            -self.direccion[0], -self.direccion[1]
        ):
            self.siguiente_direccion = nueva_direccion

    def mover(self):
        if not self.en_juego:
            return

        self.direccion = self.siguiente_direccion
        cabeza_x, cabeza_y = self.serpiente[0]
        dx, dy = self.direccion
        nueva_cabeza = (cabeza_x + dx, cabeza_y + dy)

        choca_con_pared = not (
            0 <= nueva_cabeza[0] < COLUMNAS and 0 <= nueva_cabeza[1] < FILAS
        )
        choca_con_cuerpo = nueva_cabeza in self.serpiente[:-1]

        if choca_con_pared or choca_con_cuerpo:
            self.en_juego = False
            self.actualizar_pantalla()
            return

        self.serpiente.insert(0, nueva_cabeza)
        if nueva_cabeza == self.comida:
            self.puntuacion += 1
            self.comida = self.crear_comida()
        else:
            self.serpiente.pop()

        self.actualizar_pantalla()
        self.ventana.after(VELOCIDAD, self.mover)

    def actualizar_pantalla(self):
        self.lienzo.delete("all")
        self.marcador.config(text=f"Puntuación: {self.puntuacion}")

        comida_x, comida_y = self.comida
        self.dibujar_celda(comida_x, comida_y, "#ef476f", ovalo=True)

        for indice, (x, y) in enumerate(self.serpiente):
            color = "#06d6a0" if indice == 0 else "#118ab2"
            self.dibujar_celda(x, y, color)

        if not self.en_juego:
            ancho = COLUMNAS * TAMANO_CELDA
            alto = FILAS * TAMANO_CELDA
            self.lienzo.create_rectangle(
                0, alto // 2 - 55, ancho, alto // 2 + 55, fill="#101820", outline=""
            )
            self.lienzo.create_text(
                ancho // 2, alto // 2 - 15, text="FIN DEL JUEGO",
                fill="white", font=("Arial", 22, "bold"),
            )
            self.lienzo.create_text(
                ancho // 2, alto // 2 + 20, text="Pulsa R para volver a jugar",
                fill="white", font=("Arial", 13),
            )

    def dibujar_celda(self, x, y, color, ovalo=False):
        margen = 2
        x1 = x * TAMANO_CELDA + margen
        y1 = y * TAMANO_CELDA + margen
        x2 = (x + 1) * TAMANO_CELDA - margen
        y2 = (y + 1) * TAMANO_CELDA - margen

        if ovalo:
            self.lienzo.create_oval(x1, y1, x2, y2, fill=color, outline="")
        else:
            self.lienzo.create_rectangle(x1, y1, x2, y2, fill=color, outline="")


if __name__ == "__main__":
    raiz = tk.Tk()
    JuegoSerpiente(raiz)
    raiz.mainloop()

