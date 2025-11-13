def is_armstrong(n):
    
    sum = 0
    temp = n
    
    while temp>0:
        digit = temp % 10
        sum += digit ** len(str(n))
        temp //= 10

    return n == sum

print(is_armstrong(153))
print(is_armstrong(9474))
print(is_armstrong(123))
print(is_armstrong(9))
print(is_armstrong(370))