package nl.ordina.petstore;

import nl.ordina.petstore.dao.PetDAO;
import nl.ordina.petstore.repo.PetRepo;
import nl.ordina.petstore.services.PetService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class App 
{
    public static void main( String[] args )
    {
        // Lesson A
//        PetService petService = new PetService();
//        PetRepo petRepo = new PetRepo();
//
//        System.out.println("petService " + petService.toString());
//        System.out.println("petRepo " + petRepo.toString());
//
//        // Lesson B
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext(new String[]{"Spring-Pet.xml"});
//
//        PetService petService1 = (PetService) context.getBean("petService");
//        System.out.println("petService1 " + petService1.toString());
//
//        PetDAO petDAO1 = (PetDAO) context.getBean("petDAO");
//        System.out.println("petDAO1 " + petDAO1.toString());
//
//        // Lesson C
//        ApplicationContext contextAutoscan =
//                new ClassPathXmlApplicationContext(new String[]{"Spring-Autoscan.xml"});
//
//        PetService petService2 = (PetService) contextAutoscan.getBean("petService");
//        System.out.println("petService2 " + petService2.toString());
//
//        PetDAO petDAO2 = (PetDAO) contextAutoscan.getBean("petDAO");
//        System.out.println("petDAO2 " + petDAO2.toString());

        // Lesson D
        ApplicationContext contextConfiguration =
                new AnnotationConfigApplicationContext(AppConfiguration.class);

        PetService petService3 = (PetService) contextConfiguration.getBean("petService");
        System.out.println("petService3 " + petService3.toString());

        PetDAO petDAO3 = (PetDAO) contextConfiguration.getBean("petDAO");
        System.out.println("petDAO3 " + petDAO3.toString());
    }
}
