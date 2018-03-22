n = int(input())
a, b = 0, 1
s = "0"

for i in range(n-1):
    a, b = b, a + b
    s = s + " " + str(a)

print(s)

