package it.prova.catenadimontaggio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.catenadimontaggio.dao.SlotCatenaDiMontaggioDAO;
import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

@Service
public class CatenaDiMontaggioServiceImpl implements CatenaDiMontaggioService {

	@Autowired
	private TelaioService telaioService;
	@Autowired
	private CarrozzeriaService carrozzeriaService;
	@Autowired
	private ImpiantoElettricoService impiantoElettricoService;
	@Autowired
	private MotoreService motoreService;
	@Autowired
	private ProvaSuStradaService provaSuStradaService;
	@Autowired
	private SlotCatenaDiMontaggioDAO slotCatenaDiMontaggioDAO;

	@Override
	public void avviaCatenaDiMontaggio(SlotCatenaDiMontaggio slotCatenaDiMontaggio) {
		System.out.println("----- INIZIO CATENA DI MONTAGGIO -----");

		for (Automobile automobile : slotCatenaDiMontaggio.getAutomobili()) {

			System.out.println("Sto montando il telaio della macchina " + slotCatenaDiMontaggio.getBrand() + " "
					+ automobile.getModello() + " ...");
			telaioService.montaTelaio();

			System.out.println("Sto montando la carrozzeria della macchina " + slotCatenaDiMontaggio.getBrand() + " "
					+ automobile.getModello() + " ...");
			carrozzeriaService.montaCarrozzeria();

			System.out.println("Sto montando l'impianto elettrico della macchina " + slotCatenaDiMontaggio.getBrand()
					+ " " + automobile.getModello() + " ...");
			impiantoElettricoService.montaImpiantoElettrico();

			System.out.println("Sto montando il motore della macchina " + slotCatenaDiMontaggio.getBrand() + " "
					+ automobile.getModello() + " ...");
			motoreService.montaMotore();

			System.out.println("Sto effettuando la prova su strada con la macchina " + slotCatenaDiMontaggio.getBrand()
					+ " " + automobile.getModello() + " ...");
			provaSuStradaService.provaSuStrada();
			
			System.out.println();

		}

		System.out.println("----- TERMINE CATENA DI MONTAGGIO -----");
	}

	@Override
	public SlotCatenaDiMontaggio caricaSlot(int id) {

		return slotCatenaDiMontaggioDAO.get(id);
	}

}