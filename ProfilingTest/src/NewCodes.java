public class NewCodes {
    public static void main(String[] args) {
        String s1 = "AGGTABGRDVMMEFVJKIR";
        String s2 = "GXTXASVJMDSJBUVNIIW";

        int m = s1.length();
        int n = s2.length();

//        System.out.println("Length of LCS using naive approach: " + naiveLCS(s1, s2, m, n));
        System.out.println("Length of LCS using naive approach: " + dynamicProgrammingLCS(s1, s2));
    }

    // Naive recursive function (O(n^2) time complexity)
    public static int naiveLCS(String s1, String s2, int m, int n) {
        // Base case: if either of the strings is empty, LCS is 0
        if (m == 0 || n == 0) {
            return 0;
        }

        // If characters of both strings match, then
        // LCS of X[0..m-1], Y[0..n-1] is LCS(X[0..m-2], Y[0..n-2]) + 1
        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
            return naiveLCS(s1, s2, m - 1, n - 1) + 1;
        } else {
            // Otherwise, return the maximum of LCS(X[0..m-2], Y[0..n-1]) and LCS(X[0..m-1], Y[0..n-2])
            return Math.max(naiveLCS(s1, s2, m - 1, n), naiveLCS(s1, s2, m, n - 1));
        }
    }

    // Dynamic programming (O(n^2) time complexity)
    public static int dynamicProgrammingLCS(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        // Create a 2D array to store lengths of longest common subsequence.
        int[][] L = new int[m + 1][n + 1];

        // Build the L[m+1][n+1] table in bottom-up fashion.
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    L[i][j] = 0;
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    L[i][j] = L[i - 1][j - 1] + 1;
                } else {
                    L[i][j] = Math.max(L[i - 1][j], L[i][j - 1]);
                }
            }
        }

        // L[m][n] contains the length of LCS for X[0..m-1], Y[0..n-1]
        return L[m][n];
    }
}
