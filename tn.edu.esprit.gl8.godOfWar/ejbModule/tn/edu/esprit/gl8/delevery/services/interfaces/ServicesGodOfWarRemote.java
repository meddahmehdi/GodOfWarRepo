package tn.edu.esprit.gl8.delevery.services.interfaces;

import javax.ejb.Remote;

import tn.edu.esprit.gl8.delevery.domain.Army;
import tn.edu.esprit.gl8.delevery.domain.Solidier;

@Remote
public interface ServicesGodOfWarRemote {

	public void addArmy(Army army);
	public int CalculatePriorityArmy(Army army);
	public boolean HowWin(Army army);
	public void AddSolidier(Solidier solidier);
	
}
