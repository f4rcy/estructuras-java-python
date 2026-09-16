# EJERCICIO 2. Complejidad lineal - O(n)
# El numero de operaciones crece proporcionalmente con n.

def ejercicio_lineal(n):
    contador = 0

    for i in range(n):
        contador += 1

    print("Total de operaciones del ciclo:", contador)
    print("Complejidad: O(n)")

n = int(input("Ingrese el valor de n: "))
ejercicio_lineal(n)