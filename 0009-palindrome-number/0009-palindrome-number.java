class Solution {
    public boolean isPalindrome(int x) {
		int num = x;
		int reversed = 0;
		if(x<0)
			return false;
		while (num != 0) {
			reversed = reversed * 10 + num % 10;
			num = num / 10;
		}
		if (reversed == x)
			return true;
		return false;
	}
}