def count_word(sentence):
    count=1
    for ch in sentence:
        if ch==" ":
            count=count+1
    return count
    
sentence=input("Enter a sentence")
n=count_word(sentence)
print("no. of words=",n)
