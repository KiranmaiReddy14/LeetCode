class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int count = 0;
        while (j < fruits.length) {
            map.put(fruits[j], map.getOrDefault(fruits[j], 0) + 1);
            // if the size is > 2, popping the elemnts till the size goes to 2
            while (map.size() > 2) {
                int c = map.get(fruits[j]);
                // remove 1 element at a time and increase the
                // ith element count to get into the right position
                map.put(fruits[i], map.get(fruits[i]) - 1);
                if (map.get(fruits[i]) == 0)
                    map.remove(fruits[i]);
                i++;
            }
            count = (j - i) + 1 > count ? (j - i) + 1 : count;
            j++;
        }
        count = (j - i) > count ? j - i : count;
        return count;
    }
}