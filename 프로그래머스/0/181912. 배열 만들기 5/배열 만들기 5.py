def solution(intStrs, k, s, l):
    answer=[]
    for i in intStrs:
        result=i[s:s+l]
        result2=''.join(result)
        if int(result2)>k:
            answer.append(int(result2))
    return answer
        