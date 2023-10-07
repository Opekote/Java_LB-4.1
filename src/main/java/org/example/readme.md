## Description

This Java program checks if a given word is a palindrome. A palindrome is a word, phrase, or sequence of characters that reads the same forwards and backwards.

## How it Works

The program follows these steps to determine if a word is a palindrome:

1. The input word is converted to lowercase to ensure case-insensitive comparison.
2. Leading and trailing whitespace is removed from the input word using the `trim()` method.
3. Two pointers, `left` and `right`, are initialized. `left` starts at the beginning of the word, and `right` starts at the end.
4. The program iterates through the characters in the word from both ends, comparing the characters at the `left` and `right` positions.
5. If at any point the characters at `left` and `right` are not equal, the word is not a palindrome, and the program returns `false`.
6. If the program completes the iteration without finding any unequal characters, it concludes that the word is a palindrome and returns `true`.

## Usage

1. Clone this repository to your local machine.
2. Open the project in your preferred Java development environment.
3. Modify the `inputWord` variable in the `Main` class with the word you want to check.
4. Run the program.
5. The program will print whether the input word is a palindrome or not.
