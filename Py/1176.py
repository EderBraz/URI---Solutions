n = int(input())
a, b = 0, 1
s = "0"
for i in range(n):
    fib = int(input())
    a, b = 0, 1
    for j in range(fib):
        a, b = b, a + b

    print("Fib({}) = {}".format(fib, a))