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
}
