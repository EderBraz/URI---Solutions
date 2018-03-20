linha = str(input(""))
split = linha.split(" ")
A = int(split[0])
B = int(split[1])
C = int(split[2])
D = int(split[3])
soma1 = C + D
soma2 = A + B

if B > C and D > A and soma1 > soma2 and soma1 > 0 and A % 2 == 0:
    print("Valores aceitos")
else:
    print("Valores nao aceitos")
