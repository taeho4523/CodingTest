def solution(numLog):
    answer=[]
    for i in range(len(numLog)-1):
        if numLog[i+1]-numLog[i]==1:
            answer.append("w")
        if numLog[i+1]-numLog[i]==-1:
            answer.append("s")
        if numLog[i+1]-numLog[i]==10:
            answer.append("d")
        elif numLog[i+1]-numLog[i]==-10:
            answer.append("a")
    answer=''.join(answer)
    return answer