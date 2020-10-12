package day17;

public class Task2 {
    public static void main(String[] args) {

        ChessPiece RB = ChessPiece.ROOK_BLACK;
        ChessPiece RW = ChessPiece.ROOK_WHITE;
        ChessPiece KB = ChessPiece.KING_BLACK;
        ChessPiece KW = ChessPiece.KING_WHITE;
        ChessPiece QB = ChessPiece.QUEEN_BLACK;
        ChessPiece QW = ChessPiece.QUEEN_WHITE;
        ChessPiece PB = ChessPiece.PAWN_BLACK;
        ChessPiece PW = ChessPiece.PAWN_WHITE;
        ChessPiece BB = ChessPiece.BISHOP_BLACK;
        ChessPiece BW = ChessPiece.BISHOP_WHITE;
        ChessPiece EM = ChessPiece.EMPTY;
        ChessPiece KnB = ChessPiece.KNIGHT_BLACK;




        ChessPiece[][] field = {{RB, EM, EM, EM, EM, RB, KB, EM},
                                {EM, RW, EM, EM, PB, PB, EM, PB},
                                {PB, EM, KnB, EM, EM, EM, PB, EM},
                                {QB, EM, EM, BW, EM, EM, EM, EM},
                                {EM, EM, EM, BB, PW, EM, EM, EM},
                                {EM, EM, EM, EM, BW, PW, EM, EM},
                                {PW, EM, EM, QW, EM, PW, EM, PW},
                                {EM, EM, EM, EM, EM, RW, KW, EM}};

        ChessBoard playground = new ChessBoard(field);

        playground.print();

    }
}
