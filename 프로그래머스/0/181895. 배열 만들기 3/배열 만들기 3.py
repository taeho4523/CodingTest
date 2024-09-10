def solution(arr, intervals):
    result=[]
    for i in intervals:
        for j in range(i[0],i[1]+1):
            result.append(arr[j])
    return result