package Stacks;

public class Main {
    public static void main(String[] args) {
        StackArrays stackArrays = new StackArrays(5);
        stackArrays.push(1);
        stackArrays.push(2);
        stackArrays.push(3);
        stackArrays.isEmpty();
        stackArrays.isFull();
        System.out.println("Pop: " + stackArrays.pop());
        System.out.println("Peek: " + stackArrays.peek());
        stackArrays.deleteStack();
        String word1 = "racecar";
        String word2 = "hello";
        System.out.println("Is " + word1 + " a palindrome? " + StackArrays.isPalindrome(word1));
        System.out.println("Is " + word2 + " a palindrome? " + StackArrays.isPalindrome(word2));

    }
}
