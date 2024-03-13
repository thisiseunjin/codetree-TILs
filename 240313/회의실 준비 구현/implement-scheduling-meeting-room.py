import sys
input = sys.stdin.readline

n = int(input())

seq = []
for _ in range(n) : 
    a, b = map(int, input().split())
    seq.append( (a, b) )

seq.sort(key=lambda x : x[1]) # 끝나는 시간 기준 오름차순 정렬

answer = 0
now_s, now_e = 0, 0
for s, e in seq : 
    if now_e <= s :
        answer += 1
        # print(s,e )
        now_e = e

print(answer)