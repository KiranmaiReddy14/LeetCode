class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String str = String.valueOf(ch);
            if (map.containsKey(str))
                map.get(str).add(s);
            else
                map.put(str, new ArrayList<>(Arrays.asList(s)));
        }
        for (Map.Entry<String, ArrayList<String>> m : map.entrySet())
            res.add(m.getValue());
        return res;
    }
}