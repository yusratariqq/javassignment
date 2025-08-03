public class PrimeChecker {
    public static void main(String[] args) {
        int num = 29;
        boolean isPrime = true;
        int divisor = 2;

        while(divisor <= num/2) {
            if(num % divisor == 0) {
                isPrime = false;
                break;
            }
            divisor++;
        }

        System.out.println(num + (isPrime ? " is prime" : " is not prime"));
    }
}