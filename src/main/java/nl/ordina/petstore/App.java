package nl.ordina.petstore;

import nl.ordina.petstore.repo.PetRepo;
import nl.ordina.petstore.services.PetService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class App 
{
    public static void main( String[] args )
    {
        // Lesson A
        PetService petService = new PetService();
        PetRepo petRepo = new PetRepo();

        System.out.println("petService " + petService.toString());
        System.out.println("petRepo " + petRepo.toString());

        // Lesson B
        ApplicationContext context =
                new ClassPathXmlApplicationContext(new String[]{"Spring-Pet.xml"});
        String[] beans = context.getBeanDefinitionNames();
        Arrays.stream(beans).forEach(System.out::println);
    }
}
