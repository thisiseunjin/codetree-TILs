n = int(input())

answer = 100001

for i in range(0, 100001) :
    r = n - 5 * i
    if r >= 0 and r % 2 == 0 :
        answer = min(answer, i + r//2)

if answer != 100001 :
    print(answer)
else :
    print("-1")