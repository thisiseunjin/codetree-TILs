import sys
input = sys.stdin.readline

n, m = map(int ,input().split())
seq = []
for _ in range(n) :
    n = int(input())
    seq.append(n)

seq.sort()
answer = 0
left = 1
right = 100000

def ispossible(value) :
    # if value == 0 : return False
    global m
    count = 0
    # 각 숫자를 // 2해서 더한 것이 m 이상이면 됨
    for i in seq : 
        count += i//value

    if count >= m :
        return True

    else :
        return False


while(left <= right):
    mid = (left + right) // 2

    if ispossible(mid) :
        # 좀 더 크게 해도 될듯
        left = mid + 1
        answer = max(answer, mid)
    else : 
        # 좀 더 작게해야한다 
        right = mid - 1

print(answer)