class Solution {
    public String longestDiverseString(int a, int b, int c) {
        int currA = 0, currB = 0, currC = 0;
        StringBuilder s = new StringBuilder();
        int n = a + b + c;
        int i = 0;
        while (i < n) {
            if ((currA != 2 && a >= b && a >= c) || a > 0 && (currB == 2 || currC == 2)) {
                s.append('a');
                currA++;
                currB = 0;
                currC = 0;
                a--;
            } else if ((currB != 2 && b >= a && b >= c) || b > 0 && (currA == 2 || currC == 2)) {
                s.append('b');
                currA = 0;
                currB++;
                currC = 0;
                b--;
            } else if ((currC != 2 && c >= a && c >= b) || c > 0 && (currA == 2 || currB == 2)) {
                s.append('c');
                currA = 0;
                currB = 0;
                currC++;
                c--;
            }
            i++;
        }
        return s.toString();
    }
}