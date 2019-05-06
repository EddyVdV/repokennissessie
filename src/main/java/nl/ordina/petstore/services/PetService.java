package nl.ordina.petstore.services;

import nl.ordina.petstore.dao.PetDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
public class PetService {
  private PetDAO petDAO;

  public PetService() {
  }

  @Autowired
  public PetService(PetDAO petDAO) {
    this.petDAO = petDAO;
  }

  public void setPetDAO(PetDAO petDAO) {
    this.petDAO = petDAO;
  }

  @Override
  public String toString() {
    return "PetService{" +
            "petDAO=" + petDAO +
            '}';
  }
}
