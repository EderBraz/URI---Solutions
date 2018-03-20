# -*- coding: utf-8 -*-
"""
Created on Wed Mar 14 06:51:47 2018

@author: eder_
"""

n = int(input())
total = 0
c = 0
r = 0
s = 0


for i in range(n):
    testes = input().split()
    qte,tipo = testes
    total += int(qte)
    
    if tipo == 'C':
        c+= int(qte)
    elif tipo == 'R':
        r+= int(qte)
    elif tipo == 'S':
        s+= int(qte)
    
print("Total: {} cobaias".format(total))
print("Total de coelhos: {}".format(c))
print("Total de ratos: {}".format(r))
print("Total de sapos: {}".format(s))
print("Percentual de coelhos: {:.2f} %".format(c/total*100))
print("Percentual de ratos: {:.2f} %".format(r/total*100))
print("Percentual de sapos: {:.2f} %".format(s/total*100))