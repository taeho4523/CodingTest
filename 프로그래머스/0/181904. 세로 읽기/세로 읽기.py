def solution(my_string, m, c):
    result=[]
    for i in range(int(len(my_string)/m)):
        result.append(my_string[(c-1)+m*i])
    return ''.join(result)