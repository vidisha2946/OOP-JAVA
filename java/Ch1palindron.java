import java.util.Scanner;
public class Ch1palindron 
    {
        public static boolean isPalindrome(int number) {
            String numStr = String.valueOf(number); // Convert number to string
            int i = 0;
            int j = numStr.length() - 1;

            // Compare characters from the beginning and end of the string
            while (i < j) {
                if (numStr.charAt(i) != numStr.charAt(j)) {
                    return false; // Not a palindrome
                }
                i++;
                j--;
            }
            return true; // Palindrome
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            if (isPalindrome(number)) {
                System.out.println(number + " is a palindrome.");
            } else {
                System.out.println(number + " is not a palindrome.");
            }
        }
    }
    