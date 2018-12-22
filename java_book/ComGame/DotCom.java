import java.util.*;

public class DotCom{
  ArrayList<String> siteCoordinats = new ArrayList<String>();
  String nameOfSite = new String();

  public void setLocationCells(ArrayList<String> loc){
    siteCoordinats = loc;
  }

  public void setName(String name){
    nameOfSite = name;
  }

  public String checkUserMove(String guess){
    String result = "Loos. Try again";
    String userMove = guess;
    int positionOfCell = siteCoordinats.indexOf(userMove);

    if (siteCoordinats.contains(userMove) && (siteCoordinats.size() > 1 )){
      result = "You kill one cell";
      siteCoordinats.remove(userMove);
    }
    else if (siteCoordinats.contains(userMove) && (siteCoordinats.size() == 1 )) {
      result = "You demage " + nameOfSite + " site";
      siteCoordinats.remove(userMove);
    }

    return result;
  }

}