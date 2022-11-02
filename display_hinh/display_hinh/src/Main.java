import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hiển thị hình");
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0)
            System.out.println("1. vẽ hình chữ nhật");
        System.out.println("2. vẽ hình tam giác vuông");
        System.out.println("3. vẽ tam giác cân");
        System.out.println("0. exit");
        System.out.println("Chọn hình muốn vẽ");
        choice = scanner.nextInt();
        System.out.println("Nhập chiều dài a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập chiều cao b: ");
        int b = scanner.nextInt();
        switch (choice) {
            case 1:
                for (int i=0; i<5; i++) {
                    for (int j=0; j<5; j++) {
                        System.out.println("*");
                    }
                    System.out.println("\n");
                }
        }
    }
}