package tn.edu.esprit.gl8.delevery.services.interfaces;

import javax.ejb.Local;

import tn.edu.esprit.gl8.delevery.domain.Army;
import tn.edu.esprit.gl8.delevery.domain.Solidier;

@Local
public interface ServicesGodOfWarLocal {

	public void addArmy(Army army);
	public int CalculatePriorityArmy(Army army);
	public boolean HowWin(Army army);
	public void AddSolidier(Solidier solidier);
}
