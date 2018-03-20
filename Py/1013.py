A, B, C = map(int, input().split())

if A > B and A > C:
    print("%d eh o maior" %A)
elif B > A and B > C:
    print("%d eh o maior" %B)
elif C > A and C > B:
    print("%d eh o maior" %C)