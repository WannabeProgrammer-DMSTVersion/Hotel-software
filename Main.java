import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Main {
	public static void main(String args[]) {
		start();//καλείται η στατική μέθοδος start() για να ξεκινήσει το πρόγραμμα και 
		//να εμφανιστεί το αρχικό μενού επιλογών
	}

	public static void setValues() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Παρακαλω πληκτρολογήστε όνομα");
		String name = sc.nextLine();
		System.out.println("Παρακαλω πληκτρολογήστε ηλικία");
		double age = sc.nextDouble();
		System.out.println(
				"Παρακαλω δηλώστε αν ο υποψήφιος έχει προσκομίσει ιατρική βεβαίωση.\nΑπαντήστε με: 'ναι' ή 'όχι'");
		String healthy = sc.nextLine();
		healthy.toLowerCase();
		System.out.println("Παρακαλω πληκτρολογήστε αριθμό προηγούμενων εργασιακών εμπειριών");
		int jobs = sc.nextInt();
		System.out.println("Παρακαλω πληκτρολογήστε αν ο υποψήφιος είναι καπνιστής.\nΑπαντήστε με: 'ναι' ή 'όχι'");
		String smoker = sc.nextLine();
		smoker.toLowerCase();
		System.out.println("Παρακαλω πληκτρολογήστε αριθμό ξένων γλωσσών");
		int languages = sc.nextInt();
		System.out.println("Παρακαλω πληκτρολογήστε αν ο υποψήφιος έχει επισυνάψει φωτογραφία." +
       "\nΑπαντήστε με: 'ναι' ή 'όχι'");
		String photo = sc.nextLine();
		photo.toLowerCase();
		int[] Jobs1 = new int[jobs];
		String[]Lang1 = new String[languages];
		String[]Jobs2 = new String[jobs];
		String[]Lang2 = new String[languages];
			for (int j = 0; j < 2; j++) {
					System.out.println("Παρακαλώ πληκτρολογήστε το είδος της εργασίας νούμερο"+j);
					Jobs2[j] = sc.nextLine();
			}
					for (int i = 0; i < jobs; i++) {
				System.out.println(
						"Παρακαλώ γράψτε για πόσο καιρό έμεινε (σε μήνες) ο υποψήφιος στην εργασία νούμερο:  " + i);
				Jobs1[i] = sc.nextInt();
			}
		for (int i = 0; i < languages; i++) {
			System.out.println("Παρακαλώ γράψτε το όνομα της ξένης γλώσσας νούμερο" + i);
			Lang1[i] = sc.nextLine();
		}
			for (int k = 0; k < 2; k++) {
				System.out.println("Παρακαλώ γράψτε το επίπεδο ('άριστα' ή 'όχι άριστα')"
						+ " του υποψήφιου στη γλώσσα νούμερο" + k);
				Lang2[k] = sc.nextLine();//υποθέτουμε πως το ξενοδοχείο αναζητεί 
			}//υποψήφιους μόνο με άριστη γνώση ξένων γλωσσών
		Employee A = new Employee(name, age, jobs, healthy, smoker, languages, photo, Lang1, Lang2, Jobs1, Jobs2);
		ArrayList<String> character = new ArrayList<String>();
		String e = null;
		for (int u = 0; u < 15; u++) {
			character.add(e);
		}
	}

	public static void start() {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		System.out.println("Καλως Ορίσατε! Παρακαλώ επιλέξτε μια απο τις παρακάτω επιλογές:"
				+ "Πληκτρολογήστε : 1 για Αξιολόγηση Υπαλλήλων, 2 για τα Οικονομικά Στατιστικά,"
				+ "3 για Επικοινωνία Πελατών");
		try {
			a = sc.nextInt();
		} catch (InputMismatchException exception) {
			System.out.println("Κάτι πήγε στραβά...");
		}
		if (a != 1 && a != 2 && a != 3) {// ελέγχει αν είναι μέσα στα όρια η επιλογή
			System.out.println("Δεν υπάρχει τέτοια επιλογή!!!\nΞαναδωσε!!!\n");
			a = sc.nextInt();
			sc.nextLine();// χρειάζεται για να δουλέψει
		}
		switch (a) {
		case 1:
			setValues();//Καλεί την μέθοδο καταχώρησης τιμών για την αξιολόγηση υπαλλήλου
			System.out.println();
		case 2:
			System.out.println();
		case 3:
			System.out.println();
		}
	}
}
