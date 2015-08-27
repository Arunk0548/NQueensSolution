import java.util.Scanner;

/**
 *
 * @author Arun Kumar
 */
public class SinqleQueenSolution {

    int N;

    SinqleQueenSolution() {
        try {
            Scanner console = new Scanner(System.in);
            System.out.println("Enter the size of chess board N by N:");
            N = console.nextInt();
            if (!(N >= 4 && N <= 25)) {
                System.out.println("Invalid entry, N should be in the range 4 to 25 (inclusive)");
                return;
            }
            solveNQueensPlacement();
        } catch (Exception ex) {
            System.out.println("Invalid entry, please enter number only");
        }

    }

    /**
     * To display/print the chess board matrix along with queens position.
     *
     * @param chessboard
     */
    void printQueens(int chessboard[][]) {
        String XYposition = "";
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf(" %d ", chessboard[i][j]);
                if (chessboard[i][j] == 1) {
                    XYposition += "(" + (i + 1) + "," + (j + 1) + "),";
                }
            }
            System.out.printf("\n");
        }
        //remove last ",".
        int index;
        if((index = XYposition.lastIndexOf(",")) >= 0)
            XYposition = XYposition.substring(0, index);
        System.out.printf("\n Queens on : " + XYposition);
    }

    /**
     * To check if a queen can be placed on chessboard[row][col] so that other
     * queens are not attacking.
     *
     * @param chessboard
     * @param row
     * @param col
     * @return
     */
    boolean isConsistent(int chessboard[][], int row, int col) {
        int i, j;

        /* Check this row on left side */
        for (i = 0; i < col; i++) {
            if (chessboard[row][i] > 0) {
                return false;
            }
        }

        /* Check upper diagonal on left side */
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (chessboard[i][j] > 0) {
                return false;
            }
        }

        /* Check lower diagonal on left side */
        for (i = row, j = col; j >= 0 && i < N; i++, j--) {
            if (chessboard[i][j] > 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * A recursive function, which calls itself for placing N queens on a N x N
     * matrix chess board.
     *
     * @param chessboard
     * @param col
     * @return
     */
    boolean placeNqueens(int chessboard[][], int col) {
        /* base case: If all queens are placed then return true */
        if (col >= N) {
            return true;
        }

        /* Consider this column and try placing this queen in all rows
         one by one */
        for (int i = 0; i < N; i++) {
            /* Check if queen can be placed on chessboard[i][col] */
            if (isConsistent(chessboard, i, col)) {
                /* Place this queen in chessboard[i][col] */
                chessboard[i][col] = 1;

                /* recur to place rest of the queens */
                if (placeNqueens(chessboard, col + 1) == true) {
                    return true;
                }

                /* If placing queen in chessboard[i][col] doesn't lead to a solution
                 then remove queen from chessboard[i][col] */
                chessboard[i][col] = 0;
            }
        }

        /* If queen can not be place in any row in this colum col
         then return false */
        return false;
    }

    /**
     * Using backtracking, It solve the placement of N queens on NxN matrix
     * chessboard, It prints only one solutions, despite there may more than one
     * solution for placing of Queens on chess board.
     *
     * @return
     */
    void solveNQueensPlacement() {
        int chessboard[][] = new int[N][N];

        if (placeNqueens(chessboard, 0) == false) {
            System.out.printf("Solution does not exist");
            return;
        }

        printQueens(chessboard);
        ;
    }

    public static void main(String[] args) {

        new SinqleQueenSolution();

    }

}
