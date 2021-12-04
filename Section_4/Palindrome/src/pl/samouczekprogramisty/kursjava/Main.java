package pl.samouczekprogramisty.kursjava;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(-1221));
    }

    public static boolean isPalindrome(int number) {
        if(number < 0) {
            number *= -1;
        }
        int reverse = 0;
        for(int i = number; i >= 1; i /= 10) {
            reverse *= 10;
            reverse += i % 10;
        }
        if(number == reverse) {
            return true;
        }
        return false;
    }
}
