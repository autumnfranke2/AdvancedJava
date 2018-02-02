package Swing;

import java.io.IOException;

import javax.swing.*;

public class Bowser {
	
	public static void main(String[] args) {
	JEditorPane browserPane = new JEditorPane();
	browserPane.setEditable(false);   

	try {
		browserPane.setPage("http://graceland.brightspace.com");
	  
	}
	catch (IOException e) {
		System.out.println("error loading page");
	
	} 

	JFrame browserWindow = new JFrame("Autumn Web Browser");
	browserWindow.add(browserPane);
	browserWindow.setSize(1200,900);
	browserWindow.setVisible(true);
	}
}

/*
 * java swing docs shows how to do tabs
 */
