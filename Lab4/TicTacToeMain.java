package Lab4;
import java.awt.Frame;
import javax.swing.JFrame;

public class TicTacToeMain {

	public static void main(String[] args) {
		
		{
			createAndShowGUI();
		}
		private static void createAndShowGUI()
		{
		TicTacToeBoard Board = new TicTacToeBoard();

		Frame frame = new JFrame(“Tic Tac Toe Board”);
		Frame.setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);

		Frame.add(board);
		Frame.setSize(322,422);
		Frame.setVisible(true);
		}

	}

}
