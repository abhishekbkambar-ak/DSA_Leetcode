class Solution:
    def isPalindrome(self, x: int) -> bool:

        if x < 0:
            return False

        num = str(x)

        reverse = num[::-1]

        if num == reverse:
            return True
        else:
            return False    
