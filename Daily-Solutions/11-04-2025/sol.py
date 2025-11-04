String = input('Enter a string: ')

String = String.replace('_', '~').replace('-', '~')
String = String.capitalize()

print(String)