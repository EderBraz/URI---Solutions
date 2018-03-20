while True:
    valido = 0
    soma = 0

    while valido < 2:
        x = float(input())
        if 0 < x <= 10:
            soma += x
            valido += 1
        else:
            print("nota invalida")

    print("media = {:.2f}".format(soma / 2))


    while True:

        print("novo calculo (1-sim 2-nao)")
        opcao = int(input())

        if opcao == 1 or opcao == 2:
            break

    if opcao == 2:
        break

