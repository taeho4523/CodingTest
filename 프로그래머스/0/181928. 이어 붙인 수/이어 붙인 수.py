def solution(num_list):
    even=[]
    odd=[]
    for i in num_list:
        if i%2==0:
            even.append(str(i))
        else: odd.append(str(i))
    answer1=''.join(even)
    answer2=''.join(odd)
    return int(answer1)+int(answer2)