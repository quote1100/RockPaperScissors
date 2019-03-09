package rock_scissors_paper;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SelectionScreen {
//	AISelectsEz ai1;
	protected static int AIval;
	protected static int Uval;
	static int round=1;
	public static int result = 0;	
	
	void setAIval (int a) {
		AIval=a;
	}
	
	SelectionScreen(){
		
	}
	
	SelectionScreen (String Selectscreenis) {
		System.out.println("Round " + round);
	
		if (round==1) {
			System.out.println(Selectscreenis);
		}
		else if (round>1) {
			
		}
		
		
		JFrame select = new JFrame();
		
		JLabel rockpic = new JLabel(new ImageIcon (this.getClass().getResource("/images/rock.jpg")));
		
		rockpic.addMouseListener(new MouseAdapter() {
			public void mouseClicked (MouseEvent rock) {
				User uselectsrock = new User();
				Uval=uselectsrock.PlayerSelectsRock();

				if (Selectscreenis.equals("easy mode")) {
					AISelectsEz ai1 = new  AISelectsEz();	
					setAIval (ai1.getdefaultvalAI());					
				}
				
				else if (Selectscreenis.equals("hard mode")&&round==1) {
					AISelectsEz ai2 = new AISelectsEz();
					setAIval (ai2.getdefaultvalAI());
				}
				
				else if (Selectscreenis.equals("hard mode")&&round>1) {
					if (result == 4) {
						//won with rock ai= rock, player= scissors
						//player will likely choose rock next round. Thus ai select paper
						AISelectsHd ai3 = new AISelectsHd(25,50,25);
						setAIval (ai3.getdefaultvalAI());		
					}
					else if (result == 5) {
						//lost with rock
						AISelectsHd ai4 = new AISelectsHd (25,25,50);
						setAIval (ai4.getdefaultvalAI());
					}
					else if (result == 6) {
						//drew with rock
						AISelectsHd ai4 = new AISelectsHd (25,25,50);
						setAIval (ai4.getdefaultvalAI());
					}
				}
				
				if (Selectscreenis.equals("easy mode")) {
					new ResultScreen("easy mode");	
				}
				else if (Selectscreenis.equals("hard mode")) {
					new ResultScreen("hard mode");
				}
				
				select.setVisible(false);
				select.dispose();
			}
			});
		
		JLabel paperkpic = new JLabel(new ImageIcon (this.getClass().getResource("/images/paper.jpg")));

		paperkpic.addMouseListener(new MouseAdapter() {
			public void mouseClicked (MouseEvent paper) {
				User uselectspaper = new User();
				Uval=uselectspaper.PlayerSelectsPaper();

				if (Selectscreenis.equals("easy mode")) {
					AISelectsEz ai5 = new  AISelectsEz();	
					setAIval (ai5.getdefaultvalAI());
				}
				
				else if (Selectscreenis.equals("hard mode")&&round==1) {
					AISelectsEz ai6 = new AISelectsEz();
					setAIval (ai6.getdefaultvalAI());					
				}
				
				else if (Selectscreenis.equals("hard mode")&&round>1) {
					if (result == 4) {
						AISelectsHd ai7 = new AISelectsHd(25,25,50);
						setAIval (ai7.getdefaultvalAI());		
					}
					else if (result == 5) {
						AISelectsHd ai8 = new AISelectsHd (50,25,25);
						setAIval (ai8.getdefaultvalAI());
					}
					else if (result == 6) {
						AISelectsHd ai9 = new AISelectsHd (50,25,25);
						setAIval (ai9.getdefaultvalAI());
					}
				}
				
				if (Selectscreenis.equals("easy mode")) {
					new ResultScreen("easy mode");	
				}
				else if (Selectscreenis.equals("hard mode")) {
					new ResultScreen("hard mode");
				}
				
				select.setVisible(false);
				select.dispose();
			}
			});

		JLabel scissorpic = new JLabel(new ImageIcon (this.getClass().getResource("/images/scissors.jpg")));

		scissorpic.addMouseListener(new MouseAdapter() {
			public void mouseClicked (MouseEvent scissors) {
				User uselectsscissors = new User();
				Uval=uselectsscissors.PlayerSelectsScissors();
		
				if (Selectscreenis.equals("easy mode")) {
					AISelectsEz ai10 = new  AISelectsEz();	
					setAIval (ai10.getdefaultvalAI());					
				}
				
				else if (Selectscreenis.equals("hard mode")&&round==1) {
					AISelectsEz ai11 = new AISelectsEz();
					setAIval (ai11.getdefaultvalAI());
					}
				
				else if (Selectscreenis.equals("hard mode")&&round>1) {
					if (result == 4) {
						AISelectsHd ai12 = new AISelectsHd(50,25,25);
						setAIval (ai12.getdefaultvalAI());		
					}
					else if (result == 5) {
						AISelectsHd ai13 = new AISelectsHd (25,50,25);
						setAIval (ai13.getdefaultvalAI());
					}
					else if (result == 6) {
						AISelectsHd ai14 = new AISelectsHd (25,50,25);
						setAIval (ai14.getdefaultvalAI());
					}
				}
				
				if (Selectscreenis.equals("easy mode")) {
					new ResultScreen("easy mode");	
				}
				else if (Selectscreenis.equals("hard mode")) {
					new ResultScreen("hard mode");
				}
				
				select.setVisible(false);
				select.dispose();
			}
			});
		
		JPanel rpc = new JPanel();
		rpc.add (rockpic, BorderLayout.WEST);
		rpc.add (paperkpic, BorderLayout.CENTER);
		rpc.add (scissorpic, BorderLayout.EAST);
		
		JLabel textselect = new JLabel ("Make your selection now !");
		textselect.setFont(new Font("arial",Font.PLAIN, 27));
		
		JPanel selectionPanel = new JPanel();
		selectionPanel.add(textselect, BorderLayout.NORTH);
		
		
		select.add(selectionPanel, BorderLayout.NORTH);
		select.add(rpc, BorderLayout.SOUTH);
		
		select.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		select.setSize(870, 400);
		select.setLocationRelativeTo(null);
		select.setVisible(true);
			
	}
}