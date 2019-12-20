package ma.CipaMaroc.cipamarocboot.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;




@Entity
public class Achat implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String reference;
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern ="yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date dateAchat;
	private double ttc;
	private double totalpaye;	
	private Fournisseur fournisseur;
	private TypeAchat typeAchat;
	private List<Paiement>paiements;
	
	
	
	public Achat() {
		super();
	}
	public Achat(long id, String reference, Date dateAchat, double ttc, double totalpaye, Fournisseur fournisseur,
			TypeAchat typeAchat, List<Paiement> paiements) {
		super();
		this.id = id;
		this.reference = reference;
		this.dateAchat = dateAchat;
		this.ttc = ttc;
		this.totalpaye = totalpaye;
		this.fournisseur = fournisseur;
		this.typeAchat = typeAchat;
		this.paiements = paiements;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getReferance() {
		return reference;
	}
	public void setReferance(String referance) {
		this.reference = referance;
	}
	public Date getDateAchat() {
		return dateAchat;
	}
	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}
	public double getTtc() {
		return ttc;
	}
	public void setTtc(double ttc) {
		this.ttc = ttc;
	}
	public double getTotalpaye() {
		return totalpaye;
	}
	public void setTotalpaye(double totalpaye) {
		this.totalpaye = totalpaye;
	}
	public Fournisseur getFournisseur() {
		return fournisseur;
	}
	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}
	public TypeAchat getTypeAchat() {
		return typeAchat;
	}
	public void setTypeAchat(TypeAchat typeAchat) {
		this.typeAchat = typeAchat;
	}
	public List<Paiement> getPaiements() {
		return paiements;
	}
	public void setPaiements(List<Paiement> paiements) {
		this.paiements = paiements;
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
		Achat other = (Achat) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
}
