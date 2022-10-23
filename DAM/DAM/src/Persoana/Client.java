package Persoana;

public class Client {
	
	private String cnp;
	private String nume;
	private String prenume;
	private String nrTel;
	private String adresa;
	private String tara;
	private String actIdentitate;
	
	public String getCnp() {
		return cnp;
	}
	public void setCnp(String cnp) {
		this.cnp = cnp;
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
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public String getTara() {
		return tara;
	}
	public void setTara(String tara) {
		this.tara = tara;
	}
	public String getActIdentitate() {
		return actIdentitate;
	}
	public void setActIdentitate(String actIdentitate) {
		this.actIdentitate = actIdentitate;
	}
	
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Client(String cnp, String nume, String prenume, String nrTel, String adresa, String tara,
			String actIdentitate) {
		super();
		this.cnp = cnp;
		this.nume = nume;
		this.prenume = prenume;
		this.nrTel = nrTel;
		this.adresa = adresa;
		this.tara = tara;
		this.actIdentitate = actIdentitate;
	}

}
