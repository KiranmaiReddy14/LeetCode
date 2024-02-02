class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<String>();
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        for (char c : digits.toCharArray()) {
            if (list.size() > 0) {
                List<String> li = list;
                list = new ArrayList<>();
                StringBuilder str = new StringBuilder();
                str.append(map.get(c));
                for (int i = 0; i < li.size(); i++) {
                    for (int j = 0; j < str.length(); j++) {
                        String s = li.get(i) + str.charAt(j);
                        list.add(s);
                    }
                }
            } else {
                StringBuilder str = new StringBuilder();
                str.append(map.get(c));
                for (int i = 0; i < str.length(); i++)
                    list.add(str.charAt(i) + "");
            }
        }
        return list;
    }
}