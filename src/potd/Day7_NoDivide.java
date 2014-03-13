package potd;

/**
 * No Divide
 * No this isn't a reference to that Linkin Park song.
 * Today's your Introduction to Computer Science mid-term.
 * You're doing alright on the test and the last question is "implement a function that
 * takes in 2 integers and returns the division of the 2 numbers rounded to the nearest integer".
 * 
 * Piece of cake you say. As you're typing it up you exclaim "what the heck",
 * which gets you some really weird stares. You've just learned that your "/" key is broken.
 * Some of you that are having a really bad day learn that your "/", "*", "+", and "-" are all broken.
 * How can we solve this problem without using any of your broken keys? Note:
 * You're using a pirated version of Windows 2015 so your copy and paste functionality is also broken.
 * 
 *
 * @author Carlos
 */
public class Day7_NoDivide {   
        
    public static void main(String[] args) {
        testCase();
    }
    
    public static void testCase() {
        System.out.println("Not floored: ");
        System.out.println("4 / 2 = " + specialDivision(4, 2));
        System.out.println("16 / 2 = " + specialDivision(16, 2));
        System.out.println("128 / 41 = " + specialDivision(128, 41));
        System.out.println("12 / 15 = " + specialDivision(12, 15));
        System.out.println("Floored: ");
        System.out.println("4 / 2 = " + specialDivisionFloored(4, 2));
        System.out.println("16 / 2 = " + specialDivisionFloored(16, 2));
        System.out.println("128 / 41 = " + specialDivisionFloored(128, 41));
        System.out.println("12 / 15 = " + specialDivisionFloored(12, 15));
    }
    
    public static double specialDivision(double dividend, double divisor) {
        return (Math.exp(Math.log(dividend) - Math.log(divisor)));
    }
    
    public static double specialDivisionFloored(double dividend, double divisor) {
        return Math.floor(specialDivision(dividend, divisor));
    }
}
