def staircase(n):
    counter = n
    for i in range(n):
        for x in range(n):
            if(x>=(n-i-1)):
                if(x==n-1):
                    print("#")
                else:
                    print("#",end="")

            else:
                print(" ",end="")

staircase(5)