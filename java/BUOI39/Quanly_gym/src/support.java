import java.util.Scanner;

public class support {
    private static Scanner scanner = new Scanner(System.in);

    public support() {
        // Ngăn việc khởi tạo đối tượng ScannerUtil
    }

    public static String nextLine() {
        return scanner.nextLine();
    }

    public static int nextInt() {
        return scanner.nextInt();
    }

    public static double nextDouble() {
        return scanner.nextDouble();
    }
}
