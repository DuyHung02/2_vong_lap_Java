import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền gửi(đ): ");
        int tiengui = scanner.nextInt();
        System.out.print("Nhập tỉ lệ lãi suất(%): ");
        double rate = scanner.nextDouble();
        System.out.print("Nhập số tháng gửi: ");
        int thanggui = scanner.nextInt();
        double tienlai = 0;
        for (int i = 0; i < thanggui; i++) {
            tienlai += tiengui * (rate / 100) / 12 * thanggui;
            System.out.println("Số tiền lãi là: " + tienlai);
        }
    }
}