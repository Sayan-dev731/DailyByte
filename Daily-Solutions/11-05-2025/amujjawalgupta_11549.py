def count_words(sentence):
    
    if sentence == '':
        return 0
    
    count = 1
    for c in sentence:
        if c ==' ':
            count += 1
    
    return count

print(count_words("Hello world"))
print(count_words("The quick brown fox"))
print(count_words("I"))
print(count_words("Programming is fun"))