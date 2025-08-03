public class PrimeVerify {
    public static void main(String[] args) {
        int num = 17;
        boolean prime = num > 1;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }
        System.out.println(num + (prime ? " is prime" : " is not prime"));
    }
}
