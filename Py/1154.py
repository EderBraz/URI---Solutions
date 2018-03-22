aux = 0
soma = 0
while True:
    idade = int(input())
    if idade >= 0:
        soma = soma + idade
        aux += 1
    else:
        break

print("{:.2f}".format(soma/aux))