def solution(arr):
    answer=[]
    for i in range(len(arr)):
        if arr[i]==2:
            answer.append(i)
    
    if not answer: return [-1]
    return arr[answer[0]:answer[-1]+1]
        