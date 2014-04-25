package potd;

/**
 * Hat Escape
 * Three prisoners of reasonable intelligence are brought in to an arena and are
 * told they will be allowed to walk away free if they can solve the game master's puzzle.
 * The captives are lined up in order of height, and are tied to stakes.
 * The man in the rear can see the backs of his two friends,
 * the man in the middle can see the back of the man in front,
 * and the man in front cannot see anyone.
 * The prisoners are then shown five hats. Three of the hats are black and two of the hats are white.
 * Blindfolds are then placed over each man's eyes and a hat is placed on each man's head.
 * The two left over hats are hidden. The blindfolds are then removed and the game master makes an announcement.
 * If any one of the prisoners can guess what color hat he is wearing they can all leave unharmed.
 * The man in the rear who can see both of his friends' hats but not his own says, "I don't know".
 * The middle man who can see the hat of the man in front, but not his own says, "I don't know".
 * The front man who cannot see anyone's hat says "I know!"
 * How did he know the color of his hat and what color was it?
 * Enjoy your weekend!
 * 
 *
 * @author Carlos
 */
public class Day38_HatEscape {
    
    public static void main(String[] args) {
        testCase();
    }
    
    public static void testCase() {
        System.out.println("I made a simple \"diagram\" to illustrate the possibilities:\n" +
                "1st Guy | 2nd guy | 3rd Guy -\n" +
                "B-W-W = K -\n" +
                "W-B-W = D | B-W = K -\n" +
                "W-W-B = D | W-B = D | B = K -\n" +
                "B-B-B = D | B-B = D | B = K -\n" +
                "W-B-B = D | B-B = D | B = K -\n" +
                "B-W-B = D | W-B = D | B = K -\n" +
                "B-B-W = D | B-W = K -\n" +
                "\n" +
                "B is the black hat, W is the white hat, K means that he knows is hat, D means that he doesn't know his hat.\n" +
                "So, the 1st guy only knows his hat if the 2 in front of him are white, since he says that he doesn't know, there's 3 possibilities: WWB; BBB; WBW.\n" +
                "The 2nd guy knows that IF the guy in front of him has a white hat, than he must be wearing a balck hat because the first guy did not see 2 white hats in front of him.\n" +
                "If the 2nd guy sees a black hat in front of him, he has no way of determining the coor of his own hat.\n" +
                "If the first guy and second guy say \"i don't know\" than the only logical conclusion is: the third guy is wearing a black hat.\n");
    } 
}