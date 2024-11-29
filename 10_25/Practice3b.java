package myapp;

public class Practice3b {
    public static void main(String[] argc) {
        double[][] x = { { 1, 2 }, { 3, 4 } };

        double inv[][] = invMatrix(x);
        System.out.println("逆矩陣:");
        for (int i = 0; i < inv.length; i++) {
            for (int j = 0; j < inv[i].length; j++) {
                System.out.print(inv[i][j] + " ");
            }
            System.out.println();
        }

        double multInv[][] = check(x, inv);
        System.out.println("原始矩陣與逆矩陣相乘結果:");
        for (int i = 0; i < multInv.length; i++) {
            for (int j = 0; j < multInv[i].length; j++) {
                System.out.print(multInv[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] check(double[][] a, double[][] b) {
        return Practice3a.matMultiply(a, b);
    }

    public static double[][] invMatrix(double a[][]) {
        double det = a[0][0] * a[1][1] - a[0][1] * a[1][0];
        if (det == 0) {
            throw new ArithmeticException("矩陣不可逆");
        }

        double[][] inv = new double[2][2];
        inv[0][0] = a[1][1] / det;
        inv[0][1] = -a[0][1] / det;
        inv[1][0] = -a[1][0] / det;
        inv[1][1] = a[0][0] / det;

        return inv;
    }
}
