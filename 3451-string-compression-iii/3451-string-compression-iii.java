class Solution {
    public String compressedString(String word) {
        StringBuilder comp = new StringBuilder();
        if (word.isEmpty())
            return "";
        char ch = word.charAt(0);
        int count = 1;
        for (int i = 1; i < word.length(); i++) {
            if (count == 9 || word.charAt(i) != word.charAt(i - 1)) {
                comp.append(count + "" + word.charAt(i - 1));
                count = 1;
            } else
                count++;
        }
        return comp.append(count + "" + word.charAt(word.length() - 1)).toString();
    }
}