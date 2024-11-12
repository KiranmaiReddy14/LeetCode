class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        int n = queries.size();
        double[] res = new double[n];
        HashMap<String, HashMap<String, Double>> map = buildMap(equations, values);

        for (int i = 0; i < n; i++) {
            String l = queries.get(i).get(0);
            String r = queries.get(i).get(1);
            if (!map.containsKey(l) || !map.containsKey(r))
                res[i] = -1.0;
            else {
                HashSet<String> set = new HashSet<>();
                double[] ans = { -1.0 };
                double mul = 1.0;
                DFS(map, l, r, ans, mul, set);
                res[i] = ans[0];
            }
        }
        return res;
    }

    static HashMap<String, HashMap<String, Double>> buildMap(List<List<String>> equations,
            double[] values) {
        HashMap<String, HashMap<String, Double>> map = new HashMap<>();
        for (int i = 0; i < equations.size(); i++) {
            String dividend = equations.get(i).get(0);
            String divisor = equations.get(i).get(1);
            double val = values[i];
            map.putIfAbsent(dividend, new HashMap<>());
            map.putIfAbsent(divisor, new HashMap<>());
            map.get(dividend).put(divisor, val);
            map.get(divisor).put(dividend, 1.0 / val);
        }
        return map;
    }

    static void DFS(HashMap<String, HashMap<String, Double>> map, String l, String r, double[] ans, double mul,
            HashSet<String> set) {
        if (set.contains(l))
            return;
        set.add(l);
        if (l.equals(r)) {
            ans[0] = mul;
            return;
        }
        for (Map.Entry<String, Double> m : map.get(l).entrySet()) {
            String right = m.getKey();
            double value = m.getValue();
            DFS(map, right, r, ans, mul * value, set);
        }
    }
}