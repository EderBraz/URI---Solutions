x = int(input())
hora = minuto = segundo = 0;

hora = int(x/3600)
x -= hora*3600
minuto = int(x/60)
x -= minuto*60


print(repr(hora)+":"+repr(minuto)+":"+repr(x))