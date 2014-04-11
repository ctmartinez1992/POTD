package potd;

/**
 * Transposition Cipher
 * One example of a transposition cipher is columnar transposition. The cipher works like this:
 * Pick a keyword
 * Lay your message out character by character in rows the same length of your key
 * Extra room can be filled by random characters
 * Arrange the columns according to the value of the character in the key (eg. socket = 541326)
 * Arrange the columns into rows
 * Here is an example using the key "socket" and the message "canyouprogramthis":
 * s o c k e t
 * c a n y o u
 * p r o g r a
 * m t h i s t
 * noh ors ygi art cpm uat
 * "noh" corresponds to the 3 characters below the letter "c" in "socket".
 * Alphabetically speaking, "c" comes before the other letters in the word "socket" so the letters underneath it go first in the encrypted message.
 * Today's goal is to create a function that takes in a key (socket) and an
 * encrypted message (noh ors ygi art cpm uat) and outputs the unencrypted message (canyouprogramthis).
 * As a bonus problem see if you can figure out the key for this message:
 * heeilsef twkdaohe eensmtry
 * 
 *
 * @author Carlos
 */
public class Day27_TranspositionCypher {
    
    public static void main(String[] args) {
        testCase();
    }
    
    public static void testCase() {
        System.out.println("OOPS! Forgot about it...");
    }
}
