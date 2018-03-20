x = int(input())
y = int(input())
aux = x
soma = 0

if x > y:
    x = y
    y = aux

while x <= y:

    if x % 13 != 0:
        soma += x
    x += 1

print(soma)