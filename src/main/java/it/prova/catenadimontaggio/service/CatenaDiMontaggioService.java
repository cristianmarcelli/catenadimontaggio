package it.prova.catenadimontaggio.service;

import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

public interface CatenaDiMontaggioService {
	
	public SlotCatenaDiMontaggio caricaSlot(int id);
	
	public void avviaCatenaDiMontaggio(SlotCatenaDiMontaggio slotCatenaDiMontaggio);

}