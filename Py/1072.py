# -*- coding: utf-8 -*-
n = int(input())
dentro = 0
fora = 0

for i in range(0, n):
	x = int(input())
	if 10 <= x <= 20:
		dentro+=1
	else:
		fora+=1
		
print("{} in".format(dentro))
print("{} out".format(fora))