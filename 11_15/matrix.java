import java.util.Scanner;

public class matrix {
    public static void main(String[] argc) {
        Scanner sc = new Scanner(System.in);
        int size = inp(sc);
        int a[][] = getMatrix(size, sc);

        // 第一題行列式
        int det = determinant(a, size);
        System.out.println("this is det: " + det);

        // 第二題反矩陣
        System.out.println("this is inverse Matrix:");
        printMatrix(inverse(det, a, size), size);

        // 第三題相乘
        System.out.println("this is mult");
        printMatrix(multMatrix(inverse(det, a, size), toDoubleMatrix(a)), size);
        sc.close();
    }

    public static int inp(Scanner sc) {
        int size;

        while (true) {
            System.out.print("請輸入幾乘幾:");
            size = sc.nextInt();
            if (!(size > 0)) {
                System.out.println("請輸入大於0的數值");
            } else {
                break;
            }
        }
        return size;
    }

    public static int[][] getMatrix(int size, Scanner sc) {
        int[][] a = new int[size][size];

        System.out.println("開始輸入矩陣內容");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("(" + i + ", " + j + "): ");
                a[i][j] = sc.nextInt();
            }
            System.out.println("___________________");
        }
        return a;
    }

    public static int determinant(int[][] a, int size) {
        if (size == 1) {
            return a[0][0];
        }
        if (size == 2) {
            return a[0][0] * a[1][1] - a[0][1] * a[1][0];
        }

        int det = 0;
        for (int i = 0; i < size; i++) {
            det += Math.pow(-1, i) * a[0][i] * determinant(getSubMatrix(a, size, i, 0), size - 1);
        }

        return det;
    }

    public static int[][] getSubMatrix(int[][] a, int size, int row, int col) {
        int matrix[][] = new int[size - 1][size - 1];
        int x = 0;

        for (int i = 0; i < size; i++) {
            if (i == col) {
                continue;
            }
            int y = 0;
            for (int j = 0; j < size; j++) {
                if (j == row) {
                    continue;
                }
                matrix[x][y++] = a[i][j];
            }
            x++;
        }

        return matrix;
    }

    public static double[][] inverse(int det, int[][] a, int size) {
        double[][] inverseMatrix = new double[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                inverseMatrix[i][j] = (int) Math.pow(-1, (i + 1) + (j + 1))
                        * determinant(getSubMatrix(a, size, i, j), size - 1);
                inverseMatrix[i][j] /= det;
            }
        }
        return inverseMatrix;
    }

    public static void printMatrix(double[][] a, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%2f ,", a[i][j]);
            }
            System.out.println("");
        }
    }

    public static double[][] toDoubleMatrix(int[][] intMatrix) {
        int rows = intMatrix.length;
        int cols = intMatrix[0].length;
        double[][] doubleMatrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                doubleMatrix[i][j] = intMatrix[i][j];
            }
        }
        return doubleMatrix;
    }

    public static double[][] multMatrix(double[][] matrix1, double[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        if (cols1 != rows2) {
            throw new IllegalArgumentException("矩陣的列與行不符合，無法相乘。");
        }

        double[][] result = new double[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

}