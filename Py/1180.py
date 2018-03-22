n = int(input())
lista = list(map(int, input().split()))
menor = lista[0]

for i in lista:
    if menor > i:
        menor = i

print("Menor valor: {}".format(menor))
print("Posicao: {}".format(lista.index(menor)))
