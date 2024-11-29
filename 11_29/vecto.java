import java.util.Scanner;

class Vector {
    private int array[];
    private double doneNorm = 0;

    Vector(int num) {
        array = new int[num];
    }

    void inputArray(Scanner sc) {
        System.out.println("plz Enter " + array.length + " number");
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + i + "]: ");
            array[i] = sc.nextInt();
        }
        System.out.println("Input Complete");
    }

    double cacuNorm() {
        double Norm = 0;
        for (int i = 0; i < array.length; i++) {
            Norm += Math.pow(array[i], 2);
        }
        Norm = Math.sqrt(Norm);
        doneNorm = Norm;
        return Norm;
    }

    int product(Vector otherVector) {
        if (this.array.length != otherVector.array.length) {
            System.out.println("different size, Cant Product");
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < this.array.length; i++) {
            sum += this.array[i] * otherVector.array[i];
        }
        return sum;
    }

    double cos(Vector othVector) {
        if (this.array.length != othVector.array.length) {
            System.out.println("different Size, Cant Cacu Cos");
        }
        double norm1 = this.doneNorm == 0 ? this.cacuNorm() : this.doneNorm;
        double norm2 = othVector.doneNorm == 0 ? othVector.cacuNorm() : othVector.doneNorm;

        int produ = product(othVector);

        double ans = 0;
        ans += produ;
        ans /= norm1 * norm2;

        return ans;
    }

    void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "]:" + array[i]);
        }
    }
}

public class vecto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vector vec1 = new Vector(3);
        Vector vec2 = new Vector(3);
        vec1.inputArray(sc);
        vec2.inputArray(sc);

        vec1.print();
        vec2.print();

        System.out.println("NORM: " + vec1.cacuNorm());
        System.out.println("Product: " + vec1.product(vec2));
        System.out.println("Cos: " + vec1.cos(vec2));

        sc.close();
    }
}