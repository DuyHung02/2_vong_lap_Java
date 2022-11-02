import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("kiểm tra số nguyên tố");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số ngẫu nhiên: ");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println(number + " không phải số nguyên tố");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number + " là số nguyên tố");
            else
                System.out.println(number + " không phải số nguyên tố");
        }
    }
}