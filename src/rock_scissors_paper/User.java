package rock_scissors_paper;

public class User {

	private int defaultvaluser = 0;

	Rock ro = new Rock ();
	Paper pa = new Paper ();
	Scissors sc = new Scissors ();

	int PlayerSelectsRock () {
		System.out.print("You");
		return this.defaultvaluser = ro.selectRock();
	}

	int PlayerSelectsPaper () {
		System.out.print("You");
		return this.defaultvaluser = pa.selectPaper();
	}

	int PlayerSelectsScissors () {
		System.out.print("You");
		return this.defaultvaluser = sc.selectScissors();
	}
	
	
	public int getdefaultvaluser () {
		return defaultvaluser; 
	}
}