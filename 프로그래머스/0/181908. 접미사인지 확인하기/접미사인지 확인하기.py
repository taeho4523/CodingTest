def solution(my_string, is_suffix):
    dictionary=[]
    for i in range(len(my_string)):
        dictionary.append(my_string[-i:])
    if is_suffix not in dictionary:
        return 0
    else: return 1
    