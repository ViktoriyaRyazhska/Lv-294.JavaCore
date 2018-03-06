import java.io.*;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class UI extends JPanel
                             implements ActionListener {
	
	private JList list1;
	private DefaultListModel listModel;
	private static final long serialVersionUID = 1L;
	static private final String newline = "\n";
    	JButton browsebutton;
    	JTextArea log;
    	JFileChooser fc;
    
    public UI() {
        super(new BorderLayout());
        
        listModel = new DefaultListModel();
        list1 = new JList(listModel);
        list1.setSize(100, 100);
        list1.setSelectionMode(
                ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        log = new JTextArea(100,100);
        log.setMargin(new Insets(5,5,5,5));
        log.setEditable(false);
        JScrollPane logScrollPane = new JScrollPane(log);
        logScrollPane.add(list1);
        
        fc = new JFileChooser();
        
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        browsebutton = new JButton("Browse");
        browsebutton.addActionListener(this);

        JPanel buttonPanel = new JPanel(); 
        buttonPanel.add(browsebutton);


        add(buttonPanel, BorderLayout.PAGE_START);
        add(new JScrollPane(list1), BorderLayout.CENTER);
    }
        
        
        public void actionPerformed(ActionEvent e) {


            if (e.getSource() == browsebutton) {
            	
                int returnVal = fc.showOpenDialog(UI.this);

                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File file = fc.getSelectedFile();
                    

                    Map<String, List<String>> lists = new HashMap<String, List<String>>();
                    Finder.find(lists, file);
                    
                    listModel.addElement("Duplicates in   " + file.getParent()+ "\\" + file.getName());
                    
                    for (List<String> list : lists.values()) {
                       if (list.size() > 1) {
                    	   listModel.addElement("--");
                    	   listModel.addElement("Duplicates Found");
                           for (String file1 : list) {
                               listModel.addElement(file1);
                           }
                       }
                   }
                   listModel.addElement("--");
                   
                   list1.addMouseListener(new MouseAdapter() {
                	    public void mouseClicked(MouseEvent evt) {
                	        JList list = (JList)evt.getSource();
                	        if (evt.getClickCount() == 2) {
                	            int index = list.locationToIndex(evt.getPoint());
                	            String str = listModel.getElementAt(index).toString();
                	            
                	            	if(new File(str)!=null)
    					try {
    						Desktop.getDesktop().open(new File(str).getParentFile());
    					} catch (Exception e) {
    					}
                	        } else if (evt.getClickCount() == 3) { 
                	            int index = list.locationToIndex(evt.getPoint());
                	            System.out.println(index);
                	        }            	       
                	    }           	    
                	});     
                } 
                else {
                    log.append("Browse command cancelled by user." + newline);
                }
                log.setCaretPosition(log.getDocument().getLength());
            } 
        }
    }