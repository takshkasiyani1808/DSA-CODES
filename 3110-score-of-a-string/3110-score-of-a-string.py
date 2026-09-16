class Solution:
    def scoreOfString(self, s):
        score = 0

        for i in range(len(s) - 1):
            current = ord(s[i])
            next_char = ord(s[i + 1])

            difference = abs(current - next_char)
            score += difference

        return score