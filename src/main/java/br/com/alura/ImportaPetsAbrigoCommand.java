package br.com.alura;

import br.com.alura.client.ClientHttpConfiguration;
import br.com.alura.service.PetService;

import java.io.IOException;

public class ImportaPetsAbrigoCommand implements Command {
    @Override
    public void execute() {
        try {
            ClientHttpConfiguration client = new ClientHttpConfiguration();
            PetService petService = new PetService(client);
            petService.importarPetsAbrigo();

        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
