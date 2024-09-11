def solution(num_list, n):
    answer = []
    for i in range(n):
        answer.append(num_list[0])
        num_list.pop(0)
    for j in range(len(answer)):
        num_list.append(answer[j])
    return num_list