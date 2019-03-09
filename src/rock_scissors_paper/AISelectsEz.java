package rock_scissors_paper;

public class AISelectsEz extends AI{
	
	//AI makes there choice randomly.
	public AISelectsEz () {
		
		
		defaultvalAI=getRandomNumberIntRange (1,3);
		
		if (defaultvalAI==1){
			System.out.print("AI");
			this.defaultvalAI = ro.selectRock();
		}
		else
			if (defaultvalAI==2){
				System.out.print("AI");
				this.defaultvalAI = pa.selectPaper();
			}
			else
					if (defaultvalAI==3){
						System.out.print("AI");
						this.defaultvalAI = sc.selectScissors();
					}
	}
	
	

}
