package it.prova.catenadimontaggio.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

public class DBMock {

	public static final List<SlotCatenaDiMontaggio> SLOT_CATENE_DI_MONTAGGIO_LIST = new ArrayList<SlotCatenaDiMontaggio>();

	static {

		try {
			SlotCatenaDiMontaggio slotCatenaDiMontaggio1 = new SlotCatenaDiMontaggio(1L, "Polvo", "Germany");
			Automobile automobile1 = new Automobile(1L, "modello1", "telaio1",
					new SimpleDateFormat("dd/MM/yyyy").parse("10/01/2000"));
			slotCatenaDiMontaggio1.addToAutomobili(automobile1);
			Automobile automobile2 = new Automobile(20L, "modello2", "telaio2",
					new SimpleDateFormat("dd/MM/yyyy").parse("20/12/2012"));
			slotCatenaDiMontaggio1.addToAutomobili(automobile2);
			
			
			SlotCatenaDiMontaggio slotCatenaDiMontaggio2 = new SlotCatenaDiMontaggio(2L, "Berrari", "Italy");
			Automobile automobile3 = new Automobile(54L, "modello3", "telaio3",
					new SimpleDateFormat("dd/MM/yyyy").parse("10/01/2003"));
			slotCatenaDiMontaggio2.addToAutomobili(automobile3);
			Automobile automobile4 = new Automobile(23L, "modello4", "telaio4",
					new SimpleDateFormat("dd/MM/yyyy").parse("20/05/2020"));
			slotCatenaDiMontaggio2.addToAutomobili(automobile4);
			
			
			SlotCatenaDiMontaggio slotCatenaDiMontaggio3 = new SlotCatenaDiMontaggio(3L, "PMW", "Germany");
			Automobile automobile5 = new Automobile(90L, "modello5", "telaio5",
					new SimpleDateFormat("dd/MM/yyyy").parse("10/01/1998"));
			slotCatenaDiMontaggio3.addToAutomobili(automobile5);
			Automobile automobile6 = new Automobile(12L, "modello6", "telaio6",
					new SimpleDateFormat("dd/MM/yyyy").parse("12/09/2021"));
			slotCatenaDiMontaggio3.addToAutomobili(automobile6);

			SLOT_CATENE_DI_MONTAGGIO_LIST.add(slotCatenaDiMontaggio1);
			SLOT_CATENE_DI_MONTAGGIO_LIST.add(slotCatenaDiMontaggio2);
			SLOT_CATENE_DI_MONTAGGIO_LIST.add(slotCatenaDiMontaggio3);

		} catch (ParseException e) {

			e.printStackTrace();
		}

	}

}