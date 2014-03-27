package potd;

/**
 * Tweet Parser
 * Today's objective marks the beginning of our Twitter killering app...
 * or you know just a fun little project. Given a string of text parse out the hashtags and the links.
 * If you're up for the challenge or just want some super duper bonus points
 * build your solution in to the Markdown parser you built earlier this week.
 * 
 * Sample input:
 * #solving problems like a boss http://www.problemotd.com/problem/vigenere-cipher/?show=1#33 #problemotd
 * 
 * Sample output:
 * <a href="https://twitter.com/search?q=%23solving&src=hash">#solving</a> problems like a boss
 * <a href="http://www.problemotd.com/problem/vigenere-cipher/?show=1#33">
 * http://www.problemotd.com/problem/vigenere-cipher/?show=1#33</a>
 * <a href="https://twitter.com/search?q=%23problemotd&src=hash">#problemotd</a>
 * 
 * 
 * @author Carlos
 */
public class Day17_TweetParser {
    
    public static void main(String[] args) {
        testCase();
    }
    
    public static void testCase() {
        System.out.println("Did not have time to do this one!");
    }
}