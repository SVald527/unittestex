package tests;
import animals.petstore.pet.types.Snake;
import org.junit.jupiter.api.*;
import animals.AnimalType;
import animals.petstore.pet.attributes.Breed;
import animals.petstore.pet.attributes.Gender;
import animals.petstore.pet.attributes.Skin;
import animals.petstore.pet.types.Dog;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SnakeTest {

    private static Snake actualSnake;
    @BeforeAll
    public static void createAnimals()
    {
        actualSnake = new Snake(AnimalType.DOMESTIC, Skin.FUR, Gender.UNKNOWN, Breed.UNKNOWN);
    }

    @Test
    @Order(1)
    @DisplayName("Animal Test Type Tests Domestic")
    public void animalTypeTests()
    {
        assertEquals(AnimalType.DOMESTIC, actualSnake.getAnimalType(), "Animal Type Expected[" + AnimalType.DOMESTIC
                + "] Actual[" + actualSnake.getAnimalType() + "]");
    }

    @Test
    @Order(1)
    @DisplayName("Snake Speak Psss Tests")
    public void snakeGoesPsssTest()
    {
        assertEquals("The snake goes Psss!", actualSnake.speak(), "I was expecting Psss!");
    }

    @Test
    @Order(1)
    @DisplayName("Snake skin is Hyperallergetic")
    public void snakeHyperAllergeticTests()
    {
        assertEquals("The snake is not hyperallergetic!", actualSnake.snakeHypoallergenic(),
                "The snake is not hyperallergetic!");
    }

    @Test
    @Order(1)
    @DisplayName("Snake has legs Test")
    public void legTests()
    {
        Assertions.assertNotNull(actualSnake.getNumberOfLegs());
    }

    @Test
    @Order(2)
    @DisplayName("Snake Gender Test Male")
    public void genderTestMale()
    {
        actualSnake = new Snake(AnimalType.WILD, Skin.UNKNOWN,Gender.MALE, Breed.UNKNOWN);
        assertEquals(Gender.MALE, actualSnake.getGender(), "Expecting Male Gender!");
    }

    @Test
    @Order(2)
    @DisplayName("Snake Breed Test Milk")
    public void genderSnakeBreed() {
        actualSnake = new Snake(AnimalType.DOMESTIC, Skin.SCALES,Gender.FEMALE, Breed.MILK);
        assertEquals(Breed.MILK, actualSnake.getBreed(), "Expecting Breed Milk!");
    }

    @Test
    @Order(2)
    @DisplayName("snake Speak pssth Tests 1")
    public void snakeGoespssthTest()
    {
        actualSnake = new Snake(AnimalType.WILD, Skin.UNKNOWN,Gender.UNKNOWN, Breed.UNKNOWN);
        assertEquals("The snake goes pssth", actualSnake.speak(), "I was expecting pssth");
    }
}
