"""
* BaekJoon
* https://www.acmicpc.net/problem/1049
* Problem: 기타줄
* Level: S4
* Algorithm: 그리디
"""

N, M = input().split()

single = 9999
package = 9999

for _ in range(int(M)):
    temp_p, temp_s = input().split()
    package = min(package, int(temp_p))
    single = min(single, int(temp_s))

# 낱개 * 6 > 패키지
if single * 6 < package:
    print(int(N) * single)
else:
    result = 0
    # 패키지로만 구매
    result += (int(N) // 6) * package

    # 패키지 + 싱글
    if (int(N) % 6) * single > package:
        result += package
    else:
        result += (int(N) % 6) * single

    print(result)
