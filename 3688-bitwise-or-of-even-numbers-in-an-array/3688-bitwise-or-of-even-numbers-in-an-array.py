class Solution(object):
    def evenNumberBitwiseORs(self, nums):
        result = 0
        for i in nums :
            if (i%2==0) :
                result = result | i
        
        if (result!=0) :
            return result
        else :
            return 0