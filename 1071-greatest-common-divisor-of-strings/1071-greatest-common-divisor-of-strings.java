class Solution {
   
	 public String gcdOfStrings(String str1, String str2) {

		if ((str1 + str2).equalsIgnoreCase(str2 + str1)) {
			if (str1.length() == str2.length()) {
				return str1;
			}
			int len = getGcp(str1.length(), str2.length());
			System.out.println(len);
			return str1.substring(0, len);
		} else {
			return "";
		}
	}

	public int getGcp(int num1, int num2) {
		int i = num1 > num2 ? num2 : num1;
		if (num1 == 1 || num2 == 1) {
			return num1 > num2 ? num2 : num1;
		} else {
			while (num1 % i != 0 || num2 % i != 0) {
				i--;
			}
			return i;
		}
	}

}