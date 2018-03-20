i = 0
j = 1
aux = 0.2
while i <= 2:
    if i == 0 or i == 1 or i > 1.9:
        print("I={:.0f} J={:.0f}".format(i, j))
        print("I={:.0f} J={:.0f}".format(i, j+1))
        print("I={:.0f} J={:.0f}".format(i, j+2))
    else:
        print("I={:.1f} J={:.1f}".format(i, j))
        print("I={:.1f} J={:.1f}".format(i, j+1))
        print("I={:.1f} J={:.1f}".format(i, j+2))

    i+= aux
    j+= aux