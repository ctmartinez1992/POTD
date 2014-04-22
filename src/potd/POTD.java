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
                               "Day 10 - Making Change\n" +
                               "Day 11 - Balancing Act\n" +
                               "Day 12 - Unique Permutations\n" +
                               "Day 13 - Smallest Integer\n" +
                               "Day 14 - Markdown Parser\n" +
                               "Day 15 - Digit Square\n" +
                               "Day 16 - Sinking Island\n" +
                               "Day 17 - Tweet Parser (There was no time!)\n" +
                               "Day 18 - Muspi Merol (Lorem Ipsum instead)\n" +
                               "Day 19 - Sort Times (There was no time! Insanity Jam 2014)\n" +
                               "Day 20 - Load Balancer (There was no time! Insanity Jam 2014)\n" +
                               "Day 21 - Word Ladder (There was no time! Insanity Jam 2014)\n" +
                               "Day 22 - Work Schedule (There was no time! Insanity Jam 2014)\n" +
                               "Day 23 - Horse Racing (There was no time! Insanity Jam 2014)\n" +
                               "Day 24 - Smiley Face\n" +
                               "Day 25 - Where To Eat?\n" +
                               "Day 26 - Pyramid Sort\n" +
                               "Day 27 - Transposition Cypher (OOPS! Forgot about it...)\n" +
                               "Day 28 - Two Eggs\n" +
                               "Day 29 - Stacks and Queues (There was no time!  Was on a funeral :()\n" +
                               "Day 30 - 2 Stacks 1 Queue (There was no time! Grandma's birthday :))\n" +
                               "Day 31 - Duplicate Numbers\n" +
                               "Day 32 - Et Tu Brute (Didn't made the other cyphers :()\n" +
                               "Day 33 - Lone Survivor\n" +
                               "Day 34 - Tic Tac Toe (Poorly done)\n" +
                               "Day 35 - Digital Typewriter (Sick :()\n" +
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
                    
                case "10":
                    Day10_MakingChange.main(args);
                    break;
                    
                case "11":
                    Day11_BalancingAct.main(args);
                    break;
                    
                case "12":
                    Day12_UniquePermutations.main(args);
                    break;
                    
                case "13":
                    Day13_SmallestInteger.main(args);
                    break;
                    
                case "14":
                    Day14_MarkdownParser.main(args);
                    break;
                    
                case "15":
                    Day18_MuspiMerol.main(args);
                    break;
                    
                case "16":
                    Day16_SinkingIsland.main(args);
                    break;
                    
                case "17":
                    Day17_TweetParser.main(args);
                    break;
                    
                case "18":
                    Day18_MuspiMerol.main(args);
                    break;
                    
                case "19":
                    Day19_SortTimes.main(args);
                    break;
                    
                case "20":
                    Day20_LoadBalancer.main(args);
                    break;
                    
                case "21":
                    Day21_WordLadder.main(args);
                    break;
                    
                case "22":
                    Day22_WorkSchedule.main(args);
                    break;
                    
                case "23":
                    Day23_HorseRacing.main(args);
                    break;
                    
                case "24":
                    Day24_SmileyFace.main(args);
                    break;
                    
                case "25":
                    Day25_WhereToEat.main(args);
                    break;
                    
                case "26":
                    Day26_PyramidSort.main(args);
                    break;
                    
                case "27":
                    Day27_TranspositionCypher.main(args);
                    break;
                    
                case "28":
                    Day28_TwoEggs.main(args);
                    break;
                    
                case "29":
                    Day29_Stack_Queue.main(args);
                    break;
                    
                case "30":
                    Day30_2_Stack_1_Queue.main(args);
                    break;
                    
                case "31":
                    Day31_DuplicateNumbers.main(args);
                    break;
                    
                case "32":
                    Day32_EtTuBrute.main(args);
                    break;
                    
                case "33":
                    Day33_LoneSurvivor.main(args);
                    break;
                    
                case "34":
                    Day34_TicTacToe.main(args);
                    break;
                    
                case "35":
                    Day35_DigitalTypewriter.main(args);
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