qte = int(input())
for i in range(qte):

    entrada = input().split()
    PA, PB, G1, G2 = int(entrada[0]), int(entrada[1]), float(entrada[2]), float(entrada[3])
    ano = 0

    while PA <= PB and ano <= 100:
        PA += int(PA * (G1 / 100))
        PB += int(PB * (G2 / 100))
        ano += 1
    if ano <= 100:
        print("{} anos.".format(ano))
    else:
        print("Mais de 1 seculo.")
