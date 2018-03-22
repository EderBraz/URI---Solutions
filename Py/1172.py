vetor = []

for i in range(10):
    entrada = int(input())
    if entrada < 1:
        vetor.append(1)
        print("X[{}] = 1".format(i))
    else:
        vetor.append(entrada)
        print("X[{}] = {}".format(i, entrada))


