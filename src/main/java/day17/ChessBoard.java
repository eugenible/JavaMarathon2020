package day17;

public class ChessBoard {
    private ChessPiece[][] field;

    public ChessBoard(ChessPiece[][] field) {
        this.field = field;
    }

    public void print() {
        for (int i = 0; i < this.field.length; i++) {
            for (int j = 0; j < this.field[i].length; j++) {
                System.out.print(this.field[i][j]);
            }
            System.out.println();
        }
    }
}
