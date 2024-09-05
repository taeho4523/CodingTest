def solution(my_strings, parts):
    result=[]
    for i in range(len(parts)):
        mystring=list(my_strings[i])
        for j in range(parts[i][0],parts[i][1]+1):
            result.append(mystring[j])
    answer=''.join(result)
    return answer
                                