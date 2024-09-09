def solution(my_string, indices):
    mystring=list(my_string)
    indices.sort(reverse=True)
    for i in indices:
        mystring.pop(i)
    return ''.join(mystring)