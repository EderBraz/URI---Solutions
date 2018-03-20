linha = str(input(""))
split = linha.split(" ")
hrIni = int(split[0])
minIni = int(split[1])
hrFim = int(split[2])
minFim = int(split[3])

if hrIni > hrFim:
    hora = 24-hrIni+hrFim
elif hrIni < hrFim:
    hora = hrFim - hrIni
elif hrIni == hrFim:
    hora = 24

if minIni > minFim:
    min = 60 - minIni + minFim
    hora -= 1
elif minIni < minFim:
    min = minFim - minIni
elif minIni == minFim:
    min = 0


print("O JOGO DUROU %d HORA(S) E %d MINUTO(S)" %(hora,min))