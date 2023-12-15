for _ in range(int(input())):
    arr = []
    c = 0
    n = int(input())
    it = 10
    while len(arr) <= n:
        s = str(it)
        for i in s:
            c += int(i)
        if c % 10 == 0 and c >= 10:
            arr.append(int(s))
        it += 1
    print(arr[n])