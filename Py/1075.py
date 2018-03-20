# -*- coding: utf-8 -*-
"""
Created on Wed Mar 14 06:30:19 2018

@author: eder_
"""

n = int(input())

for i in range(1, 10000):
    if i % n == 2:
        print(i)
        