package Camere;

import java.util.Date;

public class CameraRezervata extends Camera{
 private Date dataSosire;
 private Date dataPlecare;
 private boolean posibilitatePrelungire;
 
public Date getDataSosire() {
	return dataSosire;
}
public void setDataSosire(Date dataSosire) {
	this.dataSosire = dataSosire;
}
public Date getDataPlecare() {
	return dataPlecare;
}
public void setDataPlecare(Date dataPlecare) {
	this.dataPlecare = dataPlecare;
}
public boolean isPosibilitatePrelungire() {
	return posibilitatePrelungire;
}
public void setPosibilitatePrelungire(boolean posibilitatePrelungire) {
	this.posibilitatePrelungire = posibilitatePrelungire;
}

public CameraRezervata() {
	super();
	// TODO Auto-generated constructor stub
}

public CameraRezervata(Date dataSosire, Date dataPlecare, boolean posibilitatePrelungire) {
	super();
	this.dataSosire = dataSosire;
	this.dataPlecare = dataPlecare;
	this.posibilitatePrelungire = posibilitatePrelungire;
}
}
