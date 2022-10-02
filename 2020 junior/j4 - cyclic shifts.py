text = input()
string = input()

cycles = set() # so we dont get multiple similar cycles, use sets

for i in range(len(string)):
    cycles.add(string[i:]+string[:i])

for c in cycles:
    if c in text:
        print("yes")
        break
else: # only executed if the for loop is not broken with a break statement
    print("no")
    