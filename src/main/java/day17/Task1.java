package day17;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece cp1 = ChessPiece.PAWN_WHITE;
        ChessPiece cp2 = ChessPiece.PAWN_WHITE;
        ChessPiece cp3 = ChessPiece.PAWN_WHITE;
        ChessPiece cp4 = ChessPiece.PAWN_WHITE;

        ChessPiece cp5 = ChessPiece.PAWN_BLACK;
        ChessPiece cp6 = ChessPiece.PAWN_BLACK;
        ChessPiece cp7 = ChessPiece.PAWN_BLACK;
        ChessPiece cp8 = ChessPiece.PAWN_BLACK;

        ChessPiece[] fighters = {cp1,cp2,cp3,cp4,cp5,cp6,cp7,cp8};
        for (ChessPiece cp : fighters) {
            System.out.print(cp);
        }
    }
}
