package NGAY1;

import java.util.Scanner;

public class Sdtoantu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width");
        width = scanner.nextFloat(); // Nhập vào chiều rộng
        System.out.println("Enter height");
        height = scanner.nextFloat(); // NHập vào chiểu dài
        float area = width * height;
        System.out.println("Area is :" + area);
    }
}
