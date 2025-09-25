N=int(input())
N_list=list(map(int,input().split()))
M=int(input())
M_list=list(map(int,input().split()))

N_list.sort()
for num in M_list:
    lt,rt=0,N-1
    Exist=False
    
    while lt<=rt:
        mid=(lt+rt)//2
        if num==N_list[mid]:
            Exist=True
            print('1')
            break
        elif num>N_list[mid]:
            lt=mid+1
        else:
            rt=mid-1
    if not Exist:
        print('0')           