package Lab4;
import java.awt.Frame;


import javax.swing.JFrame;

public class TicTacToeMain  {

	public static void main(String[] args) {
		
			createAndShowGUI();
		}
		private static void createAndShowGUI()
		{
		TicTacToeBoard Board = new TicTacToeBoard();
		

		JFrame frame = new JFrame("Tic Tac Toe Board");

		frame.add(Board);
		frame.setSize(322,422);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		

}
