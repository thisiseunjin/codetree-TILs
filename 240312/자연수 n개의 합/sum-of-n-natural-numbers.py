n = int(input())

INF = int(2e9)

left = 1
right = INF
max_num = 0

while left <= right :
    mid = (left + right) // 2

    if mid * (mid + 1) //2 <= n :
        left = mid + 1 # 좀더 큰 것 찾아보기
        max_num = max(max_num, mid)

    else : 
        right = mid - 1

print(max_num)