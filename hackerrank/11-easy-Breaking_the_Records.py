import os
# The function is expected to return an INTEGER_ARRAY.
# The function accepts INTEGER_ARRAY scores as parameter.
def breakingRecords(scores):
    counter = []
    minScore, maxScore = scores[0], scores[0]
    for score in scores:
        if minScore > score:
            counter.append(0)
            minScore = score
        if maxScore < score:
            counter.append(1)
            maxScore = score
    return counter.count(1), counter.count(0)
scores = [10,5,20,20,4,5,2,25,1]
print(breakingRecords(scores))
