def solution(n, k):
    result=[]
    a=k
    while n>=k:
        result.append(k)
        k+=a
    return result