import sys
input = sys.stdin.readline

n = int(input())
seq = [] 
for _ in range(n) :
    a = list(map(int, input().split()))
    seq.append(a)

seq.sort(key=lambda x : x[1])

ns, ne = 0, 0
total = 0
for s, e in seq : 
    if ne <= s : 
        ne = e
        total += 1

print(n - total)