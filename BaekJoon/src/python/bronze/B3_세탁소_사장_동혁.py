n = int(input())
change = [25, 10, 5, 1]

for _ in range(n):
    money = int(input())
    answer = []
    for c in change:
        answer.append(money // c)
        money %= c

    print(*answer)

# print(*리스트명) = 원소값 전체 출력
# // 연산자 : 몫을 구함
