import tkinter as tk

class App:
    def __init__(self):
        self.window = tk.Tk()
        self.window.title("ConverKevin")
        
        # Crear un campo de entrada para la escala
        self.label_escala = tk.Label(self.window, text="Escala 1:", font=("Arial", 12))
        self.label_escala.grid(column=0, row=0, padx=10, pady=10)
        self.entry_escala = tk.Entry(self.window, font=("Arial", 12))
        self.entry_escala.grid(column=1, row=0, padx=10, pady=10)
        
        # Crear un campo de entrada para los metros
        self.label_metros = tk.Label(self.window, text="Metros:", font=("Arial", 12))
        self.label_metros.grid(column=0, row=1, padx=10, pady=10)
        self.entry_metros = tk.Entry(self.window, font=("Arial", 12))
        self.entry_metros.grid(column=1, row=1, padx=10, pady=10)
        
        # Crear un botón para convertir
        self.button_convertir = tk.Button(self.window, text="Convertir", command=self.convertir, font=("Arial", 12))
        self.button_convertir.grid(column=0, row=2, columnspan=2, padx=10, pady=10)
        
        # Crear una etiqueta para mostrar el resultado
        self.label_resultado = tk.Label(self.window, text="", font=("Arial", 16))
        self.label_resultado.grid(column=0, row=3, columnspan=2, padx=10, pady=10)
        
        self.window.mainloop()
        
    def convertir(self):
        escala = self.entry_escala.get()
        metros = self.entry_metros.get()
        
        try:
            escala = float(escala)
            metros = float(metros)
        except ValueError:
            self.label_resultado.config(text="Error: Los campos deben ser números.")
            return
        
        cm = metros * 100 / escala
        self.label_resultado.config(text="{:.2f} cm".format(cm))

app = App()
