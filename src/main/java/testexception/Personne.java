package testexception;

import java.util.Date;

public class Personne {

	public Date dateNaissance;

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public int getAge() throws Exception {
		if (dateNaissance == null)
			throw new Exception("La date de naissance n'est pas renseignée");
		else
			return 42;
	}

	public boolean valide() throws Exception {
		//...
		try  {
			getAge();
			System.out.println("ici");
		}
		finally {
			System.out.println("là");
		}
		//...
		return true;
	}
}
