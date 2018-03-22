i = 0
num = int(input())
aux = 0
while i < 1000:
    if aux == num:
        aux = 0
    print("N[{}] = {}".format(i, aux))
    aux += 1
    i += 1