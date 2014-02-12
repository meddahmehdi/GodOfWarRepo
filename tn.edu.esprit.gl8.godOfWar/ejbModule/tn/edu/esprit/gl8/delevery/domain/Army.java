package tn.edu.esprit.gl8.delevery.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Organizer
 *
 */
@Entity
@Table(name="T_Army")
public class Army implements Serializable {

	
	private int idArmy;
	private int nbrAirCraft;
	private int nbrBoat;
	private int nbSolidier;
	private static final long serialVersionUID = 1L;

	private List<Solidier> solidiers;
	
	public Army() {
		super();
	}   
	@Id    
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdArmy() {
		return this.idArmy;
	}

	public void setIdArmy(int idArmy) {
		this.idArmy = idArmy;
	}
	public int getNbrAirCraft() {
		return nbrAirCraft;
	}
	public void setNbrAirCraft(int nbrAirCraft) {
		this.nbrAirCraft = nbrAirCraft;
	}
	public int getNbrBoat() {
		return nbrBoat;
	}
	public void setNbrBoat(int nbrBoat) {
		this.nbrBoat = nbrBoat;
	}
	public int getNbSolidier() {
		return nbSolidier;
	}
	public void setNbSolidier(int nbSolidier) {
		this.nbSolidier = nbSolidier;
	}
	@OneToMany(mappedBy="army")
	public List<Solidier> getSolidiers() {
		return solidiers;
	}
	public void setSolidiers(List<Solidier> solidiers) {
		this.solidiers = solidiers;
	}      
}
