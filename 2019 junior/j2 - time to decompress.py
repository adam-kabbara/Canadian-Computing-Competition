line_count = int(input())
encoded = []

for i in range(line_count):
    encoded.append([int(elem) if i==0 else elem for i, elem in enumerate(input().split())])

for i in range(line_count):
    count, char = encoded[i]
    print(char*count)