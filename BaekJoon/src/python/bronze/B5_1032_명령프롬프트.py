n = int(input())
arr = list(input())

for i in range(n-1):
    arr2 = list(input())
    for j in range(len(arr)):
        if arr[j] != arr2[j]:
            arr[j] = '?'

print(''.join(arr))

