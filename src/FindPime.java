public class FindPime {
    public static void main(String[] args) {
        int num;
        boolean isPrime;

        num = 22;

        if (num < 2) isPrime = false;
        else isPrime = true;

        for (int i = 2; i <= num/i; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) System.out.println("Простое число");
        else System.out.println("Не простое число");
    }
}
