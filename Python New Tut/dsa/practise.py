# def getValue(s):
#         if s == "I":
#             return 1
#         elif s == "V":
#             return 5
#         elif s == "X":
#             return 10
#         elif s== "L":
#             return 50
#         elif s == "C":
#             return 100
#         elif s == "D":
#             return 500
#         elif s == "M":
#             return 1000

# # class Solution:
    
# def romanToInt(s: str) -> int:
#     IntegerNO = 0
#     i = 0
#     while i < len(s):
#         if(i <= len(s) -2):
#             if (getValue(s[i+1]) <= getValue(s[i])):
#                 IntegerNO += getValue(s[i])
#                 i += 1
#             elif getValue(s[i+1]) > getValue(s[i]):
#                 IntegerNO += getValue(s[i+1]) - getValue(s[i])
#                 i += 2
#                 continue
#         else:
#             if getValue(s[i]) <= getValue(s[i-1]):
#                 IntegerNO += getValue(s[i])
#                 i +=1 
#             elif getValue(s[i]) > getValue(s[i-1]):
#                 IntegerNO += getValue(s[i]) - getValue(s[i-1])
#                 i += 1
#     return IntegerNO

# print(romanToInt("III")) 
l = []
arr = [7, 8,5, 1, 4]
n = 5
for i in range(n):
    if arr[i] == max(arr) or arr[i] == max(arr[i:]):
        l.append(-1)
    elif i == n-1:
        l.append(-1)
    else:
        for j in range(i+1, n):
            print(arr[j], arr[i])
            if arr[j] > arr[i]:
                l.append(arr[j])
                break
print(l)