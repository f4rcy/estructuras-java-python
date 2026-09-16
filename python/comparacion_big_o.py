# EJERCICIO 8. Comparacion general de operaciones
# Excelente para cerrar la clase: ejecuta TODO junto con los mismos valores de n.

def comparacion_big_o():
    valores_n = [10, 100, 1000]

    for n in valores_n:
        print("Analizando con n =", n)

        op_constante = 1  # O(1)

        op_lineal = 0  # O(n)
        for i in range(n):
            op_lineal += 1

        op_cuadratica = 0  # O(n^2)
        for i in range(n):
            for j in range(n):
                op_cuadratica += 1

        op_logaritmica = 0  # O(log n)
        i = n
        while i > 1:
            i = i // 2
            op_logaritmica += 1

        op_n_log_n = 0  # O(n log n)
        for i in range(n):
            j = n
            while j > 1:
                j = j // 2
                op_n_log_n += 1

        print("O(1)       ->", op_constante)
        print("O(n)       ->", op_lineal)
        print("O(n^2)     ->", op_cuadratica)
        print("O(log n)   ->", op_logaritmica)
        print("O(n log n) ->", op_n_log_n)

comparacion_big_o()