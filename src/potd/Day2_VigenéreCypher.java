package potd;

/**
 * Vigenère cipher
 * The Vigenère cipher made its rounds in the mid-1550s up until the end of the American Civil War.
 * It was very easy for soldiers to encode messages and pass them around to all the allied camps.
 * 
 * The cipher requires a key and a message. It works like this:
 * Key: REDDIT
 * Message: TODAYISMYBIRTHDAY
 * 
 * REDDITREDDITREDDI
 * TODAYISMYBIRTHDAY
 * --------------------------
 * KSGDGBJQBEQKKLGDG
 * 
 * Using a 0 based alphabet (A=0), R is the 17th letter of the alphabet and T is the 19th letter of the alphabet.
 * (17 + 19) mod 26 = 11 which is where K resides in the alphabet.
 * Repeat for each key/message letter combination until done.
 * 
 * Today's problem of the day is two part. The first part is to implement a Vigenère
 * cipher in the programming language of your choice. Feel free to post solutions or
 * links to solutions in the comments.
 * 
 *
 * @author Carlos
 */
public class Day2_VigenéreCypher {
    
    public static String key = "reddit";
    public static String alphabet = "abcdefghijklmnopqrstuvwxyz";
        
    
    
    public static void testCase() {
        System.out.print("Phrase [todayismybirthday]; Ciphered ");
        System.out.println(vigenere("todayismybirthday"));
        System.out.print("Phrase [testestetstes]; Ciphered ");
        System.out.println(vigenere("testestetstes"));
    }
    public static void main(String[] args) {
        testCase();
    }
    //Applies the cipher to the given string
    public static char[] vigenere(String msg) {        
        char[] msgChars = msg.toCharArray();
        for (int i = 0; i < msg.length(); i++) {
            msgChars[i] = alphabet.charAt(((alphabet.indexOf((msgChars[i])) + alphabet.indexOf((key.charAt(i % key.length())))) % 26));
        }
        
        return msgChars;
    }    
}