class comp {
    private double a, b;

    comp(double x, double y) {
        a = x;
        b = y;
    }

    comp add(comp n) {
        double newA = this.a + n.a;
        double newB = this.b + n.b;
        return new comp(newA, newB);
    }

    comp sub(comp n) {
        double newA = this.a - n.a;
        double newB = this.b - n.b;
        return new comp(newA, newB);
    }

    comp mult(comp n) {
        double newA = (this.a * n.a) + ((-1) * this.b * n.b); // ++ -, +- + -- -
        double newB = (this.a * n.b) + (this.b * n.a);

        return new comp(newA, newB);
    }

    comp div(comp n) {
        // b up (1,2)(3,4)
        // this down(1,2)
        double upA = (this.a * n.a) + (this.b * n.b);
        double upB = (this.a * n.b) + ((-1) * this.b * n.a);

        double downA = this.a * this.a;
        double downB = this.b * this.b;
        double down = downA + downB;

        double ansA = upA / down;
        double ansB = upB / down;
        return new comp(ansA, ansB);
    }

    void show() {
        System.out.println(a + ((b < 0) ? "" : "+") + b + "i");
    }
}

class complex {
    public static void main(String[] argc) {
        comp a = new comp(1, 2);
        comp b = new comp(3, 4);

        comp p = a.add(b);
        p.show();

        comp z = b.sub(a);
        z.show();

        comp c = a.mult(b);
        c.show();

        comp d = b.div(a);
        d.show();

        comp e = new comp(3, 6);
        comp f = new comp(10, 5);
        comp g = f.div(e);
        g.show();
    }
}
