package potd;

/**
 * King's Gold
 * Many, many moons ago there was a fair king who oversaw 10 villages.
 * As the king, he required a village tax of 1 gold bar per day per village.
 * Each gold bar is supposed to weigh 1000g and have the village name etched in to it.
 * However, the king has learned through an informant that one village has been 
 * cheating him the whole time and only giving him a bar that weighs 999g.

 * The king is furious and orders a scale to be brought in to test the weight of the gold bars.
 * Assuming the king has access to all the gold bars ever sent to him, how can he figure out
 * which village has been cheating him the whole time by using the scale only once?
 * 
 * 
 * @author Carlos
 */
public class Day1_KingsGold {
    
    public static void main(String[] args) {
        System.out.println("Give an id to the 10 villages, 1-10;\n" +
        "Pick 1 gold bar from village 1, 2 from village 2, 3 from village 3, ..., 10 from village 10;\n" +
        "Giving you a grand total of 55 gold bars;\n" +
        "Weigh the 55 bars at the same time;\n" +
        "The correct result would be 55000g... but it's not!\n" +
        "Step 1: How could this be???\n" +
        "Step 2: The last number of the total weight gives us the guilty village;\n" +
        "10 - the last digit will give the number of the guilty village;\n" +
        "Example: The result was 54994, it means that there were 6 gold bars that had 999g, which means that it was village\n" + 
        "6 that cheated the king and therefore it must be removed and banished from all time and space;");
    }    
}