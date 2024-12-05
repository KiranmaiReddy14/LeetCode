class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int hIndex = 0;
        // System.out.println(Arrays.toString(citations));
        for (int i = citations.length - 1; i >= 0; i--) {
            if (citations[i] <= hIndex)
                return hIndex;
            hIndex++;
        }
        return hIndex;
    }
}