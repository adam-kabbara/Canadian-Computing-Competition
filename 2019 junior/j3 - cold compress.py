str_list = []
for _ in range(int(input())):
    line = input()
    char = line[0]
    count = 0
    string = ""

    for c in line:
        if c == char:
            count+=1
        else:
            string = string +f"{count} {char} "
            char = c
            count = 1
    string = string +f"{count} {char}".strip()
    str_list.append(string)# very wierd and stupid way of copying the string so that it doesnt change as we loop over for loop

for s in str_list:
    print(s)