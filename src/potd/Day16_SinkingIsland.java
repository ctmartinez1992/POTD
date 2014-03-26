package potd;

/**
 * Sinking Island
 * You and 3 friends are partying it up on your private island late one night
 * when all of a sudden the sirens go off.
 * The island is sinking. The only way off the island is by walking across an
 * old wooden bridge which can only support the weight of 2 people at a time.
 * Since its night time you'll want to make sure 1 of the 2 people crossing the
 * bridge brings a flashlight so you don't accidentally walk off the bridge.
 * Unfortunately you only have 1 flashlight.
 * Some of your friends move slower than others.
 * For example, if you want to cross the bridge with Friend C it will take 5 minutes
 * because you can't leave them behind without the flashlight.
 * Here is the time chart of how long it takes each friend to cross.
 * 
 * You - 1 minute
 * Friend B - 2 minutes
 * Friend C - 5 minutes
 * Friend D - 10 minutes
 * 
 * What's the fastest time everyone can get off the island?
 * 
 *
 * @author Carlos
 */
public class Day16_SinkingIsland {
    
    public static int[][] magicSquare;
    
    public static void main(String[] args) {
        testCase();
    }
    
    public static void testCase() {
        System.out.println("You = A;\n"
                + "A+B -> 2m;\n"
                + "A <- 1m;\n"
                + "C+D -> 10m;\n"
                + "B <- 2m;\n"
                + "A+B -> 2m;\n"
                + "Total time: 2+1+10+2+2 = 17m");
    }
}
