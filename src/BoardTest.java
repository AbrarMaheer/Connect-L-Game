import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * CPSC 233 W24 Assignment 1 BoardTest
 * Stores 65 JUnit Tests to test the 13 methods
 * @author Abrar Maheer Bin Arif UCID 30218259
 * @email abrarmaheer.arif@ucalgary.ca
 * @version 1.0
 * 6/02/2024 Tutorial T05
 */
public class BoardTest {

    /**
     * Used to make a copy of board before functions run, so that verify a function was non-destructive on board is easy
     * @param board The board to make deep copy of
     * @return A deep copy of given board
     */
    public int[][] deepCopy(int[][] board) {
        int[][] copy = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            copy[i] = Arrays.copyOf(board[i], board[i].length);
        }
        return copy;
    }

    @Test
    public void createBoard6x4() {
        int[][] expected = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP}};
        int[][] actual = Board.createBoard(6, 4);
        assertTrue(Arrays.deepEquals(expected, actual));
    }

    @Test
    public void createBoard4x8() {
        int[][] expected = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP}};
        int[][] actual = Board.createBoard(4, 8);
        assertTrue(Arrays.deepEquals(expected, actual));
    }

    @Test
    public void createBoard6x7() {
        int[][] expected = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP}};
        int[][] actual = Board.createBoard(6, 7);
        assertTrue(Arrays.deepEquals(expected, actual));
    }


    @Test
    public void createBoard7x5() {
        int[][] expected = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP}};
        int[][] actual = Board.createBoard(7, 5);
        assertTrue(Arrays.deepEquals(expected, actual));
    }

    @Test
    public void createBoard8x8() {
        int[][] expected = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP}};
        int[][] actual = Board.createBoard(8, 8);
        assertTrue(Arrays.deepEquals(expected, actual));
    }

    @Test
    public void rowCount7Rows() {
        int[][] board = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP}};
        assertEquals(7, Board.rowCount(board));
    }

    @Test
    public void rowCount4Rows() {
        int[][] board = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP}};
        assertEquals(4, Board.rowCount(board));
    }

    @Test
    public void rowCount6Rows() {
        int[][] board = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP}};
        assertEquals(6, Board.rowCount(board));
    }

    @Test
    public void rowCount5Rows() {
        int[][] board = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP}};
        assertEquals(5, Board.rowCount(board));
    }

    @Test
    public void rowCount8Rows() {
        int[][] board = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP}};
        assertEquals(8, Board.rowCount(board));
    }

    @Test
    public void columnCount8Columns() {
        int[][] board = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP}};
        assertEquals(8, Board.columnCount(board));
    }

    @Test
    public void columnCount7Columns() {
        int[][] board = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP}};
        assertEquals(7, Board.columnCount(board));
    }

    @Test
    public void columnCount6Columns() {
        int[][] board = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP}};
        assertEquals(6, Board.columnCount(board));
    }

    @Test
    public void columnCount5Columns() {
        int[][] board = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP}};
        assertEquals(5, Board.columnCount(board));
    }

    @Test
    public void columnCount4Columns() {
        int[][] board = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP}};
        assertEquals(4, Board.columnCount(board));
    }

    @Test
    public void valid5x5Row3Column6IsNotValid() {
        int[][] board = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP}};
        assertFalse(Board.valid(board, 3,6));
    }

    @Test
    public void valid7x5Row7Column5IsNotValid() {
        int[][] board = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP}};
        assertFalse(Board.valid(board, 7,5));
    }

    @Test
    public void valid6x5Row7Column1IsNotValid() {
        int[][] board = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP}};
        assertFalse(Board.valid(board, 7,1));
    }

    @Test
    public void valid4x5Row0Column0IsValid() {
        int[][] board = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP}};
        assertTrue(Board.valid(board, 0,0));
    }

    @Test
    public void valid6x8Row1Column7IsValid() {
        int[][] board = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP}};
        assertTrue(Board.valid(board, 1,7));
    }

    @Test
    public void canPlayColumn0Full() {
        int[][] board = new int[][]{
                {Board.BLU, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.RED, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.BLU, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.RED, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.RED, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.BLU, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.BLU, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP}};
        assertFalse(Board.canPlay(board, 0));
    }

    @Test
    public void canPlayColumn2Full() {
        int[][] board = new int[][]{
                {Board.RED, Board.BLU, Board.BLU, Board.RED},
                {Board.RED, Board.RED, Board.RED, Board.BLU},
                {Board.BLU, Board.BLU, Board.RED, Board.RED},
                {Board.RED, Board.BLU, Board.BLU, Board.RED}};
        assertFalse(Board.canPlay(board, 2));
    }

    @Test
    public void canPlayColumn1NotFull() {
        int[][] board = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.BLU, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.RED, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.RED, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.BLU, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.BLU, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP}};
        assertTrue(Board.canPlay(board, 1));
    }

    @Test
    public void canPlayColumn7Full() {
        int[][] board = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.RED},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.BLU},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.RED},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.BLU},
                {Board.EMP, Board.EMP, Board.RED, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.RED},
                {Board.BLU, Board.EMP, Board.RED, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.BLU},
                {Board.BLU, Board.BLU, Board.RED, Board.BLU, Board.EMP, Board.EMP, Board.EMP, Board.RED}};
        assertFalse(Board.canPlay(board, 7));
    }

    @Test
    public void canPlayColumn3NotFull() {
        int[][] board = new int[][]{
                {Board.BLU, Board.BLU, Board.BLU, Board.EMP},
                {Board.RED, Board.RED, Board.BLU, Board.BLU},
                {Board.BLU, Board.BLU, Board.RED, Board.BLU},
                {Board.RED, Board.BLU, Board.BLU, Board.RED},
                {Board.RED, Board.RED, Board.BLU, Board.BLU},
                {Board.BLU, Board.RED, Board.BLU, Board.RED},
                {Board.RED, Board.BLU, Board.RED, Board.BLU}};
        assertTrue(Board.canPlay(board, 3));
    }

    @Test
    public void playInColumn0WillWork() {
        int[][] board = new int[][]{
                {Board.EMP, Board.BLU, Board.BLU, Board.EMP},
                {Board.EMP, Board.RED, Board.BLU, Board.BLU},
                {Board.EMP, Board.BLU, Board.RED, Board.BLU},
                {Board.RED, Board.BLU, Board.BLU, Board.RED},
                {Board.RED, Board.RED, Board.BLU, Board.BLU},
                {Board.BLU, Board.RED, Board.BLU, Board.RED},
                {Board.RED, Board.BLU, Board.RED, Board.BLU}};
        int expected = 2;
        assertEquals(expected, Board.play(board,0, Board.RED));
    }

    @Test
    public void playInColumn1WillNotWork() {
        int[][] board = new int[][]{
                {Board.EMP, Board.RED, Board.BLU, Board.BLU},
                {Board.EMP, Board.BLU, Board.RED, Board.BLU},
                {Board.RED, Board.BLU, Board.BLU, Board.RED},
                {Board.RED, Board.RED, Board.BLU, Board.BLU},
                {Board.BLU, Board.RED, Board.BLU, Board.RED}};
        int expected = -1;
        assertEquals(expected, Board.play(board,1, Board.RED));
    }

    @Test
    public void playInColumn4WillWork() {
        int[][] board = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.BLU, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.RED, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.RED, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.BLU, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.RED},
                {Board.BLU, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.RED}};
        int expected = 6;
        assertEquals(expected, Board.play(board,4, Board.RED));
    }

    @Test
    public void playInColumn2WillNotWork() {
        int[][] board = new int[][]{
                {Board.RED, Board.BLU, Board.BLU, Board.RED},
                {Board.BLU, Board.RED, Board.BLU, Board.BLU},
                {Board.BLU, Board.BLU, Board.RED, Board.BLU},
                {Board.RED, Board.BLU, Board.BLU, Board.RED}};
        int expected = -1;
        assertEquals(expected, Board.play(board,2, Board.RED));
    }

    @Test
    public void playInColumn3WillWork() {
        int[][] board = new int[][]{
                {Board.EMP, Board.BLU, Board.EMP, Board.EMP, Board.BLU},
                {Board.EMP, Board.RED, Board.EMP, Board.EMP, Board.RED},
                {Board.EMP, Board.BLU, Board.RED, Board.EMP, Board.RED},
                {Board.RED, Board.BLU, Board.RED, Board.EMP, Board.BLU},
                {Board.RED, Board.BLU, Board.BLU, Board.RED, Board.RED},
                {Board.RED, Board.RED, Board.BLU, Board.BLU, Board.BLU}};
        int expected = 3;
        assertEquals(expected, Board.play(board,3, Board.RED));
    }

    @Test
    public void removeLastPlayInColumn0Works() {
        int[][] board = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.BLU, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.RED, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.RED, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.BLU, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.RED},
                {Board.BLU, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.RED}};
        int expected = 2;
        assertEquals(expected, Board.removeLastPlay(board, 0));
    }

    @Test
    public void removeLastPlayInColumn2Works() {
        int[][] board = new int[][]{
                {Board.RED, Board.BLU, Board.BLU, Board.RED},
                {Board.BLU, Board.RED, Board.BLU, Board.BLU},
                {Board.BLU, Board.BLU, Board.RED, Board.BLU},
                {Board.RED, Board.BLU, Board.BLU, Board.RED}};
        int expected = 0;
        assertEquals(expected, Board.removeLastPlay(board, 2));
    }

    @Test
    public void removeLastPlayInColumn1DoesNotWork() {
        int[][] board = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.BLU, Board.EMP},
                {Board.BLU, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.BLU, Board.EMP},
                {Board.RED, Board.EMP, Board.EMP, Board.EMP, Board.RED, Board.RED, Board.RED}};
        int expected = -1;
        assertEquals(expected, Board.removeLastPlay(board, 1));
    }

    @Test
    public void removeLastPlayInColumn2DoesNotWork() {
        int[][] board = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP}};
        int expected = -1;
        assertEquals(expected, Board.removeLastPlay(board, 0));
    }

    @Test
    public void removeLastPlayInColumn5Works() {
        int[][] board = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.BLU, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.RED, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.RED, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.RED},
                {Board.BLU, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.RED},
                {Board.BLU, Board.EMP, Board.EMP, Board.EMP, Board.RED, Board.BLU, Board.BLU}};
        int expected = 6;
        assertEquals(expected, Board.removeLastPlay(board, 5));
    }

    @Test
    public void fullIsFull4x5() {
        int[][] board = new int[][]{
                {Board.RED, Board.BLU, Board.BLU, Board.RED, Board.BLU},
                {Board.BLU, Board.RED, Board.BLU, Board.BLU, Board.RED},
                {Board.BLU, Board.BLU, Board.RED, Board.BLU, Board.BLU},
                {Board.RED, Board.BLU, Board.BLU, Board.RED, Board.RED}};
        assertTrue(Board.full(board));
    }

    @Test
    public void fullIsNotFull4x6() {
        int[][] board = new int[][]{
                {Board.RED, Board.BLU, Board.BLU, Board.RED, Board.BLU, Board.EMP},
                {Board.BLU, Board.RED, Board.BLU, Board.BLU, Board.RED, Board.RED},
                {Board.BLU, Board.BLU, Board.RED, Board.BLU, Board.BLU, Board.RED},
                {Board.RED, Board.BLU, Board.BLU, Board.RED, Board.RED, Board.RED}};
        assertFalse(Board.full(board));
    }

    @Test
    public void fullIsFull6x7() {
        int[][] board = new int[][]{
                {Board.RED, Board.BLU, Board.BLU, Board.RED, Board.BLU, Board.RED, Board.BLU},
                {Board.BLU, Board.RED, Board.BLU, Board.BLU, Board.RED, Board.BLU, Board.BLU},
                {Board.BLU, Board.BLU, Board.RED, Board.BLU, Board.BLU, Board.RED, Board.RED},
                {Board.RED, Board.BLU, Board.BLU, Board.RED, Board.RED, Board.BLU, Board.BLU},
                {Board.BLU, Board.RED, Board.BLU, Board.RED, Board.RED, Board.RED, Board.BLU},
                {Board.RED, Board.BLU, Board.BLU, Board.BLU, Board.BLU, Board.RED, Board.RED}};
        assertTrue(Board.full(board));
    }

    @Test
    public void fullIsNotFull4x4() {
        int[][] board = new int[][]{
                {Board.RED, Board.BLU, Board.EMP, Board.RED},
                {Board.BLU, Board.RED, Board.BLU, Board.BLU},
                {Board.BLU, Board.BLU, Board.RED, Board.BLU},
                {Board.RED, Board.BLU, Board.BLU, Board.RED}};
        assertFalse(Board.full(board));
    }

    @Test
    public void fullIsNotFull8x7() {
        int[][] board = new int[][]{
                {Board.RED, Board.BLU, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.BLU, Board.RED, Board.EMP, Board.BLU, Board.EMP, Board.EMP, Board.EMP},
                {Board.BLU, Board.BLU, Board.EMP, Board.BLU, Board.EMP, Board.BLU, Board.EMP},
                {Board.BLU, Board.BLU, Board.EMP, Board.BLU, Board.EMP, Board.RED, Board.EMP},
                {Board.BLU, Board.BLU, Board.EMP, Board.BLU, Board.BLU, Board.BLU, Board.EMP},
                {Board.RED, Board.BLU, Board.EMP, Board.BLU, Board.BLU, Board.BLU, Board.EMP},
                {Board.BLU, Board.RED, Board.EMP, Board.BLU, Board.BLU, Board.RED, Board.EMP},
                {Board.RED, Board.RED, Board.EMP, Board.RED, Board.RED, Board.BLU, Board.EMP}};
        assertFalse(Board.full(board));
    }

    @Test
    public void winInRow6x4RedWinsWithLength3AtRow5() {
        int[][] board = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.RED, Board.EMP, Board.BLU, Board.BLU},
                {Board.RED, Board.RED, Board.RED, Board.BLU}};
        assertTrue(Board.winInRow(board, 5, Board.RED, 3));
    }

    @Test
    public void winInRow5X6BlueWinsWithLength4AtRow2() {
        int[][] board = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.RED, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.BLU, Board.BLU, Board.BLU, Board.BLU, Board.EMP, Board.BLU},
                {Board.RED, Board.RED, Board.RED, Board.BLU, Board.EMP, Board.RED},
                {Board.RED, Board.BLU, Board.RED, Board.RED, Board.EMP, Board.RED}};
        assertTrue(Board.winInRow(board, 2, Board.BLU, 4));
    }

    @Test
    public void winInRow8x8RedWinsWithLength7AtRow7() {
        int[][] board = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.RED, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.RED, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.RED, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.BLU, Board.EMP, Board.RED, Board.BLU, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.BLU, Board.EMP, Board.RED, Board.BLU, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.BLU, Board.EMP, Board.RED, Board.BLU, Board.EMP, Board.BLU, Board.RED, Board.EMP},
                {Board.RED, Board.RED, Board.RED, Board.RED, Board.RED, Board.RED, Board.RED, Board.BLU}};
        assertTrue(Board.winInRow(board, 7, Board.RED, 7));
    }

    @Test
    public void winInRow5x4RedDoesNotWinWithLength3AtRow2() {
        int[][] board = new int[][]{
                {Board.RED, Board.RED, Board.BLU, Board.BLU},
                {Board.BLU, Board.BLU, Board.RED, Board.RED},
                {Board.BLU, Board.RED, Board.BLU, Board.BLU},
                {Board.RED, Board.BLU, Board.RED, Board.RED},
                {Board.RED, Board.BLU, Board.RED, Board.BLU}};
        assertFalse(Board.winInRow(board, 2, Board.RED, 3));
    }

    @Test
    public void winInRow6x5BlueWinSWithLength4AtRow3() {
        int[][] board = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.RED, Board.EMP, Board.EMP, Board.EMP},
                {Board.BLU, Board.BLU, Board.BLU, Board.BLU, Board.EMP},
                {Board.BLU, Board.RED, Board.RED, Board.RED, Board.BLU},
                {Board.RED, Board.RED, Board.RED, Board.BLU, Board.RED}};
        assertTrue(Board.winInRow(board, 3, Board.BLU, 4));
    }

    @Test
    public void winInColumn8x7BlueWinsWithLength3AtColumn0() {
        int[][] board = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.BLU, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.BLU, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.BLU, Board.BLU, Board.EMP, Board.EMP, Board.EMP, Board.RED, Board.EMP}};
        assertTrue(Board.winInColumn(board, 0, Board.BLU, 3));
    }

    @Test
    public void winInColumn7x7RedWinsWithLength5AtColumn3() {
        int[][] board = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.RED, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.RED, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.RED, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.RED, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.RED, Board.RED, Board.EMP, Board.EMP, Board.EMP},
                {Board.BLU, Board.EMP, Board.BLU, Board.BLU, Board.EMP, Board.EMP, Board.EMP},
                {Board.RED, Board.RED, Board.RED, Board.RED, Board.EMP, Board.BLU, Board.EMP}};
        assertTrue(Board.winInColumn(board, 3, Board.RED, 5));
    }

    @Test
    public void winInColumn8x4BlueWinSWithLength3AtColumn1() {
        int[][] board = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.BLU, Board.BLU, Board.EMP, Board.EMP},
                {Board.RED, Board.BLU, Board.BLU, Board.RED},
                {Board.RED, Board.BLU, Board.RED, Board.BLU},
                {Board.BLU, Board.RED, Board.BLU, Board.RED},
                {Board.RED, Board.BLU, Board.RED, Board.RED}};
        assertTrue(Board.winInColumn(board, 1, Board.BLU, 3));
    }

    @Test
    public void winInColumn6x6BlueWinSWithLength4AtColumn3() {
        int[][] board = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.BLU, Board.BLU, Board.EMP, Board.BLU, Board.BLU, Board.EMP},
                {Board.RED, Board.RED, Board.EMP, Board.BLU, Board.RED, Board.EMP},
                {Board.BLU, Board.RED, Board.EMP, Board.BLU, Board.BLU, Board.EMP},
                {Board.BLU, Board.RED, Board.EMP, Board.BLU, Board.RED, Board.RED}};
        assertTrue(Board.winInColumn(board, 3, Board.BLU, 4));
    }

    @Test
    public void winInColumn6x7RedDoesNotWinWithLength4AtColumn2() {
        int[][] board = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP}};
        assertFalse(Board.winInColumn(board, 2, Board.BLU, 4));
    }

    @Test
    public void winInDiagonalBackslash8x5RedWinsWithLength3() {
        int[][] board = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.RED, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.BLU, Board.RED, Board.EMP, Board.RED, Board.EMP},
                {Board.RED, Board.BLU, Board.RED, Board.BLU, Board.EMP},
                {Board.BLU, Board.BLU, Board.BLU, Board.BLU, Board.EMP}};
        assertTrue(Board.winInDiagonalBackslash(board, Board.RED, 3));
    }

    @Test
    public void winInDiagonalBackslash8x6BlueWinsWithLength4() {
        int[][] board = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.BLU, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.RED, Board.RED, Board.BLU, Board.EMP, Board.EMP, Board.EMP},
                {Board.BLU, Board.BLU, Board.RED, Board.BLU, Board.EMP, Board.EMP},
                {Board.RED, Board.RED, Board.BLU, Board.RED, Board.BLU, Board.EMP},
                {Board.BLU, Board.RED, Board.BLU, Board.BLU, Board.RED, Board.EMP}};
        assertTrue(Board.winInDiagonalBackslash(board, Board.BLU, 4));
    }

    @Test
    public void winInDiagonalBackslash8x8RedWinsWithLength7() {
        int[][] board = new int[][]{
                {Board.EMP, Board.RED, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.RED, Board.BLU, Board.RED, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.BLU, Board.RED, Board.BLU, Board.RED, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.RED, Board.BLU, Board.BLU, Board.BLU, Board.RED, Board.EMP, Board.EMP, Board.EMP},
                {Board.RED, Board.BLU, Board.BLU, Board.RED, Board.BLU, Board.RED, Board.RED, Board.EMP},
                {Board.BLU, Board.RED, Board.RED, Board.RED, Board.BLU, Board.RED, Board.RED, Board.EMP},
                {Board.RED, Board.BLU, Board.RED, Board.BLU, Board.RED, Board.BLU, Board.BLU, Board.RED},
                {Board.BLU, Board.BLU, Board.BLU, Board.BLU, Board.RED, Board.RED, Board.BLU, Board.BLU}};
        assertTrue(Board.winInDiagonalBackslash(board, Board.RED, 7));
    }

    @Test
    public void winInDiagonalBackslash5x6BlueWinsWithLength3() {
        int[][] board = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.BLU, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.BLU, Board.RED, Board.EMP, Board.RED, Board.EMP, Board.EMP},
                {Board.RED, Board.BLU, Board.RED, Board.RED, Board.EMP, Board.RED},
                {Board.RED, Board.BLU, Board.BLU, Board.BLU, Board.EMP, Board.RED}};
        assertTrue(Board.winInDiagonalBackslash(board, Board.BLU, 3));
    }

    @Test
    public void winInDiagonalBackslash5x5RedDoesNotWinWithLength4() {
        int[][] board = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.RED, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.BLU, Board.BLU, Board.EMP, Board.RED, Board.EMP},
                {Board.RED, Board.BLU, Board.RED, Board.RED, Board.EMP},
                {Board.BLU, Board.BLU, Board.BLU, Board.BLU, Board.EMP}};
        assertFalse(Board.winInDiagonalBackslash(board, Board.RED, 4));
    }

    @Test
    public void winInDiagonalForwardSlash6x5BlueWinsWithLength4() {
        int[][] board = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.BLU, Board.EMP},
                {Board.EMP, Board.EMP, Board.BLU, Board.RED, Board.BLU},
                {Board.EMP, Board.BLU, Board.BLU, Board.BLU, Board.RED},
                {Board.BLU, Board.RED, Board.RED, Board.RED, Board.BLU},
                {Board.BLU, Board.RED, Board.BLU, Board.RED, Board.RED},
                {Board.RED, Board.RED, Board.RED, Board.BLU, Board.BLU}};
        assertTrue(Board.winInDiagonalForwardSlash(board, Board.BLU, 4));
    }

    @Test
    public void winInDiagonalForwardSlash5x5RedWinsWithLength3() {
        int[][] board = new int[][]{
                {Board.EMP, Board.EMP, Board.BLU, Board.RED, Board.BLU},
                {Board.EMP, Board.EMP, Board.BLU, Board.BLU, Board.RED},
                {Board.EMP, Board.EMP, Board.RED, Board.RED, Board.BLU},
                {Board.EMP, Board.BLU, Board.RED, Board.BLU, Board.RED},
                {Board.EMP, Board.RED, Board.RED, Board.BLU, Board.BLU}};
        assertTrue(Board.winInDiagonalForwardSlash(board, Board.RED, 3));
    }

    @Test
    public void winInDiagonalForwardSlash8x7BlueWinsWithLength5() {
        int[][] board = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.RED, Board.BLU, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.BLU, Board.BLU, Board.BLU, Board.EMP, Board.EMP},
                {Board.EMP, Board.RED, Board.BLU, Board.BLU, Board.RED, Board.EMP, Board.EMP},
                {Board.BLU, Board.BLU, Board.RED, Board.RED, Board.BLU, Board.EMP, Board.EMP},
                {Board.BLU, Board.RED, Board.BLU, Board.BLU, Board.RED, Board.EMP, Board.EMP},
                {Board.RED, Board.BLU, Board.RED, Board.BLU, Board.RED, Board.EMP, Board.EMP},
                {Board.RED, Board.BLU, Board.RED, Board.RED, Board.RED, Board.EMP, Board.EMP},
                {Board.RED, Board.RED, Board.RED, Board.BLU, Board.BLU, Board.BLU, Board.EMP}};
        assertTrue(Board.winInDiagonalForwardSlash(board, Board.BLU, 5));
    }

    @Test
    public void winInDiagonalForwardSlash4x5RedWinsWithLength3() {
        int[][] board = new int[][]{
                {Board.RED, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.BLU, Board.EMP, Board.BLU, Board.EMP, Board.BLU},
                {Board.RED, Board.EMP, Board.BLU, Board.RED, Board.RED},
                {Board.RED, Board.EMP, Board.RED, Board.RED, Board.BLU},
                {Board.BLU, Board.RED, Board.BLU, Board.RED, Board.RED},
                {Board.RED, Board.RED, Board.BLU, Board.BLU, Board.BLU}};
        assertTrue(Board.winInDiagonalForwardSlash(board, Board.RED, 3));
    }

    @Test
    public void winInDiagonalForwardSlash4x4BlueDoesNotWinWithLength3() {
        int[][] board = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.RED, Board.EMP},
                {Board.EMP, Board.EMP, Board.BLU, Board.BLU, Board.RED},
                {Board.BLU, Board.EMP, Board.RED, Board.RED, Board.BLU},
                {Board.BLU, Board.RED, Board.BLU, Board.RED, Board.RED},
                {Board.RED, Board.RED, Board.RED, Board.BLU, Board.BLU}};
        assertFalse(Board.winInDiagonalForwardSlash(board, Board.BLU, 3));
    }

    @Test
    public void hint8x4RedHintAtRow4Column0() {
        int[][] board = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.RED, Board.EMP, Board.EMP, Board.EMP},
                {Board.RED, Board.BLU, Board.RED, Board.BLU},
                {Board.RED, Board.RED, Board.BLU, Board.BLU}};
        int[] expected = {4,0};
        assertArrayEquals(expected, Board.hint(board, Board.RED, 4));
    }

    @Test
    public void hint7x4BlueHintAtRow3Column1() {
        int[][] board = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.RED, Board.BLU, Board.EMP},
                {Board.EMP, Board.BLU, Board.RED, Board.RED},
                {Board.BLU, Board.RED, Board.BLU, Board.BLU}};
        int[] expected = {3,1};
        assertArrayEquals(expected, Board.hint(board, Board.BLU, 3));
    }

    @Test
    public void hint8x6RedHintNotFound() {
        int[][] board = new int[][]{
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.BLU, Board.EMP},
                {Board.EMP, Board.EMP, Board.EMP, Board.EMP, Board.BLU, Board.EMP},
                {Board.RED, Board.EMP, Board.EMP, Board.EMP, Board.BLU, Board.EMP},
                {Board.RED, Board.EMP, Board.EMP, Board.EMP, Board.BLU, Board.EMP},
                {Board.RED, Board.EMP, Board.EMP, Board.RED, Board.BLU, Board.EMP},
                {Board.RED, Board.EMP, Board.EMP, Board.BLU, Board.RED, Board.RED}};
        int[] expected = {-1,-1};
        assertArrayEquals(expected, Board.hint(board, Board.RED, 5));
    }

    @Test
    public void hint4x4BlueHintAtRow() {
        int[][] board = new int[][]{
                {Board.BLU, Board.EMP, Board.BLU, Board.BLU},
                {Board.BLU, Board.RED, Board.RED, Board.BLU},
                {Board.RED, Board.BLU, Board.RED, Board.RED},
                {Board.RED, Board.RED, Board.BLU, Board.BLU}};
        int[] expected = {0,1};
        assertArrayEquals(expected, Board.hint(board, Board.BLU, 3));
    }

    @Test
    public void hint6x5BlueHintNotFound() {
        int[][] board = new int[][]{
                {Board.BLU, Board.RED, Board.BLU, Board.BLU, Board.RED},
                {Board.BLU, Board.BLU, Board.RED, Board.RED, Board.RED},
                {Board.BLU, Board.BLU, Board.BLU, Board.BLU, Board.RED},
                {Board.RED, Board.BLU, Board.RED, Board.BLU, Board.BLU},
                {Board.RED, Board.BLU, Board.RED, Board.BLU, Board.BLU},
                {Board.RED, Board.RED, Board.BLU, Board.BLU, Board.RED}};
        int[] expected = {-1,-1};
        assertArrayEquals(expected, Board.hint(board, Board.RED, 4));
    }
}

