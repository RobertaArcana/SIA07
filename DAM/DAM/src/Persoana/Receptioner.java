package Persoana;

public class Receptioner {

	private Integer idReceptioner;
	private String nume;
	private String prenume;
	private String nrTel;
	
	public Integer getIdReceptioner() {
		return idReceptioner;
	}
	public void setIdReceptioner(Integer idReceptioner) {
		this.idReceptioner = idReceptioner;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public String getNrTel() {
		return nrTel;
	}
	public void setNrTel(String nrTel) {
		this.nrTel = nrTel;
	}
	
	public Receptioner() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Receptioner(Integer idReceptioner, String nume, String prenume, String nrTel) {
		super();
		this.idReceptioner = idReceptioner;
		this.nume = nume;
		this.prenume = prenume;
		this.nrTel = nrTel;
	}
	
}
