package potd;

/**
 * Smiley Face
 * Welcome back to another exciting week of Problem of the Day :)
 * Since Mondays are all about smiles we're going to make something that checks for them in a string.
 * The goal for today will be to take in a string and return true or false if the
 * parentheses in the string are closed properly (same number of opening and closing () not including smiley faces).
 * For instance:
 * #True
 * Today (Monday) is a day all about smiles ( :) )
 * #False
 * Weirdly formatted (strings (sometimes :) aren't easy :)) to read))
 * 
 *
 * @author Carlos
 */
public class Day24_SmileyFace {
    
    private static int nLeft = 0;
    private static int nRight = 0;
    private static int nSmiley = 0;
    
    public static void main(String[] args) {
        testCase();
    }
    
    public static void testCase() {
        smileys("Today (Monday) is a day all about smiles ( :) )");
        smileys("Weirdly formatted (strings (sometimes :) aren't easy :)) to read))");
    }
    
    public static void smileys(String s) {
        nSmiley = countOccurencesInString(s, ":)");   
        nLeft = countOccurencesInString(s, "(");
        nRight = countOccurencesInString(s, ")") - nSmiley;
        
        if(nLeft == nRight) {
            System.out.println("(" + s + "): TRUE - There's " + nSmiley + " smileys though...");
        } else {
            System.out.println("(" + s + "): FALSE - There's " + nSmiley + " smileys though...");
        }
    }
    
    //Look ma... its recursive!!!
    private static int countOccurencesInString(String s, String c) {
        int x = 0;
        if(s.length() == 0) {
            return 0;
        }
        
        if(s.endsWith(c)) {
            x += 1 + countOccurencesInString(s.substring(0, s.length() - 1), c);
        } else {
            x += countOccurencesInString(s.substring(0, s.length() - 1), c);
        }
        
        return x;
    }
}