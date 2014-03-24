package potd;

/**
 * Markdown Parser
 * Happy Monday! Hope you had a good weekend. Over the weekend Github Flavored
 * Markdown and permalinking were added to comments.
 * Hopefully this makes posting and sharing easier for all. Other cool new features are on the way!
 * In honor of the Markdown parser upgrade today's problem will be somewhat related.
 * We'll be building a very basic Markdown compiler of our own.
 * Our Markdown parser will parse the following:
 * 
 * Headers
 * Single depth lists
 * Paragraphs
 * 
 * Sample input:
 * ## Monday March 24th 2014 - Todo List
 * *Solve the Problem of the Day
 * *Eat breakfast
 * *Do work
 * *Party
 * Today was a good day
 * 
 * Sample output:
 * <h2>Monday March 24th 2014 - Todo List</h2>
 * <ul>
 * <li>Solve the Problem of the Day</li>
 * <li>Eat breakfast</li>
 * <li>Do work</li>
 * <li>Party</li>
 * </ul>
 * <p>Today was a good day</p>
 * 
 * 
 * @author Carlos
 */
public class Day14_MarkdownParser {
    
    public static void main(String[] args) {
        testCase();
    }
    
    public static void testCase() {
        parse("## Monday March 24th 2014 - Todo List\n" +
              "* Solve the Problem of the Day\n" +
              "* Eat breakfast\n" +
              "* Do work\n" +
              "* Party\n" +
              "Today was a good day");
    }
    
    public static void parse(String text) {
        boolean bullets = false;
        String[] lines = text.split("\r\n|\r|\n");
        String result = "";
        int size = lines.length;
        for(int i=0; i<size; i++) {
            if(lines[i].compareTo("\n") == 0) {
                result += "";
            } else if(lines[i].startsWith("##")) {
                result += "<h2>" + lines[i].substring(3, lines[i].length()) + "</h2>\n";
            } else if(lines[i].startsWith("*") && !bullets) {
                result += "<ul>\n";
                result += "\t<li>" + lines[i].substring(2, lines[i].length()) + "</li>\n";
                bullets = true;
            } else if(lines[i].startsWith("*") && bullets) {
                result += "\t<li>" + lines[i].substring(2, lines[i].length()) + "</li>\n";
                if(i+1 < size) {
                    if(!lines[i+1].startsWith("*")) {
                        result += "</ul>\n";
                        bullets = false;
                    }                    
                }
            } else {
                result += "<p>" + lines[i] + "</p>\n";
            }
        }
        
        System.out.println(result);
    }
}