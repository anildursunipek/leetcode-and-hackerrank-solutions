grades = [73,67,38,33]
def gradingStudents(grades):
    for i in range(len(grades)):
        if((grades[i] > 37) & ((grades[i] % 5) > 2)):
            grades[i] = grades[i] + (5-(grades[i] % 5))
    return grades
print(gradingStudents(grades))
