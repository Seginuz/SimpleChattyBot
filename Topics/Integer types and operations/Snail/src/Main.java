import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        int up = scanner.nextInt();
        int down = scanner.nextInt();

        System.out.println((height - down - 1) / (up - down) + 1);
    }
}