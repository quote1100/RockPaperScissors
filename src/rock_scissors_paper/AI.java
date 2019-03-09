package rock_scissors_paper;
import java.util.*;

public class AI {
	
	// each int from 1 to 3 indicate rock, paper, or scissors.
	protected int defaultvalAI;

	
	Rock ro = new Rock ();
	Paper pa = new Paper ();
	Scissors sc = new Scissors ();
	
	int PlayerSelectsRock () {
		//value for rock is 1
		return this.defaultvalAI = ro.selectRock();
	}

	int PlayerSelectsPaper () {
		//value for paper is 2
		return this.defaultvalAI = pa.selectPaper();
	}

	int PlayerSelectsScissors () {
		//value for scissors is 3
		return this.defaultvalAI = sc.selectScissors();
	}
	
	//get value for AI
	public int getdefaultvalAI () {
		return this.defaultvalAI;
	}
	
	//random number generator method
	protected static int getRandomNumberIntRange (int min, int max) {
		if (min >= max){
			throw new IllegalArgumentException ("Max must be greater than min");
			}
	
		Random r = new Random ();
		return r.nextInt((max-min)+1)+min;
		}
	
	//random number with percentage.
	protected static int getNormalDistribution (int proba, int probb, int probc) {
		int a=1; //rock
		int b=2; //paper
		int c=3; //scissors
		int d = 0;   //returned number
		int sum = proba+probb+probc;
	
		
		try {
			Random r2 = new Random();
			int r100 = r2.nextInt(sum);
		
			if (r100<proba){
				d=a;
				}
				else if (r100>=proba&&r100<(probb+proba)){
					d=b;
					}
				else if (r100>=(proba+probb)&&r100<(proba+probb+probc)){
					d=c;
					}
			if (sum!=100) {
				throw new ProbHasToBeNonZeroException();
			}
			if (proba<0 || probb<0 || probc<0){
				throw new ProbHasToBeNonZeroException();
			}
		
		}
		catch (Exception e){
			System.out.println("sum of probability has to be hundred and probability cannot be a negative number");
			
		}
		
		return d;
		
	}


	
/* according to a research, first round will be purely random with no pattern. However, on the second round, 
 * the player will want to continue with the same choice if the player won the first round. If he (or she) lost the first round,
 * they typically want to change their decision. They want to change in order of rock paper scissors.
 * If they lost with scissors, their next choice is more likely going to be rock. 
 * If it was rock then paper. If it was paper then scissors. This will be incorporated to the AI
 * Another research shows that 
 */
}