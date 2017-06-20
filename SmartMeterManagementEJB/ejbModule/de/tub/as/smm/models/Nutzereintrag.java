package de.tub.as.smm.models;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

	@Entity
	@Table(name="Nutzereintrag")
	public class Nutzereintrag implements Serializable{
	
		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue
		private Long id;
		private User u;
		private Date datum;
	
		public Nutzereintrag(){
			
		}
		
		public Nutzereintrag(Date datum,User u){
			this.datum =new Date(System.currentTimeMillis());
			this.u = u;
		}
		
		@Column(name="ID")
		public Long getId() {
			return id;
		}


		
		public User getU() {
			return u;
		}
	
		
		@Column(name="Datum")
		public Date getDatum() {
			return datum;
		}
	
		public void setDatum(Date datum) {
			this.datum = datum;
		}
		
	}


