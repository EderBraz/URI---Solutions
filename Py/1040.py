n1, n2, n3, n4 = map(float, input().split())

media = (n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / 10.0
print("Media: %.1f" % media)
if media >= 7:
    print("Aluno aprovado.")
elif media < 5:
    print("Aluno reprovado.")
elif media >= 5 and media < 7:
    print("Aluno em exame.")
    nExame = float(input())
    print("Nota do exame: %.1f" %nExame)
    media = (media + nExame) / 2.0
    if media >= 5:
        print("Aluno aprovado.")
        print("Media final: %.1f" % media)
    else:
        print("Aluno reprovado.")
        print("Media final: %.1f" % media)