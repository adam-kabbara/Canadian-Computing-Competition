n = int(input())
coords = []

for i in range(n):
    tup = input().split(',')
    lst = [int(t) for t in tup]
    coords.append(lst)

min_x = min(coords, key=lambda coord: coord[0])[0]
max_x = max(coords, key=lambda coord: coord[0])[0]
min_y = min(coords, key=lambda coord: coord[1])[1]
max_y = max(coords, key=lambda coord: coord[1])[1]

print(f"{min_x-1},{min_y-1}")
print(f"{max_x+1},{max_y+1}")
