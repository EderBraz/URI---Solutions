coluna = int(input())
opcao = input()
soma = 0

for i in range(12):
    for j in range(12):
        num = float(input())
        if j == coluna:
            soma += num

if opcao == 'S':
    print("{:.1f}".format(soma))
else:
    print("{:.1f}".format(soma/12))
