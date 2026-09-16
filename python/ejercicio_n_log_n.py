# EJERCICIO 7. Complejidad n log n - O(n log n)
# Un ciclo externo que corre n veces, y dentro otro que divide entre 2.

def ejercicio_n_log_n(n):
    contador = 0

    for i in range(n):
        j = n
        while j > 1:
            j = j // 2
            contador += 1

    print("Total de operaciones:", contador)
    print("Complejidad: O(n log n)")

n = int(input("Ingrese el valor de n: "))
ejercicio_n_log_n(n)