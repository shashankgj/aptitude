package com.xworkz.program;

public class Armstrong {

        public static void main(String args[]) {
            int num = 153;   // You can change this number to test
            int original = num;
            int count = 0;
            int quotient = num;

            // Step 1: Count number of digits
            while (quotient > 0) {
                quotient = quotient / 10;
                count++;
            }

            int temp = num;
            int sum = 0;

            // Step 2: Calculate sum of each digit raised to 'count'
            while (temp > 0) {
                int digit = temp % 10;
                int power = 1;

                for (int i = 0; i < count; i++) {
                    power *= digit;
                }

                sum += power;
                temp = temp / 10;
            }

            // Step 3: Check Armstrong condition
            if (sum == original) {
                System.out.println(original + " is an Armstrong number.");
            } else {
                System.out.println(original + " is NOT an Armstrong number.");
            }
        }


}
