qte = int(input())

for i in range(qte):
    num = int(input())
    soma = 0
    for i in range(1, num):
        if num % i == 0:
            soma += i
    if soma == num:
        print("{} eh perfeito".format(num))
    else:
        print("{} nao eh perfeito".format(num))