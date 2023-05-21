"""
* BaekJoon
* https://www.acmicpc.net/problem/1075
* Problem: 나누기
* Level: B3
* Algorithm: 수학, 문자열
"""


N = input()
F = int(input())

N = int(N[:-2] + '00')

while True:
    if N % F == 0:
        print(str(N)[-2:])
        break

    N += 1
