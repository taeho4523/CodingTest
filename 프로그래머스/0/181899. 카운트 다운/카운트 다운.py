def solution(start_num, end_num):
    result=[]
    for i in range(end_num,start_num+1):
        result.append(i)
    result.sort(reverse=True)
    return result