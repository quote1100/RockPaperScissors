package rock_scissors_paper;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class RPCScreen implements ActionListener {	
	
	public RPCScreen (String title) {
		JFrame GameFrame = new JFrame();
		JLabel rockpic = new JLabel(new ImageIcon (this.getClass().getResource("/images/rock.jpg")));
		JLabel paperkpic = new JLabel(new ImageIcon (this.getClass().getResource("/images/paper.jpg")));
		JLabel scissorpic = new JLabel(new ImageIcon (this.getClass().getResource("/images/scissors.jpg")));
		
		GameFrame.add(rockpic);
		
		GameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GameFrame.setSize(276, 302);
		GameFrame.setLocationRelativeTo(null);
		GameFrame.setUndecorated(true);
		GameFrame.setVisible(true);

		// learn little more about using actionlistener, timer, acionperformed

		Timer timer1 = new Timer(1000, null);	
		timer1.start();
		
		timer1.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {

				rockpic.setIcon(null);
				GameFrame.add(paperkpic);
				timer1.stop();
				
				Timer timer2 = new Timer(1000,null);
				timer2.start();
				timer2.addActionListener(new ActionListener() {
					public void actionPerformed (ActionEvent ev) {

						paperkpic.setIcon(null);
						GameFrame.add(scissorpic);
						timer2.stop();

						Timer timer3 = new Timer (1000,null);
						timer3.start();
						timer3.addActionListener(new ActionListener() {
							public void actionPerformed (ActionEvent eve) {
								scissorpic.setIcon(null);
								GameFrame.setVisible(false);
								GameFrame.dispose();
								timer3.stop();
								

								if (title.equals("easy mode")) {
								
									new SelectionScreen ("easy mode");
								}
								
								if (title.equals("hard mode")) {
									
									new SelectionScreen("hard mode");
								}
								
							}
							
						});
						
					}
				});
			}
		});
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}