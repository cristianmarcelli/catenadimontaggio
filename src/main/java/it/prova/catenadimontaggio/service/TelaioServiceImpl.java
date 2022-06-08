package it.prova.catenadimontaggio.service;

import org.springframework.stereotype.Service;

import it.prova.catenadimontaggio.model.Automobile;

@Service
public class TelaioServiceImpl implements TelaioService {

	@Override
	public void montaTelaio(Automobile automobile) {
		System.out.println("Telaio montato.");
	}

}