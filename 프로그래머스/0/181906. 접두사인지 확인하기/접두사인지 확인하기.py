def solution(my_string, is_prefix):
    is_list=[]
    for i in range(len(my_string)):
        is_list.append(my_string[:i+1])
    if is_prefix not in is_list:
        return 0
    else: return 1