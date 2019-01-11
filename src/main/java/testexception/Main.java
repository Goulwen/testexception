package testexception;

import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		Personne p1 = new Personne();
		//p1.setDateNaissance(Calendar.getInstance().getTime());
		
		try {
			boolean age;
			age = p1.valide();
			System.out.println(age);
		} catch (Exception e) {
			System.out.println("Une erreur est survenue : " + e.getMessage());
		}
		System.out.println("c'est fini");
	}

}
