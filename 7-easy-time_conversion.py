import os

def timeConversion(s):
    h, m , sec = list(map(int,s[:-2].split(":")))
    h = h % 12 + ("PM" in s.upper()) * 12
    return ("%02d:%02d:%02d") % (h,m,sec)

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = timeConversion(s)

    fptr.write(result + '\n')

    fptr.close()