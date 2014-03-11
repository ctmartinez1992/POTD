package potd;

/**
 * King's Wine
 * In celebration of our king finding the village that was cheating him he decides to throw a celebration for the other 9 villages.
 * In preparation for the celebration he orders 1000 barrels of the finest wine.
 * 
 * When the members of the uninvited village find out about the party they send an assassin
 * to poison one of the barrels of wine.
 * The poison takes 7 days to kill so the party guests won't realize what is happening for awhile.
 * 
 * However, after poisoning a random barrel the king's guard finds out and has the assassin executed.
 * There is no time to order more wine so the king devises a genius plan to have his 10 loyal servants taste
 * test the wine to find the poisoned barrel just in time for the party in 10 days.
 * What is the plan that he devises so that he is left with 999 barrels of wine for the party?
 * 
 *
 * @author Carlos
 */
public class Day4_KingsWine {
    
    public static void main(String[] args) {
        System.out.println("Number the barrels 0-999;\n" +
        "Convert all the barrel numbers to binary;\n" +
        "999 = ten ones or zeros;\n" +
        "Assign each servant to a number (1) position;\n" +
        "For each barrel, have the corresponding 1 digit servant take a sip;\n" +
        "According to the dead servant/s, you will know exactly the number (in binary) of the poisoned barrel;");
    }
}