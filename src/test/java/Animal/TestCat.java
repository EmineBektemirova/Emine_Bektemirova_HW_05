package Animal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class TestCat {

    @Test
    public void checkCatSound() {
        //GIVEN
        Cat cat = new Cat("testCat", 3, "pet");
        String expectedSound = "meow meow";
        //WHEN
        String actualSound = cat.makeSound();
        //THEN
        Assertions.assertEquals(expectedSound, actualSound,
                String.format("Expected '%s', but was '%s'", expectedSound, actualSound));
    }

    @Test
    public void checkCatClass() {
        //GIVEN
        Cat cat = new Cat("testCat", 3, "pet");
        String expectedSimpleName = "Cat";

        //WHEN
        String actualSimpleName = cat.getClass().getSimpleName();

        //THEN
        Assertions.assertEquals(expectedSimpleName, actualSimpleName);
    }

    @Test
    public void checkCatName() {
        //GIVEN
        Cat cat = new Cat("testCat",3 , "pet");
        String expectedSimpleName = "testCat";

        //WHEN
        String actualSimpleName = cat.getName();

        //THEN
        Assertions.assertEquals(expectedSimpleName, actualSimpleName);
    }

    @Test
    public void checkCatAge() {
        //GIVEN
        Cat cat = new Cat("testCat", 3, "pet");
        Integer expectedSimpleAge = new Integer(3);

        //WHEN
       Integer actualSimpleAge = cat.getAge();

        //THEN
        Assertions.assertEquals(expectedSimpleAge, actualSimpleAge);

    }

    @Test
    public void checkCatType() {
        //GIVEN
        Cat cat = new Cat("testCat", 3, "pet");
        String expectedSimpleType = "pet";

        //WHEN
        String actualSimpleType = cat.getType();

        //THEN
        Assertions.assertEquals(expectedSimpleType, actualSimpleType);

    }



}