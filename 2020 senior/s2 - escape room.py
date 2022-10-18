m = int(input()) 
n = int(input())
grid = [[] for _ in range(1000005)] # max number for a grid is m=1000 and n=1000 so max of 1000000 vals, add 5 for extra padding
visited = [0 for _ in range(1000005)]

for i in range(1, m+1):
    row = [int(i) for i in input().split(" ")]
    for j in range(1, n+1):
        grid[i*j].append(row[j-1])


to_visit = [1]
found = False
for x in to_visit:
    if not visited[x]:
        if x == m*n:
            found = True
            break
        visited[x] = True
        for y in grid[x]:
            to_visit.append(y)

if found:
    print("yes")
else:
    print("no")


"""
# would have used recurrsion but max depth is 1000 - not enough for test 26 and 31
# also we are not allowed to increase recursion depth in the ccc grader so :(

def find_path(x): # use sets for prev_positions as they are faster to look up in
    if not visited[x]:
        if x == m*n:
            print("yes")
            exit(0)
        visited[x] = True
        for y in grid[x]:
            find_path(y)
find_path(1)
print("no")
"""
