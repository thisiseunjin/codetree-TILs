n = int(input())

answer = 0

n = n % 5
answer += n//5

n = n % 2
answer += n//2

if n == 0 :
    print(answer)
else :
    print("-1")