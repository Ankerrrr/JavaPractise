class matrix {
    int mat[][];

    matrix(int[][] recv) {
        mat = recv;
    }

    matrix add(matrix reccv) {
        if (reccv.mat.length != mat.length || reccv.mat[0].length != mat[0].length) {
            System.out.println("Cannot Add");
            return null;
        }
        int total[][] = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                total[i][j] = mat[i][j] + reccv.mat[i][j];
            }
        }
        return new matrix(total);
    }

    matrix sub(matrix reccv) {
        if (reccv.mat.length != mat.length || reccv.mat[0].length != mat[0].length) {
            System.out.println("Cannot Sub");
            return null;
        }
        int total[][] = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                total[i][j] = mat[i][j] - reccv.mat[i][j];
            }
        }
        return new matrix(total);
    }

    matrix mult(matrix reccv) {
        if (mat[0].length != reccv.mat.length) {
            System.out.println("Cannot Multiply: Column of A != Row of B");
            return null;
        }
        int total[][] = new int[mat.length][reccv.mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < reccv.mat[0].length; j++) {
                total[i][j] = 0;
                for (int k = 0; k < mat[0].length; k++) {
                    total[i][j] += mat[i][k] * reccv.mat[k][j];
                }
            }
        }
        return new matrix(total);
    }

    matrix multN(int n) {
        int total[][] = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                total[i][j] = mat[i][j] * n;
            }
        }
        return new matrix(total);
    }

    void print() {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + ", ");
            }
            System.out.println("");
        }
        System.out.println("~~~~~~~~~~~~~~~~~");
    }
}

class hw {
    public static void main(String args[]) {
        int mat1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int mat2[][] = { { 2, 3, 4 }, { 5, 6, 2 }, { 3, 4, 5 } };

        matrix a = new matrix(mat1);
        matrix b = new matrix(mat2);

        matrix c = a.add(b);
        System.out.println("a+b= ");
        c.print();

        matrix d = a.sub(b);
        System.out.println("a-b= ");
        d.print();

        matrix e = a.mult(b);
        System.out.println("a*b= ");
        e.print();

        matrix f = a.multN(2);
        System.out.println("a*2= ");
        f.print();

    }
}