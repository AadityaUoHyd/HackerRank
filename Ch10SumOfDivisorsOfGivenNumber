//Find sum of divisors of numbers.
//If user enters number as : 6, then divisors of 6 are 1,2,3 and 6. Thus output : 1+2+3+6=12.

package test;
import java.util.*;

interface AdvancedArithmetic {
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {
   
    public int divisor_sum(int n) {
        int sum  = 0;
        int sqrt = (int) Math.sqrt(n);
        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) { // if "i" is a divisor
                sum += i + n/i; // add both divisors
            }
        }
        /* If sqrt is a divisor, we should only count it once */
        if (sqrt * sqrt == n) {
            sum -= sqrt;
        }
        return sum;
    }
}

public class Ch10SumOfDivisorsOfGivenNumber {
    public static void main(String[] args) {
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
        sc.close();
    }
    
}
