class Solution {
    public String customSortString(String order, String s) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++)
            list.add(s.charAt(i));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < order.length(); i++) {
            while (list.contains(order.charAt(i))) {
                int index = list.indexOf(order.charAt(i));
                sb.append(order.charAt(i));
                list.remove(index);
            }
        }
        for (Character c : list)
            sb.append(c);
        return sb.toString();
    }
}