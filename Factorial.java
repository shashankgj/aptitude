package com.xworkz.program;

public class Factorial {
    static int factLoop(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    static int factRec(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factRec(n - 1);
    }

    public static void main(String[] args) {
        int num = 5;

        System.out.println("Factorial of " + num + " using loop: " + factLoop(num));
        System.out.println("Factorial of " + num + " using recursion: " + factRec(num));
    }
}
