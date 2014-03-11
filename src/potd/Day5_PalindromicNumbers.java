package potd;

/**
 * Palindromic Numbers
 * A palindromic number is a number that reads the same forwards as it does backwards.
 * 123321 is a palindromic number where as 321321 is not.
 * Negative numbers may be considered palindromic or not;
 * it's up to you until someone proves otherwise.
 * 
 * Your mission, should you choose to accept it, is to create a program to return whether a number is a palindromic number or not.
 * To make things slightly more interesting you may not use a string or array in your solution.
 * Thus doing something like "123.toString()" is not allowed.
 * 
 *
 * @author Carlos
 */
public class Day5_PalindromicNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testCase();
    }
    
    public static void testCase() {
        int[] testArray = {1, 121, 123454321, 13234, 62726, 98787, 23, 100000, 000000, -5};
        for(int i=0; i<testArray.length; i++) {
            System.out.println("The number [" + testArray[i] + "] is " + (isPalindrome(testArray[i]) ? "" : "not ") + "a palindrome");
        }
    }
    
    //Compares the digits from one end to the other
    public static boolean isPalindrome(int n) {
        //1 digit is not a palindrome
        if(n < 10) {
            return false;
        }
        
        //Count the number of digits in the given number
        int nDigits = numberDigitsRecursive(n);
        boolean answer = true;
        
        //Cycle only to the middle of the number, in uneven numbers, the middle one doesn't matter
        for(int i=0; i<=(nDigits / 2); i++) {
            //Get the first and its "mirror", then get the second and its "mirror"
            double n1 = Math.pow(10, i);
            double n2 = Math.pow(10, nDigits - i - 1);
            double n11 = (n / n1 % 10);
            double n22 = (n / n2 % 10);            
            if ((int) Math.floor(n11) != (int) Math.floor(n22)) {
                answer = false;
            }
        }
        
        return answer;
    }
    
    //Counts the number of digits in a integer
    public static int numberDigits(int n) {
        int digits = 1;
        int number = n;
        while ((number /= 10) > 0) {
            digits++;
        }
        
        return digits;
    } 
    
    //Recursively counts the number of digits in a integer
    public static int numberDigitsRecursive(int n) {
        int digits = 1;
        int number = (n /= 10);
        if (number > 0) {
            digits += numberDigitsRecursive(number);
        }
        
        return digits;
    }
    
    //Counts the number of digits in a integer
    public static int numberDigitsComplicated(int n) {
        return (int) Math.ceil(Math.log10(n));
    } 
}