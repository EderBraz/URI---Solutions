N = int(input())
valor = N
cem = cinquenta = vinte = dez = cinco = dois = um = 0;

if int(N/100) >= 1:
    cem = int(N/100);
    N -= cem*100;
if int(N/50) >= 1:
    cinquenta = int(N/50);
    N -= cinquenta*50;
if int(N/20) >= 1:
    vinte = int(N/20);
    N -= vinte*20;
if int(N/10) >= 1:
    dez = int(N/10);
    N -= dez*10;
if int(N/5) >= 1:
    cinco = int(N/5);
    N -= cinco*5;
if int(N/2) >= 1:
    dois = int(N/2);
    N -= dois*2;
if int(N/1) >= 1:
    um = int(N/1);
    N -= um*1;

print(valor)
print("%d nota(s) de R$ 100,00" %cem)
print("%d nota(s) de R$ 50,00" %cinquenta)
print("%d nota(s) de R$ 20,00" %vinte)
print("%d nota(s) de R$ 10,00" %dez)
print("%d nota(s) de R$ 5,00" %cinco)
print("%d nota(s) de R$ 2,00" %dois)
print("%d nota(s) de R$ 1,00" %um)
