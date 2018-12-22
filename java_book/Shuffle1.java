public class Shuffle1{
	public static void main (String[] args){
		int i = 3;
		while (i>0) {
			
			if (i>2) {
				System.out.print("a");
			}

			i = i-1;
			System.out.print("-");

			if (i==2) {
				System.out.print("b c");
			}

			if (i==1) {
				System.out.print("d");
				i = i-1;
			}						
		}
	}
}