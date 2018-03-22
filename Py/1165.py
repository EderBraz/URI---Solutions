testes = int(input())

for i in range(testes):
    primo = int(input())
    eh_primo = True

    for j in range(2,int(primo/2+1)):
        if primo % j == 0:
            eh_primo = False
            break

    if eh_primo:
        print("{} eh primo".format(primo))
    else:
        print("{} nao eh primo".format(primo))