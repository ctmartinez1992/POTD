package potd;

/**
 * Matrix Rotation
 * The bank manager at my local bank recently gave me the algorithm to access the bank's vault.
 * I thought I'd pass on the algorithm to you all for "safe keeping".
 * Basically the vault has a USB port which you'll need to plug in to.
 * Once plugged in the vault will send you an NxN matrix such as the one below.
 * 
 * Monday-Friday the key to the vault is to rotate the matrix 90 degrees clockwise.
 * On Saturday and Sunday you have to rotate the matrix 90 degrees counter-clockwise.
 * My dog accidentally got locked in the vault and the bank manager is no where to be found.
 * Can someone help me write a program to get him out?
 * 
 * 
 * @author Carlos
 */
public class Day3_MatrixRotation {
    
    public static void main(String[] args) {
        testCase();
    }
    
    public static void testCase() {
        int[][] matrix = {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25}};
        int[][] matrixRes = new int[matrix.length][matrix[0].length];
        rotate(matrix, matrixRes, -1);
        printMatrix(matrixRes);
    }

    //Rotates the given matrices with the provided direction (1 or -1)
    public static void rotate(int[][] matrix, int[][] newMatrix, int direction) {
        if(direction == 1) {
            for (int i = 0; i < matrix.length; i++) {
                int cursor = 0;
                for(int j = matrix[0].length - 1; j >= 0; j--) {
                    newMatrix[i][cursor] = matrix[j][i];
                    cursor++;
                }
            }
        }
        else if(direction == -1) {
            int cursor = 0;
            for (int i = matrix.length - 1; i >= 0; i--) {
                for(int j = 0; j < matrix.length; j++) {
                    newMatrix[cursor][j] = matrix[j][i];
                }
                
                cursor++;
            }
        }
    }
    
    //Prints a standard matrix with a small effort of organization
    public static void printMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "|");
            }
            System.out.println("\n----------------------");
        }
    }
}