lista = []
i = 0

while i < 5:
	numero = int(input())
	lista.append(numero)
	i+= 1

par = 0
impar = 0
positivo = 0
negativo = 0

for i in lista:
	if i % 2 == 0:
		par+=1
	else:
		impar+=1

	if i > 0:
		positivo+=1
	elif i < 0:
		negativo+=1


print("{} valor(es) par(es)".format(par))
print("{} valor(es) impar(es)".format(impar))
print("{} valor(es) positivo(s)".format(positivo))
print("{} valor(es) negativo(s)".format(negativo))