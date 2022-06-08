package it.prova.catenadimontaggio.service;

import org.springframework.stereotype.Service;

@Service
public class ProvaSuStradaServiceImpl implements ProvaSuStradaService {

	@Override
	public void provaSuStrada() {
		System.out.println("Prova su strada effettuata.");
	}

}