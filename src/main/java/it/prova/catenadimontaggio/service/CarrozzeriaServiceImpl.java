package it.prova.catenadimontaggio.service;

import org.springframework.stereotype.Service;

import it.prova.catenadimontaggio.model.Automobile;

@Service
public class CarrozzeriaServiceImpl implements CarrozzeriaService {

	@Override
	public void montaCarrozzeria(Automobile automobile) {
		System.out.println("Carrozzeria montata.");
	}

}