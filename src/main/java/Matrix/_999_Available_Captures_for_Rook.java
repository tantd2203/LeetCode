package Matrix;

public class _999_Available_Captures_for_Rook {

    public static int numRookCaptures(char[][] board) {

        int rookCol = -1, rookRow = -1;
        int attackCount = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                if (board[i][j] == 'R') {
                    rookRow = i;
                    rookCol = j;
                    break;
                }
            }
        }
        // kiểm tra bên trái có   con tốt k nếu gặp tượng thì dừng lại
        for (int col = rookCol - 1; col >= 0; col--) {
            if (board[rookRow][col] == 'B') break;
            if (board[rookRow][col] == 'p') {
                attackCount++;
                break;
            }

        }
        // bên phải
        for (int col = rookCol + 1; col < board.length; col++) {
            if (board[rookRow][col] == 'B') break;
            if (board[rookRow][col] == 'p') {
                attackCount++;
                break;
            }
        }

        // ben tren

        for (int row = rookCol - 1; row >= 0; row--) {
            if (board[row][rookCol] == 'B') break;
            if (board[row][rookCol] == 'p') {
                attackCount++;
                break;
            }

        }
        // duoi
        for (int row = rookCol + 1; row < board.length; row++) {
            if (board[row][rookCol] == 'B') break;
            if (board[row][rookCol] == 'p') {
                attackCount++;
                break;
            }

        }


        return attackCount;
    }

    public static void main(String[] args) {
        char[][] board = {{'.', '.', '.', '.', '.', '.', '.', '.'}, {'.', '.', '.', 'p', '.', '.', '.', '.'}, {'.', '.', '.', 'R', '.', '.', '.', 'p'}, {'.', '.', '.', '.', '.', '.', '.', '.'}, {'.', '.', '.', '.', '.', '.', '.', '.'}, {'.', '.', '.', 'p', '.', '.', '.', '.'}, {'.', '.', '.', '.', '.', '.', '.', '.'}, {'.', '.', '.', '.', '.', '.', '.', '.'}};

        System.out.println("Number of pawns the rook is attacking: " + numRookCaptures(board));
    }
}
