import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if ((n % 4 == 0) && (result < n)) {
                result = n;
            }
        }
        System.out.println(result);
    }
}