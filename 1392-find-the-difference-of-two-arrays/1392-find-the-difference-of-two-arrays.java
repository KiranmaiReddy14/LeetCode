class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		Set<Integer> set3 = new HashSet<>();
		for (int n : nums1)
			set1.add(n);
		for (int n : nums2)
			set3.add(n);
		List<List<Integer>> finalArray = new ArrayList<>();
		for (int n : nums2) {
			if (!set1.contains(n))
				set2.add(n);
		}

		set1.removeAll(set3);
		finalArray.add(new ArrayList<>(set1));
		finalArray.add(new ArrayList<>(set2));
		return finalArray;
	}
}