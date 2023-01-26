import os

# The function accepts following parameters:
#  1. INTEGER x1
#  2. INTEGER v1
#  3. INTEGER x2
#  4. INTEGER v2

def kangaroo(x1, v1, x2, v2):
    check = sum([1 if (x1 < x2) else 0])
    while (True):
        check2 = sum([1 if (x1 < x2) else 0])
        if (((x1 < x2) & (v1 <= v2)) or ((x2 < x1) & (v2 <= v1))):
            return "NO"
            break
        elif (x1 == x2):
            return "YES"
            break
        else:
            if (check != check2):
                return "NO"
                break
            x1 += v1
            x2 += v2

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    first_multiple_input = input().rstrip().split()

    x1 = int(first_multiple_input[0])

    v1 = int(first_multiple_input[1])

    x2 = int(first_multiple_input[2])

    v2 = int(first_multiple_input[3])

    result = kangaroo(x1, v1, x2, v2)

    fptr.write(result + '\n')

    fptr.close()