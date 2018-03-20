x, y = map(int, input().split())

saida = ""
cont = 0
i = 0
while i < y:

    cont += 1
    i+= 1

    if cont == x:
        print(str(i), end='')
        cont = 0
        print("")
    else:
        print(str(i) + " ", end='')
