class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            boolean greatest = true;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    if (candies[i] + extraCandies < candies[j])
                        greatest = false;
                }
            }
            res.add(greatest);
        }
        return res;
    }
}