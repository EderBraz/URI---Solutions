# -*- coding: utf-8 -*-
"""
Created on Wed Mar 14 06:36:46 2018

@author: eder_
"""

n = int(input())

for i in range(0, n):
    a, b, c = map(float, input().split())
    media = ((a * 2) + (b * 3) + (c * 5)) / 10
    print("{0:2.1f}".format(media))