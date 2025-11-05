String = input('Enter a string: ')

String = String.replace('_', '~').replace('-', '~')
String = String.capitalize()

Output = [] # Empty Dictionary to store the final output
upper = True # it is a Flag to check whether to convert to upper or lower case
for char in String:
    if char.isalpha(): # Check if the character is an alphabet
        Output.append(char.upper() if upper else char.lower()) # Append the character in upper or lower case based on the flag
        upper = not upper # Revrse the Falg after every alphabet
    else:
        Output.append(char)

print("".join(Output))
