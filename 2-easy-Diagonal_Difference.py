import math
import os
import random
import re
import sys


#
# Complete the 'diagonalDifference' function below.
#
# The function is expected to return an INTEGER.
# The function accepts 2D_INTEGER_ARRAY arr as parameter.
#

def diagonalDifference(arr):
    total1 = 0
    total2 = 0
    top_index = len(arr) - 1
    min_index = 0
    for i in range(len(arr)):
        total1 += arr[i][i]
    while (True):
        total2 += arr[min_index][top_index]
        min_index += 1
        top_index -= 1
        if (top_index < 0):
            break
    return abs(total1 - total2)


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input().strip())

    arr = []

    for _ in range(n):
        arr.append(list(map(int, input().rstrip().split())))

    result = diagonalDifference(arr)

    fptr.write(str(result) + '\n')

    fptr.close()