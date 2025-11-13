def fibonacci(n):
    
    if n == 0 or n == 1:
        return n
    
    first = 0
    second = 1
    for i in range(2, n+1):
        a = first + second
        first = second
        second = a

    return second

print(fibonacci(0))
print(fibonacci(1))
print(fibonacci(5))
print(fibonacci(10))
print(fibonacci(2))