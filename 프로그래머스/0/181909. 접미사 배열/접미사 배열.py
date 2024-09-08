def solution(my_string):
    result=[]
    for i in range(len(my_string)):
        result.append(my_string[len(my_string)-i-1:])
    result.sort()
    return result
        
        
        