package BT1;

import java.util.Scanner;

public class Circle {
    double r;
    String color;
    Circle() {
    }

    Circle(double r, String color){
        this.r = r;
        this.color = color;
    }

    public double getR(){
        return r;
    }
    public void setR(double r){
        this.r = r;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public double chuVi(){
        return 2*r*Math.PI;
    }
    public double dienTich(){
        return 2*r*r*Math.PI;
    }

    public  void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập bán kính hình tròn = ");
        double r = sc.nextDouble();
        sc.nextLine();
        System.out.print("Nhập màu = ");
        String color = sc.nextLine();
        setR(r);
        setColor(color);
    }
    public void displayDate(){
        System.out.println("Chu vi hình tròn: " + chuVi());
        System.out.println("Diện tích hình tròn: " + dienTich());
    }
}
