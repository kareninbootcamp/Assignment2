package theDiceGame;

import java.util.Random;

/*A single die is rolled and the number showing is adding up but only until the number 1 is rolled. 
When the 1 comes up, the game is over and the accumulated total is displayed to the user. 
The final 1 does NOT get included in the total.*/

//int die = rnd.nextInt(5)+1;

public class DiceGame {
	
	public void run(){
		
		System.out.printf("Your roll is %i");


	}
	//we initialized 3 variables, min - max and totalRolls to keep track 
	public static void main(String[] args) {
		int min = 0;
		int max = 0;
		int totalRolls = 0; 
		//created the long see to get the random
		long seed = (new java.util.Date()).getTime();
		java.util.Random rnd = new java.util.Random(seed);
		//loop through the dice game by initializing a variable to zero incrementing it by 1 every iteration
		for(int i = 0; i < 100; i++){
			//here we keep track of the total* game was played
			totalRolls = i + 1;
			//instantiate a new class of RollOnedie
			RollOnedie rollOneDie = new RollOnedie();
			//initialize variable total and set it equal to the results of RollOneDie method
			int total = rollOneDie.roll1die(rnd);
			//
			if (min == 0 && total != 0){
				min = total;
			}
			if (min > total){
				min = total;
			}
			if (max < total){
				max = total;
			}
		}
		
		
		
		System.out.printf("Total number of rolls was %d\n", totalRolls);
		System.out.printf("Minimum score is %d\n", min);
		System.out.printf("Maximum score is %d\n", max);
		
		
	

	}
	
}

	class RollOnedie{
		int total = 0; //declared and intitialized
		int die = 0; //variable that represents the die
		
		
		public int roll1die(Random rnd){
		while(die != 1) {
			die = rnd.nextInt(6) + 1; //roll the die and then add the condition
			//put an if in here
			if (die != 1){
				total += die; //add total to the die
			}
			
							
		    // do something
		}
		return total;
		}
		
}


