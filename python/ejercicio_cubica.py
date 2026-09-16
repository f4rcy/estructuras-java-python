# EJERCICIO 5. Complejidad cubica - O(n^3)
# Tres ciclos anidados.

def ejercicio_cubica(n):
    contador = 0

    for i in range(n):
        for j in range(n):
            for k in range(n):
                contador += 1

    print("Total de operaciones:", contador)
    print("Complejidad: O(n^3)")

n = int(input("Ingrese el valor de n: "))
ejercicio_cubica(n)