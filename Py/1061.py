diaInicio = input().split()
diaInicio = int(diaInicio[1])

horaInicio = input().split(":")
hrIni, minIni, segIni = list(map(int, horaInicio))

diaFinal = input().split()
diaFinal = int(diaFinal[1])

horaFinal = input().split(":")
hrFim, minFim, segFim = list(map(int, horaFinal))

dia = diaFinal - diaInicio
hora = hrFim - hrIni

if hora < 0:
    hora += 24
    dia -= 1

min = minFim - minIni

if min < 0:
    min += 60
    hora -= 1

seg = segFim - segIni

if seg < 0:
    seg += 60
    min -= 1

if dia <= 0:
    dia = 0

print("{} dia(s)".format(dia))
print("{} hora(s)".format(hora))
print("{} minuto(s)".format(min))
print("{} segundo(s)".format(seg))