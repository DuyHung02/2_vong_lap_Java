import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Tìm ước số chung lớn nhất");
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập a: ");
        a = input.nextInt();
        System.out.print("Nhập b: ");
        b = input.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println("không có ước chung lớn nhất");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Ước chung lớn nhất là: " + a);
    }
}