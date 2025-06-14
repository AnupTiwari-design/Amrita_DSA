def reverse_word(word):
    stack = []
    
    for char in word:
        stack.append(char)
    
    reversed_word = ''
    while stack:
        reversed_word += stack.pop()
    
    return reversed_word

# Example usage
word = "hello"
print(reverse_word(word))  # Output: "olleh"