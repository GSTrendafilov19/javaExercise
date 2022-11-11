import java.util.Scanner;

public class main {
    static void printMatrix(int n) {
        char ch = '1';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ch + " ");
            }
            System.out.println(ch);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printMatrix(n);
    }
}
