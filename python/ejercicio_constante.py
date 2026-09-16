# EJERCICIO 1. Complejidad constante - O(1)
# No importa el valor de n. Siempre se ejecuta la misma cantidad de instrucciones.

def ejercicio_constante():
    n = 1000  # realmente no afecta la cantidad de operaciones
    contador = 0

    contador += 1  # operacion 1
    x = 5
    contador += 1  # operacion 2
    y = 10
    contador += 1  # operacion 3
    suma = x + y
    contador += 1  # operacion 4

    print("Operaciones contadas:", contador)
    print("Complejidad: O(1)")

ejercicio_constante()