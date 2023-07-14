package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import code.compresser;
import code.decompresser;

public class AppFrame extends JFrame implements ActionListener {

	JButton compressButton;
	JButton decompressButton;
	JFrame frame;
	AppFrame(){
		frame = new JFrame();
		frame.setLayout(null);
		
		compressButton= new  JButton("select file to compress");
	    compressButton.setSize(200,50);
		compressButton.setLocation(250,180);
		compressButton.setBackground(Color.green);
		compressButton.addActionListener(this);
		
		decompressButton= new  JButton("select file to decompress");
		decompressButton.setSize(200,50);
		decompressButton.setLocation(500,180);
		decompressButton.setBackground(Color.green);
		decompressButton.addActionListener(this);
		
		frame.add(compressButton);
		frame.add(decompressButton);
		frame.setSize(1000,500);
		frame.getContentPane().setBackground(Color.black);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
      if(e.getSource()==compressButton)
      {

    	  JFileChooser filechooser = new JFileChooser();
    	  int response  = filechooser.showSaveDialog(null);
    	  if(response==JFileChooser.APPROVE_OPTION)
    	  {
    		  File file = new File(filechooser.getSelectedFile().getAbsolutePath());
    		  System.out.print(file);
    		  try
    		  {
    			  compresser.method(file);
    		  }
    		  catch(Exception ee)
    		  {
    			  JOptionPane.showMessageDialog(null,ee.toString());
    		  }
    	  }

      }

      if(e.getSource()==decompressButton)
      {
    	  JFileChooser filechooser = new JFileChooser();
    	  int response  = filechooser.showSaveDialog(null);
    	  if(response==JFileChooser.APPROVE_OPTION)
    	  {
    		  File file = new File(filechooser.getSelectedFile().getAbsolutePath());
    		  System.out.print(file);
    		  try
    		  {
    			  decompresser.method(file);
    		  }
    		  catch(Exception ee)
    		  {
    			  JOptionPane.showMessageDialog(null,ee.toString());
    		  }
    	  }

      }



	}

}
