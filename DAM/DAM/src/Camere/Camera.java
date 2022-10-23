package Camere;

public class Camera {

	private Integer nrCamera;
	private Integer etaj;
	private Integer capacitate;
	private String descriere;
	private String statusCamera;
	
	
	public Integer getNrCamera() {
		return nrCamera;
	}
	public void setNrCamera(Integer nrCamera) {
		this.nrCamera = nrCamera;
	}
	public Integer getEtaj() {
		return etaj;
	}
	public void setEtaj(Integer etaj) {
		this.etaj = etaj;
	}
	public Integer getCapacitate() {
		return capacitate;
	}
	public void setCapacitate(Integer capacitate) {
		this.capacitate = capacitate;
	}
	public String getDescriere() {
		return descriere;
	}
	public void setDescriere(String descriere) {
		this.descriere = descriere;
	}
	public String getStatusCamera() {
		return statusCamera;
	}
	public void setStatusCamera(String statusCamera) {
		this.statusCamera = statusCamera;
	}
	
	
	public Camera() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Camera(Integer nrCamera, Integer etaj, Integer capacitate, String descriere, String statusCamera) {
		super();
		this.nrCamera = nrCamera;
		this.etaj = etaj;
		this.capacitate = capacitate;
		this.descriere = descriere;
		this.statusCamera = statusCamera;
	}
	
	
}
