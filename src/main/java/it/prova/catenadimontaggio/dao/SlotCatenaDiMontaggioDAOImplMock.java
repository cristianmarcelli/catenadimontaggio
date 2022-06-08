package it.prova.catenadimontaggio.dao;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

public class SlotCatenaDiMontaggioDAOImplMock implements SlotCatenaDiMontaggioDAO {

	@Override
	public SlotCatenaDiMontaggio get(int id) {
		for (SlotCatenaDiMontaggio slotCatenaDiMontaggioItem : DBMock.SLOT_CATENE_DI_MONTAGGIO_LIST) {
			if (slotCatenaDiMontaggioItem.getId() == id)
				return slotCatenaDiMontaggioItem;
		}
		return null;
	}

	@Override
	public void addCarToSlotCatenaDiMontaggio(Automobile automobileInput,
			SlotCatenaDiMontaggio slotCatenaDiMontaggioInput) {

		for (SlotCatenaDiMontaggio slotCatenaDiMontaggioItem : DBMock.SLOT_CATENE_DI_MONTAGGIO_LIST) {
			if (slotCatenaDiMontaggioItem.getId() == slotCatenaDiMontaggioInput.getId())
				slotCatenaDiMontaggioItem.addToAutomobili(automobileInput);
		}
	}

}