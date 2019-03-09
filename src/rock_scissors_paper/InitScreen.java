package rock_scissors_paper;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class InitScreen{
	
	public InitScreen (String title){
	//GUI
	JFrame frame = new JFrame ();
	
	JPanel dpanel = new JPanel ();
	JLabel dlabel = new JLabel("SELECT DIFFICULTY");
	dlabel.setFont(new Font("arial",Font.PLAIN, 17));
	
	JButton ezbutton = new JButton ("Easy Bot");
	ezbutton.addActionListener(new ActionListener() {
		public void actionPerformed (ActionEvent e) {
			new RPCScreen("easy mode");
			frame.setVisible(false);
			frame.dispose();
		}
	});

	
	
	
	
	JButton hdbutton = new JButton ("Hard Bot");
	hdbutton.addActionListener(new ActionListener() {
		public void actionPerformed (ActionEvent e) {
			new RPCScreen("hard mode");
			frame.setVisible(false);
			frame.dispose();
		}
	});
	
	dpanel.add(ezbutton, BorderLayout.WEST);
	dpanel.add(hdbutton, BorderLayout.EAST);
		
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(200, 200);
	frame.setLocationRelativeTo(null);
	
	frame.setUndecorated(true);
	
	dlabel.setHorizontalAlignment(JLabel.CENTER);
	dlabel.setVerticalAlignment(JLabel.NORTH);
	
	frame.add(dlabel, BorderLayout.CENTER);
	frame.add(dpanel, BorderLayout.PAGE_END);
	
	frame.setVisible(true);
	}
}