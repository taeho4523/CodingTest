def solution(a, b, c):
    if a==b==c:
        return (a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c)
    if  a==b or b==c or a==c:
        return (a+b+c)*(a*a+b*b+c*c)
    else: return a+b+c
    