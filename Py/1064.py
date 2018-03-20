valores = 0
qtdepos = 0
somapos = 0
while valores < 6:
    x = float(input())
    valores += 1
    if x > 0:
        qtdepos += 1
        somapos += x



print("{} valores positivos".format(qtdepos))
print("{0:.1f}".format(somapos/qtdepos))