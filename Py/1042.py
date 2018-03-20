a = [int(x) for x in input().split()]
b = list(a)
for i in range(1, len(a)):
    valorAtual = a[i]
    posicao = i

    while posicao > 0 and a[posicao-1] > valorAtual:
        a[posicao] = a[posicao-1]
        posicao = posicao-1

    a[posicao] = valorAtual
for i in range(0, len(a)):
    print(a[i])

print("")
for i in range(0, len(b)):
    print(b[i])