package BT2;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double delta(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public void giaiPhuongTrinhBacHai() {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            } else {
                System.out.println("Phương trình có nghiệm duy nhất x = " + (-c / b));
            }
        } else {
            if (delta(a, b, c) < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta(a, b, c) == 0) {
                System.out.println("Phương trình có nghiệm kép x1=x2= " + (-b / 2 * a));
            } else {
                System.out.println("Phương trình có 2 nghiệm phân biệt x1 = " + (-b + Math.sqrt(delta(a, b, c))) / 2 * a + ", x2 =" + (-b - Math.sqrt(delta(a, b, c))) / 2 * a);
            }
        }
    }

}
