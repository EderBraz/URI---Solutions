x = int(input())
y = int(input())

max1 = max(x,y)
min1 = min(x,y)

if min1 % 2 != 0:
    min1 += 2
else:
    min1 += 1

soma = 0

while min1 < max1:
    soma += min1
    min1 += 2

print(soma)