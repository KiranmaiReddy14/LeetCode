class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        backtrack(s, new ArrayList<>(), list, 0);
        return list;
    }

    public void backtrack(String s, List<String> li, List<List<String>> list, int index) {
        if (index == s.length()) {
            list.add(new ArrayList<>(li));
            return;
        } else {
            for (int i = index; i < s.length(); i++) {
                if (isPalindrome(s, index, i)) {
                    li.add(s.substring(index, i + 1));
                    backtrack(s, li, list, i + 1);
                    li.remove(li.size() - 1);
                }
            }
        }
    }

    private boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start++) != s.charAt(end--))
                return false;
        }
        return true;
    }
}