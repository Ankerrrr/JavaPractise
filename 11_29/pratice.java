class Retangle {
    int x, y;

    int getSize() {
        return x * y;
    }

    int perimetrt() {
        return 2 * (x + y);
    }
}

public class pratice {
    public static void main(String[] args) {
        Retangle ret = new Retangle();
        ret.x = 2;
        ret.y = 3;

        System.out.println(ret.getSize());
        System.out.println(ret.perimetrt());
    }
}