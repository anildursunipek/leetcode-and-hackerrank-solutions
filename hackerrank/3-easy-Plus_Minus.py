import math
import os
import random
import re
import sys


def plusMinus(arr):
    totalPositive = 0
    totalNegative = 0
    totalZero = 0
    for i in arr:
        if(i>0):
            totalPositive +=1
        elif(i<0):
            totalNegative +=1
        else:
            totalZero +=1
    print(totalPositive/len(arr))
    print(totalNegative/len(arr))
    print(totalZero/len(arr))

if __name__ == '__main__':
    n = int(input().strip())

    arr = list(map(int, input().rstrip().split()))

    plusMinus(arr)