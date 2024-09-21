package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveO1 {

	public static void main(String[] args) {
		int kar;
		for (int i = 0; i < 10; i++) {

			do {
				kar = parseInt(showInputDialog("karakter"));
				if (kar > 100 || kar < 0) {
					showMessageDialog(null, "error");
				}

			} while (kar > 100 || kar < 0);

			String navn = showInputDialog("Navn");

			if (kar <= 100 && kar >= 90) {
				System.out.println("A - " + navn);
			}
			if (kar <= 89 && kar >= 80) {
				System.out.println("B - " + navn);
			}
			if (kar <= 79 && kar >= 60) {
				System.out.println("C - " + navn);
			}
			if (kar <= 59 && kar >= 50) {
				System.out.println("D - " + navn);
			}
			if (kar <= 49 && kar >= 40) {
				System.out.println("E - " + navn);
			}
			if (kar <= 39 && kar >= 0) {
				System.out.println("F - " + navn);
			}

		}

	}

}
