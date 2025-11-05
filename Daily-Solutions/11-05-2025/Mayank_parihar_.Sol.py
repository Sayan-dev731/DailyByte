sentence = input("Enter the sentence: ")
def count_words(sentence):
    a=sentence.split() # Split sentence --> list of words
    return len(a)
print(count_words(sentence))  