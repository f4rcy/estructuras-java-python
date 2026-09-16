# EJERCICIO 3. Dos ciclos separados - O(n + n) = O(n)
# No estan anidados, asi que no se multiplican: se SUMAN.

def ejercicio_dos_ciclos(n):
    contador = 0

    for i in range(n):
        contador += 1

    for j in range(n):
        contador += 1

    print("Total de operaciones:", contador)
    print("Analisis: O(n + n) = O(2n) = O(n)")

n = int(input("Ingrese el valor de n: "))
ejercicio_dos_ciclos(n)