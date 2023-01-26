arr = [1,2,3,4,5]
def miniMaxSum(arr):
    min = 0
    max = 0
    arr = sorted(arr)
    for i in range(0,4):
        min += arr[i]
    for i in range(len(arr)-4,len(arr)):
        max += arr[i]
    print(f"{min} {max}")

miniMaxSum(arr)
