package potd;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Smiley Face
 * Welcome back to another exciting week of Problem of the Day :)
 * Since Mondays are all about smiles we're going to make something that checks for them in a string.
 * The goal for today will be to take in a string and return true or false if the
 * parentheses in the string are closed properly (same number of opening and closing () not including smiley faces).
 * For instance:
 * #True
 * Today (Monday) is a day all about smiles ( :) )
 * #False
 * Weirdly formatted (strings (sometimes :) aren't easy :)) to read))
 * 
 *
 * @author Carlos
 */
public class Day25_WhereToEat {
    
    private static List<String> places = new ArrayList();
    private static Random rng = new Random();
    private static String content = "";
    private static int rndN = 0;
    
    public static void main(String[] args) {
        testCase();
    }
    
    public static void testCase() {
        pickPlace();
    }
    
    public static void pickPlace() {
        for(int i=0; i<places.size(); i++) {
            places.remove(i);
        }
        rng = new Random();
        content = "";
        rndN = 0;
        
        getPlaces();
        chooseNewPlace();
        placeNewContent();
        organizeFolder();
    }
    
    private static void getPlaces() {        
        BufferedReader br = null; 
	try {
            String sCurrentLine;
            br = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\others\\Day25_WhereToEat.txt"));
            while ((sCurrentLine = br.readLine()) != null) {
                places.add(sCurrentLine);
            }
        } catch (IOException e) {
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {}
        }
    }
    
    private static void chooseNewPlace() {
        rndN = rng.nextInt(places.size());
        while(places.get(rndN).equals(places.get(places.size() - 1))) {
            rndN = rng.nextInt(places.size() - 1);
        }
        
        System.out.println("Place chosen was: " + places.get(rndN));        
        for(int i=0; i<places.size() - 1; i++) {
            content += places.get(i) + "\n";
        }  
        
        content += places.get(rndN);
    }
    
    private static void placeNewContent() {        
        try {
            File file = new File(System.getProperty("user.dir") + "\\others\\tmp.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();
        } catch (IOException e) {}
    }
    
    private static void organizeFolder() {       
        File file = new File(System.getProperty("user.dir") + "\\others\\Day25_WhereToEat.txt");
        file.delete();
        
        File file1 = new File(System.getProperty("user.dir") + "\\others\\tmp.txt");
        File file2 = new File(System.getProperty("user.dir") + "\\others\\Day25_WhereToEat.txt");
        file1.renameTo(file2);
    }
}