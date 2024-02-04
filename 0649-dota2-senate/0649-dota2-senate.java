class Solution {
    public String getOpp(char ch) {
        return ch == 'R' ? "D" : "R";
    }

    public String predictPartyVictory(String senate) {
        StringBuilder res = new StringBuilder(senate);
        while (true) {
            char c = res.charAt(0);
            String opp = getOpp(c);
            int index = res.indexOf(opp);
            if (index != -1) {
                res.deleteCharAt(index);
                res.deleteCharAt(0);
                res.append(c);
            } else
                return c=='R' ? "Radiant" : "Dire";
        }
    }

}