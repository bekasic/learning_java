public class SimpleDotCom {
	int[] locationCells;
	int numOfHits = 0;

	public void setLocationCells(int[] locs){
		locationCells = locs;
	}

	public String checkYourself(String guess) {
		//this method get user string number of cell and return status of hill
		String result = "Loos. Try again";
		int guessLocation = Integer.parseInt(guess);
		
		for (int cell :	locationCells){
			if (guessLocation == cell) {
				numOfHits++;
				result = "You kill one cell";
				break;
			}

		}

		if (numOfHits == locationCells.length) {
			result = "You win!!! Game is over";
		}

		System.out.println(result);
		return result;
	}

}