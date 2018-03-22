import functools

n = int(input())


@functools.lru_cache(None)
def fat(n):
    if n < 1:
        return 1
    else:
        return n * fat(n-1)


print(fat(n))