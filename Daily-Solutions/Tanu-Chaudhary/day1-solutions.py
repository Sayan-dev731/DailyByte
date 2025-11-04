# spooky case challenge

# take input from the user
s = input("enter a string : ")

# replace _ and - with ~  
s = s.replace("_","~")
s = s.replace("-","~")

result = ""
make_upper = True   

for ch in s:

    # if  ~ keep it ~
    if ch == "~":
        result += "~"
    else:
       
        if make_upper:
            result += ch.upper()
        else:
            result += ch.lower()

        make_upper = not make_upper

print(result)


