def solution(q, r, code):
    result=[]
    for i in range(len(code)):
        if i%q==r:
            result.append(code[i])
    return ''.join(result)
        