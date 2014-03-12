package potd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Clock Hands
 * Write a program to find the minimum angle between two hands on a 24 hour clock.
 * For instance, the angle at 6:00 is 90 degrees and the angle at 18:00 is also 90 degrees.
 * At 6:17 the degree is 3.5 and at 18:17 it's 176.5 (hooray for supplementary angles).
 * 
 * For fun, program this one up in a language you've never used before.
 * Here is a list of esoteric languages to help you decide.
 * There are some truly interesting languages on that list.
 * Feel free to use a "standard" language as well if there's one out there that you've been looking to learn.
 * 
 *
 * @author Carlos
 */
public class POTD {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        while(true) {            
            System.out.print("Day 1 - King's Gold\n" +
                               "Day 2 - Vigenére Cypher\n" +
                               "Day 3 - Matrix Rotation\n" +
                               "Day 4 - Kings Wine\n" +
                               "Day 5 - Palindromic Numbers\n" +
                               "Day 6 - 24H Clock\n" +
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
                    
                case "6":
                    Day6_24HClock.main(args);
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