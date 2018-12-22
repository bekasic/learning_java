public class SimpleDotComGame {
	public static void main (String[] args){
//Get user data from cmd
//Call checkYourself with user data 		
		int tryings = 0;
		boolean gameIsRun = true;
		SimpleDotCom game = new SimpleDotCom(); 
		GameHelper helper = new GameHelper();
	
		int randomNum = (int)(Math.random()*5);
		System.out.println(randomNum);
		int[] siteCoordinats = {randomNum, randomNum+1, randomNum+2};
		//int[] siteCoordinats = (randomNum, randomNum+1, randomNum+2);
		
		game.setLocationCells(siteCoordinats);

		while (gameIsRun == true){
	 		String guessInput = helper.getUserInput("Please input your value"); 
	 		game.checkYourself(guessInput);
	 		tryings++;
			if (game.numOfHits == siteCoordinats.length) {
	 			gameIsRun = false;
	 			System.out.println("Tryings, those you needed: " + tryings);
	 		} 
		}

	}
}