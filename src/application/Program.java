package application;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Board board = new Board(8,8);
		ChessMatch chessMatch = new ChessMatch();
		while (true) {
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.println("source");
			ChessPosition source = UI.readChessPosition(sc);
			System.out.println();
			System.out.println("Target");
			ChessPosition target = UI.readChessPosition(sc);

			ChessPiece capturePiece = chessMatch.performChessMove(source, target);

//		Position pos = new Position(3,5);
//		System.out.println(pos);
//		King k = new King(board, Color.BLACK);
			//System.out.print(k);
		}
	}

}
