//создает 3 объекта DotCom
//Передает DotCom данные о местоположении
//Передает DotCom ходы пользователя
import java.util.*;

public class TestDotCom {
	public static void main(String[] args) {
		String testResult = "Some Error";
		DotCom testSite = new DotCom();
		String name = "Test.com";
		
		ArrayList<String> testCoordinats = new ArrayList<String>();
		testCoordinats.add("A1");
		testCoordinats.add("A2");
		testCoordinats.add("A3");

		String testUserMove1 = "A2";
		String testUserMove2 = "A1";
		String testUserMove3 = "A1";
		String testUserMove4 = "A3";

		testSite.setLocationCells(testCoordinats);
		testSite.setName("Test Site");

		String testResult1 = testSite.checkUserMove(testUserMove1);
		String testResult2 = testSite.checkUserMove(testUserMove2);
		String testResult3 = testSite.checkUserMove(testUserMove3);
		String testResult4 = testSite.checkUserMove(testUserMove4);

		System.out.println(testResult1);
		System.out.println(testResult2);
		System.out.println(testResult3);
		System.out.println(testResult4);

	}
}
