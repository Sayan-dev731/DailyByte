def decimal_to_binary(n):
    
    if n == 0:
        return 0
    
    binary = ""

    while n > 0:
        rem = n % 2
        binary = str(rem) + binary
        n //= 2

    return binary

print(decimal_to_binary(5))
print(decimal_to_binary(10))
print(decimal_to_binary(0))
print(decimal_to_binary(1))
print(decimal_to_binary(17))