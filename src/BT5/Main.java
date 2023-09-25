package BT5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student[] student = new Student[100];
        Student student1 = new Student(1, "Uy", 18, true, "Hà Nam");
        Student student2 = new Student(2, "Uy", 18, true, "Hà Nam");
        Student student3 = new Student(3, "Uy", 18, true, "Hà Nam");
        Student student4 = new Student(4, "Uy", 18, true, "Hà Nam");
        student[0] = student1;
        student[1] = student2;
        student[2] = student3;
        student[3] = student4;
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("*********MENU********");
            System.out.println("1: Hiển thị danh sách tất cả học sinh");
            System.out.println("2: Thêm mới học sinh");
            System.out.println("3: Sửa học sinh");
            System.out.println("4: Xóa học sinh");
            System.out.println("5: Thoát");
            System.out.println("Vui luòng chọn(1-5)");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    for (Student val : student) {
                        if (val != null) {
                            val.getStudent();
                        }
                        else{
                            break;
                        }
                    }
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Nhap vao id hoc sinh can sua: ");
                    int idStudent = Integer.parseInt(sc.nextLine());
                    for (Student value : student) {
                        if (value.getStudentId() == idStudent) {
                            value.inputData(sc);
                            break;
                        }
                    }
                    break;
                case 4:
                case 5:
            }
        } while (true);
    }
}

class Student {
    private int studentId;
    private String name;
    private int age;
    private boolean gender = false;
    private String address;

    public Student() {
    }

    public Student(String name, int age, boolean gender, String adDress) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = adDress;
    }

    public Student(int studentId, String name, int age, boolean gender, String adDress) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = adDress;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAdDress() {
        return address;
    }

    public void setAdDress(String adDress) {
        this.address = adDress;
    }

    public void inputData(Scanner sc) {
        System.out.println("Id: ");
        studentId = Integer.parseInt(sc.nextLine());
        System.out.println("name: ");
        name = sc.nextLine();
        System.out.println("age :");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào giới tính học sinh(nam/nữ) ");
        boolean check = true;
        while (check) {
            String sex = sc.nextLine();
            if (sex.equals("nam")) {
                gender = true;
                check = false;
            } else if (sex.equals("nu")) {
                gender = false;
                check= false;
            } else {
                System.out.println("kì thị 3d");
                System.out.println("Nhap lai gioi tinh");
            }
        }
        System.out.println(" address");
        address = sc.nextLine();
    }

    public void getStudent() {
        System.out.printf("Mã học sinh:  %d, tên học sinh: %s, tuổi: %d, giới tính: %s,địa chỉ: %s\n",
                studentId, name, age, gender ? "nam" : "nữ", address);
    }
}