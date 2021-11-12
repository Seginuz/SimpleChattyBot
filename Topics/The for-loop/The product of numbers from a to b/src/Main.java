import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int low = scanner.nextInt();
        int high = scanner.nextInt();

        long product = low;

        for (int i = low + 1; i < high; i++) {
            product = product * i;
        }

        System.out.println(product);
    }
}