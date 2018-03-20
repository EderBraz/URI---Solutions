n = int(input())

for i in range(n):
    x, y = list(map(float, input().split()))

    if y == 0:
        print("divisao impossivel")
    else:
        print("{:.1f}".format(x/y))