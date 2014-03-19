package potd;

/**
 * Balancing Act
 * Our village has undergone some changes since our last party with the king.
 * You are now being considered for heir to the throne.
 * The king has devised two tests for you to see if you are worthy.
 * Test 1: You are given 9 balls and a balance scale.
 * One of the balls weighs slightly less than the other 8.
 * Using the scale only twice how can you figure out which ball weighs less than the others?
 * Do not attempt to mark the ball once you find it.
 * Test 2: You are given 3 additional balls and then all 12 balls are shuffled.
 * You are then asked to find the ball that weighs less than the others using the scale only three times.
 * How do you do this?
 * Good luck!
 * 
 * 
 * 1  1  1  1  1  1  1  1  1.1
 * 
 * 4      4
 * ganha1 ganha2
 * ganha1: 2          2
 * 
 * @author Carlos
 */
public class Day11_BalancingAct {
    
    public static void main(String[] args) {
        System.out.println("Test 1:\n" +
        "Put 3 balls in each scale;\n" +
        "If the weight is the same, the left out group of 3 has the heaviest ball;\n" +
        "If not, pick the heaviest group of 3 balls;\n" +
        "1 of the ball goes out the other 2 go into the balance, one on each side;\n" +
        "If the weight is the same, the left out ball is the heaviest ball;\n" +
        "If not, pick the heaviest ball on the scale;\n" +
        "Test 2:\n" +
        "Put 6 balls in each scale;\n" +
        "pick the heaviest group of 6 balls;\n" + 
        "Do test 1 all over again but instead of working with groups of 3, you work with groups of 2;");
    }    
}