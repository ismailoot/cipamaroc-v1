package ma.CipaMaroc.cipamarocboot.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Paiement implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private double montant;
	@ManyToOne
	private Achat achat;
	@ManyToOne
	private TypePaiement typePaiement;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern ="yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date datePaiement;	
	private String desciprtion;
	
	
	
	public Date getDatePaiement() {
		return datePaiement;
	}
	public void setDatePaiement(Date datePaiement) {
		this.datePaiement = datePaiement;
	}
	public String getDesciprtion() {
		return desciprtion;
	}
	public void setDesciprtion(String desciprtion) {
		this.desciprtion = desciprtion;
	}
	public Paiement() {
		super();
	}
	public Paiement(long id, double montant, Achat achat, TypePaiement typePaiement) {
		super();
		this.id = id;
		this.montant = montant;
		this.achat = achat;
		this.typePaiement = typePaiement;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public Achat getAchat() {
		return achat;
	}
	public void setAchat(Achat achat) {
		this.achat = achat;
	}
	public TypePaiement getTypePaiement() {
		return typePaiement;
	}
	public void setTypePaiement(TypePaiement typePaiement) {
		this.typePaiement = typePaiement;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paiement other = (Paiement) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	

}
