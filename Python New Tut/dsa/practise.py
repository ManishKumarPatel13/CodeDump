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
# l = []
# arr = [7, 8,5, 1, 4]
# n = 5
# for i in range(n):
#     if arr[i] == max(arr) or arr[i] == max(arr[i:]):
#         l.append(-1)
#     elif i == n-1:
#         l.append(-1)
#     else:
#         for j in range(i+1, n):
#             print(arr[j], arr[i])
#             if arr[j] > arr[i]:
#                 l.append(arr[j])
#                 break
# print(l)

def is_prime(n):
    if n <= 1:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True
def solve(H):
    # Check if the monster's health is odd and at least 3
    if H % 2 == 0 or H < 3:
        return -1

    # Determine maximum special move count
    max_special_moves = 1

    # Determine maximum regular attack count
    max_regular_attacks = H - 1

    # Initialize minimum move count
    min_moves = float('inf')

    for special_move in range(3, H + 1):
        if is_prime(special_move):
            # Calculate maximum allowed regular attacks
            remaining_health = H - special_move
            max_allowed_regular_attacks = remaining_health // 2

            # Simulate regular attack sequence
            current_moves = max_regular_attacks + max_special_moves
            regular_health = remaining_health

            while regular_health > 0:
                regular_health //= 2
                current_moves -= 1

            if regular_health == 0:
                min_moves = min(min_moves, current_moves)

    if min_moves == float('inf'):
        return -1
    else:
        return min_moves


print(solve(10)) 
