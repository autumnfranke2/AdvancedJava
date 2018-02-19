package Lab4;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Font;

TicTacToeBoard extends JPanel {
	
	public TicTacToeBoard() {
	setSize(322,422);
	setBackground(Color.white);
	
	Int titleFontSize = 36;

}

	public void paintComponent(Graphic g){
		super.paintComponent(g);
		g.setColor(Color.black);
		// font is (font name, font.style, size)
		g.setFont(new Font(Arial, Font.PLAIN, titleFontSize)); //alignment on the x coordinate
		g.drawString(“TicTacToe”, 0 , ((50 - titleFontSize) / 2 + titleFontSize)); //coordinates represent bottom left of text

}
}