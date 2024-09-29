import java.lang.*;
class Solution {
    public int fib(int n) {
        double phi = (1 + Math.sqrt(5)) / 2;
        double psi = (1 - Math.sqrt(5)) / 2;
        return (int) (Math.round((Math.pow(phi, n) - Math.pow(psi, n)) / Math.sqrt(5)));
    }
}