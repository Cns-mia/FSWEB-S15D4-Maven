package org.example;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("Racecar"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));

        System.out.println(convertDecimalToBinary(5));
        System.out.println(convertDecimalToBinary(6));
        System.out.println(convertDecimalToBinary(13));

        WorkintechList<String> list = new WorkintechList<>();
        list.add("Mehmet");
        list.add("Mehmet");
        list.add("Ali");
        list.add("Zeynep");
        list.sort();
        System.out.println(list);
        list.remove("Ali");
        System.out.println(list);
    }

    public static boolean checkForPalindrome(String text) {
        if (text == null) return false;
        String cleaned = text.toLowerCase().replaceAll("[^a-z0-9]", "");
        Stack<Character> stack = new Stack<>();
        for (char c : cleaned.toCharArray()) {
            stack.push(c);
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return cleaned.equals(reversed.toString());
    }

    public static String convertDecimalToBinary(int number) {
        if (number == 0) return "0";
        Stack<Integer> stack = new Stack<>();
        int n = Math.abs(number);
        while (n > 0) {
            stack.push(n % 2);
            n /= 2;
        }
        StringBuilder binary = new StringBuilder(number < 0 ? "-" : "");
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }
        return binary.toString();
    }
}
