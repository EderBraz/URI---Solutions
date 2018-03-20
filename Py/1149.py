lista = list(map(int, input().split()))
a = 0
n = 0
soma = 0

for i in lista:
    if a == 0:
        a = i
    else:
        if i > 0:
            n = i
            break

for i in range(n):
    soma += a
    a += 1

print(soma)