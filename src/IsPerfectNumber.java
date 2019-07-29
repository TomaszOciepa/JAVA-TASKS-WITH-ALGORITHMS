//Write a method to find out if a number is perfect or not.
// A perfect numer is a positive integer that is equal to the sum its positive divisors excluding the number itself

public class IsPerfectNumber {

    public boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int temp = 0;

        for (int i = 1; i <= number/2 ; i++) {
            if (number % i == 0){
                temp += i;
            }
        }

        return temp == number;
    }
}
