// TicTacToe unit tests using basic methodology (no libraries like JUnit)
public class TestTicTacToe {

    // Utility method to run a test
    private static void runTest(String testName, char expected, char actual) {
        if (expected == actual) {
            System.out.println(testName + " passed.");
        } else {
            System.out.println(testName + " FAILED: expected " + expected + " but got " + actual);
        }
    }

    // Test horizontal win
    private static void testRowWin() {
        char[][] board = {
            { 'X', 'X', 'X' },
            { ' ', 'O', ' ' },
            { 'O', ' ', ' ' }
        };
        char winner = App.checkWinner(board);
        runTest("testRowWin", 'X', winner);
    }

    // Test vertical win
    private static void testColumnWin() {
        char[][] board = {
            { 'O', 'X', ' ' },
            { 'O', 'X', ' ' },
            { ' ', 'X', ' ' }
        };
        char winner = App.checkWinner(board);
        runTest("testColumnWin", 'X', winner);
    }

    // Test diagonal win (top-left to bottom-right)
    private static void testDiagonalWin1() {
        char[][] board = {
            { 'O', 'X', ' ' },
            { ' ', 'O', 'X' },
            { ' ', ' ', 'O' }
        };
        char winner = App.checkWinner(board);
        runTest("testDiagonalWin1", 'O', winner);
    }

    // Test diagonal win (top-right to bottom-left)
    private static void testDiagonalWin2() {
        char[][] board = {
            { 'X', ' ', 'O' },
            { 'X', 'O', ' ' },
            { 'O', ' ', 'X' }
        };
        char winner = App.checkWinner(board);
        runTest("testDiagonalWin2", 'O', winner);
    }

    // Test no winner
    private static void testNoWinner() {
        char[][] board = {
            { 'X', 'O', 'X' },
            { 'O', 'X', 'O' },
            { 'O', 'X', 'O' }
        };
        char winner = App.checkWinner(board);
        runTest("testNoWinner", ' ', winner);
    }

    public static void main(String[] args) {
        System.out.println("Running TicTacToe logic tests...");
        testRowWin();
        testColumnWin();
        testDiagonalWin1();
        testDiagonalWin2();
        testNoWinner();
        System.out.println("Testing completed.");
    }
}
