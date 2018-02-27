package Lab4;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Line2D;
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
	//Game logic function
	// who's turn
	// state of a board
	//redraw board based on state of change
	//check for victory/loss or draw
	//update instructions base on events
	
	int titleFontSize = 36;
	int InstructionsTitle = 24;
	int Instructions = 12;
	ArrayList<DrawX> xList = new ArrayList<DrawX>();
	ArrayList<DrawO> oList = new ArrayList<DrawO>();
	

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.black);
		// font is (font name, font.style, size)
		
		//TODO: 
		//update instructions
		//x's and o's snap to grid
		//draw a winning line
		
		
		g.setFont(new Font("Arial", Font.PLAIN, titleFontSize)); //alignment on the x coordinate
		g.drawString("Tic Tac Toe", 55 , ((50 - titleFontSize) / 2 + titleFontSize)); //coordinates represent bottom left of text
		
		
		for (DrawX thisX : xList){
			g.drawString("x", thisX.xCoord, thisX.yCoord);
		}
		
		for (DrawO thisO : oList){
			g.drawString("o", thisO.xCoord, thisO.yCoord);
		}
		Graphics2D g2 = (Graphics2D) g;
        Line2D Vline1 = new Line2D.Float(100, 75, 100, 325);
        g2.draw(Vline1);
        
        Line2D Vline2 = new Line2D.Float(200, 75, 200, 325);
        g2.draw(Vline2);
        
        Line2D Hline1 = new Line2D.Float(25, 150, 275, 150);
        g2.draw(Hline1);
        
        Line2D Hline2 = new Line2D.Float(25, 250, 275, 250);
        g2.draw(Hline2);
        
        
        g.setFont(new Font("Arial", Font.PLAIN, InstructionsTitle)); //alignment on the x coordinate
		g.drawString("Instructions", 90 , ((690 - InstructionsTitle) / 2 + InstructionsTitle));
		
		g.setFont(new Font("Arial", Font.PLAIN, Instructions)); //alignment on the x coordinate
		g.drawString("Click where you want to place your character.", 25 , ((725 - Instructions) / 2 + Instructions));
		g.drawString("First to get 3 in a row wins!", 75 , ((750 - Instructions) / 2 + Instructions));
		
		/*DrawX testX = new DrawX(200,200);
		g.drawString("X", testX.xCoord, testX.yCoord);
		
		DrawO testO = new DrawO(200,200);
		g.drawString("O", testO.xCoord, testO.yCoord);*/
		
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