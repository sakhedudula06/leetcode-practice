import java.util.Scanner;

class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        } else {

            String convInt = Integer.toString(x);

            StringBuilder myString = new StringBuilder(convInt);
            String revString = myString.reverse().toString();

            long myNum = Long.parseLong(revString);

            return (myNum == x) ? true : false;
        }

    }

    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int y = myScanner.nextInt();

        boolean result = solution.isPalindrome(y);
        System.out.println("Is palindrome: " + result);
    }
}