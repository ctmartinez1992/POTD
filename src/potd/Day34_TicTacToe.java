package potd;

/**
 * Tic-Tac-Toe
 * HAPPY MONDAY!!!
 * Today's Problem of the Day is to implement an automated version of our favorite childhood game, tic-tac-toe.
 * Your program can assign random moves for X and O or you can implement some AI to favor one over the other.
 * When someone wins print out the board and who won.
 * If the game is going to be a draw print out the board and print out that it will be a draw.
 * Based on these conditions your program should never print out a full board unless the final move is a game winning move.
 * If a game is going to end in a draw just print out the board.
 * The program should run until X or O has won 10 games.
 * 
 * Had an headache, this is a terrible solution... It is what i did though
 * 
 *
 * @author Carlos
 */
public class Day34_TicTacToe {
    
    //-1 = empty; 0 = O; 1 = X
    private static final int[][] ttt = new int[3][3];
    
    public static void main(String[] args) {
        testCase();
    }
    
    public static void testCase() {
        titato();
    }  

    public static void titato() {  
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                ttt[i][j] = -1;
            }
        }
        
        dumb();
        smart();
        dumb();
        smart();
        dumb();
        smart();
        dumb();
        smart();
        dumb();
        
        printBoard();
    }
    
    //O
    private static void dumb() {
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                if(ttt[i][j] == -1) {
                    ttt[i][j] = 0;
                    break;
                }
            }
        }
    }
    
    //X
    private static void smart() {
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                if(ttt[i][j] == -1) {
                    ttt[i][j] = 1;
                    break;
                }
            }
        }
    }
    
    private static void printBoard() {        
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print(ttt[i][j] + " ");
            }
            System.out.println();
        }
    }
}