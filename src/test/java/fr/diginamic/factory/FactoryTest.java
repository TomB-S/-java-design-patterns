package fr.diginamic.factory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactoryTest {
    @Test
    public void testIngredient(){
        ElementFactory factory = new ElementFactory();
        Element element = factory.getElement(TypeElement.INGREDIENT, "Poivre", 2.5, Unite.MICRO_GRAMMES);
        assertInstanceOf(Ingredient.class, element);
    }
    @Test
    public void testAdditif(){
        ElementFactory factory = new ElementFactory();
        Element element = factory.getElement(TypeElement.ADDITIF, "Colorant E150", 1.0, Unite.MILLI_GRAMMES);
        assertInstanceOf(Additif.class, element);
    }

    @Test
    public void testAllergene(){
        ElementFactory factory = new ElementFactory();
        Element element = factory.getElement(TypeElement.ALLERGENE, "Gluten", 5.0, Unite.MILLI_GRAMMES);
        assertInstanceOf(Allergene.class, element);
    }

}
