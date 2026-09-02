class Solution {
    public static boolean isPalindrome(String s) {
        boolean isPalindrome = true;

        int start = 0, end = s.length() - 1;

        while (start < end){
            if(!Character.isLetterOrDigit(s.charAt(start))){
                start++;
            } else if (!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }

            else {

                if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                    isPalindrome = false;
                    break;
                }

                start++;
                end--;
            }
        }

        return isPalindrome;
    }

    static void main(String[] args) {
        boolean res = isPalindrome("Was it a car or a cat I saw?");
        System.out.println(res);
    }
}
