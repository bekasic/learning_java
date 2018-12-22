import java.util.*;

public class DotComGame {
		private int tryings = 0;
		private GameHelper helper = new GameHelper();
		private ArrayList<DotCom> sites = new ArrayList<DotCom>();

		private void setUpGame(){
			DotCom site1 = new DotCom();
			site1.setName("AAA.com");
			DotCom site2 = new DotCom();
			site2.setName("BBB.com");
			DotCom site3 = new DotCom();
			site3.setName("CCC.com");

			sites.add(site1);
			sites.add(site2);
			sites.add(site3);

			for (DotCom site : sites){
				site.setLocationCells(helper.placeDotCom(3));
			}
			
			System.out.println("You must kill three sites: AAA.com, BBB.com, CCC.com");
		}

		private void startGame(){
			while (sites.size() != 0){
				String guessInput = helper.getUserInput("Please input your value");
				checkInputMove(guessInput);
				tryings++;
			}
			finishGame();
		}

		private void checkInputMove(String guess){
			String responseOfGame = new String();
			for (DotCom site : sites){
				//For Debug:
				//System.out.println(site.siteCoordinats); 
				responseOfGame = site.checkUserMove(guess);
				if (responseOfGame.equals("You kill one cell")){
					break;
				}
				if (responseOfGame.equals("You demage " + site.nameOfSite + " site")){
					sites.remove(site);
					break;	
				}
			}
			System.out.println(responseOfGame);
		}

		private void finishGame(){
			System.out.println("Tryings, those you needed: " + tryings);
		}
		
	public static void main(String[] args) {
		DotComGame game = new DotComGame();
		game.setUpGame();
		game.startGame();
	}
}