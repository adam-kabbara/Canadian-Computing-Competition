text = input()
string = input()

for i in range(len(string)):
    cycle = string[i:]+string[:i]
    if cycle in text:
        print("yes")
        break
else: # only executed if the for loop is not broken with a break statement
    print("no")
    
