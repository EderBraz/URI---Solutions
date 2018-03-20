A, B, C = map(float, input().split())
if A >= B and A >= C:
    if B >= C:
        a = A
        b = B
        c = C
    else:
        a = A
        b = C
        c = B

elif B >= A and B >= C:
    if A >= C:
        a = B
        b = A
        c = C
    else:
        a = B
        b = C
        c = A
elif C >= A and C >= B:
    if A >= B:
        a = C
        b = A
        c = B
    else:
        a = C
        b = B
        c = A

if a >= b+c:
    print("NAO FORMA TRIANGULO")
elif a**2 == b**2 + c**2:
    print("TRIANGULO RETANGULO")
elif a**2 > b**2 + c**2:
    print("TRIANGULO OBTUSANGULO")
elif a**2 < b**2 + c**2:
    print("TRIANGULO ACUTANGULO")
if a == b and a == c:
    print("TRIANGULO EQUILATERO")
if a == b and a != c or a == c and a != b or b == c and b != a:
    print("TRIANGULO ISOSCELES")