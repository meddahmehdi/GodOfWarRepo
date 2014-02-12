package tn.edu.esprit.gl8.delevery.services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.edu.esprit.gl8.delevery.domain.Army;
import tn.edu.esprit.gl8.delevery.domain.Solidier;
import tn.edu.esprit.gl8.delevery.services.interfaces.ServicesGodOfWarLocal;
import tn.edu.esprit.gl8.delevery.services.interfaces.ServicesGodOfWarRemote;

@Stateless
public class GodOfWar implements ServicesGodOfWarRemote,ServicesGodOfWarLocal {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void addArmy(Army army) {
		entityManager.persist(army);
	}

	@Override
	public int CalculatePriorityArmy(Army army) {
		return army.getNbSolidier()*(army.getNbrAirCraft()+army.getNbrBoat());
	}

	@Override
	public boolean HowWin(Army army) {
		if(CalculatePriorityArmy(army)<10)
			return true;
		else
			return false;
	}

	@Override
	public void AddSolidier(Solidier solidier) {
		entityManager.persist(solidier);
	}
	
}
