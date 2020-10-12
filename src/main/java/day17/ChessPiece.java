package day17;

public enum ChessPiece {
    KING_BLACK("♚", 100), KING_WHITE("♔", 100),
    QUEEN_BLACK("♛", 9), QUEEN_WHITE("♕", 9),
    ROOK_BLACK("♜", 5), ROOK_WHITE("♖", 5),
    BISHOP_BLACK("♝", 3.5), BISHOP_WHITE("♗", 3.5),
    KNIGHT_BLACK("♞", 3), KNIGHT_WHITE("♘", 3),
    PAWN_BLACK("♟", 1), PAWN_WHITE("♙", 1),
    EMPTY("_", -1);

    ChessPiece(String sign, double power) {
        this.sign = sign;
        this.power = power;
    }

    private double power;
    private String sign;

    public String toString() {
        return this.sign;
    }
}
