package potd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
                               "Day 7 - No Divide\n" +
                               "Day 8 - Longest Palindrome\n" +
                               "Day 9 - Cracking the Primes\n" +
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
                    
                case "7":
                    Day7_NoDivide.main(args);
                    break;
                    
                case "8":
                    Day8_LongestPalindrome.main(args);
                    break;
                    
                case "9":
                    Day9_CrackingThePrimes.main(args);
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