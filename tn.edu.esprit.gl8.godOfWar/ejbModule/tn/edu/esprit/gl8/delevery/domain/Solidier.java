package tn.edu.esprit.gl8.delevery.domain;

import java.io.Serializable;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Trip
 *
 */
@Entity
@Table(name="T_Solidier")
public class Solidier implements Serializable {

	
	private int idSolidier;
	private String name;
	private String mat;
	private static final long serialVersionUID = 1L;
	
	private Army army;

	public Solidier() {
		super();
	}   
	@Id    
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdSolidier() {
		return this.idSolidier;
	}

	public void setIdSolidier(int idSolidier) {
		this.idSolidier = idSolidier;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMat() {
		return mat;
	}
	public void setMat(String mat) {
		this.mat = mat;
	}
	@ManyToOne(cascade=CascadeType.PERSIST)
	public Army getArmy() {
		return army;
	}
	public void setArmy(Army army) {
		this.army = army;
	}   
	}
