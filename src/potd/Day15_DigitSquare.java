/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package potd;

/**
 *
 * @author Carlos
 */
public class Day15_DigitSquare {
    
    public static int[][] magicSquare;
    
    public static void main(String[] args) {
        testCase();
    }
    
    public static void testCase() {
        createOddSquare(3);
        displaySquare();
        System.out.println("\n\n");
        createOddSquare(5);
        displaySquare();
        System.out.println("\n\n");
        createOddSquare(19);
        displaySquare();
    }
    
    private static void createOddSquare(int s) {
        magicSquare = new int[s][s];            //Will hold the answer
        int r = 0;                              //Runs through the rows
        int c = s / 2;                          //Runs through the columns
        int lR = r;                             //The last row
        int lC = c;                             //The last column

        magicSquare[r][c] = 1;
        int mS = s * s;                         //Size of the matrix
        for (int k = 2; k < mS + 1; k++) {
            if (r - 1 < 0) {
                r = s - 1;
            } else {
                r--;
            }

            if (c + 1 == s) {
                c = 0;
            } else {
                c++;
            }

            if (magicSquare[r][c] == 0) {
                magicSquare[r][c] = k;
            } else {
                r = lR; c = lC;
                if (r + 1 == s) {
                    r = 0;
                } else {
                    r++;
                }
                
                magicSquare[r][c] = k;
            }
            
            lR = r; lC = c;
        }
    }

    private static void displaySquare() {
        for (int j=0; j<magicSquare.length; j++) {
            for (int k=0; k<magicSquare[j].length; k++) {
                if(magicSquare[j][k] >= 10 && magicSquare[j][k] < 100) {
                    System.out.print(magicSquare[j][k] + "   ");
                } else if(magicSquare[j][k] >= 100 && magicSquare[j][k] < 1000) {
                    System.out.print(magicSquare[j][k] + "  ");
                } else if(magicSquare[j][k] >= 1000) {
                    System.out.print(magicSquare[j][k] + " ");
                } else {
                    System.out.print(magicSquare[j][k] + "    ");
                }
            }
            
            System.out.print("\n");
        }
    }
}
