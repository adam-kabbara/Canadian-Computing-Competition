commands = input()
grid = [[1, 2],
        [3, 4]]

v = commands.count('V')%2
h = commands.count('H')%2

if h and v:
    grid = [[4, 3],
            [2, 1]]
elif v:
    grid = [[2, 1],
            [4, 3]]
elif h:
    grid = [[3, 4],
            [1, 2]]

for r in grid:
    print(r[0], r[1])
