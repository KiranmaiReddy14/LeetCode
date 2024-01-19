class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> list = new ArrayList<>();
		for (int i = 0; i < candies.length; i++) {
			int size = candies[i] + extraCandies;
			boolean isGreat = true;
			for (int j = 0; j < candies.length; j++) {
				if (i != j && !(size >= candies[j])) {
					isGreat = false;
				}
			}
			list.add(isGreat);
		}
		return list;
	}
}