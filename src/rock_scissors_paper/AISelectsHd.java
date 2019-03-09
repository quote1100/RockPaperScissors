package rock_scissors_paper;

public class AISelectsHd extends AI{
	
	AISelectsHd (int a, int b, int c) {
		
		defaultvalAI=getNormalDistribution(a,b,c);
		
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
