public class Autopack {
	Integer i;
	int j;

	public static void main(String[] args) {
		Autopack a = new Autopack();
		a.go();
	}

	public void go() {
		j=i;
		System.out.println(j);
		System.out.println(i);
	}
}