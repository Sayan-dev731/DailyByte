def count_words(sentence):
    
    if sentence == '':
        return 0
    
    count = 1
    for c in sentence:
        if c ==' ':
            count += 1
    
    return count

print(count_words("Hello world"))
print(count_words("Necessity is the mother of invention."))
print(count_words("I"))
print(count_words("Eat Code Sleep"))