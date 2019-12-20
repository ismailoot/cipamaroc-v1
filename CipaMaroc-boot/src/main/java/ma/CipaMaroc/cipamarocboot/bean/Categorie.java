package ma.CipaMaroc.cipamarocboot.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categorie implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String libelle;
	private SuperCategorie superCategorie;
	
	
	public Categorie() {
		super();
	}
	public Categorie(long id, String libelle, SuperCategorie superCategorie) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.superCategorie = superCategorie;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public SuperCategorie getSuperCategorie() {
		return superCategorie;
	}
	public void setSuperCategorie(SuperCategorie superCategorie) {
		this.superCategorie = superCategorie;
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
		Categorie other = (Categorie) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
}
