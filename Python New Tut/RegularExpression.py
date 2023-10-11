import re

pattern = 'want'

text = '''Hii I am a student and I want  Chance to apply for an internship in your company.
I will be very grateful if you consider Me for this role. Thanks for giving me a chance'''

# SEARCHING NORMAL

# match = re.search(pattern, text) # This will store the index and tell whether if pattern is present in text and it stops at the first instance it matches
# print(match)

# This will print the len of text
# print(match.endpos) 

# This will print the start of pattern in text
# print(match.start()) 

# This will print the end of pattern in text
# print(match.end()) 

# This will print a tuple of start and end of pattern in text
# print(match.span()) 

# SEARCHING COMPLEX
pattern = r"[A-Z]+e" # This will search for a two letter word which starts with any capital letter and end with an e and "+"
                     # sign indicates that we want to find more then one occurence and raw file format is passed so no closing sequence should work

pattern = r"[A-Z].+e" # Dot is used to match 2 character from set [] 
matches = re.finditer(pattern, text)
print(type(matches)) # it is an iterator class variable
for match in matches:
    print(match)
    






