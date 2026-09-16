# EJERCICIO 4. Complejidad cuadratica - O(n^2)
# Un ciclo dentro de otro ciclo.

def ejercicio_cuadratica(n):
    contador = 0

    for i in range(n):
        for j in range(n):
            contador += 1

    print("Total de operaciones:", contador)
    print("Complejidad: O(n^2)")

n = int(input("Ingrese el valor de n: "))
ejercicio_cuadratica(n)