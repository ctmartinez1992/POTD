package potd;

/**
 * Party Hat
 * Over at Problem of the Day we like to party it up.
 * Since April is coming to a close let's create a program to prepare for all the May birthdays coming up.
 * Today's problem is given a number, generate a party hat that many lines tall.
 * Here is an example with 8:
 *        *
 *       ***
 *      *****
 *     *******
 *    *********
 *   ***********
 *  *************
 * ***************
 * 
 *
 * @author Carlos
 */
public class Day41_PartyHat {
    
    public static void main(String[] args) {
        testCase();
    }
    
    public static void testCase() {
        System.out.println(makeHat(10));
    }
    
    public static String makeHat(int size) {
        int layer = size;
        int count = layer - 1;
        int num = 1;
        char gap = ' ';
        char fill = '*';
        String out = "";
        while(layer > 0){
            for(int i = 0; i < count; i++) {
                out += gap;
            }
            
            for(int j = 0; j < num; j++) {
                out += fill;
            }
            
            out += "\n";
            num += 2;
            count--;
            layer--;
        }
        
        return out;
    }       
}