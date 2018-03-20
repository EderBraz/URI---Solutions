cod, qtde = map(int, input().split())


if cod == 1:
    preco = 4.0 * qtde
elif cod == 2:
    preco = 4.5 * qtde
elif cod == 3:
    preco = 5 * qtde
elif cod == 4:
    preco = 2 * qtde
elif cod == 5:
    preco = 1.5 * qtde

print("Total: R$ %.2f" % preco)

