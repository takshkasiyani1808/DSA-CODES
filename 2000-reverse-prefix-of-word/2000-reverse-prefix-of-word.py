class Solution(object):
    def reversePrefix(self, word, ch):
        ans = ""
        check = False
        right = 0

        for i in range(len(word)) :
            if word[i].lower()==ch :
                check = True
                right = i
                break


        if check :
            leftString = word[0 : right+1]
            leftString = leftString[::-1]
            rightString = word[right+1 : len(word)]
            ans = leftString + rightString
            return ans

        else :
            return word
