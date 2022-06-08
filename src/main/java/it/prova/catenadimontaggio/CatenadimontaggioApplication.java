package it.prova.catenadimontaggio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;
import it.prova.catenadimontaggio.service.CatenaDiMontaggioService;

@SpringBootApplication
public class CatenadimontaggioApplication implements CommandLineRunner {

	@Autowired
	private CatenaDiMontaggioService catenaDiMontaggioService;

	public static void main(String[] args) {
		SpringApplication.run(CatenadimontaggioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		SlotCatenaDiMontaggio slotCatenaDiMontaggio = catenaDiMontaggioService.caricaSlot(1);
		
		catenaDiMontaggioService.avviaCatenaDiMontaggio(slotCatenaDiMontaggio);
		
	}

}