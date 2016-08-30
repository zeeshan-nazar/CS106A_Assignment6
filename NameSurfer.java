/*
 * File: NameSurfer.java
 * ---------------------
 * When it is finished, this program will implements the viewer for
 * the baby-name database described in the assignment handout.
 */

import acm.program.*;
import acm.util.ErrorException;

import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.*;

public class NameSurfer extends ConsoleProgram implements NameSurferConstants {

	
	private JLabel name;
	private JTextField text;
	private JButton graph;
	private JButton clear;
	String line;
	private NameSurferEntry obj = new NameSurferEntry(line);
/* Method: init() */
/**
 * This method has the responsibility for reading in the data base
 * and initializing the interactors at the bottom of the window.
 */
	private void readfile(){
		try{
			BufferedReader rd = new BufferedReader(new FileReader("names-data.txt"));
			while(true) {
				 String line = rd.readLine();
				if(line == null) 
					{
						break;
					}
				
			}
			
			
			rd.close();
		} catch(IOException ex) {
				throw new ErrorException(ex);
			}
		System.out.println(line);
	}
	public void init() {
	    // You fill this in, along with any helper methods //
		readfile();
		name = new JLabel("Name");
		add(name,NORTH);
		text = new JTextField(30);
		add(text,NORTH);
		text.addActionListener(this);
		graph = new JButton("Graph");
		add(graph,NORTH);
		clear = new JButton("Clear");
		add(clear,NORTH);
		addActionListeners();

	}

/* Method: actionPerformed(e) */
/**
 * This class is responsible for detecting when the buttons are
 * clicked, so you will have to define a method to respond to
 * button actions.
 */
	public void actionPerformed(ActionEvent e) {
		// You fill this in //
		if(e.getSource() == graph){
			println("Graph: " + text.getText());
		}
		else if(e.getSource() == text){
			println("Graph: " + text.getText());
		}
		else if(e.getSource() == clear){
			println("Clear");
		}
		
		 
	}
}
