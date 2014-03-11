package potd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Carlos
 */
public class POTD {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        while(true) {            
            System.out.print("Day 1 - King's Gold\n" +
                               "Day 2 - Vigenére Cypher\n" +
                               "Day 3 - MatrixRotation\n" +
                               "Day 4 - KingsWine\n" +
                               "Day 5 - PalindromicNumbers\n" +
                               "0 - Quit\n\nOp: ");

            String op = bufferRead.readLine();
            System.out.println();
            switch(op) {
                case "1":
                    Day1_KingsGold.main(args);
                    break;
                    
                case "2":
                    Day2_VigenéreCypher.main(args);
                    break;
                    
                case "3":
                    Day3_MatrixRotation.main(args);
                    break;
                    
                case "4":
                    Day4_KingsWine.main(args);
                    break;
                    
                case "5":
                    Day5_PalindromicNumbers.main(args);
                    break;
                    
                default:
                    System.exit(0);
                    break;
            }
            
            System.out.println("\nEnter to go to menu!");
            bufferRead.readLine();            
        }
    }    
}