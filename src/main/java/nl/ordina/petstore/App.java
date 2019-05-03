package nl.ordina.petstore;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

//        System.out.println( "Hello World!" );
        // Lesson A
        PetService petService = new PetService();
        PetRepo petRepo = new PetRepo();

        System.out.println("petService " + petService.toString());
        System.out.println("petRepo " + petRepo.toString());
    }
}
