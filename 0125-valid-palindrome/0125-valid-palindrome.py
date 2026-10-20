class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        
        simple = ""

        for i in s :
            if (i.isalnum()) :
                simple = simple + i.lower()

        left = 0
        right = len(simple)-1

        while (left < right) :
            if simple[left] == simple[right] :
                left = left + 1
                right = right - 1
            else :
                return False
        
        return True