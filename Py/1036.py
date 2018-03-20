import math

a, b, c = map(float, input().split())

try:
    delta = ((b ** 2) - 4 * a * c)
    deltaRaiz = math.sqrt(delta)
    div = 2 * a
    if delta == 0:

        x1 = (-b + deltaRaiz) /div
        x2 = x1
        print("R1 = %.5f" % x1)
        print("R2 = %.5f" % x2)
    else:
        x1 = (-b + deltaRaiz) / div
        x2 = (-b - deltaRaiz) / div
        print("R1 = %.5f" %x1)
        print("R2 = %.5f" %x2)

except ValueError:
    print("Impossivel calcular")
except ZeroDivisionError:
    print("Impossivel calcular")