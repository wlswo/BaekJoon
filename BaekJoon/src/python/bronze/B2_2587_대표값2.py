lists = []

tot = 0
for _ in range(5):
    n = int(input())
    lists.append(n)
    tot += n

lists.sort()

print(int(tot / 5))
print(lists.pop(2))
