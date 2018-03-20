salario = float(input())

if salario <= 2000:
    print("Isento")
elif 2000 < salario <= 3000:
    imposto = ((salario - 2000) * 0.08)
    print("R$ %.2f" %imposto)
elif 3000 < salario <= 4500:
    imposto = ((salario - 3000) * 0.18 + (1000 * 0.08))
    print("R$ %.2f" %imposto)
elif salario > 4500:
    imposto = (((salario - 4500) * 0.28) + 1500 * 0.18 + 1000 * 0.08)
    print("R$ %.2f" %imposto)
