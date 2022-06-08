package it.prova.catenadimontaggio.service;

import org.springframework.stereotype.Service;

import it.prova.catenadimontaggio.model.Automobile;

@Service
public class ImpiantoElettricoServiceImpl implements ImpiantoElettricoService {

	@Override
	public void montaImpiantoElettrico(Automobile automobile) {
		System.out.println("Impianto elettrico montato.");
	}

}