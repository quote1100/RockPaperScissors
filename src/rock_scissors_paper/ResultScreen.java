package rock_scissors_paper;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;



public class ResultScreen extends SelectionScreen {
	
	ResultScreen (String mode) {
		
	
		round++;
	
	JFrame ResultFrame = new JFrame();
	ResultFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	ResultFrame.setSize(870, 400);
	ResultFrame.setLocationRelativeTo(null);
	ResultFrame.setVisible(true);
		
	
	JLabel resultrock = new JLabel(new ImageIcon (this.getClass().getResource("/images/rock.jpg")));
	JLabel resultpaper = new JLabel(new ImageIcon (this.getClass().getResource("/images/paper.jpg")));
	JLabel resultscissors = new JLabel(new ImageIcon (this.getClass().getResource("/images/scissors.jpg")));
	
	JLabel AIresultrock = new JLabel(new ImageIcon (this.getClass().getResource("/images/rock.jpg")));
	JLabel AIresultpaper = new JLabel(new ImageIcon (this.getClass().getResource("/images/paper.jpg")));
	JLabel AIresultscissors = new JLabel(new ImageIcon (this.getClass().getResource("/images/scissors.jpg")));
	
	JLabel Uselectedrock = new JLabel ("You Selected Rock", SwingConstants.CENTER);
	Uselectedrock.setFont(new Font("arial",Font.PLAIN, 17));
	JLabel Uselectedpaper = new JLabel ("You Selected Paper", SwingConstants.CENTER);
	Uselectedpaper.setFont(new Font("arial",Font.PLAIN, 17));
	JLabel Uselectedscissors = new JLabel ("You Selected Scissors", SwingConstants.CENTER);
	Uselectedscissors.setFont(new Font("arial",Font.PLAIN, 17));
	
	JLabel AIselectedrock = new JLabel ("AI Selected Rock", SwingConstants.CENTER);
	AIselectedrock.setFont(new Font("arial",Font.PLAIN, 17));
	JLabel AIselectedpaper = new JLabel ("AI Selected Paper", SwingConstants.CENTER);
	AIselectedpaper.setFont(new Font("arial",Font.PLAIN, 17));
	JLabel AIselectedscissors = new JLabel ("AI Selected Scissors", SwingConstants.CENTER);
	AIselectedscissors.setFont(new Font("arial",Font.PLAIN, 17));
	
	JLabel resultwin = new JLabel ("You Win!", SwingConstants.CENTER);
	resultwin.setFont(new Font("arial",Font.PLAIN, 17));
	JLabel resultlose = new JLabel ("You Lose...", SwingConstants.CENTER);
	resultlose.setFont(new Font("arial",Font.PLAIN, 17));
	JLabel resultdraw = new JLabel ("Draw", SwingConstants.CENTER);
	resultdraw.setFont(new Font("arial",Font.PLAIN, 17));

	JLabel tryagain = new JLabel ("Click here to try Again", SwingConstants.CENTER);
	tryagain.setFont(new Font("arial",Font.PLAIN, 17));
	
		tryagain.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent tryagain) {
		
			if (mode.equals("easy mode")) {
				new RPCScreen("easy mode");
			}
			
			else if (mode.equals("hard mode")) {
				new RPCScreen("hard mode");
			}
		
			ResultFrame.setVisible(false);
			ResultFrame.dispose();
		}
	});
		

	JPanel UserPanel = new JPanel(new BorderLayout());
	JPanel AIPanel = new JPanel(new BorderLayout());
	JPanel winlosePanel = new JPanel(new GridLayout(2,1));
	
	ResultFrame.add(UserPanel,BorderLayout.WEST);
	ResultFrame.add(AIPanel,BorderLayout.EAST);
	ResultFrame.add(winlosePanel, BorderLayout.CENTER);
	
	// maybe use switch (Uval)??
	{
	if (Uval==1) {
		UserPanel.add(resultrock, BorderLayout.CENTER);
		UserPanel.add(Uselectedrock, BorderLayout.NORTH);
	}
	else if (Uval==2) {
		UserPanel.add(resultpaper, BorderLayout.CENTER);
		UserPanel.add(Uselectedpaper, BorderLayout.NORTH);
	}
	else if (Uval==3) {
		UserPanel.add(resultscissors, BorderLayout.CENTER);
		UserPanel.add(Uselectedscissors, BorderLayout.NORTH);
	}		
	
	}	
	
	
	if (AIval==1) {
		AIPanel.add(AIresultrock, BorderLayout.CENTER);
		AIPanel.add(AIselectedrock, BorderLayout.NORTH);			
	}
	else if (AIval==2) {
		AIPanel.add(AIresultpaper, BorderLayout.CENTER);
		AIPanel.add(AIselectedpaper, BorderLayout.NORTH);				
	}
	else if (AIval==3) {
		AIPanel.add(AIresultscissors, BorderLayout.CENTER);
		AIPanel.add(AIselectedscissors, BorderLayout.NORTH);	
	}
	

	WinningCondition wc = new WinningCondition();
	int wcnum=wc.wc(Uval, AIval);
	
	if (wcnum==4) {	
		winlosePanel.add(tryagain, JLabel.CENTER);
		winlosePanel.add(resultwin, JLabel.CENTER);
		
	}
	else if (wcnum==5) {
		winlosePanel.add(tryagain, JLabel.CENTER);
		winlosePanel.add(resultlose, JLabel.CENTER);
		
	}
	else if (wcnum==6) {
		winlosePanel.add(tryagain, JLabel.CENTER);
		winlosePanel.add(resultdraw, JLabel.CENTER);
	}	
	System.out.println(result);
	}
}
