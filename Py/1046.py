linha = str(input(""))
split = linha.split(" ")
ini = int(split[0])
fim = int(split[1])
if ini == fim:
    print("O JOGO DUROU 24 HORA(S)")
elif ini > fim:
    print("O JOGO DUROU %d HORA(S)" %(24 - ini + fim))
elif ini < fim:
    print("O JOGO DUROU %d HORA(S)" %(fim - ini))