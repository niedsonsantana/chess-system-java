package program;

import boardGame.Board;
import boardGame.Position;
import chess.ChessMatch;
import chess.Color;
import chess.pieces.King;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
//		Board board = new Board(8,8);
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());

//		Position pos = new Position(3,5);
//		System.out.println(pos);
//		King k = new King(board, Color.BLACK);
		//System.out.print(k);
	}

}
