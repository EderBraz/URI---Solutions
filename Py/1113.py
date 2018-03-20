while True:
    x, y = list(map(float, input().split()))

    if x > y:
        print("Decrescente")
    elif x == y:
        break
    else:
        print("Crescente")