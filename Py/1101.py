while True:
    soma = 0
    resultado = ""
    m, n = map(int, input().split())
    if n < 1 or m < 1:
        break
    elif m <= n:
        while m <= n:
            resultado += str(m) + " "
            soma += m
            m += 1
    elif n < m:
        while n <= m:
            resultado += str(n) + " "
            soma += n
            n += 1
    print("{}Sum={}".format(resultado, soma))

