a, b, c = map(float, input().split())

perimetro = (a+b+c)
area = ((a + b) * c)/2
if((a<(b+c)) and (b<(a+c)) and (c<(a+b))):
   print("Perimetro = %.1f" %perimetro)
else:
    print("Area = %.1f" %area)