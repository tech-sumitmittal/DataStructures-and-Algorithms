package com.sumit.datastructures.a_basics.b_factors;

public class Quiz_1_PerfectNumber {

    /*
    You are given an integer A. You have to tell whether it is a perfect number or not.
    Perfect number is a positive integer which is equal to the sum of its proper positive divisors.
    A proper divisor of a natural number is the divisor that is strictly less than the number.

    For A = 4, the sum of its proper divisors = 1 + 2 = 3, is not equal to 4.   => return 0
    For A = 6, the sum of its proper divisors = 1 + 2 + 3 = 6, is equal to 6.   => return 1
    */


    public static void main(String[] args) {
        System.out.println("is 4 perfect num " + isPerfectNum(4));
        System.out.println("is 6 perfect num " + isPerfectNum(6));
    }

    private static int isPerfectNum(int num){
        if (num == 1) return 0; // 1 has no proper divisors

        int sumOfDivisors = 1;
        // we do not want to start loop from 1, because it will add both 1 and num in the sum, but we do not want to add num.
        // that's why we started loop from 2 and initialize the sumOfDivisors with 1.
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i == 0){
                if(i == num/i) {
                    sumOfDivisors += i;
                }
                else {
                    sumOfDivisors += i;
                    sumOfDivisors += num/i;

                }
            }
        }
        return sumOfDivisors == num ? 1 : 0;
    }

}