n = int(input())
fim = n * 4+1
for i in range(1, fim):
    if i % 4 == 0:
        print("PUM")
    else:
        print (str(i) + " ", end='')