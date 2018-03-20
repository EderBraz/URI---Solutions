idade = int(input())
ano = mes = 0;
if idade/365 >= 1:
    ano = int(idade/365);
    idade -= ano*365;
if idade/30 >= 1:
    mes = int(idade/30);
    idade -= mes*30;

print("%d ano(s)" %ano)
print("%d mes(es)" %mes)
print("%d dia(s)" %idade)
