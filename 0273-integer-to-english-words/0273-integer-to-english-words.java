class Solution {
    String[] twos = { "", "One", "Two", "Three", "Four", "Five", "Six",
            "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen",
            "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
            "Nineteen" };
    String[] hun = { "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty",
            "Seventy", "Eighty", "Ninety" };
    String[] thousands = { "", "Thousand", "Million", "Billion" };

    public String numberToWords(int num) {
        if (num == 0)
            return "Zero";
        int i = 0;
        String word = "";
        while (num > 0) {
            if (num % 1000 != 0)
                word = helper(num % 1000) + thousands[i] + " " + word;
            num /= 1000;
            i++;
        }
        return word.trim();
    }

    public String helper(int n) {
        if (n == 0)
            return "";
        if (n < 20)
            return twos[n] + " ";
        else if (n < 100)
            return hun[n / 10] + " " + helper(n % 10);
        else
            return twos[n / 100] + " Hundred " + helper(n % 100);
    }
}