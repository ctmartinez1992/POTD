package potd;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;
import java.util.Vector;

/**
 * Muspi Merol Muspi Merol or Lorem Ipsum is a tool used to generate dummy text
 * which can be helpful for development purposes. Our goal today is to create a
 * dummy text generation machine. The only input your program should take in is
 * how many paragraphs to output. Outputting random text is fairly easy so to
 * make this more fun our tool needs to produce somewhat authentic looking text.
 * In order to do this our tool must follow these rules:
 * The first two words must be "Muspi Merol";
 * All sentences must begin with a capital letter;
 * Words are between 1 and 10 characters;
 * Sentences are between 3 and 14 words;
 * Paragraphs are between 3 and 6 sentences;
 * Bonus: p, o, t, d are the vowels for our generator so they should appear more often than other letters;
 * Bonus: Lines should be no longer than 80 characters;
 * Place new line characters before a line gets to 80 characters and make sure to not to cut off a word.
 *
 *
 * @author Carlos
 */
public class Day18_MuspiMerol {

    private boolean startWithLoremIpsum = true;

    private final String loremIpsumUrl = "http://www.lipsum.com/feed/xml";

    private int generatedParagraphs = 0;

    private int generatedWords = 0;

    private int generatedBytes = 0;

    private boolean cached = false;

    private final Map<String, String[]> loremIpsumCache = new Hashtable<>();

    public String[] getParagraphs(int numberOfParagraphs) {
        return getLoremIpsum("paras", numberOfParagraphs);
    }

    public String[] getWords(int numberOfWords) {
        return getLoremIpsum("words", numberOfWords);
    }

    public String[] getBytes(int numberOfBytes) {
        return getLoremIpsum("bytes", numberOfBytes);
    }

    private String[] getLoremIpsum(String type, int numberOf) {
        String[] paragraphs = new String[0];
        if (cached) {
            paragraphs = (String[]) loremIpsumCache.get(type + numberOf);
            if (paragraphs != null) {
                return paragraphs;
            }
        }

        try {
            String url = getUrl(type, numberOf);
            String loremIpsumFragment = getLoremIpsumString(url);
            paragraphs = getParagraphs(loremIpsumFragment);
            if (cached) {
                loremIpsumCache.put(type + numberOf, paragraphs);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return paragraphs;
        }
        return paragraphs;
    }

    private String getUrl(String type, int numberOf) {
        String start = startWithLoremIpsum ? "yes" : "no";
        StringBuffer sb = new StringBuffer(loremIpsumUrl);
        sb.append("?amount=");
        sb.append(numberOf);
        sb.append("&what=");
        sb.append(type);
        sb.append("&start=");
        sb.append(start);
        return sb.toString();
    }

    private String[] getParagraphs(String loremIpsumFragment) {
        String[] paragraphs = new String[0];
        Vector<String> vr = new Vector<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(loremIpsumFragment.getBytes())));
        try {
            for (String line = br.readLine(); line != null; line = br.readLine()) {
                vr.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        paragraphs = new String[vr.size()];
        vr.copyInto(paragraphs);
        return paragraphs;
    }

    private String getLoremIpsumString(String loremIpsumUrl) throws IOException {
        URL url = new URL(loremIpsumUrl);
        BufferedInputStream bis = new BufferedInputStream(url.openStream());
        StringBuffer content = new StringBuffer();
        for (int b = bis.read(); b > -1; b = bis.read()) {
            content.append((char) b);
        }
        
        bis.close();
        String loremIpsumXML = content.toString();

        String loremIpsumFragment = getTag("lipsum", loremIpsumXML);

        String generated = getTag("generated", loremIpsumXML);
        String[] genBytes = generated.split(" ");
        int k = 0;
        for (int i = 0; i < genBytes.length; i++) {
            try {
                int value = Integer.parseInt(genBytes[i]);
                switch (k) {
                    case 0:
                        generatedParagraphs = value;
                        k++;
                        break;
                        
                    case 1:
                        generatedWords = value;
                        k++;
                        break;
                        
                    case 2:
                        generatedBytes = value;
                        k++;
                        break;
                }
            } catch (NumberFormatException nfe) {
                // ignore non-numbers
            }
        }

        return loremIpsumFragment;
    }

    private String getTag(String tagName, String loremIpsumXML) {
        String tagStart = "<" + tagName + ">";
        String tagEnd = "</" + tagName + ">";
        int tagStartIndex = loremIpsumXML.indexOf(tagStart) + tagStart.length();
        int tagEndIndex = loremIpsumXML.indexOf(tagEnd, tagStartIndex);
        String text = loremIpsumXML.substring(tagStartIndex, tagEndIndex);
        return text;
    }

    private void print(String[] loremIpsum) {
        for (int i = 0; i < loremIpsum.length; i++) {
            System.out.println(loremIpsum[i]);
            System.out.println();
        }
    }

    public boolean isStartWithLoremIpsum() {
        return startWithLoremIpsum;
    }

    public void setStartWithLoremIpsum(boolean startWithLoremIpsum) {
        this.startWithLoremIpsum = startWithLoremIpsum;
    }

    public static void main(String[] args) {
        Day18_MuspiMerol loremIpsum = new Day18_MuspiMerol();

        System.out.println();
        try {
            Properties options = loremIpsum.cmdLineOptions(args);
            if (options.get("help") != null) {
                loremIpsum.usage();
                return;
            }
            
            loremIpsum.setStartWithLoremIpsum(Boolean.parseBoolean(options.getProperty("start")));
            String[] _loremIpsum = loremIpsum.getLoremIpsum(options.getProperty("type"), Integer.parseInt(options.getProperty("amount")));
            loremIpsum.print(_loremIpsum);
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println();
            loremIpsum.usage();
        }
    }

    private void usage() {
        System.out.println("Usage: java " + getClass().getName() + " [-type <paras | words | bytes>] [-amount number] [-start <true | false>]");
        System.out.println("Default type is paras, default amount is 5 and default start with lorem ipsum is true.");
    }

    private Properties cmdLineOptions(String[] args) {
        Properties props = new Properties();
        props.put("type", "paras");
        props.put("amount", "5");
        props.put("start", "true");
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            if (arg.equals("-type")) {
                props.put("type", args[i + 1]);
            }
            if (arg.equals("-amount")) {
                props.put("amount", args[i + 1]);
            }
            if (arg.equals("-start")) {
                props.put("start", args[i + 1]);
            }
            if (arg.equals("-h") || arg.equals("--help")) {
                props.put("help", "showHelp");
            }
        }

        return props;
    }

    public int getGeneratedBytes() {
        return generatedBytes;
    }

    public int getGeneratedParagraphs() {
        return generatedParagraphs;
    }

    public int getGeneratedWords() {
        return generatedWords;
    }

    public boolean isCached() {
        return cached;
    }

    public void setCached(boolean cached) {
        this.cached = cached;
    }
}