def solution(a, b, c, d):
    arr=[a,b,c,d]
    arr_set=list(set(arr))
    if len(arr_set)==1:
        return 1111*arr_set[0]
    elif len(arr_set)==2:
        if arr.count(arr_set[0])==2:
            return (arr_set[0]+arr_set[1])*abs(arr_set[0]-arr_set[1])
        if arr.count(arr_set[0])==3:
            return (10*arr_set[0]+arr_set[1])**2
        if arr.count(arr_set[0])==1:
            return (10*arr_set[1]+arr_set[0])**2
    elif len(arr_set)==3:
        if arr.count(arr_set[0])==2:
            return arr_set[1]*arr_set[2]
        if arr.count(arr_set[1])==2:
            return arr_set[0]*arr_set[2]
        if arr.count(arr_set[2])==2:
            return arr_set[0]*arr_set[1]
    elif len(arr_set)==4:
        return min(arr_set)
        
    