package com.bereket;

public class Main {

    public static void main(String[] args) {
        /*
        Create a method that takes an int and checks if the number is a prime number.
         A prime number is a number that's only divisible by 1 and itself. If it's prime, return true.
         Otherwise return false.
         */
        System.out.println(PrimNum(7));

    }
    public static boolean PrimNum(int num){
        int sqrt = (int) Math.sqrt(num) + 1;
        for (int i = 2; i < sqrt; i++) {
            if (num % i == 0) {
            return false;
        }

        } return true;


    }
}
