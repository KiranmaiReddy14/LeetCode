class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int count = 0;
        while (j < fruits.length) {
            // map.put(fruits[j], map.getOrDefault(fruits[j], 0) + 1);
            map.put(fruits[j], map.getOrDefault(fruits[j], 0) + 1);

            // System.out.println(fruits[j] + " -> " + map.get(fruits[j]) + " " + map.size()
            // + " " + (j - i));
            while (map.size() > 2) {
                int c = map.get(fruits[j]);
                // map.put(fruits[j], 1);
                // for (Map.Entry<Integer, Integer> m : map.entrySet())
                // System.out.println(i + " " + fruits[i] + " -> " + map.get(fruits[i]));

                map.put(fruits[i], map.get(fruits[i]) - 1);
                if (map.get(fruits[i]) == 0)
                    map.remove(fruits[i]);
                //System.out.println(map.size() + "   " + j);
                // i =i+c;
                i++;
            }
            count = (j - i)+1 > count ? (j - i)+1 : count;
            j++;
        }
        // System.out.println(i + " " + j + " " + count+" "+(j-i));
        count = (j - i) > count ? j - i : count;
        return count;
    }
}