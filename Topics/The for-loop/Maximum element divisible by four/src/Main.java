import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfElements = scanner.nextInt();

        int maxDivisibleBy4 = 0;

        for (int i = 0; i < numOfElements; i++) {
            int input = scanner.nextInt();

            if (input % 4 == 0 && input > maxDivisibleBy4) {
                maxDivisibleBy4 = input;
            }
        }

        System.out.println(maxDivisibleBy4);
    }
}