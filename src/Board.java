/**
 * CPSC 233 W24 Assignment 1 Board.java
 * Stores a game board to be used for a Connect-L game
 * @author Abrar Maheer Bin Arif UCID 30218259
 * @email abrarmaheer.arif@ucalgary.ca
 * @version 1.0
 * 6/02/2024 Tutorial T05
 */
public class Board {

    /**
     * No piece in board (empty)
     */
    public static final int EMP = Game.EMP;
    /**
     * Connect-L Red Piece
     */
    public static final int RED = Game.RED;
    /**
     * Connect-L Blue Piece
     */
    public static final int BLU = Game.BLU;

    //Students should enter their functions below here

    /**
     * Creates a board to be used for the Connect-L game.
     *
     * @param rows integer value for the number of rows
     * @param columns integer value for the number of columns
     * @return a 2D integer array called 'board' of size rows (dimension 1) and columns (dimension 2)
     */

    public static int[][] createBoard(int rows, int columns) {
        int[][] board = new int[rows][columns]; // Creates a 2D integer array with the specified rows and columns
        // Uses a nested for loop to iterate through all the rows and columns
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                board[i][j] = EMP; // Initializes each cell to empty (EMP), to create a blank board
            }
        }
        return board; // Returns the newly created board
    }

    /**
     * Counts the number of rows in the created board.
     *
     * @param board the 2D integer array that has been created of size rows (dimension 1) and columns (dimension 2)
     * @return an integer which is the number of rows
     */

    public static int rowCount(int[][] board) {
        int rowsCounted = 0; // Counter for rows initialized
        // Iterates through each row
        for (int i = 0; i < board.length; i++) {
            rowsCounted++; // Increments rowsCounted for each row encountered
        }
        return rowsCounted; // Returns total number of rows in the board
    }

    /**
     * Counts the number of columns in the created board.
     *
     * @param board the 2D integer array that has been created of size rows (dimension 1) and columns (dimension 2)
     * @return an integer which is the number of columns
     */

    public static int columnCount(int[][] board) {
        int colsCounted = 0; // Counter for columns initialized
        // Iterates through each column
        for (int j = 0; j < board[0].length; j++) {
            colsCounted++; // Increments rowsCounted for each column encountered
        }
        return colsCounted; // Returns total number of columns in the board
    }

    /**
     * Used to verify if the specified row, column indices are inside the board dimensions.
     *
     * @param board the 2D integer array that has been created of size rows (dimension 1) and columns (dimension 2)
     * @param row integer value for the row index
     * @param column integer value for the column index
     * @return a boolean true if within board dimensions or false if not within dimensions
     */

    public static boolean valid(int[][] board, int row, int column) {
        boolean validRow = false; // Row validity flag created
        boolean validCol = false; // Column validity flag created
        // Checks if the row index is within the dimensions of the board
        if (row >= 0 && row < rowCount(board)) {
            validRow = true;
        }
        // Checks if the column index is within the dimensions of the board
        if (column >= 0 && column < columnCount(board)) {
            validCol = true;
        }
        return validRow && validCol; // Returns true only if the row and column indices are both valid
    }

    /**
     * Checks if there is room left to play in a column.
     *
     * @param board the 2D integer array that has been created of size rows (dimension 1) and columns (dimension 2)
     * @param column integer value for the column index
     * @return a boolean true if there is space in the given column, otherwise false
     */

    public static boolean canPlay(int[][] board, int column) {
        if (board[0][column] != EMP) { // Checks if the extreme top row of the specified column is empty or not
            return false; // Returns false if it is full
        } else {
            return true; // Returns true if it is empty
        }
    }

    /**
     * Plays a turn in a column.
     *
     * @param board the 2D integer array that has been created of size rows (dimension 1) and columns (dimension 2)
     * @param column integer value for the column index
     * @param piece either RED or BLUE used to play a turn
     * @return an integer index of the row the piece stopped at when playing, otherwise returns -1 if there is no space
     * to play in the specified column
     */

    public static int play(int[][] board, int column, int piece) {
        // Checks if the specified column is playable (not full)
        if (canPlay(board, column)) {
            // For loop used to iterate from the bottom to the top of the column
            for (int i = rowCount(board) - 1; i >= 0; i--) {
                // If the current cell is empty, then it places the piece in the first empty slot that is found
                if (board[i][column] == EMP) {
                    board[i][column] = piece;
                    return i; // Returns the row index where the piece was placed
                }
            }
        }
        return -1; // Returns -1 if the column is full
    }

    /**
     * Reverts a prior attempt at playing a piece in order to check if it won the game (mainly used in hint()).
     *
     * @param board the 2D integer array that has been created of size rows (dimension 1) and columns (dimension 2)
     * @param column integer value for the column index
     * @return an integer index of the row, otherwise -1 if there are no piece to remove from the specified column
     */

    public static int removeLastPlay(int[][] board, int column) {
        // For loop used to iterate over the rows
        for (int i = 0; i < rowCount(board); i++) {
            // If the specified column in that row is not empty, then remove the (top most) piece to make it empty
            if (board[i][column] != EMP) {
                board[i][column] = EMP;
                return i; // Returns the index of the row from where the last play was removed
            }
        }
        return -1; // Returns -1, if the whole column is empty
    }

    /**
     * Checks to see if the game has ended.
     *
     * @param board the 2D integer array that has been created of size rows (dimension 1) and columns (dimension 2)
     * @return a boolean true if the board is filled with non-EMPTY pieces, otherwise false
     */

    public static boolean full(int[][] board) {
        // Nested for loops used to iterate through each row and each column of the board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                // Check to see if the current cell is empty
                if (board[i][j] == EMP) {
                    return false; // If an empty cell is found then it returns false
                }
            }
        }
        return true; // If there are no empty cells, which means the board is full, then it returns true
    }

    /**
     * Checks to see all variations of an 'L' shape in the rows to determine a win.
     *
     * @param board the 2D integer array that has been created of size rows (dimension 1) and columns (dimension 2)
     * @param row integer value for the row index
     * @param piece either RED or BLUE to check consecutive row entries
     * @param length integer value for the size of 'L' needed to win
     * @return a boolean true if that row has at least length consecutive entries and the perpendicular L piece
     * of the specified type of piece (RED/BLUE), otherwise false
     */

    public static boolean winInRow(int[][] board, int row, int piece, int length) {
        int inARow = 0; // Counter for the number of the given piece in a row consecutively
        // For loop used to iterate from the start of the row to the end
        for (int column = 0; column < columnCount(board); column++) {
            // Checks if the current cell contains the specified piece, if it does, then it increments inARow
            if (board[row][column] == piece) {
                inARow++;
                // Checks if there are enough pieces in a row to win
                if (inARow >= length) {
                    // Checks for a winning condition by finding if there is a perpendicular L piece of the specified
                    // type of piece
                    if ((row - 1 >= 0 && board[row - 1][column] == piece) || (row + 1 < rowCount(board) &&
                            board[row + 1][column] == piece)) {
                        return true; // Returns true if winning conditions are met
                    }
                }
            } else {
                inARow = 0; // If the sequence of consecutive same type of piece is broken, then it resets the counter
            }
        }
        inARow = 0; // Resets the counter
        // For loop used to iterate from the end of the row to the start
        for (int column = columnCount(board) - 1; column >= 0; column--) {
            // Checks if the current cell contains the specified piece, if it does, then it increments inARow
            if (board[row][column] == piece) {
                inARow++;
                // Checks if there are enough pieces in a row to win
                if (inARow >= length) {
                    // Checks for a winning condition by finding if there is a perpendicular L piece of the specified
                    // type of piece
                    if ((row - 1 >= 0 && board[row - 1][column] == piece) || (row + 1 < rowCount(board) &&
                            board[row + 1][column] == piece)) {
                        return true; // Returns true if winning conditions are met
                    }
                }
            } else {
                inARow = 0; // If the sequence of consecutive same type of piece is broken, then it resets the counter
            }
        }
        return false; // Returns false if winning conditions are not met
    }

    /**
     * Is there a win in given board in any row of board
     *
     * @param board The 2D array board of size rows (dimension 1) and columns (dimension 2)
     * @param piece The piece to look for length in a row for any row
     * @return True if there is length in any row, False otherwise
     */

    public static boolean winInAnyRow(int[][] board, int piece, int length) {
        for (int row = 0; row < board.length; row++) {
            if (winInRow(board, row, piece, length)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks to see all variations of an 'L' shape in the columns to determine a win.
     *
     * @param board the 2D integer array that has been created of size rows (dimension 1) and columns (dimension 2)
     * @param column integer value for the column index
     * @param piece either RED or BLUE to check consecutive column entries
     * @param length integer value for the size of 'L' needed to win
     * @return a boolean true if that column has at least length consecutive entries and the perpendicular L piece
     * of the specified type of piece (RED/BLUE), otherwise false
     */

    public static boolean winInColumn(int[][] board, int column, int piece, int length) {
        int inACol = 0; // Counter for the number of the given piece in a column consecutively
        // For loop used to iterate from the top of the column to the bottom
        for (int row = 0; row < rowCount(board); row++) {
            // Checks if the current cell contains the specified piece, if it does, then it increments inACol
            if (board[row][column] == piece) {
                inACol++;
                // Checks if there are enough pieces in a column to win
                if (inACol >= length) {
                    // Checks for a winning condition by finding if there is a perpendicular L piece of the specified
                    // type of piece
                    if ((column - 1 >= 0 && board[row][column - 1] == piece) || (column + 1 < columnCount(board) &&
                            board[row][column + 1] == piece)) {
                        return true; // Returns true if winning conditions are met
                    }
                }
            } else {
                inACol = 0; // If the sequence of consecutive same type of piece is broken, then it resets the counter
            }
        }
        inACol = 0; // Resets the counter
        // For loop used to iterate from the bottom of the column to the top
        for (int row = rowCount(board) - 1; row >= 0; row--) {
            // Checks if the current cell contains the specified piece, if it does, then it increments inACol
            if (board[row][column] == piece) {
                inACol++;
                // Checks if there are enough pieces in a column to win
                if (inACol >= length) {
                    // Checks for a winning condition by finding if there is a perpendicular L piece of the specified
                    // type of piece
                    if ((column - 1 >= 0 && board[row][column - 1] == piece) || (column + 1 < columnCount(board) &&
                            board[row][column + 1] == piece)) {
                        return true; // Returns true if winning conditions are met
                    }
                }
            } else {
                inACol = 0; // If the sequence of consecutive same type of piece is broken, then it resets the counter
            }
        }
        return false; // Returns false if winning conditions are not met
    }

    /**
     * Is there a win in given board in any column of board
     *
     * @param board The 2D array board of size rows (dimension 1) and columns (dimension 2)
     * @param piece The piece to look for length in a row for any column
     * @return True if there is length in any column, False otherwise
     */

    public static boolean winInAnyColumn(int[][] board, int piece, int length) {
        for (int col = 0; col < board[0].length; col++) {
            if (winInColumn(board, col, piece, length)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks to see all variations of an 'L' shape in the diagonal backslash to determine a win.
     *
     * @param board the 2D integer array that has been created of size rows (dimension 1) and columns (dimension 2)
     * @param piece either RED or BLUE to check consecutive diagonal backslash entries
     * @param length integer value for the size of 'L' needed to win
     * @return a boolean true if any backward slash (\) diagonals have at least length consecutive entries and the
     * perpendicular L piece of the specified type of piece (RED/BLUE), otherwise false
     */

    public static boolean winInDiagonalBackslash(int[][] board, int piece, int length) {
        // Nested For loop used to iterate through each row and column, but with the consideration of a margin used to
        // find all possible occurrences of a diagonal backslash
        for (int row = 0; row <= rowCount(board) - length; row++) {
            for (int column = 0; column <= columnCount(board) - length; column++) {
                int inDiagonalBack = 0; // Counter for number of given piece in a diagonal backslash consecutively
                // First it checks for a diagonal backslash for a winning line of 'length' pieces
                for (int i = 0; i < length && row + i < rowCount(board) && column + i < columnCount(board); i++) {
                    // Checks if the current cell contains the specified piece, if it does, then it increments
                    // inDiagonalBack
                    if (board[row + i][column + i] == piece) {
                        inDiagonalBack++;
                        // Checks if there are enough pieces in a diagonal backslash to win
                        if (inDiagonalBack >= length) {
                            // Then it checks for a winning condition by finding if there is a perpendicular L piece (of
                            // the given piece) at the bottom of the diagonal backslash
                            if ((row + i - 1 >= 0 && column + i + 1 < columnCount(board) &&
                                    board[row + i - 1][column + i + 1] == piece) || (row + i + 1 < rowCount(board) &&
                                    column + i - 1 >= 0 && board[row + i + 1][column + i - 1] == piece)) {
                                return true; // Returns true if winning conditions are met
                            }
                        }
                    } else {
                        inDiagonalBack = 0; // If the sequence of consecutive same type of piece is broken, then it
                                            // resets the counter
                    }
                }
            }
        }
        // Nested For loop used to iterate through each row and column, but with the consideration of a margin used to
        // find all possible occurrences of a diagonal backslash
        for (int row = 0; row <= rowCount(board) - length; row++) {
            for (int column = 0; column <= columnCount(board) - length; column++) {
                int inDiagonalBack = 0; // Counter for number of given piece in a diagonal backslash consecutively
                // First it checks for a winning condition by finding if there is a perpendicular L piece (of the given
                // piece) at the top of the diagonal backslash
                if ((row - 1 >= 0 && column + 1 < columnCount(board) &&
                        board[row - 1][column + 1] == piece) || (row + 1 < rowCount(board) &&
                        column - 1 >= 0 && board[row + 1][column - 1] == piece)) {
                    // Then it checks for a diagonal backslash for a winning line of 'length' pieces
                    for (int i = 0; i < length && row + i < rowCount(board) && column + i < columnCount(board); i++) {
                        // Checks if the current cell contains the specified piece, if it does, then it increments
                        // inDiagonalBack
                        if (board[row + i][column + i] == piece) {
                            inDiagonalBack++;
                            if (inDiagonalBack >= length) {
                                // Checks if there are enough pieces in a diagonal backslash to win
                                return true; // Returns true if winning conditions are met
                            }
                        } else {
                            inDiagonalBack = 0; // If the sequence of consecutive same type of piece is broken, then it
                                                // resets the counter
                        }
                    }
                }
            }
        }
        return false; // Returns false if winning conditions are not met
        // Two nested For loops are needed because the perpendicular L piece could be at the top or the bottom of the
        // diagonalBackslash
    }

    /**
     * Checks to see all variations of an 'L' shape in the diagonal forwardSlash to determine a win.
     *
     * @param board the 2D integer array that has been created of size rows (dimension 1) and columns (dimension 2)
     * @param piece either RED or BLUE to check consecutive diagonal forwardSlash entries
     * @param length integer value for the size of 'L' needed to win
     * @return a boolean true if any forward slash (/) diagonals have at least length consecutive entries and the
     * perpendicular L piece of the specified type of piece (RED/BLUE), otherwise false
     */

    public static boolean winInDiagonalForwardSlash(int[][] board, int piece, int length) {
        // Nested For loop used to iterate through each row and column, but with the consideration of a margin used to
        // find all possible occurrences of a diagonal forwardSlash
        for (int row = 0; row <= rowCount(board) - length; row++) {
            for (int column = columnCount(board) - 1; column >= length - 1; column--) {
                int inDiagonalForward = 0; // Counter for number of given piece in a diagonal forwardSlash consecutively
                // First it checks for a winning condition by finding if there is a perpendicular L piece (of the given
                // piece) at the top of the diagonal forwardSlash
                for (int i = 0; i < length && row + i < rowCount(board) && column - i >= 0; i++) {
                    // Checks if the current cell contains the specified piece, if it does, then it increments
                    // inDiagonalForward
                    if (board[row + i][column - i] == piece) {
                        inDiagonalForward++;
                        // Checks if there are enough pieces in a diagonal forwardSlash to win
                        if (inDiagonalForward >= length) {
                            // Then it checks for a winning condition by finding if there is a perpendicular L piece (of
                            // the given piece) at the bottom of the diagonal forwardSlash
                            if ((row + i - 1 >= 0 && column - i - 1 >= 0 &&
                                    board[row + i - 1][column - i - 1] == piece) || (row + i + 1 < rowCount(board) &&
                                    column - i + 1 < columnCount(board) && board[row + i + 1][column - i + 1] == piece)) {
                                return true; // Returns true if the winning conditions are met
                            }
                        }
                    } else {
                        inDiagonalForward = 0;  // If the sequence of consecutive same type of piece is broken, then it
                                                // resets the counter
                    }
                }
            }
        }
        // Nested For loop used to iterate through each row and column, but with the consideration of a margin used to
        // find all possible occurrences of a diagonal forwardSlash
        for (int row = 0; row <= rowCount(board) - length; row++) {
            for (int column = columnCount(board) - 1; column >= length - 1; column--) {
                int inDiagonalForward = 0; // Counter for number of given piece in a diagonal forwardSlash consecutively
                // First it checks for a winning condition by finding if there is a perpendicular L piece (of the given
                // piece) at the top of the diagonal forwardSlash
                if ((row - 1 >= 0 && column - 1 >= 0 &&
                        board[row - 1][column - 1] == piece) || (row + 1 < rowCount(board) &&
                        column + 1 < columnCount(board) && board[row + 1][column + 1] == piece)) {
                    // Then it checks for a diagonal forwardSlash for a winning line of 'length' pieces
                    for (int i = 0; i < length && row + i < rowCount(board) && column - i >= 0; i++) {
                        // Checks if the current cell contains the specified piece, if it does, then it increments
                        // inDiagonalForward
                        if (board[row + i][column - i] == piece) {
                            inDiagonalForward++;
                            // Checks if there are enough pieces in a diagonal forwardSlash to win
                            if (inDiagonalForward >= length) {
                                return true; // Returns true if the winning conditions are met
                            }
                        } else {
                            inDiagonalForward = 0;  // If the sequence of consecutive same type of piece is broken, then
                                                    // it resets the counter
                        }
                    }
                }
            }
        }
        return false; // Returns false if the winning conditions are not met
        // Two nested For loops are needed because the perpendicular L piece could be at the top or the bottom of the
        // diagonalForwardSlash
    }

    /**
     * Is there a win in given board in any diagonal of board
     *
     * @param board The 2D array board of size rows (dimension 1) and columns (dimension 2)
     * @param piece The piece to look for length in a row for any diagonal
     * @return True if there is length in any diagonal /\, False otherwise
     */

    public static boolean winInAnyDiagonal(int[][] board, int piece, int length) {
        return winInDiagonalBackslash(board, piece, length) || winInDiagonalForwardSlash(board, piece, length);
    }

    /**
     * Tells the player if they can win a game on the next play or block the opponent from winning on the next play.
     *
     * @param board the 2D integer array that has been created of size rows (dimension 1) and columns (dimension 2)
     * @param piece either RED or BLUE based on what colour the player chooses
     * @return a 1D integer array storing the {row, column} index of the hint if a hint is found, otherwise returns
     * {-1,-1} to show no hint found
     */

    public static int[] hint(int[][] board, int piece, int length) {
        // For loop used to iterate through each column of the board
        for (int column = 0; column < columnCount(board); column++) {
            // Checks if a move can be played in the current column
            if (canPlay(board, column)) {
                // Plays the piece in the current column
                int row = play(board, column, piece);
                // Checks if this move results in a win
                if (won(board, piece, length)) {
                    // If it does, then remove that piece from the board
                    removeLastPlay(board, column);
                    return new int[]{row, column}; // Returns the row and column indices as a hint for the player
                } else {
                    removeLastPlay(board, column); // Removes the piece from the board if the move does not give a win
                }
            }
        }
        return new int[]{-1,-1}; // Returns {-1, -1} if there is no winning move (to indicate that no hint was found)
    }


    /**
     * Has the given piece won the board
     *
     * @param board The 2D array board of size rows (dimension 1) and columns (dimension 2)
     * @param piece The piece to check for a win
     * @return True if piece has won
     */
    public static boolean won(int[][] board, int piece, int length) {
        return winInAnyRow(board, piece, length) || winInAnyColumn(board, piece, length) || winInAnyDiagonal(board, piece, length);
    }

    /**
     * This function determines if the game is complete due to a win or tie by either player
     *
     * @param board The 2D array board of size rows (dimension 1) and columns (dimension 2)
     * @return True if game is complete, False otherwise
     */
    public static boolean isGameOver(int[][] board, int length) {
        return full(board) || won(board, RED, length) || won(board, BLU, length);
    }
}
