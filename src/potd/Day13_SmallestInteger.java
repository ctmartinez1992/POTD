package potd;

/**
 * Smallest Integer
 * Congrats on making it to the final problem of the week!
 * Today's problem is a bit tricky but will seem so obvious once you get it.
 * Write a function that when given 3 integers returns the smallest integer of
 * the 3 without using any comparison operator (e.g.: >, <, ==).
 * Something like "return min([1,2,3])" is cheating.
 * 
 * Cute little solution
 * def min3(a, b, c):
 *      return min2(min2(a, b), c)
 * 
 * def min2(a, b):
 *      return (a + b - abs(a - b)) // 2
 * 
 * 
 * @author Carlos
 */
public class Day13_SmallestInteger {
    
    public static void main(String[] args) {
        testCase();
    }
    
    public static void testCase() {
        System.out.println("Solution does not work for negative numbers!!!");
        System.out.println("[1, 2, 3] = " + smallestInt(1, 2, 3));
        System.out.println("[9, 8, 12] = " + smallestInt(9, 8, 12));
        System.out.println("[1570000000, 20000000, 333333333] = " + smallestInt(1570000000, 20000000, 333333333));
    }
    
    public static int smallestInt(int n1, int n2, int n3) {
        int s1 = n1, s2 = n2, s3 = n3;
        int dummy = 0;
        
        while (true) {
            try {
                dummy = 1 / Math.abs(n1);
            } catch (RuntimeException e) {
                return s1;
            }
            
            try {
                dummy = 1 / Math.abs(n2);
            } catch (RuntimeException e) {
                return s2;
            }
            
            try {
                dummy = 1 / Math.abs(n3);
            } catch (RuntimeException e) {
                return s3;
            }
            
            n1--;
            n2--;
            n3--;
        }
    }
}