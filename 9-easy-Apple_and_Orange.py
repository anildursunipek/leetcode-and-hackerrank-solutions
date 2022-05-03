apples = [2,3,-4]
oranges = [3,-2,-4]
def countApplesAndOranges(s, t, a, b, apples, oranges):
    for i in range(len(apples)):
        apples[i] += a
    for i in range(len(oranges)):
        oranges[i] += b
    apls= list(filter(lambda x: (x>=s) and (x<=t),apples))
    orngs = list(filter(lambda x: (x>=s) and (x<=t),oranges))
    print(len(apls))
    print(len(orngs))

print(countApplesAndOranges(7,10,4,12,apples,oranges))