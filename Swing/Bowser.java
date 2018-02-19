package Swing;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class Bowser {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
	
	String gu = "http://graceland.brightspace.com";
	
	
	JTabbedPane tabbedPane = new JTabbedPane();
	
	JEditorPane browserPane = new JEditorPane();
	browserPane.setEditable(false);
	
	JEditorPane browserPane2 = new JEditorPane();
	browserPane.setEditable(false);
	
	JEditorPane browserPane3 = new JEditorPane();
	browserPane.setEditable(false);
	
	JTextField textArea = new JTextField();
	
	JButton button = new JButton("Go!!!!");
	JButton backbutton = new JButton("<-");
	
	ArrayList<URL> previousPage = new ArrayList<URL>();
	
	textArea.setText("Enter a URL: ");

	
	/* tabs */
	JFrame browserWindow = new JFrame("Autumn's Web Browser");
	tabbedPane.addTab("Tab 1",  null, browserPane, "Does Nothing");
	tabbedPane.addTab("Tab 2",  null, browserPane2, "Does Nothing");
	tabbedPane.addTab("Tab 3",  null, browserPane3, "Does Nothing");
	
	
	/* search bar and placement  and loading a web page*/
	textArea.setBounds(20, 0, 1000, 20);
	button.setBounds(1100, 0, 50, 20);
	button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				browserPane3.setPage(textArea.getText());  /* action listener will make this work */
			}
			catch (IOException e1) {
				System.out.println("error loading page");
			
			}}});
	
	
	/*Back Button */
	backbutton.setBounds(0,0,20,20);
	previousPage.add(browserPane3.getPage());
	button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					try {
						browserPane3.setPage(previousPage.get(0));
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				previousPage.remove(0);
				}});
	
		
	try {
		browserPane.setPage("http://www.google.com");
		browserPane2.setPage(gu);  
	}
	catch (IOException e) {
		System.out.println("error loading page");	
	}

	
	browserPane3.add(button);
	browserPane3.add(textArea);
	browserPane3.add(backbutton);
	browserWindow.add(tabbedPane);
	browserWindow.setSize(1200,900);
	browserWindow.setVisible(true);
	browserWindow.setDefaultCloseOperation(browserWindow.EXIT_ON_CLOSE);	
}
}