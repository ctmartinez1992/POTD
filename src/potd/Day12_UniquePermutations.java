package potd;

/**
 * Unique Permutations
 * Today's problem comes from @mofodox.
 * Given the string "Hello world hello" how many unique (case sensitive) permutations can you find?
 * If you have a problem you'd like to see featured on here head over 
 * to http://www.problemotd.com/suggest/ and suggest it now!
 * 
 * @author Carlos
 */
public class Day12_UniquePermutations {
    
    public static void main(String[] args) {
        System.out.println("17! / (2 * 2 * 5! * 3!)\n" +
        "17! is the number of different letters and spaces we can give;\n" +
        "/ by 2 for the case sensitivity;\n" +
        "/ by 2 for the letter e;\n" +
        "/ by 3! for the letter o;\n" +
        "/ by 5! for the letter l;\n");
    }    
}