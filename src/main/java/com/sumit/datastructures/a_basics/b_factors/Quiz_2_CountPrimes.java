package com.sumit.datastructures.a_basics.b_factors;

public class Quiz_2_CountPrimes {

    /*
    You will be given an integer n. You need to return the count of prime numbers less than or equal to n.
    Input = 19       Prime counts <= 19 are 2, 3, 5, 7, 11, 13, 17, 19       => Ans = 8
    Input = 1        Prime counts <= 1  are Not available                    => Ans = 0
    */


    public static void main(String[] args) {
        System.out.println("Prime count for 19 = " + countPrimes(19));
        System.out.println("Prime count for 1  = " + countPrimes(1));
    }

    private static int countPrimes(int num){
        int count = 0;
        for(int i=1; i<=num; i++){
            if(isPrime(i))
                count++;
        }
        return count;
    }

    // has only 2 factors
    private static boolean isPrime(int num){
        if(num <= 1 ) return false;
        if(num == 2 ) return true;
        if(num%2 == 0) return false;

        int numOfFactors = 0;
        for(int i=1; i<=Math.sqrt(num); i++){
            if(numOfFactors > 2)
                break;
            if(num%i == 0){
                if(i == num/i)  numOfFactors += 1;
                else            numOfFactors += 2;
            }
        }
        return numOfFactors <= 2;
    }

}