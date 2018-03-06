import java.io.*;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main {
	
    private static void showUI() {
        JFrame frame = new JFrame("Project");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new UI());
        frame.pack();
        frame.setVisible(true);
        frame.setSize(700, 500);
    }
	
	public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	UIManager.put(UIManager.getSystemLookAndFeelClassName(), Boolean.FALSE); 
                showUI();
            }
        });    
    }
}