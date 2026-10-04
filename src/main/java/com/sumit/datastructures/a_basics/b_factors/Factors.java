package com.sumit.datastructures.a_basics.b_factors;

public class Factors {

    public static void main(String[] args) {
        System.out.println("Factors of num 36 are : ");

        factors_general_approach(36);
        System.out.println("================");

        factors_optimized_approach(36);
    }

    // Space Complexity - O(1)
    // Time Complexity  - O(n)
    private static void factors_general_approach(int num) {
        for (int i = 1; i <= num; i++) {
            if(num % i == 0)
                System.out.print(i + " ");
        }
    }

    // Space Complexity = O(1)
    // Time Complexity  = sqrt(n)
    private static void factors_optimized_approach(int num) {
        //for (int i = 1; i*i <= num; i++) {
        //              OR
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if(num % i == 0){
                // to prevent condition like factors of 36, where 1 set will be 6 * 6. so to reduce duplicate factors
                if(num/i == i)
                    System.out.print(i + " ");
                else
                    System.out.print(i + " " + num/i + " ");
            }
        }
    }
    // === Comment : Factors of above algo will not be in sorted order ===
    //      but we can store n/i in another list and can print that list in last in reverse order.
    // === Reason: Why range till Math.Sqrt(n) instead of n ====
    //      i <= n/i
    //      i*i <= n
    //      i <= Math.Sqrt(n)
    //      so our range will be from 1 -> Math.Sqrt(n)

}