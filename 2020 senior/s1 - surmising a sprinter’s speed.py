number_observations = int(input())
data = []
max_speed = 0

for _ in range(number_observations):
    data.append([int(i) for i in input().split(" ")]) # time, x pos
data.sort(key=lambda x: x[0])

for i in range(number_observations-1):
    speed = abs(data[i+1][1] - data[i][1]) / abs(data[i+1][0] - data[i][0])
    if max_speed < speed:
        max_speed = speed

print(max_speed)
