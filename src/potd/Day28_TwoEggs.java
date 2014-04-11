package potd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Two Eggs
 * Top research firm, Herp & Derp Inc., have been impressed by your problem solving
 * skills this week and decide to hire you to help them solve a problem.
 * They give you two identical eggs and access to a 100 story building.
 * The aim is to find out the highest floor from which an egg will not break when
 * dropped out of a window from that floor. If an egg is dropped and does not break,
 * it is undamaged and can be dropped again. However, once an egg is broken, that's it for that egg.
 * If an egg breaks when dropped from floor n, then it would also have broken from any floor above that.
 * If an egg survives a fall, then it will survive any fall shorter than that.
 * How can Herp & Derp Inc. minimize the number of egg drops it takes to find the solution?
 * 
 *
 * @author Carlos
 */
public class Day28_TwoEggs {
    
    public static void main(String[] args) {
        testCase();
    }
    
    public static void testCase() {
        System.out.println("Well, i've never seen this problem before so this is good."
                + "Basically, i think that we have to find the best worst case scenario, so let's go:"
                + "We can drop the first egg from the 50th floor and then the other from 1 to 49 or from 51 to 100."
                + "That gives us a 50 drops worst case scenario;"
                + "We can drop 1 egg every 4 floors and then check the other 3 remaining floors with the other egg."
                + "That would be a 27 drops worst case scenario, not good enough..."
                + "What about 10 drops... and then check the remaining 9 possibilities with the other egg."
                + "That would be 19 worst case scenario, that's pretty good."
                + "I think that the best way to handle this problem is to maintain the same number of possibilities with every single first egg drop."
                + "Math is definitely not my strong point, i would have to do some research but, if we were to do something like this (and i'm sure there's a formula to explain this):"
                + "100 - 1 - 2 - 3 - ... - 14 and we stop at 14 because the result is negative, we get the floor we need to start at, it's the floor 14,"
                + "and then, we test it, if it doesn't break we go to floor 14 + 13, if it doesn't break, we go to floor 14 + 13 + 12 and so on"
                + "The point of this is that we get the (maybe) best worst case scanrio, 14."
                + "At 14th floor, if it breaks, we have 13 more chances, making a total of 13+1; if it doesn't break, we go to floor 27, if it breaks"
                + ", we have 12 more chances, making a total of 12+2; if it doesn't break, we go to floor 39, if it breaks, we have 11 more chances, making a total of 11+3,"
                + "and so on... I'm not positive that this is the best solution but, i think that this is the best i can do.");
    }
}
