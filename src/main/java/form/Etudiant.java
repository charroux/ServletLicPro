package form;

public class Etudiant {
	
	String nom;
	String age;
	
	public Etudiant(String nom, String age) {
		super();
		this.nom = nom;
		this.age = age;
	}

	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	

}
