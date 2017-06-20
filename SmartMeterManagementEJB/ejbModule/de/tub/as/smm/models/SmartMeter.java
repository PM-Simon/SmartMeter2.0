package de.tub.as.smm.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "SmartMeter")
public class SmartMeter implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	Long id;
	private String kennung;
	private String Stromspannung;
	private String maxStromst�rke;

	public SmartMeter() {
	}

	public SmartMeter(String kennung, String maxSt�rke) {
		this.kennung = kennung;
		this.maxStromst�rke = maxSt�rke;
		// +zuf�llige Spannung
	}

	@Override
	public String toString() {
		return "Kennung: " + kennung;
	}

	@Column(name = "Kennung")
	public String getKennung() {
		return kennung;
	}

	@Column(name = "Stromspannung")
	public String getStromSpannung() {
		return Stromspannung;
	}

	@Column(name="ID")
	public Long getId() {
		return id;
	}

	
	@Column(name = "Stromst�rke")
	public String getStromSt�rke() {
		return maxStromst�rke;
	}

	public void setKennung(String kennung) {
		this.kennung = kennung;
	}

	public void setStromspannung(String stromspannung) {
		Stromspannung = stromspannung;
	}

	public void setStromst�rke(String stromst�rke) {
		maxStromst�rke = stromst�rke;
	}
}
