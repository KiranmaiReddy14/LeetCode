class Solution {
    public int findJudge(int n, int[][] trust) {
        if (n == 1)
            return 1;
        List<Integer> list = new ArrayList<>();
        List<Integer> t = new ArrayList<>();
        int count = 1;
        for (int i = 0; i < trust.length; i++) {
            t.add(trust[i][0]);
            if (list.contains(trust[i][0]) && t.contains(trust[i][0])) {
                int ind = list.indexOf(trust[i][0]);
                list.remove(ind);
            }
            if (list.contains(trust[i][1]) || t.contains(trust[i][1])) {
                count += 1;
                continue;
            }
            list.add(trust[i][1]);
        }
        return list.size() != 1 || count < (n - 1) ? -1 : list.get(0);
    }
}