package no.hvl.dat100;

public class OppgaveO3 {

	public static void main(String[] args) {

		int n = 4;
		int ny = 1;
		int x = 2;

		if (n == 1) {
			System.out.println("1");
		}
		for (int i = 1; i < n; i++) {

			ny = ny * x;
			x++;
		}
		System.out.println(ny);

	}
}
