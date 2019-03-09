package rock_scissors_paper;

public class WinningCondition{
	int wc (int userID, int AIID) {

		//1 rock 2 paper 3 scissors

		if (userID==1 && AIID==1) {
			new Draw ();
			return SelectionScreen.result=6;
		}
	
		else if (userID==1 && AIID==2) {
			new Lose ();
			return SelectionScreen.result=5;
		}
		
		else if (userID==1 && AIID==3) {
			new Win ();
			return SelectionScreen.result=4;
		}
		
		else if (userID==2 && AIID==1) {
			new Win ();
			return SelectionScreen.result=4;
		}
	
		else if (userID==2 && AIID==2) {
			new Draw ();
			return SelectionScreen.result=6;
		}
		
		else if (userID==2 && AIID==3) {
			new Lose ();
			return SelectionScreen.result=5;
		}
		
		else if (userID==3 && AIID==1) {
			new Lose ();
			return SelectionScreen.result=5;
		}
	
		else if (userID==3 && AIID==2) {
			new Win ();
			return SelectionScreen.result=4;
		}
		
		else if (userID==3 && AIID==3) {
			new Draw ();
			return SelectionScreen.result=6;
			}
		
		return 0;
		
	}
	}