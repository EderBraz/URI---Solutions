vetor = []

for i in range(20):
    entrada = int(input())
    vetor.append(entrada)

i = 0
for j in reversed(vetor):
    print("N[{}] = {}".format(i, j))
    i += 1