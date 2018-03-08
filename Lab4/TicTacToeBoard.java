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
	
	private char snapGrid[][];
	boolean isFull = true;
	int titleFontSize = 36;
	int InstructionsTitle = 24;
	int Instructions = 12;
	ArrayList<DrawX> xList = new ArrayList<DrawX>();
	ArrayList<DrawO> oList = new ArrayList<DrawO>();
	
	public TicTacToeBoard() {
	snapGrid = new char[3][3];
	setSize(322,422);
	setBackground(Color.white);
	GameMouse gm = new GameMouse();
	addMouseListener(gm);
	}
	

	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.black);
		// font is (font name, font.style, size)
		
		//TODO: 
		//alternate x's and o's
		//draw a winning line
		//Game logic function:
			// who's turn
			// state of a board
			//redraw board based on state of change
			//check for victory/loss or draw
			//update instructions base on events
		
		
		g.setFont(new Font("Arial", Font.PLAIN, titleFontSize)); //alignment on the x coordinate
		g.drawString("Tic Tac Toe", 55 , ((50 - titleFontSize) / 2 + titleFontSize)); //coordinates represent bottom left of text
		
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
	}
	
		//checks the board to see if its empty or not
	public boolean FullBoard() {
		for(int s = 0; s<3; s++) {
			for(int q = 0; q<3; q++) {
				if(snapGrid[s][q] == '0') {
					isFull = false;
				}
			}		
		}
			return isFull;
	}	
	
	
	// checks for an overall win
	private boolean Win() {
		return(rowWin() || columnWin() || diagonalWin());
	}
	
	
	// if its 3 in a row
	private boolean rowWin() {
		for(int r = 0; r<3; r++) {
			if(rowCol(snapGrid[r][1],snapGrid[r][2],snapGrid[r][3]) == true) {
				return true;
			}
		}
		return false;
	}
	
	
	// if its 3 in a column
	private boolean columnWin() {
		for(int r = 0; r<3; r++) {
			if(rowCol(snapGrid[1][r],snapGrid[2][r],snapGrid[3][r]) == true) {
				return true;
			}
		}
		return false;
	}
	
	
	// if its 3 in a diagonal
	private boolean diagonalWin() {
		return(rowCol(snapGrid[1][1], snapGrid[2][2], snapGrid[3][3]) == true) & 
				(rowCol(snapGrid[1][3], snapGrid[2][2], snapGrid[3][1]) == true);
	}
	
	
	private boolean rowCol(char rc1, char rc2, char rc3) {
		return ((rc1 != '0') && (rc1 == rc2) && (rc2 == rc3));
	}
	
	class GameMouse implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			boolean XDraw = false;
			
			
			if (e.getX()<=0 & e.getX()<=75) {
				if(e.getY()<=150) {
					
				}
				else if (e.getY()<=150 & e.getY()<=250){
					
				}
				else{
					
				}
			}
			else if (e.getX()>=75 & e.getX()<=100) {
				if(e.getY()<=150) {
				}
				else if (e.getY()<=150 & e.getY()<=250){
					
				}
				else{
					
				}
			}
			else if (e.getX()>=100) {
				if(e.getY()<=150) {
				}
				else if (e.getY()<=150 & e.getY()<=250){
					
				}
				else{
					
				}
			}
			
			if(XDraw = false) {
				DrawX x = new DrawX(e.getX()-10, e.getY()+10);
			}
			else{
				DrawO o = new DrawO(e.getX()-10, e.getY()+10);
				XDraw = false;
			}
			/*System.out.println(e.getX() + "" + e.getY());
			DrawX x = new DrawX(e.getX()-10, e.getY()+10);
			xList.add(x);
			repaint();*/
			
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
	void DrawXs(Graphics g) {
		for (DrawX thisX : xList){
			g.drawString("x", thisX.xCoord, thisX.yCoord);
		}
	}
	
	
	void DrawYs(Graphics g) {
		for (DrawO thisO : oList){
			g.drawString("o", thisO.xCoord, thisO.yCoord);
		}
	}
}