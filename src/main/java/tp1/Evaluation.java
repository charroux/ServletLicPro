package tp1;

public class Evaluation {

	String nom;
	float note;

	public Evaluation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Evaluation(String nom, float note) {
		super();
		this.nom = nom;
		this.note = note;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getNote() {
		return note;
	}

	public void setNote(float note) {
		this.note = note;
	}

}
