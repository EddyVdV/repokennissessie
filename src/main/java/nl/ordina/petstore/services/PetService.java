package nl.ordina.petstore.services;

import nl.ordina.petstore.dao.PetDAO;
import org.springframework.stereotype.Service;

@Service
public class PetService {
  private PetDAO petDAO;

  public PetDAO getPetDAO() {
    return petDAO;
  }

  public void setPetDAO(PetDAO petDAO) {
    this.petDAO = petDAO;
  }
}
