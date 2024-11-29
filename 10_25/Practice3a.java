package myapp;

public class Practice3a {
    public static void main(String[] argc) {
        double[][] x = { { 1, 2, 3 }, { 4, 5, 6 } };
        double[][] y = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

        double[][] result = matMultiply(x, y);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] matMultiply(double[][] a, double[][] b) {
        int m = a.length;
        int n = a[0].length;
        int p = b[0].length;

        double[][] result = new double[m][p];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return result;
    }
}
