package org.example;

public class Main {
    public static void main(String[] args) {
        String inputWord = "Eye";
        System.out.println(isPalindrome(inputWord));
    }

    public static boolean isPalindrome(String input) {
        String preparedInput = input.trim().toLowerCase();
        int left = 0;
        int right = preparedInput.length() - 1;

        while (left < right) {
            if (preparedInput.charAt(left) != preparedInput.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
