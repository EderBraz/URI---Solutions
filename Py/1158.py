n = int(input())
for i in range(n):
    soma = 0
    x,y = list(map(int, input().split()))
    for j in range(y):
        if x % 2 == 0:
            x += 1
        soma += x
        x += 2
    print(soma)

