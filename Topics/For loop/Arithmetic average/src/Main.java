import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double sum = 0;
        double count = 0;
        for (int i = a; i <= b; i++) {
            if ((i % 3) == 0) {
                sum += i;
                count++;
            }
        }
        double avg = sum/count;
        System.out.println(avg);
    }
}