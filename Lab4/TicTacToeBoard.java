package Lab4;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Font;

public class TicTacToeBoard extends JPanel {
	
	public TicTacToeBoard() {
	setSize(322,422);
	setBackground(Color.white);
	GameMouse gm = new GameMouse();
	addMouseListener(gm);
	

}
	int titleFontSize = 36;
	ArrayList<DrawX> xList = new ArrayList<DrawX>();
	ArrayList<DrawO> oList = new ArrayList<DrawO>();
	

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.black);
		// font is (font name, font.style, size)
		g.setFont(new Font("Arial", Font.PLAIN, titleFontSize)); //alignment on the x coordinate
		g.drawString("Tic Tac Toe", 0 , ((50 - titleFontSize) / 2 + titleFontSize)); //coordinates represent bottom left of text
		
		
		for (DrawX thisX : xList){
			g.drawString("x", thisX.xCoord, thisX.yCoord);
		}
		
		for (DrawO thisO : oList){
			g.drawString("o", thisO.xCoord, thisO.yCoord);
		}
		
		/*DrawX testX = new DrawX(200,200);
		g.drawString("X", testX.xCoord, testX.yCoord);
		
		DrawO testO = new DrawO(200,200);
		g.drawString("O", testO.xCoord, testO.yCoord);*/
		}
	
	
	
	/* Creates Tic Tac Toe Board */
	
	public void boardPane() {
		final JPanel TTTBoard = new JPanel();
		
		GridLayout board2 = new GridLayout(3,3);
		
		TTTBoard.setLayout(board2);
		
	}
	
	class GameMouse implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println(e.getX() + "" + e.getY());
			DrawX x = new DrawX(e.getX()-10, e.getY()+10);
			xList.add(x);
			repaint();
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
		}

		@Override
		public void mouseReleased(MouseEvent e) {
		}

		@Override
		public void mouseEntered(MouseEvent e) {
		}

		@Override
		public void mouseExited(MouseEvent e) {
		}
		
	}
	
	class DrawX {
		int xCoord = 200;
		int yCoord = 200;
		
		public DrawX(int xCoord, int yCoord) {
			this.xCoord = xCoord;
			this.yCoord = yCoord;
		}
	}
	
	class DrawO {
		int xCoord = 200;
		int yCoord = 200;
		
		public DrawO(int xCoord, int yCoord) {
			this.xCoord = xCoord;
			this.yCoord = yCoord;
		}
	}
	/*
	 * class to alternate
	 * while loop: while game isnt won alternate through x's and o's
	 * if x starts alternate 9 times starting with x
	 * if o starts alternate 9 times starting with o
	 */
}