sal = float(input())

if sal > 0 and sal <= 400:
    percentual = 15
    novoSal = (( (sal * percentual) / 100) + sal)
elif sal > 400 and sal <= 800:
    percentual = 12
    novoSal = (((sal * percentual) / 100) + sal)
elif sal > 800 and sal <= 1200:
    percentual = 10
    novoSal = (((sal * percentual) / 100) + sal)
elif sal > 1200 and sal <= 2000:
    percentual = 7
    novoSal = (((sal * percentual) / 100) + sal)
elif sal > 2000:
    percentual = 4
    novoSal = (((sal * percentual) / 100) + sal)

reajuste = novoSal - sal

print("Novo salario: %.2f" %novoSal)
print("Reajuste ganho: %.2f" %reajuste)
print("Em percentual: " + str(percentual) + " %")
