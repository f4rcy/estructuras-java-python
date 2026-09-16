# EJERCICIO 6. Complejidad logaritmica - O(log n)
# En vez de avanzar de 1 en 1, el problema se reduce a la mitad.

def ejercicio_logaritmica(n):
    contador = 0
    i = n

    while i > 1:
        i = i // 2   # division entera (equivale a i = i / 2 en Java)
        contador += 1

    print("Total de iteraciones:", contador)
    print("Complejidad: O(log n)")

n = int(input("Ingrese el valor de n: "))
ejercicio_logaritmica(n)