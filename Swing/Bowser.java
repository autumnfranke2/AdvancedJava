package Swing;

import java.io.IOException;
import java.awt.event.ActionEvent;
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


	try {
		browserPane.setPage("http://www.google.com");
		browserPane2.setPage(gu);  
		browserPane3.setPage(textArea.getText());  /* action listener will make this work */
	}
	catch (IOException e) {
		System.out.println("error loading page");
	
	}


	JFrame browserWindow = new JFrame("Autumn's Web Browser");
	tabbedPane.addTab("Tab 1",  null, browserPane, "Does Nothing");
	tabbedPane.addTab("Tab 2",  null, browserPane2, "Does Nothing");
	tabbedPane.addTab("Tab 3",  null, browserPane3, "Does Nothing");
	
	
	

	browserWindow.add(tabbedPane);
	browserWindow.setSize(1200,900);
	browserWindow.setVisible(true);
	browserWindow.action(null, textArea);
	}

	
}

/*
 * java swing docs shows how to do tabs
 * 
 * Create a textArea that accepts a url, as well as a button that allows 
 * the page to load the contents of that URL.

Create a back button that allows the user to navigate to a previously visited page

Make the browser have an appealing appearance.

Make your java application terminate when you close the browser window.

 */
