public class Solution {
    public int maxScore(String inputStr) {
        int totalOnes = 0;
        int zerosCount = 0;
        int onesCount = 0;
        int res = Integer.MIN_VALUE;
        for (char ch : inputStr.toCharArray()) {
            if (ch == '1') totalOnes++;
        }
        for (int i = 0; i < inputStr.length() - 1; i++) {
            if (inputStr.charAt(i) == '0') zerosCount++;
            else onesCount++;
            int currentScore = zerosCount + (totalOnes - onesCount);
            res = Math.max(res, currentScore);

        }
        return res;
    }
}