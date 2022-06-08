package it.prova.catenadimontaggio.dao;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

public interface SlotCatenaDiMontaggioDAO {

	public SlotCatenaDiMontaggio get(int id);

	public void addCarToSlotCatenaDiMontaggio(Automobile automobileInput,
			SlotCatenaDiMontaggio slotCatenaDiMontaggioInput);

}