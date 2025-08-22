package com.xworkz.program;

public class Palindrome {

    public static void main(String[] args) {
        int num = 12221;
        int temp = num;
        int reverse = 0;

        while (temp > 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }

        if (num == reverse) {
            System.out.println(num + " is a Palindrome");
        } else {
            System.out.println(num + " is NOT a Palindrome");
        }
    }
}
