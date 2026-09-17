class Solution(object):
    def digitFrequencyScore(self, n):
        score = 0

        for digit in str(n):
            score += int(digit)

        return score