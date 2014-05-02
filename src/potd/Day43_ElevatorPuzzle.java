package potd;

/**
 * Y2K Age Finder
 * Your goal for today is to write a program that asks a user for their birth year
 * encoded as two digits (eg "90") and for the current year, also encoded as two digits (eg "14").
 * The program should then write out the user's age in years. Example input/output:
 *  Year of Birth: 90
 *  Current year: 14
 *  Your age: 24
 * 
 *
 * @author Carlos
 */
public class Day43_ElevatorPuzzle {
    
    public static void main(String[] args) {
        testCase();
    }
    
    public static void testCase() {
        System.out.println("Man of short stature?\n"
                + "When it's raining he has no umbrella to reach the button 7 or above, \n"
                + "When there's people with him he politely asks them to press the button for him, \n"
                + "When it's not raining or the leevator is empty there's no way for him to reach the seventh button");
    }    
}