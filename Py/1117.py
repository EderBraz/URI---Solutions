valido = 0
nota = []
while valido < 2:
    x = float(input())
    if 0 < x <= 10:
        nota.append(x)
        valido += 1
    else:
        print("nota invalida")

media = sum(list(nota))/2
print("media = {}".format(media))