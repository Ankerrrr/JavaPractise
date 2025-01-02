class Circle {
  private double pi = 3.14;
  private double radius;

  public Circle(double r) {
    radius = r;
  }

  public void show() {
    System.out.println("radius=" + radius + ", area= " + (radius * radius * pi));
  }
}

class pratice {
  public static void main(String[] args) {
    Circle cir = new Circle(2);
    cir.show();
  }
}