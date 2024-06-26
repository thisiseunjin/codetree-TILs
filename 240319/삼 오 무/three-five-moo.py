# import math
import sys

n = int(input())

# + 3 + 5 - 15

left = 1
right = sys.maxsize
answer = sys.maxsize

def get_count(t) :
    count = 0

    count = mid//3 + mid//5 - mid//15 

    return t - count # 전체 수 - MOO 개수

while(left <= right) :
    mid = (left + right) // 2

    if get_count(mid) >= n:
        # 크니까 더 줄여야함
        right = mid - 1
        answer = min(answer, mid)

    else :
        left = mid + 1

print(answer)