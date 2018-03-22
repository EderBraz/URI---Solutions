from functools import lru_cache


@lru_cache(maxsize = 1000)
def fibo(n):
    if type(n) != int:
        raise TypeError()
    if n < 1:
        raise ValueError()

    if n == 1:
        return 0
    elif n == 2 or n == 3:
        return 1
    elif n > 3:
        return fibo(n-1) + fibo(n-2)


n = int(input())
for n in range(1, n):
    print(str(fibo(n)) + " ", end='')
print(fibo(n+1))
